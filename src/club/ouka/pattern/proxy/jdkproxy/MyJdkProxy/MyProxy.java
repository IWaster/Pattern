package club.ouka.pattern.proxy.jdkproxy.MyJdkProxy;


import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-08
 * Time: 6:43
 */
public class MyProxy {
    public static final String LN = "\r\n";

    //    @CallerSensitive
    public static Object newProxyInstance(MyClassLoader loader,
                                          Class<?>[] interfaces,
                                          MyInvocationHandler h) {
        try {
            //1生成代码
            String src = generateSrc(interfaces);
            //2输出到磁盘
            String filePath = MyProxy.class.getResource("").getPath();
            File file = new File(filePath + "$proxy0.java");
            FileWriter fw = new FileWriter(file);
            fw.write(src);
            fw.flush();
            fw.close();
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> iterable = manager.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task = compiler.getTask(null,manager,null,null,null,iterable);

            task.call();
            manager.close();
            Class proxyClass = loader.findClass("$proxy0");
            Constructor constructor = proxyClass.getConstructor(MyInvocationHandler.class);
            file.delete();
            return constructor.newInstance(h);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }


    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package club.ouka.pattern.proxy.jdkproxy.MyJdkProxy;" + LN);
        sb.append("import club.ouka.pattern.proxy.Person;" + LN);
        sb.append("import java.lang.reflect.*;" + LN);
        sb.append("public final class $proxy0 implements " + interfaces[0].getName() + " {" + LN);

        sb.append("MyInvocationHandler h;"+LN);
        /**
         * 构造方法生成
         */
        sb.append("public $proxy0(MyInvocationHandler h) {" + LN);
        sb.append("this.h= h;" + LN);
        sb.append("}" + LN);


        for (Method m : interfaces[0].getMethods()) {
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + LN);
            sb.append("try{" + LN);

            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + LN);
            sb.append("this.h.invoke(this,m,null);" + LN);
            sb.append("} catch (Throwable e){" + LN +
                    "e.printStackTrace();" + LN +
                    "}" + LN);
            sb.append("}");
        }


        sb.append("}");

        return sb.toString();

    }
}

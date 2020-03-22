package club.ouka.pattern.proxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-08
 * Time: 10:46
 */
public class Matchmaker implements MethodInterceptor {


    public Object getInstance(Class<?>clazz){
        Enhancer enhancer =  new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    private void berfore(){
        System.out.println("挑选前");
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        berfore();
        Object o1 = methodProxy.invokeSuper(o, objects);
        after();
        return o1;
    }

    private void after(){
        System.out.println("挑选后");
    }
}

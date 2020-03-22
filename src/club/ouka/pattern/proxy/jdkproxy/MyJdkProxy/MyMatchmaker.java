package club.ouka.pattern.proxy.jdkproxy.MyJdkProxy;

import club.ouka.pattern.proxy.Person;

import java.lang.reflect.Method;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-08
 * Time: 6:00
 */
public class MyMatchmaker implements MyInvocationHandler {

    private Person target;
    public Object getInstance(Person person){
        this.target=person;
        Class<? extends Person> aClass = target.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(),aClass.getInterfaces(),this);
    }

    private void berfore(){
        System.out.println("挑选前");
    }
    @Override
    public Object invoke(Object MyProxy, Method method, Object[] args) throws Throwable {
        berfore();
        Object invoke = method.invoke(this.target, args);
        after();
        return invoke;
    }

    private void after(){
        System.out.println("挑选后");
    }
}

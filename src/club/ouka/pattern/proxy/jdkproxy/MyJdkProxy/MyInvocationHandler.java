package club.ouka.pattern.proxy.jdkproxy.MyJdkProxy;

import java.lang.reflect.Method;

/**
 * Description:
 * User: Ouka
 * Date: 2020-03-08
 * Time: 6:42
 */
public interface MyInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}


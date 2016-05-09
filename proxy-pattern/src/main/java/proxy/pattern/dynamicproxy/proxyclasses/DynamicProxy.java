package proxy.pattern.dynamicproxy.proxyclasses;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * DynamicProxy
 * <p/>
 * 动态代理,它是在运行时生成的class，在生成它时你必须提供一组interface给它，
 * 然后该class就宣称它实现了这些interface。
 * 你当然可以把该class的实例当作这些interface中的任何一个来用。当然啦，这个
 * Dynamic Proxy其实就是一个Proxy，它不会替你作实质性的工作，在生成它的实例
 * 时你必须提供一个handler，由它接管实际的工作。
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/9/16 9:40 AM.
 */
public class DynamicProxy implements InvocationHandler {

    private Object sub; // 真实的引用对象

    public DynamicProxy(Object sub) {
        this.sub = sub;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before calling " + method);
        method.invoke(sub, args);
        System.out.println("after calling " + method);
        return null;
    }
}

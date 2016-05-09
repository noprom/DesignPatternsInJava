package proxy.pattern.dynamicproxy.demo;

import proxy.pattern.dynamicproxy.originalclasses.RealSubject;
import proxy.pattern.dynamicproxy.originalclasses.Subject;
import proxy.pattern.dynamicproxy.proxyclasses.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * DynamicProxyEx
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/9/16 9:44 AM.
 */
public class DynamicProxyEx {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        InvocationHandler handler = new DynamicProxy(realSubject);
        Class clz = realSubject.getClass();

        //以下是分解步骤
//        Class c = Proxy.getProxyClass(clz.getClassLoader(), clz.getInterfaces());
//        try {
//            Constructor constructor = c.getConstructor(new Class[]{InvocationHandler.class});
//            Subject subject = (Subject) constructor.newInstance(new Object[]{handler});
//            subject.request();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }
        Subject subject = (Subject) Proxy.newProxyInstance(
                clz.getClassLoader(), clz.getInterfaces(), handler);
        subject.request();
    }
}

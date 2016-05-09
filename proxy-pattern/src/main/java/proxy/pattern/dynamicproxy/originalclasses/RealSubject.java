package proxy.pattern.dynamicproxy.originalclasses;

/**
 * RealSubject
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/9/16 9:38 AM.
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("I am from concrete subject");
    }
}

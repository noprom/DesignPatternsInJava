package proxy.pattern.staticproxy.proxyclasses;

import proxy.pattern.staticproxy.originalclasses.ConcreteSubject;
import proxy.pattern.staticproxy.originalclasses.Subject;

/**
 * Proxy
 * <p/>
 * 静态代理，对具体真实对象直接引用
 * 代理角色，代理角色需要有对真实角色的引用，
 * 代理做真实角色想做的事情
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/9/16 9:02 AM.
 */
public class Proxy extends Subject {

    ConcreteSubject cs;

    @Override
    public void doSomeWord() {
        preRequest();  //真实角色操作前的附加操作

        System.out.println("Proxy call happening now");
        // Lazy initialization
        if (cs == null) {
            cs = new ConcreteSubject();
        }
        cs.doSomeWord();

        postRequest();  //真实角色操作后的附加操作
    }

    /**
     * 真实角色操作前的附加操作
     */
    private void postRequest() {
    }

    /**
     * 真实角色操作后的附加操作
     */
    private void preRequest() {
    }
}

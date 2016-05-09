package proxy.pattern.proxyclasses;

import proxy.pattern.originalclasses.ConcreteSubject;
import proxy.pattern.originalclasses.Subject;

/**
 * Proxy
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/9/16 9:02 AM.
 */
public class Proxy extends Subject {

    ConcreteSubject cs;

    @Override
    public void doSomeWord() {
        System.out.println("Proxy call happening now");
        // Lazy initialization
        if (cs == null) {
            cs = new ConcreteSubject();
        }
        cs.doSomeWord();
    }
}

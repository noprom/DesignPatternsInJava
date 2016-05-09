package proxy.pattern.originalclasses;

/**
 * ConcreteSubject
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/9/16 9:01 AM.
 */
public class ConcreteSubject extends Subject {
    @Override
    public void doSomeWord() {
        System.out.println("I am from concrete subject");
    }
}

package design.patterns.singleton.pattern;

/**
 * StandardSingletonPattern
 * 标准的单例模式,不需要使用带有synchronized的懒汉模式
 * 和饿汉模式
 * 既实现了线程安全,又避免了同步带来的性能影响
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 4/22/16 10:22 AM.
 */
class StandardCaptain {

    private StandardCaptain() {
    }

    private static class SingletonHelper {
        // Nested class is referenced after getCaptain() is called
        private static final StandardCaptain captain = new StandardCaptain();
    }

    public static StandardCaptain getCaptain() {
        return SingletonHelper.captain;
    }
}

public class StandardSingletonPattern {
    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for our team");
        StandardCaptain c1 = StandardCaptain.getCaptain();
        System.out.println("Trying to make another captain for our team");
        StandardCaptain c2 = StandardCaptain.getCaptain();
        if (c1 == c2) {
            System.out.println("c1 and c2 are same instance");
        }
    }
}

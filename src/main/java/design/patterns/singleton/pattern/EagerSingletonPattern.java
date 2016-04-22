package design.patterns.singleton.pattern;

/**
 * EagerSingletonPattern
 * 单例模式:饿汉模式
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 4/22/16 10:24 AM.
 */
class EagerCaptain {
    private static final EagerCaptain captain = new EagerCaptain();

    private EagerCaptain() {
    }

    public static EagerCaptain getCaptain() {
        return captain;
    }
}

public class EagerSingletonPattern {
    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for our team");
        EagerCaptain c1 = EagerCaptain.getCaptain();
        System.out.println("Trying to make another captain for our team");
        EagerCaptain c2 = EagerCaptain.getCaptain();
        if (c1 == c2) {
            System.out.println("c1 and c2 are same instance");
        }
    }
}

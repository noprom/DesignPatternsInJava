package design.patterns.singleton.pattern;

/**
 * SingletonPattern
 * 单例模式:懒汉模式
 * 需要使用synchronized来保持线程安全
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 4/22/16 10:06 AM.
 */
class MakeACaptain {
    private static MakeACaptain captain;

    //We make the constructor private to prevent the use of "new"
    private MakeACaptain() {

    }

    /**
     * 获得单例,但是需要使用synchronized来保持线程安全
     * 在性能上会有一些影响
     *
     * @return
     */
    public synchronized static MakeACaptain getCaptain() {
        // Lazy initialization
        if (captain == null) {
            captain = new MakeACaptain();
            System.out.println("New Captain selected for our team");
        } else {
            System.out.print("You already have a Captain for your team.");
            System.out.println("Send him for the toss.");
        }
        return captain;
    }
}

public class SingletonPattern {

    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for our team");
        MakeACaptain c1 = MakeACaptain.getCaptain();
        System.out.println("Trying to make another captain for our team");
        MakeACaptain c2 = MakeACaptain.getCaptain();
        if (c1 == c2) {
            System.out.println("c1 and c2 are same instance");
        }
    }
}

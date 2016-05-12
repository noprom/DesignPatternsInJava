package singleton.pattern;

/**
 * SingletonPattern
 * 单例模式:懒汉模式
 * 在第一次调用的时候实例化自己
 * 需要使用synchronized来保持线程安全
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 4/22/16 10:06 AM.
 */
class LazyCaptain {
    private static LazyCaptain captain;

    //We make the constructor private to prevent the use of "new"
    private LazyCaptain() {

    }

//    /**
//     * 在方法上进行同步
//     * 获得单例,但是需要使用synchronized来保持线程安全
//     * 在性能上会有一些影响
//     *
//     * @return
//     */
//    public synchronized static LazyCaptain getCaptain() {
//        // Lazy initialization
//        if (captain == null) {
//            captain = new LazyCaptain();
//            System.out.println("New Captain selected for our team");
//        } else {
//            System.out.print("You already have a Captain for your team.");
//            System.out.println("Send him for the toss.");
//        }
//        return captain;
//    }

    /**
     * 双重检查锁定
     *
     * @return
     */
    public static LazyCaptain getCaptain() {
        if (captain == null) {
            synchronized (LazyCaptain.class) {
                if (captain == null) {
                    captain = new LazyCaptain();
                }
            }
        }
        return captain;
    }
}

public class LazySingletonPattern {

    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for our team");
        LazyCaptain c1 = LazyCaptain.getCaptain();
        System.out.println("Trying to make another captain for our team");
        LazyCaptain c2 = LazyCaptain.getCaptain();
        if (c1 == c2) {
            System.out.println("c1 and c2 are same instance");
        }
    }
}

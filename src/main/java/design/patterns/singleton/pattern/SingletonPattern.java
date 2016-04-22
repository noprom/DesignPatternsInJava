package design.patterns.singleton.pattern;

/**
 * SingletonPattern
 * 单例模式
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 4/22/16 10:06 AM.
 */
class MakeACaptain {
    private static MakeACaptain captain;

    //We make the constructor private to prevent the use of "new"
    private MakeACaptain() {

    }

    public static MakeACaptain getCaptain() {
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

    }
}

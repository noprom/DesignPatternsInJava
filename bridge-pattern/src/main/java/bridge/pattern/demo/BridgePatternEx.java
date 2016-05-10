package bridge.pattern.demo;

/**
 * BridgePatternEx
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/11/16 5:35 AM.
 */
interface IColor {
    void fillWithColor(int border);
}

class RedColor implements IColor {

    public void fillWithColor(int border) {
        System.out.print("Red color with " + border + " inch border");
    }
}

class GreenColor implements IColor {

    public void fillWithColor(int border) {
        System.out.print("Green color with " + border + " inch border.");
    }
}

public class BridgePatternEx {

    public static void main(String[] args) {

    }
}

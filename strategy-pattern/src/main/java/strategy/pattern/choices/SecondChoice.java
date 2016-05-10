package strategy.pattern.choices;

/**
 * SecondChoice
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/10/16 8:19 AM.
 */
public class SecondChoice implements IChoice {
    public void myChoice(String s1, String s2) {
        System.out.println("You wanted to concatenate the numbers.");
        System.out.println(" The result of the addition is:" + s1 + s2);
        System.out.println("***End of the strategy***");
    }
}

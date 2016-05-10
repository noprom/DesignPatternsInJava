package strategy.pattern.context;

import strategy.pattern.choices.IChoice;

/**
 * Context
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/10/16 8:39 AM.
 */
public class Context {
    IChoice iChoice;

    public void setiChoice(IChoice choice) {
        iChoice = choice;
    }

    public void showChoice(String s1, String s2) {
        iChoice.myChoice(s1, s2);
    }
}

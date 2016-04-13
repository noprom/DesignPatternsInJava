package java.design.patterns;

/**
 * ObserverPattern
 * 观察者模式
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 4/13/16 3:29 PM.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者
 */
class Observer {
    public void update() {
        System.out.println("flag value has been changed in observer");
    }
}

interface ISubject {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();
}

/**
 * 被观察者
 */
class Subject implements ISubject {

    List<Observer> observerList = new ArrayList<Observer>();
    private int flag;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
        notifyObservers();
    }

    public void register(Observer observer) {
        observerList.add(observer);
    }

    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        for (int i = 0, size = observerList.size();
                i < size; i++) {
            observerList.get(i).update();
        }
    }
}

public class ObserverPattern {

    public static void main(String[] args) {

    }
}

package design.patterns;

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
        System.out.println("***Observer Pattern Demo***\n");
        Observer o1 = new Observer();
        Subject sub1 = new Subject();
        sub1.register(o1);
        System.out.println("Setting Flag = 5 ");
        sub1.setFlag(5);
        System.out.println("Setting Flag = 25 ");
        sub1.setFlag(25);
        sub1.unregister(o1);
        // No notification this time to o1 .
        // Since it is unregistered.
        System.out.println("Setting Flag = 50 ");
        sub1.setFlag(50);
    }
}

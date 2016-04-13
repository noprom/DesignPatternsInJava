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
import java.util.Observer;

interface IObserver {
    void update(int value);
}

/**
 * 观察者
 */
class Observer1 implements IObserver {

    public void update(int value) {
        System.out.println("Observer1: value has been changed to " + value);
    }
}

class Observer2 implements IObserver {

    public void update(int value) {
        System.out.println("Observer2: value has been changed to " + value);
    }
}

interface ISubject {
    void register(IObserver observer);

    void unregister(IObserver observer);

    void notifyObservers(int modifiedValue);
}

/**
 * 被观察者
 */
class Subject implements ISubject {

    List<IObserver> observerList = new ArrayList<IObserver>();
    private int value;

    public void register(IObserver observer) {
        observerList.add(observer);
    }

    public void unregister(IObserver observer) {
        observerList.remove(observer);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers(value);
    }

    public void notifyObservers(int modifiedValue) {
        for (int i = 0, size = observerList.size();
             i < size; i++) {
            observerList.get(i).update(modifiedValue);
        }
    }
}

public class ObserverPattern {

    public static void main(String[] args) {
        System.out.println("*** Modified Observer Pattern Demo***\n");
        Subject sub = new Subject();
        Observer1 ob1 = new Observer1();
        Observer2 ob2 = new Observer2();
        sub.register(ob1);
        sub.register(ob2);
        sub.setValue(5);
        System.out.println();
        sub.setValue(25);
        System.out.println();
        //unregister ob1 only
        sub.unregister(ob1);
        //Now only ob2 will observe the change
        sub.setValue(100);
    }
}

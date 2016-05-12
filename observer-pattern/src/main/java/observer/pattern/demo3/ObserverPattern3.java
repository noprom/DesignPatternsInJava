package observer.pattern.demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * ObserverPattern2
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 4/13/16 4:09 PM.
 */

interface IObserver {
    void update(String s, int value);
}

interface ISubject {
    void register(IObserver observer);

    void unregister(IObserver observer);

    void notifyObservers(int modifiedValue);
}

class Observer1 implements IObserver {

    public void update(String s, int value) {
        System.out.println("Observer1 in " + s + ": value has been changed to " + value);
    }
}

class Observer2 implements IObserver {

    public void update(String s, int value) {
        System.out.println("Observer2 in " + s + ": value has been changed to " + value);
    }
}

class Observer3 implements IObserver {

    public void update(String s, int value) {
        System.out.println("Observer3 in " + s + ": value has been changed to " + value);
    }
}

class Subject1 implements ISubject {

    private int value;

    List<IObserver> observerList = new ArrayList<IObserver>();

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers(value);
    }

    public void register(IObserver observer) {
        observerList.add(observer);
    }

    public void unregister(IObserver observer) {
        observerList.remove(observer);
    }

    public void notifyObservers(int modifiedValue) {
        for (int i = 0, size = observerList.size();
             i < size; i++) {
            observerList.get(i).update(getClass().getName(), value);
        }
    }
}

class Subject2 implements ISubject {

    private int value;

    List<IObserver> observerList = new ArrayList<IObserver>();

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers(value);
    }

    public void register(IObserver observer) {
        observerList.add(observer);
    }

    public void unregister(IObserver observer) {
        observerList.remove(observer);
    }

    public void notifyObservers(int modifiedValue) {
        for (int i = 0, size = observerList.size();
             i < size; i++) {
            observerList.get(i).update(getClass().getName(), value);
        }
    }
}

public class ObserverPattern3 {

    public static void main(String[] args) {
        System.out.println("*** Observer Pattern Demo3 ***\n");
        Subject1 sub1 = new Subject1();
        Subject2 sub2 = new Subject2();
        Observer1 ob1 = new Observer1();
        Observer2 ob2 = new Observer2();
        Observer3 ob3 = new Observer3();
        //Observer1 and Observer2 registers to Subject 1
        sub1.register(ob1);
        sub1.register(ob2);
        //Observer2 and Observer3 registers to Subject 2
        sub2.register(ob2);
        sub2.register(ob3);
        //Set new value to Subject 1
        //Observer1 and Observer2 get notification
        sub1.setValue(50);
        System.out.println();
        //Set new value to Subject 2
        //Observer2 and Observer3 get notification
        sub2.setValue(250);
        System.out.println();
        //unregister Observer2 from Subject 1
        sub1.unregister(ob2);
        //Set new value to Subject & only Observer1 is notified
        sub1.setValue(550);
        System.out.println();
        //ob2 can still notice change in Subject 2
        sub2.setValue(750);
    }
}

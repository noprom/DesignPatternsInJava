package iterator.pattern.demo;

import iterator.pattern.aggregate.Arts;
import iterator.pattern.aggregate.ISubject;
import iterator.pattern.aggregate.Science;
import iterator.pattern.iterator.IIterator;

/**
 * IteratorPatternEx
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/15/16 2:43 PM.
 */
public class IteratorPatternEx {

    public static void main(String[] args) {
        System.out.println("***Iterator Pattern Demo***\n");
        ISubject Sc_subject = new Science();
        ISubject Ar_subjects = new Arts();
        IIterator Sc_iterator = Sc_subject.createIterator();
        IIterator Ar_iterator = Ar_subjects.createIterator();
        System.out.println("\nScience subjects :");
        Print(Sc_iterator);
        System.out.println("\nArts subjects :");
        Print(Ar_iterator);
    }

    private static void Print(IIterator iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}

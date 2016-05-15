package iterator.pattern.aggregate;

import iterator.pattern.iterator.IIterator;

/**
 * ISubject
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/15/16 2:30 PM.
 */
public interface ISubject {
    IIterator createIterator();
}

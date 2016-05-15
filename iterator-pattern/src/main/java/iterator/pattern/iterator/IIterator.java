package iterator.pattern.iterator;

/**
 * IIterator
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/15/16 2:31 PM.
 */
public interface IIterator {

    void first();

    String next();

    Boolean isDone();

    String currentItem();
}

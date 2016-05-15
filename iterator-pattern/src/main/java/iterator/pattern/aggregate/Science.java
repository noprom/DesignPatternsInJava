package iterator.pattern.aggregate;

import iterator.pattern.iterator.IIterator;

import java.util.LinkedList;

/**
 * Science
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/15/16 2:39 PM.
 */
public class Science implements ISubject {

    private LinkedList<String> subjects;

    public Science() {
        subjects = new LinkedList<String>();
        subjects.addLast("Maths");
        subjects.addLast("Comp. Sc.");
        subjects.addLast("Physics");
    }

    public IIterator createIterator() {
        return new ScienceIntrator(subjects);
    }

    public class ScienceIntrator implements IIterator {

        private LinkedList<String> subjects;

        private int position;

        public ScienceIntrator(LinkedList<String> subjects) {
            this.subjects = subjects;
            position = 0;
        }

        public void first() {
            position = 0;
        }

        public String next() {
            return subjects.get(position++);
        }

        public Boolean isDone() {
            return position >= subjects.size();
        }

        public String currentItem() {
            return subjects.get(position);
        }
    }
}

package iterator.pattern.aggregate;

import iterator.pattern.iterator.IIterator;

/**
 * Arts
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/15/16 2:32 PM.
 */
public class Arts implements ISubject {
    private String[] subjects;

    public Arts() {
        subjects = new String[2];
        subjects[0] = "Bengali";
        subjects[1] = "English";
    }

    public IIterator createIterator() {
        return new ArtsIterator(subjects);
    }

    //Containing the ArtsIterator
    public class ArtsIterator implements IIterator {
        private String[] subjects;
        private int position;

        public ArtsIterator(String[] subjects) {
            this.subjects = subjects;
            position = 0;
        }

        public void first() {
            position = 0;
        }

        public String next() {
            return subjects[position++];
        }

        public Boolean isDone() {
            return position >= subjects.length;
        }

        public String currentItem() {
            return subjects[position];
        }
    }
}


package adapter.pattern.different.type.adapter;

/**
 * ClassAndObjectAdapter
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/10/16 9:32 AM.
 */
interface IIntegerValue {
    int getInteger();
}

class IntegerValue implements IIntegerValue {

    public int getInteger() {
        return 5;
    }
}

class ClassAdapter extends IntegerValue {
    //Incrementing by 2
    public int getInteger() {
        return 2 + super.getInteger();
    }
}

class ObjectAdapter {

    private IIntegerValue myInt;

    public ObjectAdapter(IIntegerValue myInt) {
        this.myInt = myInt;
    }

    //Incrementing by 2
    public int getInteger() {
        return 2 + this.myInt.getInteger();
    }
}

public class ClassAndObjectAdapter {

    public static void main(String args[]) {
        System.out.println("***Class and Object Adapter Demo***");
        ClassAdapter ca1 = new ClassAdapter();
        System.out.println("Class Adapter is returning :" + ca1.getInteger());
        ClassAdapter ca2 = new ClassAdapter();
        ObjectAdapter oa = new ObjectAdapter(new IntegerValue());
        System.out.println("Object Adapter is returning :" + oa.getInteger());
    }
}

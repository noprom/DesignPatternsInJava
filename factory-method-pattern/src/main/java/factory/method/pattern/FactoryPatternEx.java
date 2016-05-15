package factory.method.pattern;

/**
 * FactoryPatternEx
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/15/16 3:03 PM.
 */
interface IAnimal {
    void speak();
}

class Duck implements IAnimal {

    public void speak() {
        System.out.println("Duck says Pack-pack");
    }
}

class Tiger implements IAnimal {

    public void speak() {
        System.out.println("Tiger says: Halum..Halum");
    }
}

abstract class IAnimalFactory {
    public abstract IAnimal
    /*if we cannot instantiate in later stage, we'll throw exception*/
    getAnimalType(char type) throws Exception;
}

class ConcreteFactory extends IAnimalFactory {

    @Override
    public IAnimal getAnimalType(char type) throws Exception {
        switch (type) {
            case 'D':
                return new Duck();
            case 'T':
                return new Tiger();
            default:
                throw new Exception("Animal type : " + type + " cannot be instantiated");
        }
    }
}


public class FactoryPatternEx {

    public static void main(String[] args) throws Exception {
        System.out.println("***Factory Pattern Demo***\n");
        IAnimalFactory animalFactory = new ConcreteFactory();
        IAnimal DuckType = animalFactory.getAnimalType('D');
        DuckType.speak();
        IAnimal TigerType = animalFactory.getAnimalType('T');
        TigerType.speak();
        //There is no Lion type. So, an exception will be thrown
        IAnimal LionType = animalFactory.getAnimalType('L');
        LionType.speak();
    }
}

package intecbrussel.be.animal;

public class Dog extends Animal {
    private boolean hasFoulBreath;

    public Dog() {
        super();
    }

    public Dog(String dog1, int i, boolean b) {
    }

    @Override
    public boolean IsClean() {
        return false;
    }

    public Dog(boolean isClean, int age, String name, int animalNumber, boolean hasFoulBreath) {
        super(isClean, age, name, animalNumber);
        this.hasFoulBreath = hasFoulBreath;
    }

    public boolean isHasFoulBreath() {
        return hasFoulBreath;
    }

    public void setHasFoulBreath(boolean hasFoulBreath) {
        this.hasFoulBreath = hasFoulBreath;
    }
    @Override
    public void treatAnimal() {
        super.setClean(true);
        this.setHasFoulBreath(false);

    }
}

package intecbrussel.be.animal;

import intecbrussel.be.animal.Animal;

public class Monkey extends Animal {
    private boolean isHyperActive;

    public Monkey() {
        super();
    }

    public Monkey(String monkey1, int i, boolean b) {
    }

    @Override
    public boolean IsClean() {
        return false;
    }

    public Monkey(boolean isClean, int age, String name, int animalNumber, boolean isHyperActive) {
        super(isClean, age, name, animalNumber);
        this.isHyperActive = isHyperActive;
    }


    public boolean isHyperActive() {
        return isHyperActive;
    }

    public void setHyperActive(boolean hyperActive) {
        isHyperActive = hyperActive;
    }

    @Override
    public void treatAnimal() {
        super.setClean(true);
        this.setHyperActive(false);
    }
}

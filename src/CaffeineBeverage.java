public abstract class CaffeineBeverage {

    // Template Method
    final void prepareRecipe() {
        boilLiquid();
        brew();
        pourInCup();
        if (wantsLemon()) {
            addLemon();
        }
        if (wantsMilk()) {
            addMilk();
        }
        if (wantsSugar()) {
            addSugar();
        }
        dispense();
    }

    //hooks
    boolean wantsLemon() {
        return true;
    }

    boolean wantsMilk() {
        return true;
    }

    boolean wantsSugar() {
        return true;
    }
    //end hooks

    abstract void boilLiquid();
    abstract void brew();

    //abstract void addCondiments();
    public void addLemon() {
        System.out.println("Adding Lemon");
    }

    public void addMilk() {
        System.out.println("Adding Milk");
    }

    public void addSugar() {
        System.out.println("Adding Sugar");
    }

    public void pourInCup() {
        System.out.println("Pouring into Cup");
    }

    public void dispense() {
        System.out.println("Robot arm pushing cup through flap");
    }
}
public class Latte extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Pulling an espresso shot");
    }

    @Override
    public void addMilk() {
        System.out.println("Adding steamed Milk");
    }

    @Override
    public void addSugar() {
        System.out.println("Adding Pumpkin Chemicals");
    }

    @Override
    boolean wantsLemon() {
        return false;
    }

    @Override
    void boilLiquid() {
        System.out.println("Boiling water");
    }
}

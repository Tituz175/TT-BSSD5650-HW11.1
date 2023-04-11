public class Coffee extends CaffeineBeverage {
    @Override
    void boilLiquid() {
        System.out.println("Boiling water");
    }
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    boolean wantsLemon() {
        return false;
    }
}
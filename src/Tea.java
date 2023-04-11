public class Tea extends CaffeineBeverage {
    @Override
    void boilLiquid() {
        System.out.println("Boiling water");
    }

    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    boolean wantsMilk() {
        return false;
    }

    @Override
    boolean wantsSugar() {
        return false;
    }
}
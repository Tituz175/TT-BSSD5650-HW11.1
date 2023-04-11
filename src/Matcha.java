public class Matcha extends CaffeineBeverage {

    @Override
    void boilLiquid() {
        System.out.println("Boiling water");
    }

    @Override
    void brew() {
        System.out.println("Whisking powder in water");
    }

    @Override
    boolean wantsLemon() {
        return false;
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

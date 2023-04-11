public class DrPepper extends CaffeineBeverage {
    @Override
    void boilLiquid() {
        System.out.println("Boiling Dr. Pepper");
    }

    @Override
    void brew() {
        //do nothing
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

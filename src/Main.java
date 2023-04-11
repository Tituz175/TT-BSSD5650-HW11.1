public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Latte latte = new Latte();
        Tea tea = new Tea();
        Matcha matcha = new Matcha();
        DrPepper drPepper = new DrPepper();
        coffee.prepareRecipe();
        latte.prepareRecipe();
        tea.prepareRecipe();
        matcha.prepareRecipe();
        drPepper.prepareRecipe();
    }
}
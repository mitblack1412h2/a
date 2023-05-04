package demo.dp.tdtu;

public class CoffeeMachine {
    private CoffeeFactory coffeeFactory;
    private Coffee coffee;
    private Sugar sugar;

    public CoffeeMachine(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
        this.coffee = coffeeFactory.createCoffee();
        this.sugar = new Sugar();
    }

    public void makeCoffee() {
        System.out.println("Preparing coffee...");
        coffee.prepare();
        sugar.addSugar();
        System.out.println("Coffee is ready!");
    }
}






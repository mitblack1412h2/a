package demo.dp.tdtu;
public class CoffeeMaker {
    private BrewStrategy brewStrategy;


    public CoffeeMaker(BrewStrategy brewStrategy) {
        this.brewStrategy = brewStrategy;
    }

    public void makeCoffee() {
        grindCoffeeBeans();
        heatWater();
        brewStrategy.brewCoffee();
        pourInCup();
    }



    private void grindCoffeeBeans() {
        System.out.println("Grinding coffee beans...");
    }

    private void heatWater() {
        System.out.println("Heating water...");
    }

    private void pourInCup() {
        System.out.println("Pouring coffee into cup...");
    }
}


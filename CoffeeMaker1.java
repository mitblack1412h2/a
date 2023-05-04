package demo.dp.tdtu;
import java.util.ArrayList;
import java.util.List;
public class CoffeeMaker1 {
    private boolean isCoffeeMade;
    private List<CoffeeMakerObserver> observers = new ArrayList<>();

    public void makeCoffee() {
        grindCoffeeBeans();
        heatWater();
        brewCoffee();
        pourInCup();
        isCoffeeMade = true;
        notifyObservers();
    }

    public void addObserver(CoffeeMakerObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(CoffeeMakerObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (CoffeeMakerObserver observer : observers) {
            observer.onCoffeeMade();
        }
    }

    private void grindCoffeeBeans() {
        System.out.println("Grinding coffee beans...");
    }

    private void heatWater() {
        System.out.println("Heating water...");
    }

    private void brewCoffee() {
        System.out.println("Brewing coffee...");
    }

    private void pourInCup() {
        System.out.println("Pouring coffee into cup...");
    }
}

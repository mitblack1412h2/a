package demo.dp.tdtu;

public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeFactory espressoFactory = new EspressoFactory();
        CoffeeMachine espressoMachine = new CoffeeMachine(espressoFactory);
        espressoMachine.makeCoffee();
        System.out.println("------------------------------");

        CoffeeFactory cappuccinoFactory = new CappuccinoFactory();
        CoffeeMachine cappuccinoMachine = new CoffeeMachine(cappuccinoFactory);
        cappuccinoMachine.makeCoffee();
        System.out.println("------------------------------");

        CoffeeMaker coffeeMaker = new CoffeeMaker(new DripBrewStrategy());
        coffeeMaker.makeCoffee();
        System.out.println("------------------------------");

        CoffeeMaker1 coffeeMaker1 = new CoffeeMaker1();
        CoffeeMakerObserver observer1 = new CoffeeMakerObserver(){
            @Override
            public void onCoffeeMade() {
                System.out.println("Observer 1: Yay, coffee is ready!");
            }
        };
        CoffeeMakerObserver observer2 = new CoffeeMakerObserver() {
            @Override
            public void onCoffeeMade() {
                System.out.println("Observer 2: Time to wake up and smell the coffee!");
            }
        };

        coffeeMaker1.addObserver(observer1);
        coffeeMaker1.addObserver(observer2);
        coffeeMaker1.makeCoffee();
        coffeeMaker1.removeObserver(observer1);
        coffeeMaker1.makeCoffee();
    }
}

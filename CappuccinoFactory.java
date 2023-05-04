package demo.dp.tdtu;

public class CappuccinoFactory implements CoffeeFactory{
    public Coffee createCoffee() {
        return new Cappuccino();
    }
}

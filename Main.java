public class Main {
    public static void main(String[] args) {
        ShippingCostCalculator calculator = new ShippingCostCalculator();

        Chair chair = new Chair(1);
        Table table = new Table(40);
        Sofa sofa = new Sofa(3, 100);
        Lamp lamp = new Lamp(3);

        chair.accept(calculator);
        table.accept(calculator);
        sofa.accept(calculator);
        lamp.accept(calculator);

        System.out.println("Shipping cost: $" + calculator.getShippingCost());
    }
}
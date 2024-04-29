public class Lamp implements Furniture {
    private int weight;

    public Lamp(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visitLamp(this);
    }
}

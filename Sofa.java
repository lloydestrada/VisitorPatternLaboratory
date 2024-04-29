public class Sofa implements Furniture {
    private int size;
    private int distance;

    public Sofa(int size, int distance) {
        this.size = size;
        this.distance = distance;
    }

    public int getSize() {
        return size;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visitSofa(this);
    }
}

public class Chair implements Furniture {
    private int size;

    public Chair(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visitChair(this);
    }
}
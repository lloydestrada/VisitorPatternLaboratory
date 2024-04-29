public class ShippingCostCalculator implements ShippingCostVisitor {
    private int shippingCost;
    public void visitChair(Chair chair) {
        // Flat rate for shipping chairs
        shippingCost += 10;
    }


    public void visitTable(Table table) {
        // Shipping cost for tables based on size
        if (table.getSize() < 50) {
            shippingCost += 20;
        } else {
            shippingCost += 30;
        }
    }


    public void visitSofa(Sofa sofa) {
        // Shipping cost for sofas based on size and distance
        shippingCost += (sofa.getSize() * 2) + (sofa.getDistance() / 10);
    }

    public int getShippingCost() {
        return shippingCost;
    }

    public void visitLamp(Lamp lamp) {
        // Shipping cost for lamps based on weight
        if (lamp.getWeight() < 5) {
            shippingCost += 5;
        } else {
            shippingCost += 10;
        }
    }
}
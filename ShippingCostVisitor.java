public interface ShippingCostVisitor {
    void visitChair(Chair chair);
    void visitTable(Table table);
    void visitSofa(Sofa sofa);
    void visitLamp(Lamp lamp);
}
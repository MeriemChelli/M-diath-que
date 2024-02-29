package mediatheque;

public class ItemPrinter implements ItemVisitor{
    @Override
    public void visit(Book m) {
        System.out.println("VisitéBook : " + m);
    }

    @Override
    public void visit(CD m) {
        System.out.println("VisitéCD : " + m);
    }
}
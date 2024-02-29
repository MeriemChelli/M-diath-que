
package mediatheque;
public class BookPrinter implements ItemVisitor {
    @Override
    public void visit(Book m) {
        System.out.println("VisitéBook : " + m);
    }

    @Override
    public void visit(CD m) {
    }
}
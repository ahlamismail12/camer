//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("camera", " Auto focus ...",99,10,5,'R') ;

       p1.setPrice(80);
        Product p2 = new Product (p1);
        p2.display();
    }
}


public class Product {

    private String name ;
    private String description;
    private float price;
    private int quantity;
    private float discount;
    private char color;

    public Product (){
       this.name = " No name ";
       this.description = "No description";
       this.price = 0.0f;
       this.quantity = 0;
       this.discount = 0f;
    }

    public Product ( String n, String d , float p , int q , float dis) {

        this.name = n;
        this.description = d;
        this.price = p;
        this.quantity = q;
        this.discount = dis;
    }

    //Product p1 = new Product("camera", " Auto focus ...",99,10,5,'R') ;


    public Product( Product p1){
        this(p1.name, p1.description, p1.price, p1.quantity, p1.discount, p1.color);
    }

// public product ( strind n ,int w , floit s )

    public Product ( String n, String d , float p , int q , float dis,char c ) {
        this(n, d, p, q, dis);
        this.color = c;

    }

    public Product( String n, String d , float p){
        this.name = n;
        this.description = d;
        this.price = p;

    }
        public void display (){
        System.out.println(" Name = "+ name);
        System.out.println(" description = "+ description);
        System.out.println(" price = "+ price );
        System.out.println(" quantity = "+ quantity );
        System.out.println(" discount = "+ discount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {

        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
}


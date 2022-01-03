package test12;

public class Book {
	private int id;
    private String name;
    private double price;
    private String outer;
    
    public Book() {
    }
    public Book(int id,String name ,double price ,String outer) {
   	 this.id=id;
   	 this.name=name;
   	 this.price=price;
   	 this.outer=outer;
    }
    public void setId(int id) {
   	 this.id=id;
    }
    public int getId() {
   	 return this.id;
    }
    public void setName(String name) {
   	 this.name=name;
    }
    public String getName() {
   	 return this.name;
    }
    public void setPrice(double price) {
   	 this.price=price;
    }
    public double getPrice() {
   	 return this.price;
    }
    public void setOuter(String outer) {
   	 this.outer=outer;
    }
    public String getOuter() {
   	 return this.outer;
    } 
}

class shoppingcart {
private String ProductName;
private int quantity;
private double price;
shoppingcart(String ProductName, int quantity, double price){
setProduct(ProductName);
setQuantity(quantity);
setPrice(price);
}
   void setProduct(String Productname) {
        if (Productname == null || Productname.isBlank()) {
            System.out.println("Invalid product name.");
            return;
        }
        this.ProductName = Productname;
    }
      void setQuantity(int quantity) {
        if(quantity<=0){
            System.out.println("invalid quantity");
            return;
        }
        this.quantity = quantity;
        
    }
      void setPrice(double price) {
        if(price<=0){
            System.out.println("invalid price");
            return;
        }
        this.price = price;
        
    }

    void addItems(int amount){
        if(amount<=0){
            System.out.println("add iteams ");
            return;
        }
        if(amount > quantity){
    System.out.println("Not Enough Items");
    return;
}
        quantity+=amount;
    }
  void removeItems(int amount){
    if(amount<=0){
        System.out.println("Not Enough Items");
        return;
    }
    quantity-=amount;
  }  
  double calculateTotal(){
    double total = quantity * price;
return total;
  }
  void displaybill(){
    System.out.println("----------BILL----------");
    System.out.println("Product : " + this.ProductName);
    System.out.println("Quantity : " + this.quantity);
    System.out.println("Price : " + this.price);
    System.out.println("Total : " + calculateTotal());
    System.out.println("-----------------------");

  }
}

public class shoopingcart{
    public static void main(String[] args) {
        shoppingcart sc = new shoppingcart("tablet", 5, 1000);
        sc.addItems(2);
        sc.removeItems(3);
        sc.calculateTotal();
        sc.displaybill();
    }
}

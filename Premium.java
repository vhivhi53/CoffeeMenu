package shop;

public class Premium extends Customer {



private String price;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int Discount;
    public Premium(String firstName, String lastName, String phoneNumber, int Discount){
        super(firstName, lastName, phoneNumber);
       this.Discount = Discount;
        
    }
    public int getDiscount() {
        return Discount;
    }
    public void setDiscount(int discount) {
        Discount = discount;
    }

    //public void setprice(){

        //type casting
        //string convert to int back to string 
       // int price2 = Integer.parseInt(price);
        //this.price = String.valueOf(Integer.parseInt(price - 1));
   // }
public String toString(){
    return "Name: " + getfirstName() +" " + getlastName() + getphoneNumber();
}
public void prepare(String text){
    String[] lines = text.split("\n");
    for (String line : lines) {
        if (line.contains("$")) {
            String[] parts = line.split("\\$"); // Split by the dollar sign
            if (parts.length == 2) {
                String coffeeType = parts[0].trim(); // Extract coffee type
                try {
                    double price = Double.parseDouble(parts[1].trim()); // Extract price
                    double total = 0.0;
                    total += price;
                } catch (NumberFormatException e) {
                    // Handle invalid price format
                    e.printStackTrace(); // or any other appropriate action
                }
            }
        }
    }
    
}
}


    


package shop;
public abstract class Customer {
    //make subclass 



    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String size;

    public Customer(String firstName, String lastName,String phoneNumber, String size){

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getfirstName(){
        return firstName;
    }
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public String getphoneNumber(){
        return phoneNumber;
    }
    public void setphoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public abstract void prepare(String Text);



}





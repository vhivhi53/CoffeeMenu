package shop;
//where will you use this class
//in file build 
//for button?
public class Regular extends Customer{
    private String firstName;
    private String lastName;
    private String phoneNumber;


    public Regular(String firstName, String lastName, String phoneNumber, String size){
        super(firstName, lastName, phoneNumber);
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;

    }


    @Override
    public String toString(){
        return "\n" + "Name: " + getfirstName()+" " + getlastName() + "\n" + "phone number: " +" " + getphoneNumber();
    }


    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'prepare'");
    }

}
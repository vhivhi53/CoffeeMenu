package shop;
public class Espresso {
    //latte
    //ameri
    //cap
    //set milk 

    private String latte;
    private String Americano;
    private String Cappucino;
    //create specific types of milk
    private String Milk;


    public Espresso(String latte, String Americano, String Cappucino){
        super();//from coffee class 
        this.latte = latte; 
        this.Americano = Americano;
        this.Cappucino = Cappucino;
    }

    public String getAmericano() {
        return "3.00";
    }

    public void setAmericano(String americano) {
        this.Americano = americano;
    }

    public String getCappucino() {
        return "3.06";
    }

    public void setCappucino(String cappucino) {
        this.Cappucino = cappucino;
    }


    public String getLatte() {
        return "3.12";
    }

    public void setLatte(String latte) {
        this.latte = latte;
    }




}

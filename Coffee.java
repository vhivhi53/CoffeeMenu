package shop;

public class Coffee extends Customer{

  //list options
  private String lightRoast;
  private String darkRoast;
  private String mediumRoast;
  private String None;
  private String heavyCream;

  public String getSyrup() {
    return "\n" + "Classic Syrup 1.00";
  }





  public void setSyrup(String syrup) {
    Syrup = syrup;
  }











  private String Syrup;

  public String getHeavyCream() {
    return "\n" + "HeavyCream 1.00";
  }





  public void setHeavyCream(String heavyCream) {
    this.heavyCream = heavyCream;
  }





  public String getNone() {
    return "\n" + "No Milk 0.00";
  }





  public void setNone(String None) {
    this.None = None;
  }





  public Coffee(String firstName, String lastName, String phoneNumber,String Size)
  {
    super(firstName, lastName, phoneNumber);
    this.lightRoast = lightRoast;
    this.darkRoast = darkRoast;
    this.mediumRoast = mediumRoast;
    this.None = None; 

}





    public String getmediumRoast() {
    return "\n" + "Medium Roast 2.06";
  }


  public void setmediumRoast(String mediumRoast) {
    this.mediumRoast = mediumRoast;
  }


    public String getlightRoast() {
    return " \n"+ "Light Roast 2.00";
  }

  public void setlightRoast(String lightRoast) {
    this.lightRoast = lightRoast;
  }



public String getdarkRoast() {
      return "\n" + "Dark Roast $2.12";
    }

    public void setdarkRoast(String darkRoast) {
      this.darkRoast = darkRoast;
    }












    @Override
    public void prepare() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'prepare'");
    }

}
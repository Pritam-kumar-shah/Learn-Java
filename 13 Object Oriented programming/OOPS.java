public class OOPS {
  public static void main(String[] args) {
    Pen p1 = new Pen(); // Created a pen object calles p1
    p1.setColor("Blue");
    System.out.println(p1.getcolor());
    p1.setTip(5);
    System.out.println(p1.getTip());
    p1.setColor("yellow");
    System.out.println(p1.getcolor());
    
    
    bankAccount myAcc = new bankAccount();
    myAcc.username = "Pritam9325";
    System.out.println(myAcc.username);
    myAcc.setPassword("Pritam.123");
    
  }  
}

class bankAccount{
  public String username;
  private String password;
  public void setPassword(String pwd){
    password = pwd;
  }
}

class Pen {
    private String color;
    private int tip;

    String getcolor(){
      return this.color;
    }

    int getTip(){
      return this.tip;
    }

   void setColor(String newColor){
    this.color = newColor;
   }

   void setTip(int newTip){
    this.tip = newTip;
   }
}


import java.lang.*;

class Year2020{ //extends Object class if no parent class is present
 
      Year2020(){
        //super(); it calls the constructor of object parent class
         System.out.println("Constructor");      //now it will print
      }

  static public void main(String []args){

              System.out.println("this will run before constructor");
              Year2020 o= new Year2020();
   }


}
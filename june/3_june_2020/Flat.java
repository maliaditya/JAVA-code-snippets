class Flat{

    int  mob=10;
    static int tv=20;

    static{

            System.out.println("static block This will run 1st");
      }

  Flat(){

   System.out.println("constructor This will run after static block");
}
     
       public static void main(String args[]){

       Flat f= new Flat();
      System.out.println("this will run after constructer");

     }


}
class Instagram{


    static int globalPost(Instagram a){
        System.out.print("Is Object instance of Instagram:  " );
        System.out.println(a instanceof Instagram);

        return 0;
    }

    void closeFriends(){
        System.out.println("Instance Method");
    }

  
}

class Facebook{

    public static void main(String[] args) {
        Instagram obj = new Instagram();
        String a = null;
        int num1 = 10 ;
        int num2 = 20;
        int ans ;

        ans = (num1 < num2)? Instagram.globalPost(obj) : num2;
        

     }

}
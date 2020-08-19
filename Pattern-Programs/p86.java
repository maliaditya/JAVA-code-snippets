/*
Pattern86

      *       *
       *     *
        *   *
         * *
          *

*/



class Pattern86{


    public static void main(String[] args) {
        int s=0 ,p=4;
        for(int i=1;i<=5;i++){

            for(int j=0;j<5;j++){
                if(j<s)
                System.out.print(" ");
                else{
                if(j==s || j==p){
                System.out.print("* ");
                    
                } else
                    System.out.print("  ");
            }
            }
            s++;

            System.out.println();
        }
    }
}

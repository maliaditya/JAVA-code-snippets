/*
Pattern65
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
*/

class Pattern65{

    public static void main(String[] args) {
        
        int j,count=1;

        for(int i=1;i<=5;i++){
            for (j=5;j>0;j--){
                if (j>count){
                System.out.print(" ");
                }else{
                System.out.print(i+" ");
                }

            }

            count++;
        
        System.out.println();
        }   
    }
}
/*

Pattern66
     1
    1 2 
   1 2 3 
  1 2 3 4
 1 2 3 4 5

*/

class Pattern66{

    public static void main(String[] args) {
        
        int j,count=1,p =1;

        for(int i=1;i<=5;i++){
            for (j=5;j>0;j--){
                if (j>count){
                System.out.print(" ");
                }else{
                System.out.print(p+" ");
                p++;
                }

            }
            p = 1;
            count++;
        
        System.out.println();
        }   
    }
}
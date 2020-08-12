/*
Pattern68
     A
    A B
   A B C
  A B C D
 A B C D E
*/

class Pattern28{

    public static void main(String[] args) {
        
        int j,count=1, p=65;

        for(int i=1;i<=5;i++){
            for (j=5;j>0;j--){
                if (j>count){
                System.out.print(" ");
                }else{
                System.out.print((char)(p)+" ");
                p++;
                }

            }
            p=65;
            count++;
        
        System.out.println();
        }   
    }
}
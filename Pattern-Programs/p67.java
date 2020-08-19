/*
Pattern67
     A
    B B
   C C C
  D D D D
 E E E E E
*/

class Pattern67{

    public static void main(String[] args) {
        
        int j,count=1;

        for(int i=1,c=64;i<=5;i++){
            for (j=5;j>0;j--){
                if (j>count){
                System.out.print(" ");
                }else{
                System.out.print((char)(c+i)+" ");
                }

            }
            count++;
        
        System.out.println();
        }   
    }
}
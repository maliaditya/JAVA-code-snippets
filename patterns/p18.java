/*

Pattern18
A A A A A
B B B B
C C C 
D D 
E 
*/

class Pattern18{

    public static void main(String[] args) {
        
        int j,count = 5;

        for(int i=1,c= 64;i<=5;i++){
            for (j=1;j<=5;j++){
                if(j<=count)
                System.out.print((char)(c+i)+ " ");
                else
                System.out.print(" ") ;             

            }
            count--;
        
        System.out.println();
        }   
    }
}
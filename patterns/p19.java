/*

Pattern19
A B C D E
A B C D
A B C
A B
A

*/

class Pattern19{

    public static void main(String[] args) {
        
        int j,count = 5;

        for(int i=1,c= 64;i<=5;i++){
            for (j=1;j<=5;j++){
                if(j<=count)
                System.out.print((char)(c+j)+ " ");
                else
                System.out.print(" ") ;             

            }
            count--;
        
        System.out.println();
        }   
    }
}
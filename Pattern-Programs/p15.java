/*

Pattern14
A 
A B
A B C
A B C D
A B C D E
*/

class Pattern14{

    public static void main(String[] args) {
        
        int j;

        for(int i=1,c= 64;i<=5;i++){
            for (j=1;j<=5;j++){
                if (j>i){
                System.out.print("  ");
                }else{
                System.out.print((char)(c+j)+ " ");
                }

            }
        
        System.out.println();
        }   
    }
}
/*
Pattern5
A B C D E
A B C D E 
A B C D E
A B C D E
A B C D E
*/

class Pattern5{

    public static void main(String[] args) {
        
        int j;

        for(int i=1,c=64;i<=5;i++){
            for (j=1;j<=5;j++){
            System.out.print((char)(c+j)+" ");
            }
        
        System.out.println();
        }   
    }
}
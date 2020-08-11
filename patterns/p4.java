/*
Pattern4
A A A A A
B B B B B
C C C C C
D D D D D
E E E E E
*/

class Pattern4{

    public static void main(String[] args) {
        
        int i,j,c=64;

        for(i=1;i<=5;i++){
            for (j=1;j<=5;j++){
            System.out.print((char)(c+i)+" ");
            }
        
        System.out.println();
        }   
    }
}
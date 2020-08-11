/*
Pattern8
E E E E E
D D D D D
C C C C C
B B B B B
A A A A A
*/

class Pattern8{

    public static void main(String[] args) {
        
        int j;

        for(int i=5,c=64;i>0;i--){
            for (j=5;j>0;j--){
                System.out.print((char)(c+i)+" ");

            }
        
        System.out.println();
        }   
    }
}
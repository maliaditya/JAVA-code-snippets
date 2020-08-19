/*


Pattern13
A
B B 
C C C
D D D D
E E E E E
*/

class Pattern13{

    public static void main(String[] args) {
        
        int j;

        for(int i=1,c= 64;i<=5;i++){
            for (j=1;j<=5;j++){
                if (j>i){
                System.out.print("  ");
                }else{
                System.out.print((char)(c+i)+ " ");
                }

            }
        
        System.out.println();
        }   
    }
}
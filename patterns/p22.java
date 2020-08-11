/*

Pattern22
E E E E E
D D D D
C C C
B B 
A
*/

class Pattern22{

    public static void main(String[] args) {
        
        int j,count=1;

        for(int i=5,c=64;i>0;i--){
            for (j=5;j>0;j--){
                if (j<count){
                System.out.print("  ");
                }else{
                System.out.print((char)(c+i)+ " ");
                }

            }

            count++;
        
        System.out.println();
        }   
    }
}
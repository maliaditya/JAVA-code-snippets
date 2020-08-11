/*

Pattern23
E D C B A
E D C B
E D C
E D
E
*/

class Pattern23{

    public static void main(String[] args) {
        
        int j,count=1;

        for(int i=5,c=64;i>0;i--){
            for (j=5;j>0;j--){
                if (j<count){
                System.out.print("  ");
                }else{
                System.out.print((char)(c+j)+ " ");
                }

            }

            count++;
        
        System.out.println();
        }   
    }
}
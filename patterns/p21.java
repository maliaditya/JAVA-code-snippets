/*

Pattern20
5 5 5 5 5
4 4 4 4
3 3 3
2 2 
1 
*/

class Pattern21{

    public static void main(String[] args) {
        
        int j,count=1;

        for(int i=5;i>0;i--){
            for (j=5;j>0;j--){
                if (j<count){
                System.out.print("  ");
                }else{
                System.out.print(j+ " ");
                }

            }

            count++;
        
        System.out.println();
        }   
    }
}
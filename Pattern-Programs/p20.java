/*

Pattern20
5 5 5 5 5
4 4 4 4
3 3 3
2 2 
1 
*/

class Pattern20{

    public static void main(String[] args) {
        
        int j,count=5;

        for(int i=5;i>0;i--){
            for (j=1;j<=5;j++){
                if (j>count){
                System.out.print("  ");
                }else{
                System.out.print(i+ " ");
                }

            }

            count--;
        
        System.out.println();
        }   
    }
}
/*
Pattern11
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/

class Pattern10{

    public static void main(String[] args) {
        
        int j;

        for(int i=1;i<=5;i++){
            for (j=1;j<=5;j++){
                if (j>i){
                System.out.print("  ");
                }else{
                System.out.print(i+ " ");
                }

            }
        
        System.out.println();
        }   
    }
}
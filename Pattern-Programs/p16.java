/*

Pattern16
1 1 1 1 1
2 2 2 2
3 3 3
4 4
5
*/

class Pattern16{

    public static void main(String[] args) {
        
        int j,count = 5;

        for(int i=1;i<=5;i++){
            for (j=1;j<=5;j++){
                if(j<=count)
                System.out.print(i+ " ");
                else
                System.out.print(" ") ;             

            }
            count--;
        
        System.out.println();
        }   
    }
}
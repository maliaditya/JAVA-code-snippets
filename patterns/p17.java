/*

Pattern17
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

class Pattern17{

    public static void main(String[] args) {
        
        int j,count = 5;

        for(int i=1;i<=5;i++){
            for (j=1;j<=5;j++){
                if(j<=count)
                System.out.print(j+ " ");
                else
                System.out.print(" ") ;             

            }
            count--;
        
        System.out.println();
        }   
    }
}
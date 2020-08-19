/*
Pattern75
      *
     * *
    * * *
   * * * *
  * * * * *
   * * * *
    * * *
     * *
      *
*/

class Pattern76{

    public static void main(String[] args) {
        
        int count=1;

        for(int i=1;i<=5;i++){
            System.out.print(" ");

            for (int j=5;j>0;j--){
                if (j>count){
                System.out.print(" ");
                }else{
                System.out.print(i+ " ");
                }
            }
            count++;
        System.out.println();
        }   

    
        int p=4;
        for(int i=0;i<4;i++){
            System.out.print("  ");
            for (int j=0;j<4;j++){
                if(j<i)
                System.out.print(" ");
                else
                System.out.print(p+" ");

            }
            p--;
        System.out.println();
        }      
    }
}
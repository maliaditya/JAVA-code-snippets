/*
Pattern88

      5       5
       4     4
        3   3
         2 2
          1

*/



class Pattern88{


    public static void main(String[] args) {
        int s=0 ,p=4;
        for(int i=5;i>0;i--){

            for(int j=0;j<5;j++){
                if(j<s)
                System.out.print(" ");
                else{
                if(j==s || j==p){
                System.out.print(i+" ");
                    
                } else
                    System.out.print("  ");
            }
            }
            s++;

            System.out.println();
        }
    }
}

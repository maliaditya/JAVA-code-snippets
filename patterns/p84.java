/*
Pattern84
          A
         B B
        C   C
       D     D
      E       E

*/



class Pattern84{


    public static void main(String[] args) {
        int s=4 ,p=4;
        for(int i=1;i<=5;i++){

            for(int j=0;j<5;j++){
                if(j<s)
                System.out.print(" ");
                else{
                if(j==s || j==p){
                System.out.print((char)(64+i)+ " ");
                    
                } else
                    System.out.print("  ");
            }
            }
            s--;

            System.out.println();
        }
    }
}

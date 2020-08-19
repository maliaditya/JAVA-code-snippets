/*
Pattern87

      1       1
       2     2
        3   3
         4 4
          5

*/



class Pattern87{


    public static void main(String[] args) {
        int s=0 ,p=4;
        for(int i=1;i<=5;i++){

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

/*
Pattern92
           1
          2 2
         3   3
        4     4
       5       5
        4     4
         3   3
          2 2
           1

*/



class Pattern92{

    public static void main(String[] args) {
        int s=4 ,p=4;
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
            s--;

            System.out.println();
        }

        s=1; p=4;
        for(int i=4;i>0;i--){

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

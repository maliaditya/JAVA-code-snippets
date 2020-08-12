/*
Pattern85
          E
         D D
        C   C
       B     B
      A       A

*/



class Pattern85{


    public static void main(String[] args) {
        int s=4 ,p=4;
        for(int i=5;i>0;i--){

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

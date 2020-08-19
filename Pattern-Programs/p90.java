/*
Pattern90

      E       E
       D     D
        C   C
         B B
          A

*/



class Pattern90{


    public static void main(String[] args) {
        int s=0 ,p=4;
        for(int i=5;i>0;i--){

            for(int j=0;j<5;j++){
                if(j<s)
                System.out.print(" ");
                else{
                if(j==s || j==p){
                System.out.print((char)(64+i)+" ");
                    
                } else
                    System.out.print("  ");
            }
            }
            s++;

            System.out.println();
        }
    }
}

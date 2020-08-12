/*
Pattern79
      A
     B B
    C C C
   D D D D
  E E E E E
   D D D D
    C C C
     B B
      A
*/

class Pattern79{

    public static void main(String[] args) {
        
        int count=1;

        for(int i=1;i<=5;i++){
            System.out.print(" ");

            for (int j=5;j>0;j--){
                if (j>count){
                System.out.print(" ");
                }else{
                System.out.print((char)(64+i)+ " ");
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
                System.out.print((char)(64+p)+" ");

            }
            p--;
        System.out.println();
        }      
    }
}
/*

Pattern33
A B C D E
  A B C D
    A B C 
      A B
        A
*/

class Pattern33{

    public static void main(String[] args) {
        
        int j,p=1;
  
        for(int i=0,c=64;i<5;i++){
            for (j=0;j<5;j++){
                if(j<i){
                System.out.print("  ");
                }
                else{
                System.out.print((char)(c+p)+" ");
                p++;}
  
            }
            p=1;
        System.out.println();
        }   
    }
  }
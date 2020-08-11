/*

Pattern41
        A
      A B C 
    A B C D E 
  A B C D E F G
A B C D E F G H I
*/

class Pattern{

    public static void main(String[] args) {
        
        int fspace=4,bspace=4, p=1;
  
        for(int i=1,c=64;i<=5;i++){
        
            for(int j=0;j<9;j++){
                if(j<fspace || j>bspace){
                    System.out.print("  ");
                } else{
                    
                    System.out.print((char)(c+p)+" ");
                    p++;
                    
                }
            }
            p=1;
            fspace--;
            bspace++;
           
        System.out.println();
        }   
    }
  }
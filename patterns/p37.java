/*

Pattern37
        A
      B B B
    C C C C C
  D D D D D D D
E E E E E E E E E
*/

class Pattern37{

    public static void main(String[] args) {
        
        int fspace=4,bspace=4;
  
        for(int i=1,c=64;i<=5;i++){
        
            for(int j=0;j<9;j++){
                if(j<fspace || j>bspace){
                    System.out.print("  ");
                } else{
                    
                    System.out.print((char)(c+i)+" ");
                    
                }
            }
            fspace--;
            bspace++;
           
        System.out.println();
        }   
    }
  }
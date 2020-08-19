/*

Pattern38
        A
      C C C 
    E E E E E
  G G G G G G G
I I I I I I I I I
*/

class Pattern38{

    public static void main(String[] args) {
        
        int fspace=4,bspace=4;
  
        for(int i=1,c=64;i<=9;i++){
            if(i%2==0)
                continue;
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
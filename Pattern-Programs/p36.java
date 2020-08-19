/*

Pattern36
        1
      3 3 3 
    5 5 5 5 5 
  7 7 7 7 7 7 7
9 9 9 9 9 9 9 9 9 
*/

class Pattern36{

    public static void main(String[] args) {
        
        int fspace=4,bspace=4;
  
        for(int i=1;i<=9;i++){
            if(i%2==0)
                continue;
            for(int j=0;j<9;j++){
                if(j<fspace || j>bspace){
                    System.out.print("  ");
                } else{
                    
                    System.out.print(i+" ");
                    
                }
            }
            fspace--;
            bspace++;
           
        System.out.println();
        }   
    }
  }
/*


Pattern39
        1
      1 2 3
    1 2 3 4 5 
  1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9
*/

class Pattern39{

    public static void main(String[] args) {
        
        int fspace=4,bspace=4, p=1;
  
        for(int i=1;i<=5;i++){
        
            for(int j=0;j<9;j++){
                if(j<fspace || j>bspace){
                    System.out.print("  ");
                } else{
                    
                    System.out.print(p+" ");
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
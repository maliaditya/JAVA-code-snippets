/*

Pattern44
        0
      1 0 1
    2 1 0 1 2
  3 2 1 0 1 2 3
4 3 2 1 0 1 2 3 4
*/

class Pattern44{

    public static void main(String[] args) {
        
        int fspace=4,bspace=4;
  
        for(int i=1,c=65,counter=4;i<=5;i++){

            for(int j=0;j<9;j++){
                if(j<fspace || j>bspace){
                    System.out.print("  ");
                    
                } else{
                    
                    System.out.print(j-counter < 0 ? (char)(c + (-(j-counter)))+" " : (char)(c+j-counter) +" ");
                    
                }
            }
            fspace--;
            bspace++;
           
        System.out.println();
        }   
    }
  }
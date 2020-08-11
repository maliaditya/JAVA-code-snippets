/*

Pattern40
        1
      3 2 1
    5 4 3 2 1
  7 6 5 4 3 2 1
9 8 7 6 5 4 3 2 1
*/

class Pattern40{

    public static void main(String[] args) {
        
        int fspace=4,bspace=4;
  
        for(int i=1;i<=9;i++){
            if(i%2==0)
                continue;
            int temp= i;
            for(int j=0;j<9;j++){
                if(j<fspace || j>bspace){
                    System.out.print("  ");
                } else{
                    
                    System.out.print(temp+" ");
                    temp--;
                    
                }
            }
            fspace--;
            bspace++;
           
        System.out.println();
        }   
    }
  }
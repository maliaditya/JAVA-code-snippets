/*

Pattern35
        1
      2 2 2 
    3 3 3 3 3
  4 4 4 4 4 4 4
5 5 5 5 5 5 5 5 5
*/

class Pattern35{

    public static void main(String[] args) {
        
        int fspace=4,bspace=4;
  
        for(int i=1;i<=5;i++){
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
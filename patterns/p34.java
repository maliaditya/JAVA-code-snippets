/*

Pattern34
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * * 
*/

class Pattern34{

    public static void main(String[] args) {
        
        int fspace=4,bspace=4;
  
        for(int i=0;i<5;i++){
            for(int j=0;j<9;j++){
                if(j<fspace || j>bspace){
                    System.out.print("  ");
                } else{
                    System.out.print("* ");
                }
            }
            fspace--;
            bspace++;
           
        System.out.println();
        }   
    }
  }
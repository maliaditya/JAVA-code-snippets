/*
Pattern31
1 2 3 4 5
  1 2 3 4
    1 2 3
      1 2 
        1
*/

class Pattern31{

    public static void main(String[] args) {
        
        int j, p=1;

        for(int i=0;i<5;i++){
            for (j=0;j<5;j++){
                if(j<i){
                System.out.print("  ");
                }else{
                System.out.print(p+" ");
                p++;}

            }
        p=1;
        System.out.println();
        }   
    }
}
/*
Pattern78
       1
      1 2
     1 2 3
    1 2 3 4
   1 2 3 4 5
    1 2 3 4
     1 2 3
      1 2
       1
 */


class Pattern78{


    public static void main(String[] args) {
        
        int p=1;
        for(int i=4;i>0;i--){

            System.out.print(" ");

            for(int j=1;j<=4;j++){
                
                if(j<i){

                System.out.print(" ");

                } else{

                System.out.print(p+" ");
                p++;
                }
            }
            p=1;
            System.out.println();
        }

        for(int i=1;i<=5;i++){

            for(int j=1;j<=5;j++){

                if(i>j){

                    System.out.print(" ");

                } else {

                    System.out.print(p+" ");
                    p++;
                }
            }
            p=1;
            System.out.println();


        }
    }
}
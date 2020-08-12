
class Patter46{


    public static void main(String[] args) {
        
        int fspace=4,bspace=4;

        for(int i=0,c=65;i<5;i++){

            for(int j=0;j<=9;j++){
                
                if(j<fspace || j>bspace){

                    System.out.print("  ");

                } else {
                    if(j<=4){

                    System.out.print((char)c+" ");
                    c++;

                    } else{
                        
                        System.out.print((char)(60+j)+" ");
                        

                    }

                }


            }
            c=65;
            fspace--;
            bspace++;
            System.out.println();
        }
    }
}
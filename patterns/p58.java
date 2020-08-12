/*

Pattern57
D
D C
D C B
D C B A
D C B
D C
D 

*/ 



class Pattern58{

    public static void main(String[] args) {

        
     
        for(int i=0;i<4;i++){
            for (int j=0;j<4-i;j++){

                System.out.print(j+i);
            }
            System.out.println();

        }

        

    }
}
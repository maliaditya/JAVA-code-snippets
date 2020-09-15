class Pattern{

    public static void main(String[] args) {
        char c = 'A';
        char rowCounter = 'A';
        for(int i=4;i>=0;i--){
            for(int j=1;j<=5;j++){
                if(j>i){
                System.out.print(c+" ");
                c++;
}
               else
                System.out.print("  ");
            }
            rowCounter++;
            c = rowCounter;
            System.out.println();

        }
    }
}
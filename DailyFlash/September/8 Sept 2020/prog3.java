class Pattern {

    public static void main(String[] args) {
        int p = 1;
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print((char)(64+p)+" ");
            }
            p++;
            System.out.println();

        }
    }
    
}

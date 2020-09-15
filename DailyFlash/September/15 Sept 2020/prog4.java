class Pattern4{

    public static void main(String[] args) {
        int p =1;
        for(int i=0;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j>i)
                System.out.print(p*j+" ");
                else
                System.out.print(" ");

            }
            p++;
            System.out.println();

        }
    }
}
class Pattern{

    public static void main(String[] args) {
        String c = "  ";
        String s = "****" ;
        for(int i=0;i<4;i++){
            c = s.charAt(i) + c;
            System.out.println(c);
        }
    }
}
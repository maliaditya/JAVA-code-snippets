class prog3{

    public static void main(String[] args){
        int i = 5;
        int j = 4;
        System.out.println((i++ >= j++) && (--j < i++));
        System.out.println((--i < j--) || (j++ >= ++i));
    }
}
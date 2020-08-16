
class ChartoASCII{

    public static void main(String[] args) {
        
        String a = "abcd";
        int p;

        for(int i=0;i<a.length();i++){

            p = a.charAt(i);

            System.out.print((char)(p) + " = "+ p + ", ");
        }
    }
}

class ShortDemo {

    public static void main(String[] args){

       // short x = 32768;//error: incompatible types: possible lossy conversion from int to short
       short x = 32767;
        System.out.println(x);
        ++x;
        System.out.println(x);
    }
    
}
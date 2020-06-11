class ByteDemo{


    public static void main(String[] args){

        //byte myData = 10;
        //byte myData = 128; //prog1.java:7: error: incompatible types: possible lossy 
                                // conversion from int to byte
     
        byte myData = 127;
        System.out.println(myData);
        myData++;
        System.out.println(myData);
        myData++;
        System.out.println(myData);
    }
}
class ToggeCase{

    public static void main(String[] args) {
        
        char a = 'a';

        if (a >= 'A' && a <='Z'){
            System.out.println((char)((int)a + 32));
        } else { 
              System.out.println((char)((int)a - 32));
        }


    }
}
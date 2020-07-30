
// class Core2Web{

//     static String  sirName = "Shashi Bagal";
//     int memberCount = 36;

//     public static void main(String[] args) {
        
//         Core2Web java10 = new Core2Web();
//         Core2Web python = new Core2Web();

//         System.out.println(sirName);
//         System.out.println("Java Batch members: " +java10.memberCount);
//         python.memberCount= 400;
//         System.out.println("Python Total strength: " + python.memberCount);

//     }
// }

// class op{
//     public static void main(String[] args) {
//         int x = 1;
//         if((x & (x-1))==0)
//             System.out.println(x);
//             System.out.println(x-1);
//     }
// }

class op{
    public static void main(String[] args) {
        int x = 10,a;
        int y = -10,b;
        a = x>>2;
        b = y>>>2;

        System.out.println(Integer.toBinaryString(b));
        System.out.println(b);
    }
}
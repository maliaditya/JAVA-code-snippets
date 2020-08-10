
class Core2Web{

    static int totalStudents = 1200;
    int memberCount = 36;

    public static void main(String[] args) {
        
        Core2Web java10 = new Core2Web();
        Core2Web python = new Core2Web();

        System.out.println(totalStudents);
        System.out.println("Java Batch members: " +java10.memberCount);
        python.memberCount= 400;
        System.out.println("Python Total strength: " + python.memberCount);

    }
}

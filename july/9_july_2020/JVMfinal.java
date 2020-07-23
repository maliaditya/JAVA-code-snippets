class Core2Web{
    static int totalStudentCount = 2500;
    int batchStudentCount = 0;

    void dispStudentCount(){
        System.out.println("totalStudentCount = " + totalStudentCount);
        System.out.println("totalStudentCount = " + totalStudentCount);
    }

}

class C2WAppAdmin{

    static int totalLoginCount = 1200;
    int videoCount = 0;

    void dispStat(){
        System.out.println("total login count = " + totalLoginCount);
        System.out.println("total video count = " + videoCount);
    }
}

class Mentor{

    public static void main(String[] args){

        Core2Web java = new Core2Web();
        
        java.batchStudentCount = 370;
        java.dispStudentCount();


        Core2Web PPA = new Core2Web();
        
        PPA.batchStudentCount = 290;
        PPA.dispStudentCount();

        C2WAppAdmin python =new C2WAppAdmin();

        python.videoCount = 25;
        python.dispStat();


        C2WAppAdmin os = new C2WAppAdmin();
        
        os.videoCount = 150;
        os.dispStat();
    }
}
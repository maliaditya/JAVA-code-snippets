class Student{

    Student(String name ,String  branch,String clgName,double pointer,int attendance,int subjects){
     
        System.out.println("\n Student Name: " + name + "\n Branch: " + branch + "\n Collge Name: " + clgName+ "\n Pointer: " + pointer+ "\n Attendance: " + attendance+ "\n Subjects: " + subjects);

    }

    public static void main(String[] args){

        
        Student obj = new Student("Aditya Mali","Computer","ZCOER",7.2,34,10);
    }


}
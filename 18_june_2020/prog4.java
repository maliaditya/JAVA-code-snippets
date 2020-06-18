import javax.print.attribute.standard.Copies;

class Company{

        static String handSanitizer =  " External use only :p";


        String name = "XYZ";
        String address = "abc";
        String technology = "Machine Learning"; 
        int noOfEmp = 50;

        void noOfEmps(){
            System.out.println(" no of Employees" + noOfEmp);
        }

        static void sanitizationInstructions(){
            System.out.println(handSanitizer);
        }

         
        public static void main(String[] args){

            Company obj = new Company();
            obj.noOfEmps();
            Company.sanitizationInstructions();

        }

    
}
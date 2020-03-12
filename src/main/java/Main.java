import org.apache.logging.log4j.*;


import javax.swing.*;

public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args){

        Validation validation = new Validation();

        String password = JOptionPane.showInputDialog("Enter Password");

        while (!validation.passwordIsValid(password)){

//            file(validation.getErrors());

            for (String error :validation.getErrors()) {
                logger.error(error);
//                System.out.println(error);
            }
            System.out.println("-------------------");
            if(validation.bonus()){
                logger.debug("The password is never OK if it is empty and 8 or more characters are not met.");
            }
            else if(validation.passwordIsOk()){
                logger.debug("User password is ok\n");
            }
            else {
                logger.debug("User password is not ok\n");
            }
            System.out.println("-------------------");
            validation.getErrors().clear();
            validation.getBonus().clear();

;
            password = JOptionPane.showInputDialog("Re-enter password.");

        }
        if(validation.passwordIsValid(password) && validation.passwordIsOk()){
            System.out.println("Password approved!");
        }

    }
//    public static void file(ArrayList<String> errors){
//        try{
//            File file = new File("errors.log");
//
//            if(file.getName() != "errors.log"){
//                file.createNewFile();
//            }
//            else {
//                FileWriter myWriter = new FileWriter("errors.log",true);
//                for (String error:errors) {
//                    myWriter.write(error + "\n");
//                }
//                myWriter.close();
//                System.out.println("Successfully wrote to the file.");
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}

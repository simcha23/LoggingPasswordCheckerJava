import java.util.ArrayList;
import java.util.logging.Logger;

public class Validation {

    private  ArrayList<String> errors = new ArrayList<>();
    private  ArrayList<String> bonus = new ArrayList<>();

    public Boolean passwordIsValid(String password){

        Boolean checkLength = false;
        Boolean checkUpper = false;
        Boolean checkLower = false;
        Boolean checkDigit = false;
        Boolean checkSpecialChar = false;
        Boolean emptyCheck = false;

        Boolean success = false;

        for(int i = 0 ; i <= 0 ; i++){

            for(int x = 0; x < password.length(); x++){

                char character = password.charAt(x);

                if(!password.isEmpty()){
                    emptyCheck = true;
                }
                if(Character.isUpperCase(character)){
                    checkUpper = true;
                }
                if(Character.isLowerCase(character)){
                    checkLower = true;
                }
                if(Character.isDigit(character)){
                    checkDigit = true;
                }
                if(password.length() > 8){
                    checkLength = true;
                }
                if(password.matches("(?=.*[~!@#$%^&*()_-]).*")){
                    checkSpecialChar = true;
                }
            }

            if(!emptyCheck) {
                errors.add("Password must exist.");
                bonus.add("Password must contain at least 1 Uppercase.");
            }
            if(!checkLength) {
                errors.add("Password must be longer than 8 characters.");
                bonus.add("Password must contain at least 1 Uppercase.");
            }
            if(!checkUpper) {
                errors.add("Password must contain at least 1 Uppercase.");
            }
            if(!checkLower) {
                errors.add("Password must contain at least 1 Lowercase.");
            }
            if(!checkDigit) {
                errors.add("Password must contain at least 1 Digit.");
            }
            if(!checkSpecialChar) {
                errors.add("Password must contain at least 1 character.");
            }

            if(emptyCheck & checkUpper && checkLower && checkDigit && checkLength && checkSpecialChar){
                success = true;
            }
        }

        return success;

    }
    public Boolean passwordIsOk(){

        return errors.size() < 4;
    }
    public Boolean bonus(){

        return bonus.size() == 1 || bonus.size() == 2;
    }

    public ArrayList<String> getErrors() {
        return errors;
    }

    public ArrayList<String> getBonus() {
        return bonus;
    }
}

import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;

public class PasswordCheckerTest {

    Validation validation = new Validation();
    @Test
    public void passwordIsValidTest(){

        String input = JOptionPane.showInputDialog("Enter password");

        Assert.assertEquals(true,validation.passwordIsValid(input));
    }
    @Test
    public void passwordIsOkTest(){

        String input = JOptionPane.showInputDialog("Enter password");
        validation.passwordIsValid(input);

        Assert.assertEquals(true,validation.passwordIsOk());
    }
    @Test
    public void bonusTest(){

        String input = JOptionPane.showInputDialog("Enter password");
        validation.passwordIsValid(input);

        Assert.assertEquals(true,validation.passwordIsOk());
    }

}

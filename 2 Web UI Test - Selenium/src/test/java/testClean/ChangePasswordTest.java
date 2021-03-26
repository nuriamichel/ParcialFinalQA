package testClean;

import org.junit.Assert;
import org.junit.Test;
import pomPages.todoLy.*;

public class ChangePasswordTest extends  TestBaseTodoLy{
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection = new MenuSection();
    SettingsScreen settingsScreen = new SettingsScreen();

    String user="nuriamichel@upb.com";
    String pwdOld = "12345123";
    String pwdNew = "12345123456";

    @Test
    public void verify_change_password_todoly() throws InterruptedException {

        mainPage.loginImage.click();
        loginModal.loginAction(user,pwdOld);
        menuSection.settingsButton.click();
        settingsScreen.pwdOld.set(pwdOld);
        settingsScreen.pwdNew.set(pwdNew);
        settingsScreen.changeButton.click();
        this.waitOnSecond(2);

        menuSection.logoutButton.click();
        this.waitOnSecond(2);

        mainPage.loginImage.click();
        loginModal.loginAction(user,pwdNew);

        this.waitOnSecond(4);
        Assert.assertTrue("ERROR, no se cambió la contraseña",menuSection.settingsButton.controlIsDisplayed());

    }




}

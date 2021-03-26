package pomPages.todoLy;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class SettingsScreen {
    public TextBox pwdOld = new TextBox(By.id("TextPwOld"));
    public TextBox pwdNew = new TextBox(By.id("TextPwNew"));
    public Button changeButton = new Button(By.xpath("//span[@class='ui-button-text' and contains(.,'Ok')]"));

    public  SettingsScreen(){}

}

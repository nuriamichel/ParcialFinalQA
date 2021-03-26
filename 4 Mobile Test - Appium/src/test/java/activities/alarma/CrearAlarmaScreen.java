package activities.alarma;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class CrearAlarmaScreen {

    public TextBox hora = new TextBox(By.xpath("//android.widget.EditText[contains(@text,'08')]"));
    public TextBox minuto = new TextBox(By.xpath("//android.widget.EditText[contains(@text,'35')]"));

    public Button crearAlarmaButton =new Button(By.id("android:id/icon2"));

    public CrearAlarmaScreen(){}
}

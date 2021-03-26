package activities.alarma;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class AlarmasScreen {

    public Button addAlarma = new Button(By.id("com.android.deskclock:id/float_add"));
    public Label alarma = new Label(By.xpath("//android.widget.TextView[@text='08:35']"));

    public AlarmasScreen(){}
}

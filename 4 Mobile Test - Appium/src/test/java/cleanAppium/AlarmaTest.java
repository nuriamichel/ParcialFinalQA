package cleanAppium;

import activities.alarma.AlarmasScreen;
import activities.alarma.CrearAlarmaScreen;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sesion.Session;

import java.net.MalformedURLException;

public class AlarmaTest {

    AlarmasScreen alarmasScreen = new AlarmasScreen();
    CrearAlarmaScreen crearAlarmaScreen = new CrearAlarmaScreen();
    @Test
    public void verifyAddContactApp() throws MalformedURLException, InterruptedException {

        alarmasScreen.addAlarma.click();
        crearAlarmaScreen.hora.click();
        crearAlarmaScreen.minuto.click();

        crearAlarmaScreen.crearAlarmaButton.click();


        Thread.sleep(2000);
        Assert.assertTrue("ERROR! La alarma no se creó", alarmasScreen.alarma.isControlDisplayed());

    }

    @After
    public void closeApp() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}

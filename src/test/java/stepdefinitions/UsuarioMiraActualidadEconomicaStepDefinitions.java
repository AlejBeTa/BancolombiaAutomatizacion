package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import utils.drivers.MyChromeDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static utils.constants.Constants.URL_BANCOLOMBIA;

public class UsuarioMiraActualidadEconomicaStepDefinitions {

    @Managed
    MyChromeDriver BROWSER = MyChromeDriver.inicializarNavegador();

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Alejandro");

    }
}


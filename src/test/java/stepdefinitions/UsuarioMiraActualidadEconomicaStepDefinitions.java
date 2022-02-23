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
import tasks.AccederBancolombia;
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

    @Given("^el usuario entra a la pagina$")
    public void elUsuarioEntraALaPagina() {OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(BROWSER.onUrl(URL_BANCOLOMBIA)));
        OnStage.theActorInTheSpotlight().wasAbleTo(AccederBancolombia.acceder());
    }

    @And("^selecciona Empresas$")
    public void seleccionaEmpresas() {
    }

    @And("^selecciona Capital Inteligente$")
    public void seleccionaCapitalInteligente() {
    }

    @When("^da click en Actualidad economica$")
    public void daClickEnActualidadEconomica() {
    }

    @And("^busca \"([^\"]*)\"$")
    public void busca(String arg1) {
    }

    @Then("^descarga el reporte$")
    public void descargaElReporte() {
    }

    @And("^verifica la descarga$")
    public void verificaLaDescarga() {
    }
}


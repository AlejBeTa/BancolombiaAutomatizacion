package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Reporte;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import questions.VerificarPDF;
import tasks.*;
import utils.drivers.MyChromeDriver;
import utils.pdf.LeerPDF;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static utils.constants.Constants.*;

public class UsuarioMiraActualidadEconomicaStepDefinitions {

    @Managed
    MyChromeDriver BROWSER = MyChromeDriver.inicializarNavegador();
    Reporte reporte;

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
        OnStage.theActorInTheSpotlight().wasAbleTo(AccederEmpresas.acceder());
    }

    @And("^selecciona Capital Inteligente$")
    public void seleccionaCapitalInteligente() {OnStage.theActorInTheSpotlight().wasAbleTo(AccederCapitalInteligente.acceder());
    }

    @When("^da click en Actualidad economica$")
    public void daClickEnActualidadEconomica() {OnStage.theActorInTheSpotlight().wasAbleTo(AccederActualidadEconomica.acceder());
    }

    @And("^busca el reporte$")
    public void buscaElReporte() {
        OnStage.theActorInTheSpotlight().wasAbleTo(AccederReporte.acceder());
    }

    @Then("^descarga el reporte$")
    public void descargaElReporte() {OnStage.theActorInTheSpotlight().wasAbleTo(DescargarPDF.descargar());
    }

    @And("^verifica la descarga$")
    public void verificaLaDescarga() throws InterruptedException {
        OnStage.theActorInTheSpotlight().should(seeThat(VerificarPDF.Texto(), Matchers.is(PAGINA_UNO_PDF)));
    }
}


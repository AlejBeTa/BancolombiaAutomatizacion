package utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

import static utils.constants.Constants.*;

public class MyChromeDriver {

    private static ChromeOptions Options;
    private static WebDriver chromeDriver;

    public MyChromeDriver(WebDriver driver){this.chromeDriver = driver;}

    public static MyChromeDriver inicializarNavegador(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        Options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory",DESCARGA);
        prefs.put("download.prompt_for_download", FALSE);
        prefs.put("plugins.always_open_pdf_externally", TRUE);
        Options.addArguments("--start-maximized");
        Options.setExperimentalOption("prefs",prefs);
        chromeDriver = new ChromeDriver(Options);
        return new MyChromeDriver(chromeDriver);
    }

    public WebDriver onUrl(String url) {chromeDriver.get(url); chromeDriver.manage().window().maximize();return chromeDriver;}

}

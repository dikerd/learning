package builder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChromeStandaloneDriver implements ISeleniumDriver {
    public static final String BROWSER_LOCALE_DEFAULT = "en-us";
    public static final int PAGE_LOAD_TIME_SEC = 60;
    public WebDriver driver;
    private static Logger logger = LoggerFactory.getLogger(ChromeStandaloneDriver.class);

    public ChromeStandaloneDriver() { }

    private ChromeOptions setChromeCapabilities(){
        ChromeOptions chromeOptions = new ChromeOptions();
        logger.info("Set capability to accept SSL Connections");
        //TODO:
        logger.info("Set capability to work with local " + BROWSER_LOCALE_DEFAULT);
        //TODO:
        return chromeOptions;
    }

    public void start() {
        logger.info("Will Start Selenium Chrome Driver/Client");
        ChromeOptions chromeOptions = setChromeCapabilities();
        logger.info("Setup Chrome Driver with Driver Manager");
        //TODO:
        logger.info("Set Chrome with capabilities");
        //TODO:
        logger.info("Set page load time to be " + PAGE_LOAD_TIME_SEC + " seconds");
        this.driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIME_SEC, TimeUnit.SECONDS);
    }

    @Override
    public WebDriver getDriver() {
        //TODO:
        return null;
    }
}

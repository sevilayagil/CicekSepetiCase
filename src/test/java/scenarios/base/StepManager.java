package scenarios.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class StepManager {
    public WebDriver driver;
    public User user;
    protected void set_timeOutValue(int timeOutValue) {
        this._baseTimeOutValue = timeOutValue;
    }

    private int _baseTimeOutValue = 0;
    private String folderName = "";
    String pattern;
    SimpleDateFormat simpleDateFormat;
    public String get_randomNumber() {
        return UUID.randomUUID().toString();
    }

    public String get_currentTime() {
        return simpleDateFormat.format(new Date()).toString();
    }

    public String getFolderName() {
        return folderName;
    }

    protected StepManager(String folderName) {
        String os =System.getProperty("os.name").toLowerCase();
        if (os.contains("mac")){
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        }
        else{
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        }
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-popup-blocking");
        driver = new ChromeDriver(options);
        options.addArguments("incognito");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.folderName = folderName;
        pattern = "dd-M-yyyy-hh-mm-ss";
        simpleDateFormat = new SimpleDateFormat(pattern);
        user=new User();
        user.getUserName();
        user.getUserPassword();

    }

    protected void getUrl() {
        driver.get("https://www.lolaflora.com/en-es/");


    }

    protected void elementClick(WebElement element, TimeOut... timeOuts) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOuts.length == 0 ? _baseTimeOutValue : timeOuts[0].value);
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        } catch (Exception ex) {
            takeScreenshot();
        }
    }

    protected WebElement getElement(WebElement element,TimeOut... timeOuts ) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOuts.length == 0 ? _baseTimeOutValue : timeOuts[0].value);
            wait.until(ExpectedConditions.visibilityOf(element));
            /* reportStep(Status.PASS, description);*/
            return element;
        } catch (Exception ex) {
            System.out.println("find element method error" + ex.getMessage());
            takeScreenshot();
            return null;
        }

    }

    public enum TimeOut {
        LOW(5),
        MIDDLE(10),
        HIGH(15),
        CUSTOM_MAX(60);
        private final int value;

        public int getValue() {
            return value;
        }

        // enum constructor - cannot be public or protected
        private TimeOut(int value) {
            this.value = value;
        }

    }

    public void takeScreenshot() {

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {

            String _path = "src/test/java/screenshot/" + getFolderName() + "\\" + get_currentTime() + "\\" +get_randomNumber() +".png";
            FileUtils.copyFile(scrFile, new File(_path));
        } catch (IOException e) {
            System.out.println("ScreenShot fail." + e.getMessage());
        }
    }
}


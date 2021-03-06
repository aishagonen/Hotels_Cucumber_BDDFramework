package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;


public class ElementUtil {

    /**
     * Fluentwait method which is used for elements
     *
     * @param locator
     * @return
     */
    public static WebElement webAction(final By locator) {

        Wait<WebDriver> wait = new FluentWait<WebDriver>(BasePage.get())
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementClickInterceptedException.class)
                .withMessage(
                        "Webdriver waited for 15 seconds nut still could not find the element therefore TimeOutException has been thrown"
                );
        return wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
    }

    /**
     * ClickOn method is used click the element
     *
     * @param locator
     */
    public void clickOn(By locator) {
        webAction(locator).click();
    }

    /**
     * SendKeys method
     *
     * @param locator
     * @param value
     */
    public void sendKeys(By locator, String value) {
        try {
            clear(locator);
            webAction(locator).sendKeys(value);
        } catch (Exception e) {
            System.out.println("Some exception occured while sending value" + locator);
        }

    }

    /**
     * GetText method
     *
     * @param locator
     * @return
     */
    public String getTextFromElement(By locator) {
        return webAction(locator).getText();
    }

    /**
     * clear method
     *
     * @param locator
     */
    public void clear(By locator) {
        webAction(locator).clear();
    }


    /**
     * isDisplayed Method
     *
     * @param locator
     * @return
     */
    public boolean isElementDisplayed(By locator) {
        return webAction(locator).isDisplayed();
    }

    /**
     * isSelected Method
     *
     * @param locator
     * @return
     */
    public boolean isElementSelected(By locator) {
        return webAction(locator).isSelected();
    }

    /**
     * isEnabled Method
     *
     * @param locator
     * @return
     */
    public boolean isElementEnabled(By locator) {
        return webAction(locator).isEnabled();
    }

    /**
     * findElements method
     * It is used multiple locators
     *
     * @param locator
     * @return
     */
    public List<WebElement> webElements(By locator) {
        return BasePage.get().findElements(locator);
    }

    /**
     * DropDown Select Text Method
     *
     * @param locator
     * @param dropDownText
     */
    public void selectFromDropDownText(By locator, String dropDownText) {
        WebElement text = webAction(locator);
        Select selectText = new Select(text);
        selectText.selectByVisibleText(dropDownText);
    }

    /**
     * DropDown Select Index Method
     *
     * @param locator
     * @param dropDownIndex
     */
    public void selectDropDownIndex(By locator, int dropDownIndex) {
        WebElement index = webAction(locator);
        Select selectIndex = new Select(index);
        selectIndex.selectByIndex(dropDownIndex);
    }

    /**
     * ScrollDown method using scrollIntoView
     *
     * @param locator
     */
    public void scrollByElement(By locator) {
        WebElement scrollElement = webAction(locator);
        JavascriptExecutor js = (JavascriptExecutor) BasePage.get();
        js.executeScript("argument[0].scrollIntoView;", scrollElement);
    }

    public void scrollPageDown() {
        JavascriptExecutor js = (JavascriptExecutor) BasePage.get();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    /**
     * ScrollDown method using pixel
     *
     * @param xPixel
     * @param yPixel
     */
    public void scrollByPixel(String xPixel, String yPixel) {
        String str = "window.scrollBy(" + xPixel + ", " + yPixel + ")";
        JavascriptExecutor js = (JavascriptExecutor) BasePage.get();
        js.executeScript(str);
    }

    /**
     * MoveToElement Actions class
     *
     * @param locator
     */
    public void moveToElement(By locator) {
        Actions actions = new Actions(BasePage.get());
        actions.moveToElement(webAction(locator)).build().perform();
    }

    /**
     * GetScreenShot method
     * If test is failed use this method under the hook after
     *
     * @param name
     * @return
     */
    public String getScreenShot(String name) {
        SimpleDateFormat df = new SimpleDateFormat("-yyyy-MM-dd-HH-mm");
        String date = df.format(new Date());
        TakesScreenshot ts = (TakesScreenshot) BasePage.get();
        File source = ts.getScreenshotAs((OutputType.FILE));
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return target;
    }


    public String getPageTitle(String title){
        WebDriverWait wait = new WebDriverWait(BasePage.get(), 15);
        wait.until(ExpectedConditions.titleContains(title));
        return BasePage.get().getTitle();
    }

    public void getHotelsRadius(By hotelLocator, By mileLocator, int mile ) {
        List<WebElement> hotelList = webElements(hotelLocator);
        List<WebElement> hotelMiles = webElements(mileLocator);
        ArrayList<String> hotelsInRadius = new ArrayList<String>();

        for (int i = 0; i < hotelList.size(); i++) {
            String hotelNames = hotelList.get(i).getText();
            String milesText = hotelMiles.get(i).getText();
            String milesNumber = milesText.replaceAll("[a-zA-Z ]", "");
            double miles = Double.parseDouble(milesNumber);
            mile = Constants.RADIUS;
            if (miles <= mile) {
                hotelsInRadius.add(hotelNames + "  -->  " + milesText);
            }
        }

        for (String inRadius : hotelsInRadius) {
            System.out.println(inRadius);
        }
    }



}

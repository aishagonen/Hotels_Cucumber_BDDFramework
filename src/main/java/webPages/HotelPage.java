package webPages;

import managers.PageObjectManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Constants;
import utils.ElementUtil;

import java.util.List;

public class HotelPage  extends ElementUtil {

    By star3 = By.cssSelector("#f-star-rating-3");
    By star3hotels = By.xpath("//*[@class='hotel-wrap']//a[@class='property-name-link']");
    By star4 = By.cssSelector("#f-star-rating-4");
    By star4hotels = By.xpath("//a[@class='property-name-link']");
    By star5 = By.cssSelector("#f-star-rating-5");
    By star5hotels = By.xpath("//*[@class='hotel-wrap']//a[@class='property-name-link']");
    By hiltonList = By.xpath("//*[contains(text(), 'Hilton')]");
    By distance = By.xpath("//a[contains(text(),'Distance')]");
    By cityCenter = By.xpath("//a[contains(text(),'City center')]");
    By allMiles	= By.xpath("//ul[@class='property-landmarks']//li[contains(text(),'to City center')]");
    By filter = By.xpath("//a[@class='remove-filter']");
    By airport = By.xpath("//a[contains(text(),'Logan International Airport (BOS)')]");
    int mile = Constants.RADIUS;

    public void selectStar3() {
        clickOn(star3);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void resultTownStar3() {
       selectStar3();
       clickOn(distance);
       clickOn(cityCenter);

       scrollPageDown();
       getHotelsRadius(star3hotels, allMiles, mile);

    }
    public void resultAirportStar3() {
        selectStar3();
        clickOn(distance);
        clickOn(airport);
        scrollPageDown();
        getHotelsRadius(star3hotels, allMiles, mile);

    }

    public void selectStar4() {
        clickOn(star4);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void resultTownStar4() {
        selectStar4();
        clickOn(distance);
        clickOn(cityCenter);
        scrollPageDown();
        getHotelsRadius(star4hotels, allMiles, mile);
    }

    public void resultAirportStar4() {
        selectStar4();
        clickOn(distance);
        clickOn(airport);
        scrollPageDown();
        getHotelsRadius(star4hotels, allMiles, mile);
    }

    public void selectStar5() {
        clickOn(star5);try {
        Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void resultTownStar5() {
        selectStar5();
        clickOn(distance);
        clickOn(cityCenter);
        scrollPageDown();
        getHotelsRadius(star5hotels, allMiles, mile);
    }
    public void resultAirportStar5() {
        selectStar5();
        clickOn(distance);
        clickOn(airport);
        scrollPageDown();
        getHotelsRadius(star5hotels, allMiles, mile);
    }

    public String verifyStar(){
        return getTextFromElement(filter);
    }

    public void getHilton() {
        scrollPageDown();

        List<WebElement> list = webElements(hiltonList);
        System.out.println(list.size() + " hotels are available." );

        for (WebElement element : list) {
            String text = element.getText();
            System.out.println(text);
        }
    }

    public void resultAirport(int mile) throws InterruptedException {
        clickOn(distance);
        Thread.sleep(3000);
        clickOn(airport);
        scrollPageDown();
        Thread.sleep(5000);
        getHotelsRadius(hiltonList, allMiles, mile);
    }

    public void resultDowntown(int mile) throws InterruptedException {
//        clear(distance);
//        clickOn(distance);
//        Thread.sleep(3000);
//        clickOn(cityCenter);
//        scrollPageDown();
//        Thread.sleep(5000);
//        getHotelsRadius(hiltonList, allMiles, mile);
    }



}
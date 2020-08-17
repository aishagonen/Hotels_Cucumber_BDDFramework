package managers;

import org.openqa.selenium.WebDriver;
import utils.ElementUtil;
import webPages.HomePage;
import webPages.HotelPage;


public class PageObjectManager {

    private HomePage homePage;
    private HotelPage hotelPage;

    WebDriver driver;

    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage() : homePage;
    }

    public HotelPage getHotelPage() {
        return (hotelPage == null) ? hotelPage = new HotelPage() : hotelPage;
    }

}



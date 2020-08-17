package webPages;

import org.openqa.selenium.By;
import utils.ElementUtil;

public class HomePage extends ElementUtil {

    By destination = By.name("q-destination");
    By checkin = By.xpath("//input[@id='qf-0q-localised-check-in']");
    By checkout = By.xpath("//input[@id='qf-0q-localised-check-out']");
    By rooms = By.id("qf-0q-rooms"); // value: 0
    By adults = By.id("qf-0q-room-0-adults"); // value: 1
    By children = By.id("qf-0q-room-0-children"); // value: 2
    By age1 = By.id("qf-0q-room-0-child-0-age"); // value: 5
    By age2 = By.id("qf-0q-room-0-child-1-age"); // value: 10
    By searchBtn = By.xpath("//button[@class='cta cta-strong']");

    public void sendInformation() {
        webAction(destination).sendKeys("Boston, Massachusetts, United States of America");
        sendKeys(checkin, "09/21/20");
        sendKeys(checkout, "09/27/20");
        selectDropDownIndex(rooms, 0);
        selectDropDownIndex(adults, 1);
        selectDropDownIndex(children, 2);
        selectDropDownIndex(age1, 5);
        selectDropDownIndex(age2, 10);
        clickOn(searchBtn);

    }








}

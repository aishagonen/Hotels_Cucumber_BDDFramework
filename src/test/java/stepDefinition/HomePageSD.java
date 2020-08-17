package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import webPages.HomePage;
import webPages.HotelPage;

public class HomePageSD {

    HomePage homePage = new HomePage();
    HotelPage hotelPage = new HotelPage();
    PageObjectManager pageObjectManager = new PageObjectManager();


    @Given("^I am on default locations search result screen$")
    public void getResultScreen() throws InterruptedException {
        pageObjectManager.getHomePage().sendInformation();
        Thread.sleep(3000);
    }

    @When("^I select property class (\\d+) stars$")
    public void selectAnyStars(int stars) {
        switch (stars) {
            case 3:
                pageObjectManager.getHotelPage().selectStar3();
                break;
            case 4:
                pageObjectManager.getHotelPage().selectStar4();
                break;
            case 5:
                pageObjectManager.getHotelPage().selectStar5();
                break;
        }
    }

    @Then("^I verify system displays only (\\d+) stars hotels on search result$")
    public void verifyDisplayedStars(int stars) throws InterruptedException {
        Thread.sleep(5000);
        String text = pageObjectManager.getHotelPage().verifyStar();
        System.out.println("Asked only " + stars + " stars hotels. Displayed only " + text + " hotels on search result.");
    }


    @Then("^I verify system displays all hotels within (\\d+) miles radius of airport$")
    public void verifyRadiusOfAirport(int mile) throws InterruptedException {
        Thread.sleep(5000);
        pageObjectManager.getHotelPage().resultAirport(mile);
    }

    @Then("^I verify Hilton Hotel is within (\\d+) miles radius of downtown\\.$")
    public void verifyRadiusOfDowntown(int mile) throws InterruptedException {
        Thread.sleep(5000);
        pageObjectManager.getHotelPage().resultDowntown(mile);
    }

}

//        @Then("^I verify only (\\d+) stars Hilton Hotel is within (\\d+) miles radius of downtown\\.$")
//        public void verifyStarHiltonRadiusOfDowntown(int stars, int mile) throws InterruptedException {
//            switch (stars){
//                case 3:
//                    selectAnyStars(3);
//                    Thread.sleep(5000);
//                    pageObjectManager.getHotelPage().resultTownStar3();
//                    Thread.sleep(5000);
//                    pageObjectManager.getHotelPage().getHilton();
//                    break;
//                case 4:
//                    selectAnyStars(4);
//                    Thread.sleep(5000);
//                    pageObjectManager.getHotelPage().resultTownStar4();
//                    Thread.sleep(5000);
//                    pageObjectManager.getHotelPage().getHilton();
//                    break;
//                case 5:
//                    selectAnyStars(5);
//                    Thread.sleep(5000);
//                    pageObjectManager.getHotelPage().resultTownStar5();
//                    Thread.sleep(5000);
//                    pageObjectManager.getHotelPage().getHilton();
//                    break;
//            }

















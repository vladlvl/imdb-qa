package tests;

import base.BaseTest;
import pages.HomePage;
import pages.MoviePage;
import org.testng.annotations.Test;

public class ImdbSearchTest extends BaseTest {

    @Test //Verify that page title matches the one saved from the dropdown
    public void searchAndOpenFirstResult() {
        HomePage home = new HomePage();
        MoviePage movie = new MoviePage();

        home.openAndSearch("QA");
        String savedTitle = home.getFirstResultTitle();
        System.out.println(savedTitle);
        home.clickFirstResult();
        movie.verifyTitle(savedTitle);

    }
}
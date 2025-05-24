package tests;

import base.BaseTest;
import pages.HomePage;
import pages.MoviePage;
import org.testng.annotations.Test;

public class CastVerificationTest extends BaseTest {

    @Test  //Verify there are more than 3 members in the "top cast section"
    public void verifyTopCastIsNotEmpty() {
        HomePage home = new HomePage();
        MoviePage movie = new MoviePage();

        home.openAndSearch("QA");
        home.clickFirstResult();
        movie.verifyTopCastCount(3);
    }
}

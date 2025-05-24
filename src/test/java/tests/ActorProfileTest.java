package tests;

import base.BaseTest;
import pages.HomePage;
import pages.MoviePage;
import org.testng.annotations.Test;

public class ActorProfileTest extends BaseTest {

    @Test   //Verify that correct profile have opened
    public void openThirdActorProfileAndVerify() {
        HomePage home = new HomePage();
        MoviePage movie = new MoviePage();


        home.openAndSearch("QA");
        home.clickFirstResult();
        String actorName = movie.getActorName(2);
        movie.clickActorByIndex(2);
        movie.verifyName(actorName);
    }
}

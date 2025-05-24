package pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.*;


public class MoviePage {
    private ElementsCollection topCast = $$("section[data-testid='title-cast'] li");
    private ElementsCollection actorLinks = $$("[data-testid='title-cast-item__actor']");
    private SelenideElement heroText = $("[data-testid='hero__primary-text']");


    public void verifyTitle(String expectedTitle) {
        heroText.shouldHave(exactText(expectedTitle));
    }

    public void verifyTopCastCount(int minCount) {
        topCast.shouldHave(CollectionCondition.sizeGreaterThan(minCount));
    }

    public String getActorName(int index) {
        return actorLinks.get(index).shouldBe(visible).getText();
    }

    public void clickActorByIndex(int index) {
        SelenideElement actorLink = actorLinks.get(index);
        actorLink.scrollIntoView(true);
        sleep(500); //required due to layout shift/sticky header. none of the clean ways worked such as "shouldbe(visible)" etc. not the best approach to add hardcoded waiters, but it reduces flakiness
        actorLinks.get(index).shouldBe(visible).click();

    }

    public void verifyName(String expectedName) {
        heroText.shouldHave(text(expectedName));
    }
}

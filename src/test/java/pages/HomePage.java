package pages;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.*;

import java.time.Duration;

public class HomePage {
    private SelenideElement searchInput = $("[data-testid='suggestion-search']");
    private ElementsCollection searchResults = $$("ul[role='listbox'] li");
    private SelenideElement cookieBanner = $("[data-testid='accept-button']");


    public void open() {
        Selenide.open("https://www.imdb.com");
    }

    public void search(String text) {
        searchInput.setValue(text);
    }

    public String getFirstResultTitle() {
        return searchResults.first().$("[class*='searchResult__constTitle']").getText();
    }

    private void closeCookieBanner() {
        try {
            cookieBanner.should(appear, Duration.ofSeconds(5)).click();
        } catch (Exception ignored) {}
    }

    public void openAndSearch (String query){
        Selenide.open("/");
        closeCookieBanner();
        search(query);
    }

    public void clickFirstResult() {
        searchResults.first().click();
    }
}
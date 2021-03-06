package ru.qatools.school.twister.web.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

/**
 * Created by dima on 25.01.15.
 */
public class CreatePostPage extends AbstractPage {

    public CreatePostPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new HtmlElementDecorator(driver), this);
        driver.get( homeUrl+"post/new" );
    }
}

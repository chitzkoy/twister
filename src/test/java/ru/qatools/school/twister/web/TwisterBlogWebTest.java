package ru.qatools.school.twister.web;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class TwisterBlogWebTest {

    private WebDriver driver = new PhantomJSDriver();

    private static final String BASE_URL = "http://localhost:8080";
    private static final String BLOG_TITLE = "Twister";

    @Before
    public void openHomePage() {
        driver.get(BASE_URL);
    }

    @Test
    public void blogTitleTest() {
    	String title = driver.getTitle();
        assertThat(title, notNullValue());
        assertThat(title, startsWith(BLOG_TITLE));
    }
    
    @After
    public void close(){
    	driver.close();
        driver.quit();
    }
}
package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextAreaField {
    public static final String TEXT_AREA_XPATH = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInputTextArea')]//textarea";

    WebDriver driver;
    String label;

    public TextAreaField(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeText(String text) {
        driver.findElement(By.xpath(String.format(TEXT_AREA_XPATH, label))).sendKeys(text);
    }

}
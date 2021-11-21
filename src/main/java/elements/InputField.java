package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class InputField extends BasePage {
    String label;

    public InputField(WebDriver driver, String label) {
        super(driver);
        this.label = label;
    }

    public void writeText(String text) {
        driver.findElement(By.xpath(String.format(INPUT_XPATH, label))).sendKeys(text);
    }
}
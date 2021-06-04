package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private WebDriver driver;
    public By dropdown = By.id("dropdown");

    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }
    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);

}
    public List<String> getSelectedOption(){
        List<WebElement> selectedElement = findDropDownElement().getAllSelectedOptions();
        return selectedElement.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
}

}

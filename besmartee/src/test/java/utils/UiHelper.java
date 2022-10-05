package utils;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class UiHelper 
{
    private WebDriverManager driverManager;

    public UiHelper(WebDriverManager driverManager) {
        this.driverManager = driverManager;
    }
    
    /**
     * Default number of retries a method will take before throwing an error.  All retries are 1000 milliseconds apart
     */
    public static final int DefaultRetryCount = 20;
    public static final int DefaultSleepTime = 1000;
    
    
    public enum UiLocator 
    {
        ClassName,
        Css,
        Id,
        XPath
    }
    
    public WebElement tryGetElement(UiLocator uiLocator, String locator) 
    {
        WebElement element = null;

        try {
            element = getElement(uiLocator, locator);
        } 
        
        catch(NoSuchElementException e) { }
        
        catch(IOException e) { }

        return element;
    }
    
    
    
   
    // Private method
    private WebElement getElement(UiLocator uiLocator, String locator) throws IOException 
    {
        By by = getByLocator(uiLocator, locator);
        return driverManager.getDriver().findElement(by);
    }
    

    private List<WebElement> getElements(UiLocator uiLocator, String locator) throws IOException  {
        return getElements(uiLocator, locator, driverManager.getDriver());
    }
    
    private List<WebElement> getElements(UiLocator uiLocator, String locator, SearchContext parent) 
    {
        By by = getByLocator(uiLocator, locator);
        return parent.findElements(by);
    }
    
    private static final By getByLocator(UiLocator uiLocator, String locator) 
    {
        return UiLocator.ClassName.equals(uiLocator) ? By.className(locator)
            : UiLocator.Css.equals(uiLocator) ? By.cssSelector(locator)
            : UiLocator.Id.equals(uiLocator) ? By.id(locator)
            : By.xpath(locator);
    }
    
    
}

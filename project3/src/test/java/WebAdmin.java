import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebAdmin{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = getDriver();
        driver.manage().window().maximize();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminLogin&token=d251f363cceb5a849cb7330938c64dea");

        WebElement searchInputEmail = driver.findElement(By.id("email"));
        searchInputEmail.sendKeys("webinar.test@gmail.com");

        WebElement searchInputPassword = driver.findElement(By.id("passwd"));
        searchInputPassword.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement searchButtonIn = driver.findElement(By.name("submitLogin"));
        searchButtonIn.click();

        Thread.sleep(10000);


        WebElement searchButtonDashboard = driver.findElement(By.id("tab-AdminDashboard"));
        searchButtonDashboard.click();
        String temp1 = driver.getTitle();
        System.out.println("Page title is " + driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(5000);
        if (!temp1.equals(driver.getTitle())) System.out.println("Error refresh page AdminDashboard");

        WebElement searchButtonAdminParentOrders = driver.findElement(By.id("subtab-AdminParentOrders"));
        searchButtonAdminParentOrders.click();
        String temp2 = driver.getTitle();
        System.out.println("Page title is " + driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(5000);
        if (!temp2.equals(driver.getTitle())) System.out.println("Error refresh page AdminParentOrders");

        WebElement searchButtonAdminCatalog = driver.findElement(By.id("subtab-AdminCatalog"));
        searchButtonAdminCatalog.click();
        String temp3 = driver.getTitle();
        System.out.println("Page title is " + driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(5000);
        if (!temp3.equals(driver.getTitle())) System.out.println("Error refresh page AdminCatalog");
        driver.navigate().back();



        WebElement searchButtonAdminParentCustomer = driver.findElement(By.id("subtab-AdminParentCustomer"));
        searchButtonAdminParentCustomer.click();
        String temp4 = driver.getTitle();
        System.out.println("Page title is " + driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(5000);
        if (!temp4.equals(driver.getTitle())) System.out.println("Error refresh page AdminParentCustomer");


        WebElement searchButtonAdminParentCustomerThreads = driver.findElement(By.id("subtab-AdminParentCustomerThreads"));
        searchButtonAdminParentCustomerThreads.click();
        String temp5 = driver.getTitle();
        System.out.println("Page title is " + driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(5000);
        if (!temp5.equals(driver.getTitle())) System.out.println("Error refresh page AdminParentCustomerThreads");


        WebElement searchButtonAdminStats = driver.findElement(By.id("subtab-AdminStats"));
        searchButtonAdminStats.click();
        String temp6 = driver.getTitle();
        System.out.println("Page title is " + driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(5000);
        if (!temp6.equals(driver.getTitle())) System.out.println("Error refresh page AdminStats");


        WebElement searchButtonAdminParentModulesSf = driver.findElement(By.id("subtab-AdminParentModulesSf"));
        searchButtonAdminParentModulesSf.click();
        String temp7 = driver.getTitle();
        System.out.println("Page title is " + driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(5000);
        if (!temp7.equals(driver.getTitle())) System.out.println("Error refresh page AdminParentModulesSf");
        driver.navigate().back();


        WebElement searchButtonAdminParentThemes = driver.findElement(By.id("subtab-AdminParentThemes"));
        searchButtonAdminParentThemes.click();
        String temp8 = driver.getTitle();
        System.out.println("Page title is " + driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(5000);
        if (!temp8.equals(driver.getTitle())) System.out.println("Error refresh page AdminParentThemes");


        WebElement searchButtonAdminParentShipping = driver.findElement(By.id("subtab-AdminParentShipping"));
        searchButtonAdminParentShipping.click();
        String temp9 = driver.getTitle();
        System.out.println("Page title is " + driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(5000);
        if (!temp9.equals(driver.getTitle())) System.out.println("Error refresh page AdminParentShipping");

        WebElement searchButtonAdminParentPayment = driver.findElement(By.id("subtab-AdminParentPayment"));
        searchButtonAdminParentPayment.click();
        String temp10 = driver.getTitle();
        System.out.println("Page title is " + driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(5000);
        if (!temp10.equals(driver.getTitle())) System.out.println("Error refresh page AdminParentPayment");


        WebElement searchButtonAdminInternational = driver.findElement(By.id("subtab-AdminInternational"));
        searchButtonAdminInternational.click();
        String temp11 = driver.getTitle();
        System.out.println("Page title is " + driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(5000);
        if (!temp11.equals(driver.getTitle())) System.out.println("Error refresh page AdminInternational");


        WebElement searchButtonShopParameters = driver.findElement(By.id("subtab-ShopParameters"));
        searchButtonShopParameters.click();
        String temp12 = driver.getTitle();
        System.out.println("Page title is " + driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(5000);
        if (!temp12.equals(driver.getTitle())) System.out.println("Error refresh page ShopParameters");


        WebElement searchButtonAdminAdvancedParameters = driver.findElement(By.id("subtab-AdminAdvancedParameters"));
        searchButtonAdminAdvancedParameters.click();
        String temp13 = driver.getTitle();
        System.out.println("Page title is " + driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(5000);
        if (!temp13.equals(driver.getTitle())) System.out.println("Error refresh page AdminAdvancedParameters");
        }


        /*WebElement searchButtonOut = driver.findElement(By.class("page-title"));
        searchButtonOut.click();

        System.out.println("Page title is " + driver.getTitle());*/



    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//resourses//chromedriver.exe" );
        return new ChromeDriver();
    }
}

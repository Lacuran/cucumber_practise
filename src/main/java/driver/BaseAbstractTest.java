package driver;




public abstract class BaseAbstractTest{

    private static WebDriverController driver;

    public BaseAbstractTest() {
        driver = new WebDriverController();
    }

    public static WebDriverController getDriver() {
        return driver;
    }


    public static void afterClassCleanup(){
        driver.quit();
    }
}

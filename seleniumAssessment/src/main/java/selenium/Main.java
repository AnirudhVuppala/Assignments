package selenium;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Tooltip form = new Tooltip();
        Nba form = new Nba();
//        form.setUp();
        form.trial();
//        form.gettext();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }



        DriverSingleton.quitDriver();
    }
}

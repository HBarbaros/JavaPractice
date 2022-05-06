package day38_Inheritance.browserTask;

public class BrowserObjects {

    public static void main(String[] args) {

        Chrome chrome = new Chrome();
        chrome.openBrowser();
        chrome.closeBrowser();

        System.out.println();

        FireFox fireFox = new FireFox();
        fireFox.openBrowser();
        fireFox.closeBrowser();

        System.out.println();

        Opera opera = new Opera();
        opera.openBrowser();
        opera.closeBrowser();

        System.out.println();

        Safari safari = new Safari();
        safari.openBrowser();
        safari.closeBrowser();

    }

}

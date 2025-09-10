package course.oop.j121interfacechallenge;

class Chrome implements Browser {
    protected String url;

    @Override
    public String getEngine() {
        return "";
    }

    @Override
    public void goToPage(String url) {
        this.url = url;
        System.out.println("Chrome url " + this.url);
    }

    @Override
    public void refreshPage() {

    }

    @Override
    public void bookmarkPage() {

    }
}

class Firefox implements Browser {
    protected String url;

    @Override
    public String getEngine() {
        return "";
    }

    @Override
    public void goToPage(String url) {
        this.url = url;
        System.out.println("Firefox url " + this.url);
    }

    @Override
    public void refreshPage() {

    }

    @Override
    public void bookmarkPage() {

    }
}

public class J121InterfaceChallenge {
    public static void main(String[] args) {
        Browser chrome = new Chrome();
        chrome.goToPage("www.google.pl");
        Browser firefox = new Firefox();
        firefox.goToPage("www.gmail.com");
    }
}

package study.oop;

class Page {
    public void open() {
        System.out.println("Opening page...");
    }
}

class LoginPage extends Page {
    public void fillLoginForm() {
        System.out.println("Filling login form...");
    }
}

public class J116PolymorphismCasting {
    public static void main(String[] args) {
        // Upcasting (automatic): page is declared as Page object but behaves like LoginPage.
        Page page = new LoginPage();
        // Access to Page object methods only
        page.open();
        // page.fillLoginForm(); // ❌ Compile error: method not in Page

        //Downcasting (explicit): page is cast LoginPage object
        LoginPage loginPage = (LoginPage) page;
        // Access to Page and LoginPage object methods
        loginPage.open(); // Inherited from Page
        loginPage.fillLoginForm(); // Defined in LoginPage
    }
}

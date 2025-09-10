package course.oop.j121interfacechallenge;

public interface Browser {
    String ENGINE = "WebKit";

    // default methods must have body
    default String getEngine() {
        return Browser.ENGINE;
    }

    void goToPage(String url);

    void refreshPage();

    void bookmarkPage();
}

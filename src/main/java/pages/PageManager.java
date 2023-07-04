package pages;

public class PageManager {
    private static PageManager pageManager;
    private LoginPage loginPage;
    private NavigationBarPage navigationBarPage;


    private PageManager() {
    }

    private synchronized static void crearInstancia() {
        if (pageManager == null) {
            pageManager = new PageManager();
        }
    }

    public static PageManager obtenerInstancia() {
        crearInstancia();
        return pageManager;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
    }

    public NavigationBarPage getNavigationBarPage() {
        return (navigationBarPage == null) ? navigationBarPage = new NavigationBarPage() : navigationBarPage;
    }

}

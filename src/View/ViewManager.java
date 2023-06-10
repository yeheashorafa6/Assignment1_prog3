package View;

import java.io.IOException;

public class ViewManager {
    public static LoginPageView loginPage;
    public static SystemPageView systemPage;
    
    private ViewManager(){
        
    }
    
    public static void openLoginPage()  throws IOException{
        if (loginPage == null) {
            loginPage = new LoginPageView();
            loginPage.show();
        } else {
            loginPage.show();
        }
        
    }
    public static void closeLoginPage(){
        if(loginPage != null)
            loginPage.close();
    }
    
    public static void openSystemPage() throws IOException{
        if (systemPage == null) {
            systemPage = new SystemPageView();
            systemPage.show();
        } else {
            systemPage.show();
        }
        
    }
    public static void closeSystemPage(){
        if(systemPage != null)
            systemPage.close();
    }
}

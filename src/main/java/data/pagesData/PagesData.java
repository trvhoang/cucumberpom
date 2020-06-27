package data.pagesData;

public class PagesData {

    public String pageURL(String pageName){
        switch (pageName){
            case "LoginPage": return "https://www.equos.io/";
            case "HomePage": return "https://equos.io/trade";
            default: return "wrong page url";
        }

    }
}

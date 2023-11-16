package playStoreAnalysis;

public class googlePlayStore {
    
    String appName;
    String appCategory;
    int rating; 

    public googlePlayStore (String appName, String appCategory) {
        this.appName = appName;
        this.appCategory = appCategory;

    }

    public String getAppName() {return appName;}
    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppCategory() {return appCategory;}
    public void setAppCategory(String appCategory) {
        this.appCategory = appCategory;
    }

    public int getRating() {return rating;}
    public void setRating(int rating) {
        this.rating = rating;
    }

    public int averageRating (int rating) {

        return ;
    }

    public int highestRated (int rating) {
        return ; 
    }
    public int lowestRated (int rating) {
        return ; 
    }


}

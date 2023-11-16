package playStoreAnalysis;

import java.util.ArrayList;
import java.util.List;

public class googlePlayStore {

    private String appCategory;
    private float highestRating;
    private float lowestRating; 
    private String bestApp;
    private String worstApp;
    private List<Float> appRatings = new ArrayList<>(); 
    

    public googlePlayStore (String appCategory) {
        this.appCategory = appCategory;
    }

    public void rateApps (storeStats record) {
        appRatings.add(record.rating());
        if (record.rating() < getLowestRating()) {
            setLowestRating(record.rating());
            setWorstApp(record.appName());
        }
        if (record.rating() > getHighestRating()) {
            setHighestRating(record.rating());
            setBestApp(record.appName());
        }
    }

    public Float getAvg() {
        return appRatings.stream().reduce(0f, (acc, v) -> acc + v) / appRatings.size();
    }

    public int getTotal() {
        return appRatings.size();
    }

    // getters and setters

    public String getAppCategory() {return appCategory;}
    public void setAppCategory(String appCategory) {
        this.appCategory = appCategory; }

    public float getHighestRating() {return highestRating;}
    public void setHighestRating(float highestRating) {
        this.highestRating = highestRating;}

    public float getLowestRating() {return lowestRating;}
    public void setLowestRating(float lowestRating) {
        this.lowestRating = lowestRating;}

    public String getBestApp() {return bestApp;}
    public void setBestApp(String bestApp) {
        this.bestApp = bestApp;}

    public String getWorstApp() {return worstApp;}
    public void setWorstApp(String worstApp) {
        this.worstApp = worstApp;}

    public List<Float> getAppRatings() { return appRatings; }
    public void setAllRatings(List<Float> appRatings) { 
        this.appRatings = appRatings;}
}

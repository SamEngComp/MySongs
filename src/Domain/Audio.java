package Domain;

public class Audio {

    // PROPERTIES

    private String title;
    private int totalReproductions;
    private int totalLikes;
    private int ratings;

    // METHODS

    public void like() {
        this.totalLikes ++;
    }

    public void reproduce() {
        this.totalReproductions ++;
    }

    // GET AND SET

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public void setTotalReproductions(int totalReproductions) {
        this.totalReproductions = totalReproductions;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
}

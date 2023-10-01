package Domain;

public class Audio {

    // PROPERTIES

    String title;
    int totalReproductions;
    int totalLikes;
    int ratings;

    // METHODS

    void like() {
        this.totalLikes ++;
    }

    void reproduce() {
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

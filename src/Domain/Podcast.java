package Domain;

public class Podcast extends Audio {

    // PROPERTIES

    private String host;
    private String description;

    // CONSTRUCTORS

    public Podcast(String title,
                   String host,
                   String description) {
        super.setTitle(title);
        this.host = host;
        this.description = description;
    }

    public Podcast() { }

    @Override
    public int getRatings() {
        if (this.getTotalLikes() > 500) return 10;
        else return 8;
    }

    // GET AND SET

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

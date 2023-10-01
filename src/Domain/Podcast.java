package Domain;

public class Podcast extends Audio {
    
    // PROPERTIES

    String host;
    String description;

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

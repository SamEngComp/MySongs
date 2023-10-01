package Domain;

public class Music extends Audio {

    // PROPERTIES

    private String album;
    private String artist;
    private String gender;

    // CONSTRUCTORS

    public Music(String title,
                 String album,
                 String artist,
                 String gender) {
        super.setTitle(title);
        this.album = album;
        this.artist = artist;
        this.gender = gender;
    }

    public Music() { }

    // GET AND SET

    @Override
    public int getRatings() {
        if (this.getTotalReproductions() > 200) return 10;
        else return 7;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

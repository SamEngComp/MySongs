package Domain;

public class Favorite {
    public void add(Audio audio) {
        if (audio.getRatings() >= 9)
            System.out.println("("+ audio.getTitle() + ") is the current favorite!");
        else
            System.out.println("("+ audio.getTitle() + ") is being liked!");
    }
}

package Main;

import Domain.Music;
import Domain.Podcast;

public class Main {
    public static void main(String[] args) {

        // INSTANCES

        Music song1 = new Music("Vermelho",
                "Lady Leste",
                "Gloria Groove",
                "Funk");

        Music song2 = new Music();
        song2.setTitle("Derretida");
        song2.setAlbum("Noitada");
        song2.setArtist("Pabllo Vittar");
        song2.setGender("Pop");

        Podcast podcast1 = new Podcast("Inglês Todos os Dias",
                "Tim Barrett",
                """
     Aprimore o seu inglês diáriamente com estes
     mini-podcasts de 5 minutos com o professor
     Tim Barrett de www.domineingles.com.br.
     Aprenda inglês do dia a dia, expressões,
     phrasal verbs, preposições, collocations
     e muito mais!
     """);

        Podcast podcast2 = new Podcast();
        podcast2.setTitle("Quanto vale essa história?");
        podcast2.setHost("Bianca DellaFancy");

        // FICTITIOUS DATA

        for (int i = 0; i < 100; i++) {
            song1.reproduce();
            if (i < 50) song2.reproduce();
        }

        for (int i = 0; i < 50; i++) {
            song1.like();
            if (i < 20) song2.like();
        }

        for (int i = 0; i < 5000; i++) {
            podcast1.reproduce();
            if (i < 1000) podcast2.reproduce();
        }

        for (int i = 0; i < 2000; i++) {
            podcast1.like();
            if (i < 1500) podcast2.like();
        }
    }
}

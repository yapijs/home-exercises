package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.Iterator;

public class VideoStore {
    private ArrayList<Video> inventory = new ArrayList<>();
    //private Iterator<Video> iterator = inventory.iterator();

    public VideoStore() {
    }

    public void addNewMovie(String title) {
        inventory.add(new Video(title));
    }

    public void addNewMovie(String title, int rating) {
        inventory.add(new Video(title, rating));
    }


    public boolean returnMovie(String title) {
        Video video = findVideo(title);
        if (video != null) {
            return video.returnVideo();
        }
        return false;
    }

    public boolean rentMovie(String title) {
        Video video = findVideo(title);
        if (video != null) {
            return video.rentOut();
        }
        return false;
    }

    private Video findVideo(String title) {
        for (Video video: inventory) {
            if (video.getTitle().equals(title)) {
                return video;
            }
        }
        return null;
    }

    public boolean rateMovie(String title, int rating){
        Video movie = findVideo(title);
        if (movie != null) {
            movie.addNewRating(rating);
            return true;
        }
        return false;
    }

    public void listMovies() {
        Iterator<Video> iterator = inventory.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        if (inventory.size() == 0 ) {
            System.out.println("No movies at this video store :(");
        }
    }


}

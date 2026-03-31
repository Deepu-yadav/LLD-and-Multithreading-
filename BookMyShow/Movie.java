package BookMyShow;

import BookMyShow.ENUM.MovieType;


public class Movie {

    private int id;
    private String name;
    private int durationInMinutes;   // Better than double
    private MovieType movieType;
    private String language;

       public Movie(int id, String name,MovieType movieType, int durationInMinutes, String language){
        this.id=id;
        this.movieType=movieType;
        this.durationInMinutes=durationInMinutes;
        this.name=name;
        this.language=language;
       }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public String getLanguage() {
        return language;
    }
}

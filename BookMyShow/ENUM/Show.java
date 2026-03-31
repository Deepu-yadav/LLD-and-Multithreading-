package BookMyShow.ENUM;

import BookMyShow.Hall;
import BookMyShow.Movie;

import java.time.LocalDateTime;


public class Show {

    private int showId;
    private String name;
    private Hall hall;
    private Movie movie;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Show(int showId,
                String name,
                Hall hall,
                Movie movie,
                LocalDateTime startTime,
                LocalDateTime endTime) {

        this.showId = showId;
        this.name = name;
        this.hall = hall;
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }
}
package tech.mottola.springdemo;

/**
 * Created by mottola on 6/29/16.
 */
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return  "Run a hard 5k";
    }
}
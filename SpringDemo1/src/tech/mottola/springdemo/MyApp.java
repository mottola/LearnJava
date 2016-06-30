package tech.mottola.springdemo;

/**
 * Created by mottola on 6/29/16.
 */
public class MyApp {
    public static void main(String[] args) {
        // create the object
        Coach theCoach = new TrackCoach();

        // use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}

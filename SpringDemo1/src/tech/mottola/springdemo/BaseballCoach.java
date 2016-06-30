package tech.mottola.springdemo;

/**
 * Created by mottola on 6/29/16.
 */
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return  "Spend 30 minutes on batting practice";
    }
}

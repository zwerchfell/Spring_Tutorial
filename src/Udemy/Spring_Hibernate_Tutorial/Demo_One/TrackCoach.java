package Udemy.Spring_Hibernate_Tutorial.Demo_One;

/**
 * Created by Z on 6/10/17.
 */
public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}

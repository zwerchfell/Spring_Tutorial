package Udemy.Spring_Hibernate_Tutorial.Demo_One;

/**
 * Created by Z on 6/9/17.
 */
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice.";
    }
}

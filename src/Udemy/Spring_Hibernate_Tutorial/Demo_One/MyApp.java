package Udemy.Spring_Hibernate_Tutorial.Demo_One;

/**
 * Created by Z on 6/9/17.
 */
public class MyApp {
    public static void main(String[] args) {
        Coach theCoach = new BaseballCoach();

        System.out.println(theCoach.getDailyWorkout());
    }
}

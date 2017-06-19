package Udemy.Spring_Hibernate_Tutorial.Demo_One;

public class MyApp {
    public static void main(String[] args) {
        Coach theCoach = new TrackCoach();

        System.out.println(theCoach.getDailyWorkout());
    }
}

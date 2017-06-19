package Udemy.Spring_Hibernate_Tutorial.Demo_One;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}

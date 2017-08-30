package Udemy.Spring_Hibernate_Tutorial.Demo_One;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
    private String[] fortunes = new String[]{"Today is your lucky day!",
                                     "Win MegaMillions",
                                     "Win PowerBall"};

    @Override
    public String getFortune() {
        Random random = new Random();
        int idx = random.nextInt(fortunes.length);
        return fortunes[idx];
    }
}

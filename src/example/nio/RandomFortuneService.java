package example.nio;

import java.util.concurrent.ThreadLocalRandom;

public class RandomFortuneService implements FortuneService {

    private String[] fortunesArray = {"Who dares wins!",
            "It never rains but it pours",
            "Your lucky numbers are 2 and 9, and letter X"};

    @Override
    public String getFortune() {
        return fortunesArray[ThreadLocalRandom.current().nextInt(0, fortunesArray.length)];
    }
}

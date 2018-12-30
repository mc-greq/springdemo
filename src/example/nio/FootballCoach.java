package example.nio;

public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice 50 penalty kicks";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}

package example.nio;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String teamName;
    private String email;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public void setTeamName(String teamName) {
        System.out.println("CricketCoach: inside setter method - setTeamName");
        this.teamName = teamName;
    }

    public void setEmail(String email) {
        System.out.println("CricketCoach: inside setter method - setEmail");
        this.email = email;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getEmail() {
        return email;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

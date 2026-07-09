package com.codeit.javaExam;

//@SpringBootApplication
public class JavaExamApplication {
    public static void main(String[] args) {
//		SpringApplication.run(JavaExamApplication.class, args);

        Hero selectedHero = new StrengthHero();
        IGameService gameService = new TwoCoinGameService(selectedHero);
        gameService.play();

    }
}

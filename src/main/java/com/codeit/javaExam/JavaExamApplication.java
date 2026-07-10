package com.codeit.javaExam;

//@SpringBootApplication
public class JavaExamApplication {
    public static void main(String[] args) {
//		SpringApplication.run(JavaExamApplication.class, args);

        Member aaron = new Member(
                "260709-0000000",
                "Aaron",
                10
        );

        aaron.setName("Baron");
        System.out.println(aaron.toString());

        Member caron = new Member(
                "260708-0000000"
        );

        caron.setName("Caron");
        caron.setAge(20);
        System.out.println(caron.toString());

//        Game game = new Game(new String[]{"Aaron", "Baron"}, 3);
//        Game nullGame = new Game();
    }
}

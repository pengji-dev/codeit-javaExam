package com.codeit.javaExam;

//@SpringBootApplication
public class JavaExamApplication {
    public static void main(String[] args) {
//		SpringApplication.run(JavaExamApplication.class, args);

        PaymentPrice paymentPrice = new PaymentPrice("하리보 젤리", 2500, 2500);
        paymentPrice.display();
    }
}

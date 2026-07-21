package com.codeit.javaExam;

import com.codeit.javaExam.Hero.*;

//@SpringBootApplication
public class JavaExamApplication {
//    private static final Map<Integer, Player> PLAYERS = new HashMap<>() {
//        // Radiant 레디언트 진영
//        put(1, new Player(1, "Aaron", Side.RADIANT, 7, 12, 2, new AgilityHero("Slark")));
//        put(2, new Player(2, "Baron", Side.RADIANT, 2, 1, 6, new StrengthHero("Slardar")));
//        put(3, new Player(3, "Caron", Side.RADIANT, 4, 4, 4, new AgilityHero("Weaver")));
//        put(4, new Player(4, "Daron", Side.RADIANT, 8, 4, 4, new StrengthHero("Huskar")));
//        put(5, new Player(5, "Earon", Side.RADIANT, 1, 4, 4, new AgilityHero("Anti-Mage")));
//
//        // Dire 다이어 진영
//        put(6, new Player(6, "Faron", Side.DIRE, 0, 5, 9, new StrengthHero("Tiny")));
//        put(7, new Player(7, "Garon", Side.DIRE, 7, 4, 2, new StrengthHero("Dragon Knight")));
//        put(8, new Player(8, "Haron", Side.DIRE, 4, 3, 1, new StrengthHero("Night Stalker")));
//        put(9, new Player(9, "Iaron", Side.DIRE, 8, 2, 2, new AgilityHero("Phantom Lancer")));
//        put(10, new Player(10, "Jaron", Side.DIRE, 1, 8, 7, new AgilityHero("Drow Ranger")));
//    };

    public static void main(String[] args) {
//		SpringApplication.run(JavaExamApplication.class, args);

        /*
         *  다형성 : 게으르게 코딩하는 것 = 로직을 바꾸고 싶을 때, 인터페이스 타입 변수 기준으로 구현 클래스만 바꿔주는 것
         *      HeroRepository heroRepository 변수에다가 저장소를 변경하고 싶으면
         *          - new AgilityHeroRepository()
         *          - new StrengthHeroRepository()
         *          - new 블라블라HeroRepository()
         *          -> 구현 클래스의 객체만 변경해주면 가능
         */
        // AgilityHero
        CrudRepository<AgilityHero> crudRepository = new AgilityHeroRepository(
                new AgilityHero[]{
                        new AgilityHero("Slark"),
//                        new StrengthHero("Night Stalker"),      // 문제 (1) StrengthHero임에도 생성자에 함께 Hero[] 인터페이스 다형성 배열로 주입 가능
                        new AgilityHero("Drew Ranger")
                }
        );

        // StrengthHero
        CrudRepository<StrengthHero> strengthHeroCrudRepository = new StrengthHeroRepository(
                new StrengthHero[]{
                        new StrengthHero("Slardar"),
                        new StrengthHero("Dragon Knight"),
//                        new AgilityHero("Aaron")
                }
        );

//        crudepository.create(new StrengthHero("Slarder"));     // 문제 (2) StrengthHero임에도 create()에 Hero 인터페이스 다형성으로 주입 가능
        crudRepository.create(new AgilityHero("Weaver"));
        crudRepository.delete("Slark");

        strengthHeroCrudRepository.create(new StrengthHero("Centaur Warchief"));

        Hero selectedHero = strengthHeroCrudRepository.findHeroByName("Slardar");
        IGameService gameService = new TwoCoinIGameService(selectedHero);
        gameService.play();

//        PaymentPrice paymentPrice = new PaymentPrice("하리보 젤리", 2500, 2500);
//        paymentPrice.display();

//        List<Player> playerList = new ArrayList<>(PLAYERS.values());
//
//        System.out.println(" --- Stream.forEach ---");
//        Stream<Player> playerStream = playerList.stream();
////        playerStream
//        playerList.stream() // Stream<Player> = [Player, Player, Player]
//                .forEach((new Consumer<Player>() {
//                    @Override
//                    public void accept(Player player) {
////                        System.out.println(player.toString());
//                        System.out.println(player);
//                    }
//                });
//
////                .forEach((player) -> {
//////                    System.out.println(player.toString());
////                    System.out.println(player);
////                });
//
//        System.out.println(" -- for 향상된 -- ");
//        for (Player player : playerList) {
//            System.out.println(player);
//        }
    }
}

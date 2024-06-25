package step2;


import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Intro itr = new Intro();
      Battle battle = new Battle();
      Ment ment = new Ment();

      // 0. 용사, 몬스터 객체생성
       Player player = new Player("용사", 35, 7, 250, 250);
       Monster goblin = new Monster("고블린", 10, 5, 40);
       Monster slime = new Monster("슬라임", 12, 3, 30);
       Monster Scorpion = new Monster("스콜피온", 15, 7, 100);
       Monster ogre = new Monster("오우거", 22, 8, 150);
       Monster zombie = new Monster("좀비킹", 20, 8, 180);
       Monster kingslime = new Monster("킹슬라임", 30, 15, 200);
       Monster shadowAssassin = new Monster("그림자암살자", 35, 13, 200);
       Monster treasurebox = new Monster("보물상자", 10, 0, 50);
       Monster flamegolem = new Monster("화염골렘", 30, 20, 250);
       Monster icequeen = new Monster("얼음여왕", 35, 22, 250);
       Monster dragon = new Monster("드래곤", 40, 25, 350);
       Monster devilking = new Monster("마왕", 50, 30, 400);

      // 1. 게임시작, 인트로
      itr.logo();
      ment.startkey();
      int Gamestart = 0;
      int stage = 1;
       
      Gamestart = scanner.nextInt();
      if (Gamestart == 1) {
         switch (stage) {
         case 1:
            ment.jump();
            itr.start();
            ment.pushKey();
            scanner.nextInt(); // enter입력대기
            stage++;
         case 2:
        	itr.intro1();
        	scanner.nextInt(); // enter입력대기
        	stage++;
         case 3:
            itr.intro2();
            scanner.nextInt(); // enter입력대기
            stage++;
         case 4:
            itr.intro3();
            scanner.nextInt(); // enter입력대기
            stage++;
         case 5:
            System.out.println("[던전에 진입하자마자 근처 입구를 배회하던 고블린이 공격해옵니다]");
            goblin.printMent();
            goblin.printStats();
            Battle.battle(player, goblin, scanner);
            battle.giveRandomReward1(player, goblin);
         }
      } else {
         ment.endkey();
         System.exit(0);
      }
      
      


      // 2. 플레이어 선택에따라 전투후 스테이지 선택, 2가지 선택지
        // 스테이지 2,3 : 슬라임, 스콜피온
      ment.stageOne();
      int stageChoice = scanner.nextInt();
      scanner.nextLine();

      switch (stageChoice) {
      case 1:
         // 스테이지 1: 슬라임
         System.out.println("[숲의 선물 스테이지에 도착했습니다.]");
         slime.printMent();
         slime.printStats();
         Battle.battle(player, slime, scanner);
           battle.giveRandomReward2(player, slime);

         break;
      case 2:
         // 스테이지 2: 스콜피온
         System.out.println("[사막의 미궁 스테이지에 도착했습니다.]");
         Scorpion.printMent();
         Scorpion.printStats();
         Battle.battle(player, Scorpion, scanner);
           battle.giveRandomReward3(player, Scorpion);

         break;
      default:
         System.out.println("잘못된 입력입니다. 기본적으로 스테이지 1을 선택합니다.");
         Battle.battle(player, slime, scanner); // 기본적으로 스테이지 1로 진행
         break;
      }
      
      
        // 스테이지 4,5 : 오우거, 좀비킹
      ment.stageTwo();
      stageChoice = scanner.nextInt();
      scanner.nextLine();

      switch (stageChoice) {
      case 1:

         System.out.println("[암흑의 숲 스테이지에 도착했습니다.]");
         ogre.printMent();
         ogre.printStats();
         Battle.battle(player, ogre, scanner);
           battle.giveRandomReward4(player, ogre);

         break;
      case 2:

         System.out.println("[부패한 호수 스테이지에 도착했습니다.]");
         zombie.printMent();
         zombie.printStats();
         Battle.battle(player, zombie, scanner);
           battle.giveRandomReward5(player, zombie);

         break;
      default:
         System.out.println("잘못된 입력입니다. 기본적으로 스테이지 1을 선택합니다.");
         Battle.battle(player, ogre, scanner); // 기본적으로 스테이지 1로 진행
         break;
      }
      
      // 3. 이벤트맵 (슬라임킹, 그림자암살자, 보물상자)
      ment.stagefour();
      stageChoice = scanner.nextInt();
      scanner.nextLine();
      switch (stageChoice) {
      case 1:
    	  ment.hamjung1();
         kingslime.printMent();
         kingslime.printStats();
         Battle.battle(player, kingslime, scanner);
           battle.giveRandomReward8(player, kingslime);

         break;
      case 2:
    	  ment.hamjung2();
         shadowAssassin.printMent();
         shadowAssassin.printStats();
         Battle.battle(player, shadowAssassin, scanner);
           battle.giveRandomReward9(player, shadowAssassin);

         break;
      case 3:
    	  ment.hamjung3();
         treasurebox.printMent();
         treasurebox.printStats();
         Battle.battle(player, treasurebox, scanner);
         battle.giveRandomReward10(player, treasurebox);

         break;
      default:
         System.out.println("잘못된 입력입니다. 기본적으로 스테이지 1을 선택합니다.");
         Battle.battle(player, kingslime, scanner); // 기본적으로 스테이지 1로 진행
         break;
      }
      
      
      // 스테이지 6,7 : 화염골렘, 얼음여왕
      ment.stageThree();
      stageChoice = scanner.nextInt();
      scanner.nextLine();

      switch (stageChoice) {
      case 1:

         System.out.println("[용암 절벽 스테이지에 도착했습니다.]");
         flamegolem.printMent();
         flamegolem.printStats();
         Battle.battle(player, flamegolem, scanner);
           battle.giveRandomReward6(player, flamegolem);

         break;
      case 2:

         System.out.println("[얼음 궁전 스테이지에 도착했습니다.]");
         icequeen.printMent();
         icequeen.printStats();
         Battle.battle(player, icequeen, scanner);
           battle.giveRandomReward7(player, icequeen);

         break;
      default:
         System.out.println("잘못된 입력입니다. 기본적으로 스테이지 1을 선택합니다.");
         Battle.battle(player, flamegolem, scanner); // 기본적으로 스테이지 1로 진행
         break;
      }

      
      // 4. 생명의호수 스테이지, 중간 체력회복 100
      System.out.println("지쳐있는 용사앞에 생명의 기운이 넘쳐나는 호수가 보입니다.");
      System.out.println("[생명의 호수  스테이지에 도착했습니다.]");

      System.out.println("1번을 눌러주세요");
      stageChoice = scanner.nextInt();
      
//    player.setHealth(100);
    
		player.heal(100, 1);
		player.displayStats();

		// 5. 중간보스 (드래곤)
		ment.stagefive();
		dragon.printMent();
		dragon.printStats();
		Battle.battle(player, dragon, scanner);
		battle.giveRandomReward11(player, dragon);

		// 6. 마왕 조우

		ment.stagesix();
		devilking.printMent();
		devilking.printStats();
		Battle.battle(player, devilking, scanner);
		battle.giveRandomReward12(player, devilking);
		ment.stageseven();

		scanner.close();

	}

}
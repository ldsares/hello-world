package step2;

import java.util.Scanner;

public class Battle {

   public static void battle(Player player, Monster monster, Scanner scanner) {

      int cnt = 0;
      while (monster.MonsterHp() > 0 && player.PlayerHp() > 0) {
          System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
    	  System.out.println("  1. 공격하기  ┃  2. 회복하기(실패확률존재)  ┃  3. 도망가기(패털티있음) ");
          System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
         int choice = scanner.nextInt();
         int randomHp = 40 + (int) (Math.random()*20+1);
         int recoverycnt = (int) (Math.random() * 5 + 1);

         
         
         switch (choice) {
         case 1:
            player.attack(monster);
            if (monster.MonsterHp() > 0) {
               monster.attack(player);
            }
            break;
         case 2:

            int recovery = randomHp;
            int recoveryCnt = recoverycnt;
            player.heal(recovery, recoveryCnt);
            if (monster.MonsterHp() > 0) {
               monster.attack(player);
            }
            break;

         case 3:
            int rannum= (int)(Math.random()*10+1); // 주사위
            int rannum2= (int)(Math.random()*5+1); // 공격력 패널티
            int rannum3= (int)(Math.random()*2+1); // 방어력 패널티
            System.out.println("랜덤주사위를(1~10) 던집니다. 50%확률로 도망칠수있습니다");
            System.out.println("랜덤주사위를 던졌습니다 " + rannum + "가 나왔습니다");
            if(rannum > 5 ) {
               System.out.println("무사히 도망쳤지만 방어구 내구도가 상했습니다.");
               player.setDefense(player.PlayerDefense()- rannum3);
                   System.out.println("방어구 내구도가 하락하여 " + rannum3 + "만큼 방어력이 하락하였습니다.");
                   player.displayStats();
                   return; //전투종료
            }else {
               System.out.println("도망에 실패하였습니다. 무기 내구도가 상했습니다.");
               player.setAttackPower(player.PlayerPower()- rannum2);
                   System.out.println("무기 내구도가 하락하여 " + rannum2 + "만큼 공격력이 하락하였습니다.");
            }
            break;
         default:
            System.out.println("잘못된 선택입니다. 몬스터에게 공격당했습니다!");
            monster.attack(player);
            break;

         }
         player.displayStats();
         monster.printStats();

      }

      if (player.PlayerHp() > 0) {
    	  monster.printMent2();
//         System.out.println(player.PlayerName() + "이(가) " + monster.MonsterName() + "을(를) 물리쳤습니다!");
      } else {
//         System.out.println(player.PlayerName() + "이(가) " + monster.MonsterName() + "에게 패배했습니다...");
    	  player.displayMent();
         System.out.println("게임 종료!");
         System.exit(0); 
      }
   }
//   giveRandomReward(player, monster);

      // 1. 고블린 보상
    static void giveRandomReward1(Player player, Monster monster) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("보상을 선택하세요");
       System.out.println("1. 낡은단검 공5 (일반) 2. 낡은방패 방3 (일반) 3. 찢어진망토 체15 (일반)");
        int choice = scanner.nextInt(); 
        switch (choice) {
            case 1:
                int increaseAttack = 5; // 공격력 증가
                player.setAttackPower(player.PlayerPower() + increaseAttack);
                System.out.println("전투에서 승리하여 공격력이 " + increaseAttack + " 증가하였습니다!");
                break;
            case 2:
                int increaseDefense = 3; // 방어력 증가
                player.setDefense(player.PlayerDefense() + increaseDefense);
                System.out.println("전투에서 승리하여 방어력이 " + increaseDefense + " 증가하였습니다!");
                break;
            case 3:
                int increaseHealth = 15; // 체력 증가
                player.setMaxHp(player.PlayerMaxHp() + increaseHealth);
                player.setHealth(player.PlayerHp() + increaseHealth);
                System.out.println("전투에서 승리하여 체력이 " + increaseHealth + " 증가하였습니다!");
                break;
            default:
                System.out.println("보상을 받지 못했습니다.");
                break;
        }
        player.displayStats();
    }   
       // 2. 슬라임 보상
    static void giveRandomReward2(Player player, Monster monster) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("보상을 선택하세요");
       System.out.println("1. 어둠의 지팡이 공8 (레어) 2. 마나의 엘릭서 방4 (레어) 3. 강화 비약 체30 (레어)");
        int choice = scanner.nextInt(); 
        switch (choice) {
            case 1:
                int increaseAttack = 8; // 공격력 증가
                player.setAttackPower(player.PlayerPower() + increaseAttack);
                System.out.println("전투에서 승리하여 공격력이 " + increaseAttack + " 증가하였습니다!");
                break;
            case 2:
                int increaseDefense = 4; // 방어력 증가
                player.setDefense(player.PlayerDefense() + increaseDefense);
                System.out.println("전투에서 승리하여 방어력이 " + increaseDefense + " 증가하였습니다!");
                break;
            case 3:
                int increaseHealth = 30; // 체력 증가
                player.setMaxHp(player.PlayerMaxHp() + increaseHealth);
                player.setHealth(player.PlayerHp() + increaseHealth);
                System.out.println("전투에서 승리하여 체력이 " + increaseHealth + " 증가하였습니다!");
                break;
            default:
                System.out.println("보상을 받지 못했습니다.");
                break;
        }
        player.displayStats();
    }   

   // 3. 스콜피온 보상
   static void giveRandomReward3(Player player, Monster monster) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("보상을 선택하세요");
      System.out.println("1. 파멸의 검 공20 (에픽) 2. 신비의 룬 방5 (레어) 3. 영웅의 반지 체40 (레어)");
      int choice = scanner.nextInt();
      switch (choice) {
      case 1:
         int increaseAttack = 20; // 공격력 증가
         player.setAttackPower(player.PlayerPower() + increaseAttack);
         System.out.println("전투에서 승리하여 공격력이 " + increaseAttack + " 증가하였습니다!");
         break;
      case 2:
         int increaseDefense = 5; // 방어력 증가
         player.setDefense(player.PlayerDefense() + increaseDefense);
         System.out.println("전투에서 승리하여 방어력이 " + increaseDefense + " 증가하였습니다!");
         break;
      case 3:
         int increaseHealth = 40; // 체력 증가
         player.setMaxHp(player.PlayerMaxHp() + increaseHealth);
         player.setHealth(player.PlayerHp() + increaseHealth);
         System.out.println("전투에서 승리하여 체력이 " + increaseHealth + " 증가하였습니다!");
         break;
      default:
         System.out.println("보상을 받지 못했습니다.");
         break;
      }
      player.displayStats();
   }
       
   // 4. 오우거 보상
   static void giveRandomReward4(Player player, Monster monster) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("보상을 선택하세요");
      System.out.println("1. 천둥의 망치 공25 (에픽) 2. 강철 투구 방6 (에픽) 3. 차원의 열쇠 체50 (레어)");
      int choice = scanner.nextInt();
      switch (choice) {
      case 1:
         int increaseAttack = 25; // 공격력 증가
         player.setAttackPower(player.PlayerPower() + increaseAttack);
         System.out.println("전투에서 승리하여 공격력이 " + increaseAttack + " 증가하였습니다!");
         break;
      case 2:
         int increaseDefense = 6; // 방어력 증가
         player.setDefense(player.PlayerDefense() + increaseDefense);
         System.out.println("전투에서 승리하여 방어력이 " + increaseDefense + " 증가하였습니다!");
         break;
      case 3:
         int increaseHealth = 50; // 체력 증가
         player.setMaxHp(player.PlayerMaxHp() + increaseHealth);
         player.setHealth(player.PlayerHp() + increaseHealth);
         System.out.println("전투에서 승리하여 체력이 " + increaseHealth + " 증가하였습니다!");
         break;
      default:
         System.out.println("보상을 받지 못했습니다.");
         break;
      }
      player.displayStats();
   }    
    
   // 5. 좀비킹 보상
   static void giveRandomReward5(Player player, Monster monster) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("보상을 선택하세요");
      System.out.println("1. 불멸의 단검 공30 (에픽) 2. 불사의 부츠 방6 (에픽) 3. 독의 병 체80 (에픽)");
      int choice = scanner.nextInt();
      switch (choice) {
      case 1:
         int increaseAttack = 30; // 공격력 증가
         player.setAttackPower(player.PlayerPower() + increaseAttack);
         System.out.println("전투에서 승리하여 공격력이 " + increaseAttack + " 증가하였습니다!");
         break;
      case 2:
         int increaseDefense = 6; // 방어력 증가
         player.setDefense(player.PlayerDefense() + increaseDefense);
         System.out.println("전투에서 승리하여 방어력이 " + increaseDefense + " 증가하였습니다!");
         break;
      case 3:
         int increaseHealth = 80; // 체력 증가
         player.setMaxHp(player.PlayerMaxHp() + increaseHealth);
         player.setHealth(player.PlayerHp() + increaseHealth);
         System.out.println("전투에서 승리하여 체력이 " + increaseHealth + " 증가하였습니다!");
         break;
      default:
         System.out.println("보상을 받지 못했습니다.");
         break;
      }
      player.displayStats();
   }           
    
   // 6. 화염골렘 보상
   static void giveRandomReward6(Player player, Monster monster) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("보상을 선택하세요");
      System.out.println("1. 이글거리는 장검 공35 (에픽) 2. 불꽃방패 방7 (에픽) 3. 불의 반지 체120 (전설!)");
      int choice = scanner.nextInt();
      switch (choice) {
      case 1:
         int increaseAttack = 35; // 공격력 증가
         player.setAttackPower(player.PlayerPower() + increaseAttack);
         System.out.println("전투에서 승리하여 공격력이 " + increaseAttack + " 증가하였습니다!");
         break;
      case 2:
         int increaseDefense = 7; // 방어력 증가
         player.setDefense(player.PlayerDefense() + increaseDefense);
         System.out.println("전투에서 승리하여 방어력이 " + increaseDefense + " 증가하였습니다!");
         break;
      case 3:
         int increaseHealth = 120; // 체력 증가
         player.setMaxHp(player.PlayerMaxHp() + increaseHealth);
         player.setHealth(player.PlayerHp() + increaseHealth);
         System.out.println("전투에서 승리하여 체력이 " + increaseHealth + " 증가하였습니다!");
         break;
      default:
         System.out.println("보상을 받지 못했습니다.");
         break;
      }
      player.displayStats();
   }       
   
   // 7. 얼음여왕 보상
   static void giveRandomReward7(Player player, Monster monster) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("보상을 선택하세요");
      System.out.println("1. 서리의 활 공40 (전설!) 2. 서리방패 방7 (에픽) 3. 얼음 반지 체85 (에픽)");
      int choice = scanner.nextInt();
      switch (choice) {
      case 1:
         int increaseAttack = 40; // 공격력 증가
         player.setAttackPower(player.PlayerPower() + increaseAttack);
         System.out.println("전투에서 승리하여 공격력이 " + increaseAttack + " 증가하였습니다!");
         break;
      case 2:
         int increaseDefense = 7; // 방어력 증가
         player.setDefense(player.PlayerDefense() + increaseDefense);
         System.out.println("전투에서 승리하여 방어력이 " + increaseDefense + " 증가하였습니다!");
         break;
      case 3:
         int increaseHealth = 85; // 체력 증가
         player.setMaxHp(player.PlayerMaxHp() + increaseHealth);
         player.setHealth(player.PlayerHp() + increaseHealth);
         System.out.println("전투에서 승리하여 체력이 " + increaseHealth + " 증가하였습니다!");
         break;
      default:
         System.out.println("보상을 받지 못했습니다.");
         break;
      }
      player.displayStats();
   }       
      
   // 8. 이벤트맵, 킹슬라임 보상
   static void giveRandomReward8(Player player, Monster monster) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("보상을 선택하세요");
      System.out.println("1. 재생의검 공25 (에픽) 2. 시간의모래시계 방7 (에픽) 3. 투명 망토 체90 (에픽)");
      int choice = scanner.nextInt();
      switch (choice) {
      case 1:
         int increaseAttack = 25; // 공격력 증가
         player.setAttackPower(player.PlayerPower() + increaseAttack);
         System.out.println("전투에서 승리하여 공격력이 " + increaseAttack + " 증가하였습니다!");
         break;
      case 2:
         int increaseDefense = 7; // 방어력 증가
         player.setDefense(player.PlayerDefense() + increaseDefense);
         System.out.println("전투에서 승리하여 방어력이 " + increaseDefense + " 증가하였습니다!");
         break;
      case 3:
         int increaseHealth = 90; // 체력 증가
         player.setMaxHp(player.PlayerMaxHp() + increaseHealth);
         player.setHealth(player.PlayerHp() + increaseHealth);
         System.out.println("전투에서 승리하여 체력이 " + increaseHealth + " 증가하였습니다!");
         break;
      default:
         System.out.println("보상을 받지 못했습니다.");
         break;
      }
      player.displayStats();
   }      
   
   // 9. 이벤트맵, 어쌔씬 보상
   static void giveRandomReward9(Player player, Monster monster) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("보상을 선택하세요");
      System.out.println("1. 상처의 검 공45 (전설!) 2. 천사의선물 방7 (에픽) 3. 신비의 로브 체90 (에픽)");
      int choice = scanner.nextInt();
      switch (choice) {
      case 1:
         int increaseAttack = 45; // 공격력 증가
         player.setAttackPower(player.PlayerPower() + increaseAttack);
         System.out.println("전투에서 승리하여 공격력이 " + increaseAttack + " 증가하였습니다!");
         break;
      case 2:
         int increaseDefense = 7; // 방어력 증가
         player.setDefense(player.PlayerDefense() + increaseDefense);
         System.out.println("전투에서 승리하여 방어력이 " + increaseDefense + " 증가하였습니다!");
         break;
      case 3:
         int increaseHealth = 90; // 체력 증가
         player.setMaxHp(player.PlayerMaxHp() + increaseHealth);
         player.setHealth(player.PlayerHp() + increaseHealth);
         System.out.println("전투에서 승리하여 체력이 " + increaseHealth + " 증가하였습니다!");
         break;
      default:
         System.out.println("보상을 받지 못했습니다.");
         break;
      }
      player.displayStats();
   }         

   
   
   
    
       // 10.이벤트맵, 보물상자, 능력치 2배보상
        static void giveRandomReward10(Player player, Monster monster) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("**축하합니다** 이벤트보상을 선택하세요");
           System.out.println("1. 심판의 검 공55 (고대전설!) 2. 신성한 갑옷 방어력2배 (고대전설!) 3. 신성 망토 체력2배증가 (고대전설!)");
            int choice = scanner.nextInt(); 
            switch (choice) {
                case 1:
                    int increaseAttack =  55; // 공격력 증가
                    player.setAttackPower(player.PlayerPower() + increaseAttack);
                    System.out.println("전투에서 승리하여 공격력이 " + increaseAttack + " 증가하였습니다!");
                    break;
                case 2:
                    int increaseDefense = 2; // 방어력 증가
                    player.setDefense(player.PlayerDefense() * increaseDefense);
                    System.out.println("전투에서 승리하여 방어력이 " + increaseDefense + " 증가하였습니다!");
                    break;
                case 3:
                    int increaseHealth = 2; // 체력 증가
                    player.setMaxHp(player.PlayerMaxHp() * increaseHealth);
                    player.setHealth(player.PlayerHp() + increaseHealth);
                    System.out.println("전투에서 승리하여 체력이 " + increaseHealth + " 증가하였습니다!");
                    break;
                default:
                    System.out.println("보상을 받지 못했습니다.");
                    break;
           }
           player.displayStats();
       } 
    
        
       // 11. 중간보스, 드래곤
       static void giveRandomReward11(Player player, Monster monster) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("보상을 선택하세요");
          System.out.println("1. 불타는 검 공60 (고대전설!) 2. 드래곤 철갑 방10 (전설!) 3. 마력의 팔찌 체150 (전설!)");
          int choice = scanner.nextInt();
          switch (choice) {
          case 1:
             int increaseAttack = 60; // 공격력 증가
             player.setAttackPower(player.PlayerPower() + increaseAttack);
             System.out.println("전투에서 승리하여 공격력이 " + increaseAttack + " 증가하였습니다!");
             break;
          case 2:
             int increaseDefense = 10; // 방어력 증가
             player.setDefense(player.PlayerDefense() + increaseDefense);
             System.out.println("전투에서 승리하여 방어력이 " + increaseDefense + " 증가하였습니다!");
             break;
          case 3:
             int increaseHealth = 150; // 체력 증가
             player.setMaxHp(player.PlayerMaxHp() + increaseHealth);
             player.setHealth(player.PlayerHp() + increaseHealth);
             System.out.println("전투에서 승리하여 체력이 " + increaseHealth + " 증가하였습니다!");
             break;
          default:
             System.out.println("보상을 받지 못했습니다.");
             break;
          }
          player.displayStats();
       }      
       
       // 12. 최종보스, 마왕
       static void giveRandomReward12(Player player, Monster monster) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("보상을 선택하세요");
          System.out.println("1. 심판의 검 공120 (고대전설!) 2. 신성 갑옷 방20 (고대전설!) 3. 성스러운 성배 체200 (고대전설!)");
          int choice = scanner.nextInt();
          switch (choice) {
          case 1:
             int increaseAttack = 120; // 공격력 증가
             player.setAttackPower(player.PlayerPower() + increaseAttack);
             System.out.println("전투에서 승리하여 공격력이 " + increaseAttack + " 증가하였습니다!");
             break;
          case 2:
             int increaseDefense = 20; // 방어력 증가
             player.setDefense(player.PlayerDefense() + increaseDefense);
             System.out.println("전투에서 승리하여 방어력이 " + increaseDefense + " 증가하였습니다!");
             break;
          case 3:
             int increaseHealth = 200; // 체력 증가
             player.setMaxHp(player.PlayerMaxHp() + increaseHealth);
             player.setHealth(player.PlayerHp() + increaseHealth);
             System.out.println("전투에서 승리하여 체력이 " + increaseHealth + " 증가하였습니다!");
             break;
          default:
             System.out.println("보상을 받지 못했습니다.");
             break;
          }
          player.displayStats();
       }      
   
}

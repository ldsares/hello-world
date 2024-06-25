package step2;

public class Ment {

	   String stageName;
	   public void stageOne() {
		   System.out.println("┏━ ");
		   System.out.println("┃ 고블린과 전투를 마친후 길이 열렸다 어디로 갈것인가?┃");
		   System.out.println("                                      ━┛");
	      System.out.println("┌==================================┐");
	      System.out.println("        ★☆★☆★☆스테이지 선택★☆★☆★☆  "); 
	       System.out.println("      " +" "+"   1. 숲의 선물          ");
	       System.out.println("      "+" "+ "   2. 사막의 미궁        ");
	       System.out.println("    "+"원하는 스테이지를 선택하세요 ( 1 OR 2 ) ");
	       System.out.println("└=================================┘");
	   }
	   public void stageTwo() {
		   System.out.println("┏━ ");
	       System.out.println("          힘겨운 전투였다.암흑숲쪽에는 거대한 오우거가 ");
	       System.out.println("  부패한 호수에는 수많은 좀비와 좀비킹이보인다 어디로 갈것인가?");
	       System.out.println("                                             ━┛");
	       System.out.println("┌=================================┐");
	       System.out.println("        ★☆★☆★☆스테이지 선택★☆★☆★☆  "); 
	       System.out.println("      " +" "+"   1. 암흑의 숲        ");
	       System.out.println("      "+" "+ "   2. 부패한 호수        ");
	       System.out.println("    "+"원하는 스테이지를 선택하세요 ( 1 OR 2 ) ");
	       System.out.println("└=================================┘");
	   }
	   public void stageThree() {
		   System.out.println("┏━ ");
		   System.out.println("     좋은 장비를 건진것 같다. 한쪽은 불 한쪽은 얼음이다. ");
		   System.out.println("                 어느쪽을 선택할것인가?");
		   System.out.println("                                       ━┛");
		   System.out.println("┌=================================┐");
	       System.out.println("        ★☆★☆★☆스테이지 선택★☆★☆★☆  "); 
	       System.out.println("      " +" "+"   1. 용암 절벽        ");
	       System.out.println("      "+" "+ "   2. 얼음 궁전        ");
	       System.out.println("    "+"원하는 스테이지를 선택하세요 ( 1 OR 2 ) ");
	       System.out.println("└=================================┘");
	   }
	   public void stagefour() {
		   System.out.println("┏━ ");
		   System.out.println("   왠지 이앞은 좋은 아이템을 얻을수도 있을것 같다.");
		   System.out.println("                                       ━┛");
	      System.out.println("┌=======================================================┐");
	      System.out.println("                             ★☆★☆★☆이벤트 스테이지 선택★☆★☆★☆                             "); 
	       System.out.println("      " +" "+"   1. 소녀가 도움을 요청합니다. 도와주시겠습니까?  ");
	       System.out.println("      "+" "+ "   2. 한 행인이 서있습니다. 말을 건네 보시겠습니까?  ");
	      System.out.println("      " + " " + "   3. 수상한 상자 하나가 있습니다.확인해 보시겠습니까?  ");
	      System.out.println("                 " + "원하는 번호를 선택하세요 ( 1 OR 2 OR 3 선택 ) ");
	      System.out.println("└========================================================┘");
	   }

	   public void stagefive() {
		  System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓ ");
	      System.out.println("     불길한 기운이 엄습합니다..");
	      System.out.println("     저 앞에 청룡 봉우리가 보입니다. 마왕이 저편 너머에 있는것같습니다.");
	      System.out.println("     중간보스! 청룡 봉우리 스테이지에 도착했습니다. ");
	      System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
	   }

	   public void stagesix() {
		  System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━B O S S━━━━━━━━━━━━━━━━━━━━━━━━━┓ ");
	      System.out.println("            지속적으로 마을의 평화를 위협하는 마왕을 드디어 조우하였습니다.");
	      System.out.println("            마왕은 서있는것만으로도 엄청난 위압감을 줍니다. ");
	      System.out.println("            지금까지 모아온 아이템과 경험 스탯으로 마왕을 상대해봅시다.");
	      System.out.println("            최종보스! 어둠의 첨탑 스테이지에 도착했습니다.");
	      System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
	   }
	   public void stageseven() {
		  System.out.println("┌============================ E N D I N G=========================┐");
	      System.out.println("               마왕을 드디어 처지했습니다. 마을에 평화가 찾아왔습니다.");
	      System.out.println("==================================================================");
	      System.out.println("               모든 마을사람들이 돌아온 용사를 축하해주고 밤새 축하파티를 열었습니다.");
	      System.out.println("==================================================================");
	      System.out.println("               먼훗날 용사는 대대손손 전해지는 전설의 용사로 기록되었습니다");
	      System.out.println("==================================================================");
	      System.out.println("                         플레이 해주셔서 감사합니다.");
	      System.out.println("└=================================================================┘");
	   }

	   public void startkey() {
	      System.out.println("┌=============================================================================┐");
	      System.out.println("                                                      쪼렙용사키우기에 오신것을 환영합니다.");
	      System.out.println("                                 <  1. S T A R T  >");
	      System.out.println("                                  <  2. E X I T  >");
	      System.out.println("                            (   Please press the key   )");
	      System.out.println("└=============================================================================┘");
	   }

	   public void endkey() {
	      System.out.println("┌=============================================================================┐");
	      System.out.println("                              [종료 되었습니다. 감사합니다]");
	      System.out.println("└=============================================================================┘");
	   }

	   public void pushKey() {
	      System.out.println("┌=============================================================================┐");
	      System.out.println("                       [계속 진행하시려면  : 1번 Push + Enter]");
	      System.out.println("└=============================================================================┘");
	   }

	   public void jump() {
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("");

	   }
	   
	   public void hamjung1() {

		   System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★★☆★★");
	         System.out.println("                      "+ "            "+  "    함정 스테이지에 도착했습니다");
	         System.out.println(" ========================================================");
	         System.out.println("      "     + "            소녀의 형상이 점점 괴물로 변해갑니다.그 정체는 킹슬라임!");
	         System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★★☆★☆★☆★☆★☆★☆★★☆★★☆★");
	   }
	   public void hamjung2() {

		   System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★★☆★★");
	         System.out.println("                      "+ "            "+  "    함정 스테이지에 도착했습니다");
	         System.out.println(" ========================================================");
	         System.out.println("                    "     + "               사실 그는 그림자암살자였습니다.!");
	         System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★★☆★☆★☆★☆★☆★☆★★☆★★☆★");
	   }
	   public void hamjung3() {
		   
		   System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★★☆★★");
		   System.out.println("                      "+ "            "+  "    이벤트 스테이지에 도착했습니다");
		   System.out.println(" ========================================================");
		   System.out.println("             "     + "             보물상자가 나타났습니다 좋은보상이있을듯 합니다!");
		   System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★★☆★☆★☆★☆★☆★☆★★☆★★☆★");
	   }
	   
	   

	}

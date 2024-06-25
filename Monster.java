package step2;


public class Monster {
    String name;
    int Power;
    int Defense;
    int Hp;

   public Monster(String name, int MonsterPower, int MonsterDefense, int MonsterHp) {
       this.name = name;
       this.Power = MonsterPower;
       this.Defense = MonsterDefense;
       this.Hp = MonsterHp;
   }

   public void takeDamage(int damage) {
       int getDamage = damage - Defense;
       if (getDamage > 0) {
          Hp -= getDamage;
       }
       if (Hp < 0) {
          Hp = 0;
       }
       System.out.println("       "+" "+name + "의 남은 체력: " + Hp);
       System.out.println("└============================┘");
   }

   public String MonsterName() {
       return name;
   }

   public int MonsterPower() {
       return Power;
   }

   public int MonsterDefense() {
       return Defense;
   }

   public  int MonsterHp() {
       return Hp;
   }

   public void attack(Player player) {
	   System.out.println("┌============================┐");
       System.out.println("   "+ name + ":"+ player.PlayerName()+"를 공격했습니다!");
       System.out.println("┃============================┃");
      
       player.takeDamage(Power);
   }
   public void printMent() {
        
       
         System.out.println("┌============================┐");
         System.out.println("       "+name+"이 등장했습니다");
         System.out.println("└============================┘");
         System.out.println(" ");
   }  

   
   public void printStats() {
         System.out.println("┌====== 몬 스 터 스탯 ========┐");
           System.out.println("     몬스터 이름: " + name );
           System.out.println("     체력: " + Hp );
           System.out.println("     공격력: " + Power );
           System.out.println("     방어력: " + Defense );
           System.out.println("└========================┘");
      }

   
   public void printMent2() {
       
         
         System.out.println("┌============================┐");
         System.out.println("     "+name+"을(를) 토벌 하였습니다.");
         System.out.println("└============================┘");
         System.out.println(" ");
      
     }

}

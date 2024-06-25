package step2;


public class Player {
   String name;
   int Power;
   int Defense;
   int Hp;
   int MaxHp;

   public Player(String name, int PlayerPower, int PlayerDefense, int Hp, int PlayerMaxHp) {
      this.name = name;
      this.Power = PlayerPower;
      this.Defense = PlayerDefense;
      this.Hp = Hp;
      this.MaxHp = PlayerMaxHp;
   }

   public void attack(Monster monster) {
	   System.out.println("┌============================┐");
       System.out.println("     "+ name + ":"+ monster.MonsterName()+"를 공격했습니다!");
       System.out.println("┃============================┃");
      monster.takeDamage(Power);
   }

   public String PlayerName() {
      return name;
   }

   public int PlayerPower() {
      return Power;
   }

   public int PlayerDefense() {
      return Defense;
   }

   public int PlayerHp() {
      return Hp;
   }

   public int PlayerMaxHp() {
      return MaxHp;
   }

   public int setAttackPower(int i) {
      return Power = i;
   }

   public int setDefense(int i) {
      return Defense = i;
   }

   public int setHealth(int i) {
      return Hp = i;
   }

   public int setMaxHp(int i) {
      return MaxHp = i;
   }

   public void takeDamage(int damage) {
      int getDamage = damage - Defense;
      if (getDamage > 0) {
         Hp -= getDamage;
      }
      if (Hp < 0) {
         Hp = 0;
      }
      System.out.println("   "+"       "+name + "의 남은 체력: " + Hp);
      System.out.println("└============================┘");
   }

      public void heal(int recovery, int recoveryCnt) {
            int cnt = 1;
            int hpCnt = recoveryCnt;
            int HPrecovery = recovery;

            if (cnt >= 3) {
               System.out.println("[더 이상 회복하지 못합니다.]");
            } // 회복 제한은 나중에 선생님께 여쭤보기...

            if (hpCnt == 1 || hpCnt == 2 || hpCnt == 3) {
               if (Hp < MaxHp) {
                  Hp += HPrecovery;
                  if (Hp > MaxHp) {
                     Hp = MaxHp;
                  }
                  System.out.println("["+name + "의 체력이 " + HPrecovery + "만큼 회복되었습니다.]");
               } else {
                  System.out.println("["+name + "의 체력이 이미 최대치입니다. 현재 체력: " + Hp+"]");
               }

            } else if (hpCnt == 4 || hpCnt == 5) {
               System.out.println("[회복에 실패 했습니다.]");
               
            }
      }

//    setHealth(PlayerHp() + HPrecovery);
//    System.out.println("HP: " + HPrecovery + "만큼 회복 되었습니다!");

   public void displayStats() {
      System.out.println("┌====== 플레이어 스탯 =======┐");
        System.out.println("     플레이어: " + name );
        System.out.println("     체력: " + Hp +"/"+ MaxHp);
        System.out.println("     공격력: " + Power );
        System.out.println("     방어력: " + Defense );
        System.out.println("└========================┘");
   }
   
    public void displayMent() {
         
         System.out.println("┌============================┐");
         System.out.println("    "+name+"가 패배 하였습니다.");
         System.out.println("└============================┘");
         System.out.println(" ");

    }
}    

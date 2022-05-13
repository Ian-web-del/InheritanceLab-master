public class Wizard extends Character{
    Wizard(String name, int lvl, int hp, int mp){
        super(name,lvl,hp,mp);
    }
    public void steeltempest(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Steeltempest (Damage - 10)(Mana Cost - 30)");
        int damagePoints = 20;
        int manaCost = 30;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void SweepingBlade(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Sweepingblade (Damage - 20)(Mana Cost - 60)");
        int damagePoints = 30;
        int manaCost = 60;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void LastBreath(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Lastbreath (Damage - 70)(Mana Cost - 110)");
        int damagePoints = 50;
        int manaCost = 110;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void heal(){
        super.healthPoints += 50;
        System.out.println("heal me honey");
    }
    /**
     * Display character data
     */
    public void display(){
        System.out.println("Wizard: " + super.characterName);
        System.out.println("HealthPoints: " + super.healthPoints);
        System.out.println("ManaPoints: " + super.manaPoints);
        System.out.println("Level " + super.level);
    }
}
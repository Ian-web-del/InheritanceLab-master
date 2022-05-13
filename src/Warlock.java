public class Warlock extends Character{
    Warlock(String name, int lvl, int hp, int mp){
        super(name,lvl,hp,mp);
    }
    /**
     * Skills and Regen 
     */
    public void RazorShuriken(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Razorshuriken (Damage - 30) (Mana cost - 40)");
        int damagePoints = 30;
        int manaCost = 40;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void ShadowSlash(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Shadowslash (Damage - 20) (Mana cost - 60)");
        int damagePoints = 20;
        int manaCost = 60;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void DeathMark(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Deathmark (Damage - 50) (Mana cost - 100)");
        int damagePoints = 50;
        int manaCost = 100;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    /**
     * Display character data
     */
    public void display(){
        System.out.println("Warlock: " + super.characterName);
        System.out.println("HealthPoints: " + super.healthPoints);
        System.out.println("ManaPoints: " + super.manaPoints);
        System.out.println("Level " + super.level);
    }
}
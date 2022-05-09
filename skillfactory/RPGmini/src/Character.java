public class Character {
    private String name;
    private int hp;
    private int strength;
    private int dexterity;
    private int xp;
    private int gold;

    public Character(String name, int hp, int strength, int dexterity, int xp, int gold){
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.dexterity = dexterity;
        this.xp = xp;
        this.gold = gold;
    }

    public int attack(){
        if(dexterity*3>getRandomValue()) return strength;
        else return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getDexterity() {
        return dexterity;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    public int getXp() {
        return xp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }
    public int getGold() {
        return gold;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    private int getRandomValue() {
        return (int) (Math.random() * 100);
    }

    public String toString() {
        return String.format("%s здоровье:%d", name, hp);

    }

}
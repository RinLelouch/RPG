import java.util.Set;

public abstract class Character {
    private String name;
    private int hp;
    private int mp;
    private Set<Skills> skills;
    private int lvl;
    private int exp;

    public Character(String name, int hp, int mp, int lvl, int exp, Set<Skills> skills){
        this.name=name;
        this.hp=hp;
        this.mp=mp;
        this.lvl=1;
        this.exp=0;
        this.skills=skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public boolean isAlive(){
        return getHp() >0;
    }
    public void lvlUp(){
        if(getExp()>=100){
            setLvl(getLvl()+1);
            System.out.println("Congratulations, u have leveled up, u are now lvl " + getLvl());
        }
    }
    public void monsterIsDead(Monsters monster){
        if (monster.getHp()<=0){
            this.setExp(getExp()+ monster.getExp());
        }
        lvlUp();
        addSkill();
    }
    public void normalAttack(){

    }
    public void skillAttack(){

    }

    public void skillAdd(Skills s){
        this.skills.add(s);
    }

    public abstract void addSkill();



    public abstract void normalAttack(Monsters monster);
}

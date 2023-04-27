import java.lang.reflect.Array;
import java.util.ArrayList;

public  class Character {
    private String name;
    private int hp;
    private int mp;
    private ArrayList<Skills>();
    private int lvl;
    private int exp;

    public Character(String name, int hp, int mp, int lvl, int exp, ArrayList<Skills> skills){
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
    public void normalAttack(){

    }
    public void skillAttack(){

    }

}

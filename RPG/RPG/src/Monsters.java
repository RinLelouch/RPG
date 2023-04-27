import java.util.Set;

public class Monsters {
    private final String name;
    private final int lvl;
    private int hp;
    private int mp;
    private final Set<Skills> skills;
    private final int exp;


    public Monsters(String name, int lvl, int hp, int mp, Set<Skills> skills, int exp) {
        this.name = name;
        this.lvl = lvl;
        this.hp = hp;
        this.mp = mp;
        this.skills = skills;
        this.exp = exp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getLvl() {
        return lvl;
    }

    public int getExp() {
        return exp;
    }

    public String getName() {
        return name;
    }

    public Set<Skills> getSkills() {
        return skills;
    }

}

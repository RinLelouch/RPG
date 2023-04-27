import java.util.Set;

public class Warrior extends Character{
    private int str;
    public Warrior(String name, int hp, int mp, int lvl, int exp, Set<Skills> skills, int str) {
        super(name, hp, mp, lvl, exp, skills);
        this.str=str;
    }

    @Override
    public void addSkill(){
        if (getLvl()== 5){
            skillAdd(Skills.SHIELD_BASH);
        }if(getLvl()==10){
            skillAdd(Skills.QUICK_SLASH);
        }
    }
    @Override
    public void normalAttack(Monsters monster){
        monster.setHp(getHp()-(int)(Math.random()* this.str));
        monsterIsDead(monster);
    }


}



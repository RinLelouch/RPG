import java.util.Set;

public class Orc extends Monsters {
    public Orc(String name, int lvl, int hp, int mp, Set<Skills> skills, int exp) {
        super("Orc", 25, 1400, 400, Set.of(Skills.RUSH, Skills.BAT_SLASH), 15);
    }
}

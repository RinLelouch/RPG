import java.util.Set;

public class Goblin extends Monsters {
    public Goblin(String name, int lvl, int hp, int mp, Set<Skills> skills, int exp) {
        super("Goblin", 3, 500, 150, Set.of(Skills.STAB, Skills.SAND_THROW), 5);
    }

}

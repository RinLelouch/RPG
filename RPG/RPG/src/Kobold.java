import java.util.Set;

public class Kobold extends Monsters {
    public Kobold(String name, int lvl, int hp, int mp, Set<Skills> skills, int exp) {
        super("Kobold", 15, 800, 250, Set.of(Skills.CLAW_SLASH, Skills.TAIL_WHIP), 10);
    }
}

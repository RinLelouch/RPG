import java.util.Set;

public class Mermaid extends Monsters {
    public Mermaid(String name, int lvl, int hp, int mp, Set<Skills> skills, int exp) {
        super("Mermaid", 20, 1000, 400, Set.of(Skills.TRIDENT_SLASH, Skills.WATER_PISTOL), 13);
    }
}

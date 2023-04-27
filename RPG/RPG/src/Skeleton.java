import java.util.Set;

public class Skeleton extends Monsters {
    public Skeleton(String name, int lvl, int hp, int mp, Set<Skills> skills, int exp) {
        super("Skeleton", 15, 850, 200, Set.of(Skills.BONE_SWORD_SLASH, Skills.BONE_SHIELD_BASH), 10);
    }
}

import java.util.ArrayList;
import java.util.Set;

public enum Monster {
    GOBLIN("Goblin", 3, 500, 150, Set.of(Skills.STAB,Skills.SAND_THROW), 5),
    KOBOLD("Kobold", 15, 800, 250, Set.of(Skills.CLAW_SLASH,Skills.TAIL_WHIP), 10),
    ORC("Orc", 25, 1400, 400, Set.of(Skills.RUSH,Skills.BAT_SLASH),15),
    MERMAID("Mermaid", 20, 1000, 400, Set.of(Skills.TRIDENT_SLASH,Skills.WATER_PISTOL),13),
    SKELETON("Skeleton", 15,850, 200, Set.of(Skills.BONE_SWORD_SLASH,Skills.BONE_SHIELD_BASH), 10),
    DRAGON,
    GIANT_SPIDER,
    GOBLIN_CAPTAIN,
    GOBLIN_KING,
    KOBOLD_CAPTAIN,
    KOBOLD_KING,
    ORC_CAPTAIN,
    ORC_KING,
    MERMAID_CAPTAIN,
    MERMAID_KING,
    SKELETON_CAPTAIN,
    SKELETON_KING,
    GIANT_SPIDER_CAPTAIN,
    GIANT_SPIDER_KING,
    DRAGON_KING;
    Monster(String nomeRazza, int lvl, int hp, int mp, Set<Skills> skills, int exp){

    }
}

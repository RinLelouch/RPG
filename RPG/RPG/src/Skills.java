public enum Skills {
    //WIZARD
    FIRE_BALL("fire ball" , 80 , 120),
    ICE_BLADE("ice blade", 100, 150),
    FIRE_STORM("fire storm", 150, 200),
    //CLERIC
    HOLY_RAGE("holy pray" , 100 , 100),
    LIGHTNING_BOLT("lightning bolt", 150, 180),

    //WARRIOR
    QUICK_SLASH("quick slash",40, 60),
    SWORD_TWIST("sword twist", 60,90),
    SWORD_THROW("sword throw", 40, 150),
    //PALADIN
    LIGHT_JUDGMENT("light judgment" , 50 , 80),
    SHIELD_BASH("shield bash", 60, 100),

    //HUNTER
    PRECISION_SHOT("precision shot", 80, 120),
    CRIPPLE_SHOT("cripple shot", 50, 20),
    PARALYZE_SHOT("paralyze shot", 60, 20),
    //SNIPER
    HEAD_SHOT("head shot", 100, 150),
    HAWK_EYE("hawk eye", 80, 100),

    //ASSASSIN
    BACK_STAB("back stab", 80, 90),
    EVISCERATE("eviscerate", 100, 120),
    KNIFE_THROW("knife throw", 80, 100),
    //SHADOW_MASTER
    CAMOUFLAGE("camouflage", 100, 0),
    POISON_FANG("poison fang", 120, 80),

    //GOBLIN
    STAB("stab", 20, 20),
    SAND_THROW("sand throw", 10 , 10),

    //KOBOLD
    CLAW_SLASH("claw slash", 30, 30),
    TAIL_WHIP("tail whip", 20, 15),

    //ORC
    RUSH("rush" , 40, 50),
    BAT_SLASH("bat slash", 50, 60),

    //MERMAID
    TRIDENT_SLASH("trident slash", 40, 40),
    WATER_PISTOL("water pistol", 50, 50),

    //SKELETON
    BONE_SWORD_SLASH("bone sword slash", 30, 45),
    BONE_SHIELD_BASH("bone shield bash", 20, 50),

    //GIANT_SPIDER
    VENOM_FANG("venom fang",30, 30),
    POISON_CLOUD("poison cloud", 50, 60),

    //DRAGON
    DRAGON_BREATH("dragon breath", 250, 500),
    DRAGON_CLAW("dragon claw", 50, 175);

    private final String name;
    private final int mpNeeded;
    private final int damage;
    Skills(String name, int mpNeeded, int damage){
        this.name=name;
        this.mpNeeded=mpNeeded;
        this.damage=damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getMpNeeded() {
        return mpNeeded;
    }
}






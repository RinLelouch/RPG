public enum Skills {
    //WIZARD
    FIRE_BALL("fire ball" , 80 , 120, Wizard),
    ICE_BLADE("ice blade", 100, 150, Wizard),
    FIRE_STORM("fire storm", 150, 200, Wizard),
    //CLERIC
    HOLY_RAGE("holy pray" , 100 , 100, Cleric),
    LIGHTNING_BOLT("lightning bolt", 150, 180, Cleric),

    //WARRIOR
    QUICK_SLASH("quick slash",40, 60, Warrior),
    SWORD_TWIST("sword twist", 60,90, Warrior),
    SWORD_THROW("sword throw", 40, 150 ,Warrior),
    //PALADIN
    LIGHT_JUDGMENT("light judgment" , 50 , 80, Paladin),
    SHIELD_BASH("shield bash", 60, 100, Paladin),

    //HUNTER
    PRECISION_SHOT("precision shot", 80, 120, Hunter),
    CRIPPLE_SHOT("cripple shot", 50, 20, Hunter),
    PARALYZE_SHOT("paralyze shot", 60, 20, Hunter),
    //SNIPER
    HEAD_SHOT("head shot", 100, 150, Sniper),
    HAWK_EYE("hawk eye", 80, 100, Sniper ),

    //ASSASSIN
    BACK_STAB("back stab", 80, 90, Assassin),
    EVISCERATE("eviscerate", 100, 120, Assassin),
    KNIFE_THROW("knife throw", 80, 100, Assassin),
    //SHADOW_MASTER
    CAMOUFLAGE("camouflage", 100, 0 , ShadowMaster),
    POISON_FANG("poison fang", 120, 80, ShadowMaster),

    //GOBLIN
    STAB("stab", 20, 20, Monster.GOBLIN),
    SAND_THROW("sand throw", 10 , 10 , Monster.GOBLIN),

    //KOBOLD
    CLAW_SLASH("claw slash", 30, 30, Monster.KOBOLD),
    TAIL_WHIP("tail whip", 20, 15, Monster.KOBOLD),

    //ORC
    RUSH("rush" , 40, 50, Monster.ORC),
    BAT_SLASH("bat slash", 50, 60, Monster.ORC),

    //MERMAID
    TRIDENT_SLASH("trident slash", 40, 40, Monster.MERMAID),
    WATER_PISTOL("water pistol", 50, 50, Monster.MERMAID),

    //SKELETON
    BONE_SWORD_SLASH("bone sword slash", 30, 45, Monster.SKELETON),
    BONE_SHIELD_BASH("bone shield bash", 20, 50, Monster.SKELETON),

    //GIANT_SPIDER
    VENOM_FANG("venom fang",30, 30,Monster.GIANT_SPIDER),
    POISON_CLOUD("poison cloud", 50, 60, Monster.GIANT_SPIDER),

    //DRAGON
    DRAGON_BREATH("dragon breath", 250, 500, Monster.DRAGON),
    DRAGON_CLAW("dragon claw", 50, 175, Monster.DRAGON);


    Skills(String name, int mpNeeded, int damage, Object jobRestriction){

    }




}






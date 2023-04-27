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
    CAMUFLAGE("camuflage", 100, 0 , ShadowMaster),
    POISON_FANG("poison fang", 120, 80, ShadowMaster);
    Skills(String name, int mpNeeded, int damage, Class jobRestriction){

    }




}






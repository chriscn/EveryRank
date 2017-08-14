package io.github.chriscn;

public enum RANKS {
    VIP(1),
    VIP_PLUS(2),
    LOL(3),
    LOL_PLUS(4),
    MVP(5),
    MVP_PLUS(6),
    JR_HELPER(7),
    HELPER(8),
    MOD(9),
    ADMIN(10),
    OWNER(11),
    SLOTH(12),
    ANGUS(13),
    BUILD_TEAM(14),
    BUILD_TEAM_PLUS(15),
    MOJANG(16),
    YOUTUBE(17),
    APPLE(18),
    MCPROHOSTING(19);


    private int index;
    RANKS(int i) {
        this.index = i;
    }

    public String getRank() {
        return new RankUtil().ranks.get(index-1);
    }

}

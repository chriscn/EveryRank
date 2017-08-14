package io.github.chriscn;

public enum RANKS {
    DEFAULT(0),
    VIP(1),
    VIP_PLUS(2),
    LOL(3),
    LOL_PLUS(4),
    MVP(5),
    MVP_PLUS(6),



    private int index;
    RANKS(int i) {
        this.index = i;
    }

    public String getRank() {
        return new RankUtil().ranks.get(index+1);
    }

}

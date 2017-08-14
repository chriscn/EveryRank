package io.github.chriscn;

public enum RANKS {
    DEFAULT(0),
    VIP(1),
    VIP_PLUS(2),
    MVP(3),
    MVP_PLUS(4),



    private int index;
    RANKS(int i) {
        this.index = i;
    }

    public String getRank() {
        return new RankUtil().ranks.get(index+1);
    }

}

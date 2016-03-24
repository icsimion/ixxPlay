package com.ixxus.model;

public class Personality {
    private Trait plan;
    private Trait level;
    private Trait team;
    private Trait liberal;

    public Trait getPlan() {
        return plan;
    }

    public void setPlan(Trait plan) {
        this.plan = plan;
    }

    public Trait getLevel() {
        return level;
    }

    public void setLevel(Trait level) {
        this.level = level;
    }

    public Trait getTeam() {
        return team;
    }

    public void setTeam(Trait team) {
        this.team = team;
    }

    public Trait getLiberal() {
        return liberal;
    }

    public void setLiberal(Trait liberal) {
        this.liberal = liberal;
    }
}

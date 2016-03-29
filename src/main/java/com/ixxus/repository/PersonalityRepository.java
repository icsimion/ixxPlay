package com.ixxus.repository;

import com.ixxus.model.Trait;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class PersonalityRepository {
    private final Trait doer = new Trait("Doer", "You are very quick at getting tasks done. You believe the outcome is the most " +
            "important part of a task and the faster you can reach that outcome the better. After all, time is money.");
    private final Trait planner = new Trait("Planner", "You may be slow, but you’ll usually find the best solution. If " +
            "something’s worth doing, it’s worth doing right.");
    private final Trait levelLow = new Trait("Low level", "You’re from the old school of programming and believe that you should " +
            "have an intimate relationship with the computer. You don’t mind juggling registers around and spending " +
            "hours getting a 5% performance increase in an algorithm.");
    private final Trait levelHigh = new Trait("High level", "The world is made up of objects and components, you should create your " +
            "programs in the same way.");
    private final Trait solo = new Trait("Solo situation", "The best way to program is by yourself. There’s no communication problems, " +
            "you know every part of the code allowing you to write the best programs possible.");
    private final Trait team = new Trait("Team" ,"A good group is better than the sum of it’s parts. The only thing better " +
            "than a genius programmer is a cohesive group of genius programmers.");
    private final Trait conservative = new Trait("Conservative programmer", "The less code you write, the less chance there is of it containing " +
            "a bug. You write short and to the point code that gets the job done efficiently.");
    private final Trait liberal = new Trait("Liberal programmer", "Programming is a complex task and you should use white space and " +
            "comments as freely as possible to help simplify the task. We’re not writing on paper anymore so we can " +
            "take up as much room as we need.");

    public Trait getDoer() {
        return doer;
    }

    public Trait getPlanner() {
        return planner;
    }

    public Trait getLevelLow() {
        return levelLow;
    }

    public Trait getLevelHigh() {
        return levelHigh;
    }

    public Trait getSolo() {
        return solo;
    }

    public Trait getTeam() {
        return team;
    }

    public Trait getConservative() {
        return conservative;
    }

    public Trait getLiberal() {
        return liberal;
    }
}

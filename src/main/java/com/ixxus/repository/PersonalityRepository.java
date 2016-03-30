package com.ixxus.repository;

import com.ixxus.model.Trait;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class PersonalityRepository {
    private final Trait doer = new Trait("Doer",
            "You focus on getting tasks done and tend to be very quick at it. You are goal oriented and believe that the faster you can reach the outcome the better. The outcome is the most important part of a task.");
    private final Trait planner = new Trait("Planner",
            "You are thorough and take considerable time to understand all the details of the task at hand, but in the end you usually find the best solution. If something's worth doing, it's worth doing right.");
    private final Trait levelLow = new Trait("Low level view",
            "You're from the old school of programming and believe that you should have an intimate relationship with the computer. You enjoy tinkering with registers and spending hours optimizing the code.");
    private final Trait levelHigh = new Trait("High level view",
            "For you the world is made up of modules and objects and components and you are on top of everything combining them in beautifully crafted applications.");
    private final Trait solo = new Trait("Solo player",
            "The best way for you to perform is to code by yourself. You focus very well on your task only if you are left alone with your code. Just the two of you make a great couple.");
    private final Trait team = new Trait("Team player",
            "You have a team spririt and believe that a good group is better than the sum of its parts. The only thing better than a great programmer is a group of great programmers.");
    private final Trait conservative = new Trait("Conservative programmer",
            "You write code to make things work efficiently. The less code you write, the less chance there is of it containing a bug.");
    private final Trait liberal = new Trait("Liberal programmer",
            "Programming is a difficult task and you should use indenting and comments as freely as possible to help simplify the task. We're not writing on paper anymore so we can take up as much room as we need.");

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

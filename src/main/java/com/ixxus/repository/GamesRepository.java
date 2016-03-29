package com.ixxus.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by simion on 29/03/2016.
 */
@Repository
public class GamesRepository {
    public static String CORRECT = "CORRECT";
    public static String INCORRECT = "INCORRECT";
    private final String game1Explanation = "G1 You are very quick at getting tasks done. You believe the outcome is the most " +
            "important part of a task and the faster you can reach that outcome the better. After all, time is money.";
    private final String game1Answer = "A";

    private final String game2Explanation = "G2 You are very quick at getting tasks done. You believe the outcome is the most " +
            "important part of a task and the faster you can reach that outcome the better. After all, time is money.";
    private final String game2Answer = "B";

    public String getGame1Explanation() {
        return game1Explanation;
    }

    public String getGame1Answer() {
        return game1Answer;
    }

    public String getGame2Explanation() {
        return game2Explanation;
    }

    public String getGame2Answer() {
        return game2Answer;
    }
}

package com.ixxus.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by simion on 29/03/2016.
 */
@Repository
public class GamesRepository {
    public static String CORRECT = "CORRECT";
    public static String INCORRECT = "INCORRECT";
    private final String game1Explanation = "You need 2 matches. Using the 1st match to burn the 1st stick from both sides and second from one side. "
            + "When the 1st stick finishes (half an hour), use the 2nd match to ignite the other end of second stick.";
    private final String game1Answer = "B";

    private final String game2Explanation = "One single weight is needed. Take one marble from box one, two from the 2nd box, three from 3rd box and so one "
            + "and weigh. The total weight, if all boxes contained only 10g marbles should be 550. Subtract the found weight from 550, and that will be the "
            + "index of the box(i.e.  if 5th box contain 9g marbles, then total weight would be 545; 550-545=5(5th box).";
    private final String game2Answer = "A";

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

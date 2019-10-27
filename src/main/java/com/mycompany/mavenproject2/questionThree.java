package com.mycompany.mavenproject2;

import java.util.Scanner;

public class questionThree {

    public static void main(String[] args) {
        double[] testScoresArray = new double[5];
        TestScores firstSet = new TestScores(testScoresArray);
        System.out.println(firstSet);
        firstSet.setTestScoresArray(testScoresArray);
        firstSet.testScoreAverages(testScoresArray);
    }
}

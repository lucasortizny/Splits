package com.lucasortizny.splitcalculator.datamodels;
import java.time.*;
import java.time.Duration;
/**
 * This is the heart of the application. The splits will be based on a pre-existing project:
 * MooSplits.
 */

public class Split extends Category implements Comparable<Split>{
    public String splitName;
    public String splitDescription;
    public Duration actualTime;
    public Duration desiredTime;
    public Double percentages;

    public Split(String splitName, String splitDescription, Duration actualTime, Duration desiredTime, Double percentages) {
        this.splitName = splitName;
        this.splitDescription = splitDescription;
        this.actualTime = actualTime;
        this.desiredTime = desiredTime;
        this.percentages = percentages;
    }

    public Split(String categoryName, String categoryDescription, String splitName, String splitDescription, Duration actualTime, Duration desiredTime, Double percentages) {
        super(categoryName, categoryDescription);
        this.splitName = splitName;
        this.splitDescription = splitDescription;
        this.actualTime = actualTime;
        this.desiredTime = desiredTime;
        this.percentages = percentages;
    }

    public Split(String gameName, String platform, String categoryName, String categoryDescription, String splitName, String splitDescription, Duration actualTime, Duration desiredTime, Double percentages) {
        super(gameName, platform, categoryName, categoryDescription);
        this.splitName = splitName;
        this.splitDescription = splitDescription;
        this.actualTime = actualTime;
        this.desiredTime = desiredTime;
        this.percentages = percentages;
    }

    public Split(String gameName, String categoryName, String categoryDescription, String splitName, String splitDescription, Duration actualTime, Duration desiredTime, Double percentages) {
        super(gameName, categoryName, categoryDescription);
        this.splitName = splitName;
        this.splitDescription = splitDescription;
        this.actualTime = actualTime;
        this.desiredTime = desiredTime;
        this.percentages = percentages;
    }

    public String getSplitName() {
        return splitName;
    }

    public String getSplitDescription() {
        return splitDescription;
    }

    public Duration getActualTime() {
        return actualTime;
    }

    public Duration getDesiredTime() {
        return desiredTime;
    }

    public Double getPercentages() {
        return percentages;
    }

    public void setSplitName(String splitName) {
        this.splitName = splitName;
    }

    public void setSplitDescription(String splitDescription) {
        this.splitDescription = splitDescription;
    }

    public void setActualTime(Duration actualTime) {
        this.actualTime = actualTime;
    }

    public void setDesiredTime(Duration desiredTime) {
        this.desiredTime = desiredTime;
    }

    public void setPercentages(Double percentages) {
        this.percentages = percentages;
    }

    @Override
    public int compareTo(Split split) {
        return this.percentages.compareTo(split.percentages);
    }
}

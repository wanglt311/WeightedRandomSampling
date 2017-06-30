package com.company.webcrawer;

/**
 * Created by wangltlily311 on 6/30/17.
 */
//record the weight added to each category
public class WeightCategory {
    private String category;
    private int weight;

    public WeightCategory() {

    }

    public WeightCategory(String category, int weight) {
        this.category = category;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

package com.company.webcrawer;

import java.util.*;

public class Main {
    //public static List<WeightCategory>  weightCategoryList = new ArrayList<WeightCategory>();
    private static Random random = new Random();

//    public static void initData(List<WeightCategory> weightCategorys) {
//        weightCategoryList = weightCategorys;
//    }
    public static Map<String, Integer> categoryMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        WeightCategory weightCategory1 = new WeightCategory("red", 60);
        WeightCategory weightCategory2 = new WeightCategory("blue", 20);
        WeightCategory weightCategory3 = new WeightCategory("yellow", 20);
        List<WeightCategory> weightCategories = new ArrayList<WeightCategory>();
        weightCategories.add(weightCategory1);
        weightCategories.add(weightCategory2);
        weightCategories.add(weightCategory3);

        //initData(weightCategories);
        categoryMap.put(weightCategory1.getCategory(), 0);
        categoryMap.put(weightCategory2.getCategory(), 0);
        categoryMap.put(weightCategory3.getCategory(), 0);

        int weightSum = 0;
        for (WeightCategory weightCategory : weightCategories) {
            weightSum += weightCategory.getWeight();
        }

        if (weightSum <= 0) {
            System.err.println("Error: weightSum = " + weightSum);
            return;
        }

        for (int i = 0; i < 10000; i++) {
            System.out.println("This is the " + i + "th round");
            int n = random.nextInt(weightSum);
            int m = 0;
            for (WeightCategory weightCategory : weightCategories) {
                if(m <= n && n < m + weightCategory.getWeight()) {
                    System.out.println("This Random Category is "+ weightCategory.getCategory());
                    int value = categoryMap.get(weightCategory.getCategory());
                    categoryMap.put(weightCategory.getCategory(), ++value);
                    break;
                }
                m += weightCategory.getWeight();
            }
        }

        System.out.println(categoryMap.toString());

    }
}

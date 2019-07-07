//package com.ningyq.algorithm;

import java.util.Scanner;

public class FalseCoin1 {

    private static int [] coins = new int[1000];

    private static int weight(int start, int end) {
        int weight = 0;

        for (int i = start; i <= end; i++) {
            weight += coins[i];
        }
//        System.out.println(weight);
        return weight;
    }

    private static void compareTo(int lStart, int lEnd, int rStart, int rEnd) {
        int falseCoin = -1;

        System.out.println("lStart = " + lStart + ", lEnd = " + lEnd + ", rStart = " + rStart + ", rEnd = " + rEnd);
        System.out.println("lWeight = " + weight(lStart, lEnd) + ", rWeight = " + weight(rStart, rEnd));

        if (lStart == lEnd && rStart == rEnd) {
            if (weight(lStart, lEnd) < weight(rStart, rEnd)) {
                falseCoin = lStart;
            } else {
                falseCoin = rStart;
            }
            System.out.println("找到伪币的位置是：" + falseCoin);
        } else if (lStart == lEnd) {
            if (weight(lStart, lEnd) == 0) {
                falseCoin = lStart;
                System.out.println("找到伪币的位置是：" + falseCoin);
            } else {
                compareTo(rStart, (rStart + rEnd) / 2, (rStart + rEnd) / 2 + 1, rEnd);
            }
        } else if (rStart == rEnd) {
            if (weight(rStart, rEnd) == 0) {
                falseCoin = rStart;
                System.out.println("找到伪币的位置是：" + falseCoin);
            } else {
                compareTo(lStart, (lStart + lEnd) / 2, (lStart + lEnd) / 2 + 1, lEnd);
            }
        } else {
            if (weight(lStart, lEnd) < weight(rStart, rEnd)) {
                compareTo(lStart, (lStart + lEnd) / 2, (lStart + lEnd) / 2 + 1, lEnd);
            } else if (weight(lStart, lEnd) > weight(rStart, rEnd)) {
                compareTo(rStart, (rStart + rEnd) / 2, (rStart + rEnd) / 2 + 1, rEnd);
            } else {
                if ((lEnd - lStart) > (rEnd - rStart)) {
                    compareTo(lStart, (lStart + lEnd) / 2, (lStart + lEnd) / 2 + 1, lEnd);
                } else {
                    compareTo(rStart, (rStart + rEnd) / 2, (rStart + rEnd) / 2 + 1, rEnd);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("请输入硬币总数：");
        int coinNum = sc.nextInt();
        int falseCoin = (int) (coinNum * Math.random());
        System.out.println("随机产生的伪币位置：" + falseCoin);

        for (int i = 0; i < coinNum; i++) {
            coins[i] = 1;
        }
        coins[falseCoin] = 0;

        compareTo(0, coinNum/2 - 1, coinNum/2, coinNum - 1);
    }
}
package com.company;

public class Main {
    public static String manWalk(int ageMan, int temp) {
        String result = "";
        if (ageMan < 20 || ageMan > 45 && temp < -20 || temp > 30) {
            System.out.println("ИДИ ГУЛЯЙ");
        } else if (ageMan > 20 && temp < 0 || temp > 28) {
            System.out.println("МОЖНО ГУЛЯТЬ");
        } else if (ageMan > 40 && temp < -10 || temp > 25) {
            System.out.println("Можно еще погулять");
        } else System.out.print("DASTAN, ");
        return result;
    }

    public static void main(String[] args) {
        manWalk(41, 25);
        manWalk(12, 30);

        man2Walk(generateRandomAge(), 20);
        man2Walk(generateRandomAge(), 4);
        man2Walk(generateRandomAge(), 20);
    }

    public static String man2Walk(int ageMan, int temp) {
        String result = "";
        if (ageMan < 20 || ageMan > 45 && temp < -20 || temp > 30) {
            System.out.print("ИДИ ГУЛЯЙ");
        } else if (ageMan > 20 && temp < 0 || temp > 28) {
            System.out.print("МОЖНО ГУЛЯТЬ");
        } else if (ageMan > 40 && temp < -10 || temp > 25) {
            System.out.print("Можно еще погулять");
        } else System.out.print("DASTAN");
        return result;


    }

    public static int generateRandomAge() {
        int a = 0;
        int b = 50;
        int randomNum = (int) (0 + (Math.random() * b));
        System.out.println(" Случайное число 1-ое " + randomNum);
        return randomNum;
    }
}
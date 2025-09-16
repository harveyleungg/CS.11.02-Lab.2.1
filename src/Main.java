/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Harvey Leung
*****************************************************************************************************
*/

// define Main class
public class Main {
    // main - entry point of program
    public static void main(String[] args) {
        // printing the result based on the methods
        // 1. add
        int sumTwo = add(3, 8);
        System.out.println(sumTwo);

        // 2. add
        int sumFour = add(3,8,4,9);
        System.out.println(sumFour);

        // 3. morningGreeting
        String morning = morningGreeting("Toby Fox");
        System.out.println(morning);

        // 4. afternoonGreeting
        String afternoon = afternoonGreeting("Mac Miller");
        System.out.println(afternoon);

        // 5. triple
        String tripled = triple("oohbaby");
        System.out.println(tripled);

        // 6. half
        double halved = half(17);
        System.out.println(halved);

        // 7. roundPositiveValueToNearestInteger
        double roundPositive = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundPositive);

        // 8. roundNegativeValueToNearestInteger
        double roundNegative = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(roundNegative);
    }

    // defining the methods
    // 1. add
    public static int add(int num1, int num2){
        return num1 +  num2;
    }

    // 2. add
    public static int add(int num1, int num2, int num3, int num4){
        return add(add(add(num1, num2), num3), num4);
    }
    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好， " + name + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好， " + name + "!";
    }
    // 5. triple
    public static String triple(String text){
        return text + text + text;
    }

    // 6. half
    public static double half(double num){
        return num / 2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static double roundPositiveValueToNearestInteger(double num){
        return Math.round(num);
    }

    // 8. roundNegativeValueToNearestInteger
    public static double roundNegativeValueToNearestInteger(double num){
        return Math.round(num);
    }
}

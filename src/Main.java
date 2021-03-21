public class Main {
    public static void main(String[] args) {
        int cost1 = 100;
        int cost2 = 1100;
        int totalBonus1;
        int totalBonus2;
        int balance1 = 100;
        if(cost1 >= 1000) {
            totalBonus1 = cost1 / 100 + cost1;
        } else {
            totalBonus1 = cost1;
        }
        if(cost2 >= 1000) {
                totalBonus2 = cost2 / 100 + cost2;
        } else {
                totalBonus2 = cost2;
        }
        int balance = balance1 + totalBonus1 + totalBonus2;
        System.out.println(balance);
    }
}

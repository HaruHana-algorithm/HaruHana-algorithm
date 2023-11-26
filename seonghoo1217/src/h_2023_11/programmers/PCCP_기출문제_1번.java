package h_2023_11.programmers;

public class PCCP_기출문제_1번 {
    public static int solution(int[] bandage, int health, int[][] attacks) {
        int N = attacks.length;
        
        int healTime = bandage[0];
        int healAmount = bandage[1];
        int bonusHeal = bandage[2];

        int attackTime = attacks[N - 1][0];
        int currentHealth = health;
        int continuousHeal=0;
        int attackIndex = 0;
        for (int i=1;i<=attackTime;i++){
            if(attackIndex < N && i  == attacks[attackIndex][0]){
                continuousHeal = 0;
                currentHealth -= attacks[attackIndex][1];
                attackIndex++;
                if (dieCheck(currentHealth)) return -1;
            }else {
                currentHealth = heal(health, currentHealth, healAmount);
                continuousHeal++;
                if (continuousHeal == healTime){
                    currentHealth = heal(health, currentHealth, bonusHeal);
                    continuousHeal = 0;
                }
            }
        }
        return currentHealth;
    }
    private static int heal(int maxHealth, int currentHealth, int healAmount){
        if (maxHealth < currentHealth + healAmount) return maxHealth;
        return currentHealth + healAmount;
    }

    private static boolean dieCheck(int currentHealth){
        return currentHealth <= 0;
    }
    public static void main(String[] args) {
        int [] b = {5, 1, 5};
        int h = 30;
        int [][] a = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
        int solution = solution(b, h, a);
        System.out.println(solution);
    }
}

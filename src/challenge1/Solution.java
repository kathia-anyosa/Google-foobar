package challenge1;

import java.util.ArrayList;

public class Solution{
    public static String solution(int i) {
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        
        for (int n = 3; n <= 21000; n++){
            if (isPrime(n)){
                primes.add(n);
            }
        }
        StringBuilder output = new StringBuilder();
        for (int m = 0; m < primes.size(); m++){
            output.append(primes.get(m));
        }
        return output.toString().substring(i, i+5);
    }
    
    private static boolean isPrime(int n){
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        //Solution solution = new Solution();
        String output1 = Solution.solution(0);
        System.out.println(output1);

        String output2 = Solution.solution(3);
        System.out.println(output2);
    }
}
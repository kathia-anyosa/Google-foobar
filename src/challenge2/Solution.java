package challenge2;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] l, int t) {
        int[] result = {-1, -1};
        //System.out.println("ints: " + Arrays.toString(l));
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : l){
            arr.add(i);
        }

        for (int i : l){
            int a = arr.indexOf(i);
            //System.out.println("a: " + a);
            //System.out.println("l[a]: " + l[a]);
            int b = a;
            int acc = 0;
            while (b < l.length){
                //System.out.println("b: " + b);
                //System.out.println("l[b]: " + l[b]);
                acc = acc + l[b];
                //System.out.println("acc: " + acc);
                if (acc == t){
                    if (arr.indexOf(a) == 0){
                        result[0] = b;
                    } else{
                        result[0] = a;
                    }
                    result[1] = b;
                    //System.out.println("result: " + Arrays.toString(result));
                    return result;
                }
                b++;
            }
        }
        //System.out.println("result: " + Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        int[] ints1 = {1, 2, 3, 4};
        int[] output1 = Solution.solution(ints1, 15);
        System.out.println(Arrays.toString(output1));

        int[] ints2 = {4, 3, 10, 2, 8};
        int[] output2 = Solution.solution(ints2, 12);
        System.out.println(Arrays.toString(output2));

        int[] ints3 = {250, 0, 0, 0};
        int[] output3 = Solution.solution(ints3, 250);
        System.out.println(Arrays.toString(output3));

        int[] ints4 = {260};
        int[] output4 = Solution.solution(ints4, 260);
        System.out.println(Arrays.toString(output4));

        int[] ints5 = {};
        int[] output5 = Solution.solution(ints5, 500);
        System.out.println(Arrays.toString(output5));
    }
}
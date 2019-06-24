package codility.exercises;


public class BinaryGap {
    public static void main(String[] args) {

        System.out.println(Solution.solution(6249));
    }


}

class Solution {
    public static int solution(int N) {
        // write your code in Java SE 8
        int counter = 0;
        int current =0;
        String s = Integer.toString(N, 2);
        int last = s.length();

        if (countChars(s,'1') < 2 ||countChars(s,'0') < 1)
            return counter;


        for (int i = 0; i < last; i++) {
            if (Character.getNumericValue(s.charAt(i)) == 1) {
                if(counter<current) counter=current-1;
                current=0;
            }
            current++;
        }
        return counter;
    }

    private static int countChars(String s, char i){
        return (int)s.chars().filter(ch -> ch == i).count();
    }
}



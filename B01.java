import java.util.*;

public class Submit {
    public int solution(String num) {
        int len = num.length();
        int val = 0;
        for (char c : num.toCharArray()) {
            val += c - '0';
        }
        if (val <10) return val;
        else return cal(val);
    }
    
    private int cal(int val) {
        while (val >= 10) {
            int sum =0;
            while (val!=0) {
                sum+=val%10;
                val = val/10;
            }
            val = sum;
        }
        return val;
    }
}
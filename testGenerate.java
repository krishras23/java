package java;

import org.junit.Test;

public class testGenerate {

    private void Series(int a, int b, int n) {
        System.out.println("------------");
        for (int x = 0; x < n; x++) {
            double current = 0;
            for (int j = 0; j <= x; j++)
                current += Math.pow(2, j) * b;
            int val = (int) current + a;
            System.out.println(val);
        }
        System.out.println("------------");
    }

    @Test
    public void TestSeries() {
        //       Series(0,2,10);
        Series(5, 3, 5);
    }
}

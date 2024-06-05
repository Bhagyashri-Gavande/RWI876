package arrayDemo;


import java.util.*;
public class ArrayDemo {

    static int ArrayDemo(int a[], int n) {

        Arrays.sort(a);
        int second_larg = 0;
        for (int i = n - 2; i >= 0; i--)
        {
            if (a[i] != a[n - 1])
            {
                second_larg = a[i];
                break;
            }
        }

        return second_larg;
    }

    public static void main(String[] args) {
        int a[] = { 9, -7, 6, 6, 5, 4 };
        int n = a.length;

        int ans = ArrayDemo(a, n);

        System.out.println("Second largest element..." + ans);

    }
}

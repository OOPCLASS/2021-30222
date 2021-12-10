package ro.utcluj;

import java.util.*;

public class Main {

    public static Vector<Integer> era() {
        int n = 100000;
        double rootn = Math.sqrt(n);
        boolean [] sieve = new boolean[n + 1];
        Vector<Integer> pp = new Vector<>();
        Arrays.fill(sieve , true);
        for(int i = 2 ; i <= n ; i++) {
            if(sieve[i]) {
                pp.add(i);
                if(i <= rootn) {
                   for(int j = i*i ; j <= n ; j += i) {
                       sieve[j] = false;
                   }
                }
            }
        }
        return pp;
    }

    public static void main(String... args) {
        Vector<Integer> sequence = era();
        int n , m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for(int i = n ; i <= m ; i++) {
            if(i % 2 == 0 && i > 2) {
                int pos = 0;
                boolean Goldbach = false;
                while(sequence.elementAt(pos) <= i) {
                    if(sequence.contains(i - sequence.elementAt(pos))) {
                        Goldbach = true;
                        break;
                    }
                    pos++;
                }
                if(!Goldbach) {
                    System.out.println("FALSE");
                    System.exit(0);
                }
            }
        }
        System.out.println("TRUE");
    }
}

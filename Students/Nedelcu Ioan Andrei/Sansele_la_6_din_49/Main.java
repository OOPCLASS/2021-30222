import java.util.*;
public class Main {
    static long[] fact = new long[10001];
    static long[] ifact = new long[10001];
    static long[] invs = new long[10001];
    static long mod = (long)1e9 + 7;
    static long m = 10000;
    static long binomial_coeff(long n , long k) {
        fact[0] = ifact[0] = invs[0] = 1;
        fact[1] = ifact[1] = invs[1] = 1;
        for (long i = 2 ; i <= m ; ++i) {
            fact[(int)i] = fact[(int)i - 1] * i % mod;
            invs[(int)i] = mod - mod / i * invs[(int)(mod % i)] % mod;
            ifact[(int)i] = ifact[(int)i - 1] * invs[(int)i] % mod;
        }
        return fact[(int)n] * ifact[(int)k] % mod * ifact[(int)(n - k)] % mod;
    }

    public static void main(String ... argc) {
        ///sansele de casting la loterie 6/49
        System.out.println(1.0 / binomial_coeff(49 , 6));
    }
}

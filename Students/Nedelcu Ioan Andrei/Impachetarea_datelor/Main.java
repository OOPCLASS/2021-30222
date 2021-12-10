public class Main {
    public static void main(String ... argc) {
        ///impachetarea datelor
        /// a -> 7 biti , b -> 1bit , c -> 8 biti
        int a = 12 , b = 1 , c = 13;
        short impachetare = (short)(((a << 1 | b) << 8) | c);
        int cc = impachetare & 0xff;
        int bb = (impachetare >>> 8) & 1;
        int aa = (impachetare >>> 9) & 0x7f;
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
    }
}

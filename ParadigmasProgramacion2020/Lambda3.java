@FunctionalInterface
interface CalCarA {
    double calArea(int a,int b);
}

@FunctionalInterface
interface CalCarV {
    double calVol(int a,int b,int c);
}

@FunctionalInterface
interface CalCarC {
    double calAreaC(int a);
}

public class Lambda3 {
    public static void main(String[] args) {
        CalCarA aR = (int val1, int val2) -> val1 * val2;
        CalCarV vR = (int val1, int val2,int val3) -> val1 * val2 * val3;
        CalCarC aC = (int val1) -> Math.PI * val1 * val1;
        
        System.out.println(aR.calArea(10,20));
        System.out.println(vR.calVol(10,20,30));
        System.out.println(aC.calAreaC(10));
    }
}

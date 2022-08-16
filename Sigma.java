public class Sigma {
    public static int sigma(int start, int end, int step) {
        return Accumulate.biAccumulate(new Adder(), 0, start, end, step);
    }
    
}
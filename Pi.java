public class Pi {
    public static int pi(int start, int end, int step) {
        return Accumulate.biAccumulate(new Multiplier(), 1, start, end, step);
    }
    
}
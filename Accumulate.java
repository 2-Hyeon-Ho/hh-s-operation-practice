public class Accumulate {
    static int biAccumulate(BinaryOP binder, int init, int start, int end, int step) {
        int result = init;
        for(int i = start; i <= end; i += step) {
            result = binder.apply(result, i);
        }
        return result;
    } 
}
import java.util.stream.LongStream;
public class SumNumbers {
    public long sumNumbers(int a, int b) {
        return LongStream.range(a, b).sum();
    }
}

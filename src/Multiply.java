import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Multiply {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList();
        List<Integer> collect = integers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println("Multiplication using Stream:"+collect);
        Optional<Integer> reduce = integers.stream().reduce((a, b) -> a * b);
        if (reduce.isPresent()){
            System.out.println("Total multiply:"+reduce.get());
        }else{
            System.out.println("Empty array:"+reduce.get());
        }
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListasLamb6 {
    public static void main(String[] args) {
        List<Integer> lis1 = Arrays.asList(4,5,6,7,8,9,10,11,12);
        
        List<Integer> numPares = lis1.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        
        
        numPares.stream().forEach(n -> System.out.println(n));
        System.out.println();
        
        List<String> lisNom = Arrays.asList("Juan","Pedro","Maria","Jose","Pablo");
        
        List<String> nomMayus = lisNom.stream().map(String::toUpperCase).peek(System.out::println).collect(Collectors.toList());
        
        nomMayus.stream().forEach(n -> System.out.println(n));
        
        System.out.println();
        lis1.stream().forEach(n -> System.out.println(n));
    }
}

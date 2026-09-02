import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListasLamb5 {
    public static void main(String[] args) {
        Stream<Integer> numeros = Stream.of(1,2,3,4,5,6,7,8);
        int suma = numeros.reduce(0,Integer::sum);
        
        System.out.println(suma);
        System.out.println();
        
        List<Integer> listNumeros = Arrays.asList(2,3,4,5,6,7);
        List<Integer> numDobles = listNumeros.stream().map(n -> n * 2).collect(Collectors.toList());
        
        for(int v : numDobles)
            System.out.println(v);
        
        System.out.println();    
        listNumeros.stream().forEach(n -> System.out.println(n));
        
        System.out.println();    
        numDobles.stream().forEach(n -> System.out.println(n));
    }
}

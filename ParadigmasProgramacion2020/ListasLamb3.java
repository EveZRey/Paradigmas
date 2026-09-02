import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListasLamb3 {
    public static void main(String[] args) {
        
        Stream<String> listaNombresOrdenados = Stream.of("Pedro","Juan","Maria","Ana","Carlos")
         .filter(s -> s.contains("P"));
        // .sorted();
        // .map(s -> s.toUpperCase());
        // .count();   Se le quieta Stream<String> a la linea 9
        // y se pone long y se pone en print listaNombresOrdenados
        // en lugar listaNueva
        
        List<String> nuevaLista = listaNombresOrdenados.collect(Collectors.toList());
        
        System.out.println(nuevaLista);
        
    }
}

// función anyMatch(se pone una lambda);
// startsWith(símbolo con que comienza);

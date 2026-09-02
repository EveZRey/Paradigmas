import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListasLamb7 {
    public static void main(String[] args) {
        List<String> lisNom = Arrays.asList("Juan","Pedro","Maria","Jose","Pablo","Raul","Jesus");
        
        List<String> lisLimi = lisNom.stream().limit(3).collect(Collectors.toList());
        
        List<String> lisSal = lisNom.stream().skip(4).collect(Collectors.toList());
        
        lisLimi.stream().forEach(n -> System.out.println(n));
        
        System.out.println();
        lisSal.stream().forEach(n -> System.out.println(n));
        
        List<Integer> lNum = Arrays.asList(1,2,3,4,5,6,7,8);
        
        List<Integer> lNumCua = lNum.stream().map(n -> n * n).collect(Collectors.toList());
        
        System.out.println(lNumCua);
        
        long tamanio = lNum.stream().count();
        
        System.out.println();
        System.out.println(tamanio);
    }
}

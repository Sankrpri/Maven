import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamApi {

    public static void main(String[] args) throws InterruptedException {


        List<String> names=List.of("Aman","Anshu","Annu","Deespk","Akash");
        List<String> NameStartWithA =names.stream().filter(e->e.startsWith("A")).toList();
        System.out.println(NameStartWithA);

        List<Integer> list1= List.of(2,4,50,21,22,67);
        List<Integer> list2= Arrays.asList(23,24,26,30);
        List < Integer> square=list2.stream().map(i-> i*i).collect(Collectors.toList());
        System.out.println(square);
        List<Integer> Even=list1.stream().filter(e->e%2==0).toList();
      List<Integer> even1=list1.stream().filter(e->e%2!=0).collect(Collectors.toList());
        System.out.println(Even);
        System.out.println(even1);
    }
    }


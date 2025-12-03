package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {

  public static void main(String[] args) {
//  List<String> nombres = Arrays.asList("Paula", "Oriana", "Sara", "Aitana", "Sonia");
    List<String> nombres = List.of("Paula", "Oriana", "Sara", "Aitana", "Sonia");
    nombres.stream()
        // skip, ignora los n primeros
        .skip(3)
        .forEach(System.out::println);

    nombres.stream()
        // limit, solo usa los n primeros
        .limit(2)
        .forEach(System.out::println);
  }
}

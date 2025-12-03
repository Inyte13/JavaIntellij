package Streams;

import java.util.Arrays;
import java.util.List;

public class ApisStream {

  private static List<Integer> listaNums() {
    return Arrays.asList(0, 1, 2, 3, 4, 5, 6);
  }

  public static void main(String[] args) {
    List<Integer> nums = listaNums();

    // INTERMEDIAS

    // map
    nums.stream()
        .map(num -> num * 2)
        .forEach(System.out::println);
//      .forEach(num -> System.out.println(num))

    // filter
    nums.stream()
        .filter(num -> num % 2 == 0)
        .forEach(System.out::println);
//      .forEach(num -> System.out.println(num))

    // peek, observa
    nums.stream()
        .peek(num -> System.out.println("Peek: " + num))
        .forEach(System.out::println);

    // TERMINAN

    // forEach



    // reduce
    int suma = nums.stream()
        .reduce(0,(acc, num) -> acc + num);
//      .reduce(0, Integer::sum);
    System.out.println(suma);
  }
}

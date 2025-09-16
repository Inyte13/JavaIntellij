package laboratorio;

import java.util.Scanner;

public class Producto {
  private int code;
  private String name;
  private int stock;
  
  public Producto(int code, int stock, String name) {
    this.code = code;
    this.stock = stock;
    this.name = name;
  }
  @Override
  public String toString() {
    return "Producto{" +
            "code=" + code +
            ", name='" + name + '\'' +
            ", stock=" + stock +
            '}';
  }
}



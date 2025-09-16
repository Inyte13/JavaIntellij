package laboratorio;

import java.util.Scanner;

public class Producto {
  private int code;
  private String name;
  private int stock;
  
  public Producto(int code, String name, int stock) {
    this.code = code;
    this.name = name;
    this.stock = stock;
  }
  public int getCode() {
    return code;
  }
  public void setCode(int code) {
    this.code = code;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getStock() {
    return stock;
  }
  public void setStock(int stock) {
    this.stock = stock;
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



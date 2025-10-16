package SistemaDeMatriculas;

public class Matricula {
  private int codMatri;
  private int codAlu;
  private int codCurso;
  public Matricula(int codMatri, int codAlu, int codCurso) {
    this.codMatri = codMatri;
    this.codAlu = codAlu;
    this.codCurso = codCurso;
  }
  public int getCodMatri() {
    return codMatri;
  }
  public int getCodAlu() {
    return codAlu;
  }
  public int getCodCurso() {
    return codCurso;
  }
}

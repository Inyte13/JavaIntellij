package ids;

public class Hora {
	int hora, minuto, segundo;
	public Hora(int h, int m, int s) {
		setHora(h); // Llamamos a setHora
		setMinuto(m); // Llamamos a setMinuto
		setSegundo(s);} // Llamamos a setSegundos
	public int getHora() {
		return hora;}
	public void setHora(int hora) {
		if(0<=hora&&hora<=23)
			this.hora = hora;}
	public int getMinuto() {
		return minuto;}
	public void setMinuto(int minuto) {
		if(0<=minuto&&minuto<60)
			this.minuto = minuto;}
	public int getSegundo() {
		return segundo;}
	public void setSegundo(int segundo) {
		if(0<=segundo&&segundo<60)
			this.segundo = segundo;}
	public void aumentarSegundo() {
		segundo++;
		if(segundo==60) {
			segundo=0;
			aumentarMinuto();}}
	public void aumentarMinuto() {
		minuto++;
		if(minuto==60) {
			minuto=0;
			aumentarHora();}}
	public void aumentarHora() {
		hora=(hora+1)%24;}
	public void mostrarHora() {
		System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);}
	public static void main(String[] args) {
		Hora h=new Hora(23,59,58);
		h.mostrarHora();
		h.aumentarSegundo();
		h.mostrarHora();
		h.aumentarSegundo();
		h.mostrarHora();}}
	

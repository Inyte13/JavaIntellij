package ids;

public class EquipoDeFutbol {
	private String nombre;
	private int nivelAtaque;
	private int nivelDefensa;
	public EquipoDeFutbol() {}
	public EquipoDeFutbol(String nombre, int nivelAtaque, int nivelDefensa) {
		this.nombre=nombre;
		this.nivelAtaque = nivelAtaque;
		this.nivelDefensa = nivelDefensa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int getNivelAtaque() {
		return nivelAtaque;
	}
	public void setNivelAtaque(int nivelAtaque) {
		this.nivelAtaque = nivelAtaque;
	}
	public int getNivelDefensa() {
		return nivelDefensa;
	}
	public void setNivelDefensa(int nivelDefensa) {
		this.nivelDefensa = nivelDefensa;
	}
	public String estiloEquipo() {
		if(nivelAtaque>nivelDefensa) {
			return "Ofensivo";
		}else if(nivelAtaque<nivelDefensa) {
			return "Defensivo";
		}else {
			return "Baleanceado";
		}
	}
	@Override
	public String toString() {
		return "EquipoDeFutbol [nombre=" + nombre + ", nivelAtaque=" + nivelAtaque + ", nivelDefensa=" + 
				nivelDefensa+ "]";
	}
	public static void main(String[] args) {
		EquipoDeFutbol equipo1=new EquipoDeFutbol("U",90,10);
		EquipoDeFutbol equipo2=new EquipoDeFutbol("Alianza",20,80);
		System.out.println(equipo1.estiloEquipo());
	}
}

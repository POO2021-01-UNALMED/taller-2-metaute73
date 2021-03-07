package test;
public class Auto {
	
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		return asientos.length;
	}
	
	public String verificarIntegridad() {
		
		
		boolean k = true;
		
		if (this.registro != motor.registro) {
			k = false;
		}
		if (k) {
			for (Asiento a : asientos) {
				if (a.registro != this.registro) {
					k = false;
				}
			}
		}
		if (k) {
			return "auto original";
		}
		return "las piezas no son originales";	
	}
}

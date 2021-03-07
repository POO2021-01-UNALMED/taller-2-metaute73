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
		int c = 0;
	    for (Asiento a : asientos)
	      if (a != null)
	        c++;
	    return c;
	}
	
	public String verificarIntegridad() {
		
		
		boolean k = true;
		
		if (this.registro != motor.registro) {
			k = false;
		}
		if (k) {
			for (Asiento a : asientos) {
				if (a != null && a.registro != this.registro) {
					k = false;
				}
			}
		}
		if (k) {
			return "Auto original";
		}
		return "las piezas no son originales";	
	}
}

package test;
public class Asiento {
	
	public String color;
	public int precio;
	public int registro;
	
	void cambiarColor(String color) {
		String[] colors = {"rojo", "verde", "amarillo", "negro", "blanco"};
		for (int i = 0; i < colors.length; i++) {
			if (colors[i] == color) {
				this.color = color;
			}
		}
		
	}
}

package test;
public class Motor {
	
	public int numeroCilindros;
	public String tipo;
	public int registro;
	
	public void cambiarRegistro(int n) {
		
		this.registro = n;
	}
	public void asignarTipo(String s) {
		
		if (s == "electrico" || s == "gasolina") {
			tipo = s;
		}
	}
}


public class Inventario {
	
	private String nombreProducto;
	
	public double calcularValor(double precio, int cantidad) {
		validarCantidad(cantidad);
		return precio*cantidad;
	}
	private void validarCantidad(int cantidad) {
		if(cantidad<0) {
			throw new IllegalArgumentException("Las cantidades negativas no son validas");
		}
	}
	public void agregarProducto(String nombre, int cantidad) {
		
	}
	public boolean tieneStock(int cantidad) {
		return cantidad>0;
	}
	String getNombreProducto() {
		return nombreProducto;
	}
	void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
}

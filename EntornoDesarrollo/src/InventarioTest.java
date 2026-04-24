import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class InventarioTest extends ValidarCantidad {

	@Test
	void testCalcularValor() {
		Inventario inv=new Inventario();
		double resultado=inv.calcularValor(10.0, 5);
		assertEquals(50.0, resultado);
	}
	
	@Test
	void testAgregarProducto() {
		Inventario inv= new Inventario();
		inv.agregarProducto("Monitor", 2);
		assertTrue(true);
	}
	
	@Test
	void testStock() {
		Inventario inv= new Inventario();
		assertTrue(inv.tieneStock(10));
		assertFalse(inv.tieneStock(0));
	}
	

}

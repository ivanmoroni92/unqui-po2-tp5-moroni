package mercadoCentral;

public class Cooperativo extends Producto {

	protected double descuento;

	public Cooperativo(double precio, int stock, double descuento) {
		super(precio, stock);
		this.descuento = descuento;

	}

	public Cooperativo(double precio, int stock) {
		super(precio, stock);
		this.descuento = 0.10;

	}

	@Override
	public double getPrecio() {
		return precio * descuento;
	}

}

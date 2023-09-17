package mercadoCentral;

public abstract class Producto implements Cobrable {
	protected double precio;

	protected int stock;

	public Producto(double precio, int stock) {
		this.precio = precio;
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void registrar() {
		descontarStock();
	}

	private void descontarStock() {
		stock -= 1;
	}

}

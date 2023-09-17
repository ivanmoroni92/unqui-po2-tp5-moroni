package mercadoCentral;

public class Servicio extends Factura{
    private  double costo ;
    private int unidades ;
	public Servicio(Agencia agencia) {
		super(agencia);
	}

	@Override
	public double getPrecio() {
		return costo * unidades;
	}

}

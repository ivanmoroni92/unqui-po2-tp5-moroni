package mercadoCentral;

public abstract class Factura implements Cobrable {
	
	public Factura(Agencia agencia) {
		this.agencia = agencia;
	}


	private Agencia agencia ; 
	

	
	public abstract double getPrecio() ;
	
	
	public final void  registrar() {
		agencia.registrarPago(this);
	} ;
	

}

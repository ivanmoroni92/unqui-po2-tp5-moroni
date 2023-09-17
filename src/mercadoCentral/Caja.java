package mercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	protected List<Cobrable> cobrables;

	public Caja() {
		this.cobrables = new ArrayList<Cobrable>();
	}

	public void registrarProducto(Cobrable cobrable) {
		cobrable.registrar();
		cobrables.add(cobrable);
	}

	public double montoTotalAPagar() {
		
//		cobrables.stream().mapToDouble(Cobrable::getPrecio).sum() ;
//		cobrables.stream().mapToDouble(cobrable -> cobrable.getPrecio()).sum() ;
	
		double total = 0;

		for (Cobrable cobrable : cobrables) {
			total += cobrable.getPrecio();
		}

		return total;
	}
	
	

}

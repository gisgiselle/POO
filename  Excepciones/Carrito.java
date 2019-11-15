  
public class Carrito {
	private Producto[] carrito; 
	

	public Carrito(){
		carrito = new Producto[11];
	}

	public void addProducto(Producto prod, int index){
		carrito[index]=prod;
	}

	public Producto getProducto(int index){
		return carrito[index];
	}

	public double  calcularSubtotal(){
		double total=0.0;
		for(int i=0; i<carrito.length; i++){
			if(carrito[i]!= null)
			total+=carrito[i].getPrecio()*carrito[i].getCantidad();
		}
		System.out.println("Subtotal"+total);
		return total;

	}
	public double calcularTotalIVA(){
		double totalIva=0.0;
		for(int i=0; i<carrito.length; i++){
			if(carrito[i]!=null)
				totalIva+=carrito[i].getPrecio()*0.16*carrito[i].getCantidad();
		}
		System.out.println("Iva"+totalIva);
		return totalIva;
	}


	public Producto[] getCarrito(){
		return carrito;
	}
	

}



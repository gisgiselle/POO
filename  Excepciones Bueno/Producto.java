public class Producto{
	private String nombre, sku;
	private int cantidad; 
	private double precio;

	public Producto(String nombre, String sku, int cantidad, double precio)throws NegativaException{
		this.nombre=nombre;
		this.sku=sku;
		if(cantidad<0||precio<0){
			throw new NegativaException();
		}

		this.cantidad=cantidad;
		this.precio=precio;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getSku(){
		return sku;
	}

	public void setSku(String sku){
		this.sku=sku;
	}
	public int getCantidad(){
		return cantidad;
	}

	public void setCantidad(int cantidad){
		this.cantidad=cantidad;
	}
	public double getPrecio(){
		return precio;
	}

	public void setPrecio(double precio){
		this.precio=precio;
	}

}
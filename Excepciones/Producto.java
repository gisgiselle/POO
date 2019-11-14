  
public class Producto {
	public Producto(String string) throws NegativaException{
		if(Integer.parseInt(string)<0){
			throw new NegativaException();		
        }
      if(string.length()=0){
          throw new TextVacioException();
	}
}
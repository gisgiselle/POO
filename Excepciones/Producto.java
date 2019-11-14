  
public class Producto {
	public Producto(String string) throws NegativaException,TextVacioException{
		if(Integer.parseInt(string)<0){
			throw new NegativaException();		
        }
      	if(string.isEmpty()){
          throw new TextVacioException();
		}
	}


}

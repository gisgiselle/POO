public class Objeto{
    String nombreObjeto;
    int obPunto;
    int spMenos;

    public Objeto(String nombreObjeto, int obPunto,int spMenos){
        this.nombreObjeto=nombreObjeto;
        this.obPunto=obPunto;
        this.spMenos=spMenos;
    }
    public String getNombreObjeto(){
        return nombreObjeto;
    }
    public int getObPunto(){
        return obPunto;
    }
    public int getSpMenos(){
        return spMenos;
    }

    public void setNombreObjeto(String nombreObjeto){
        this.nombreObjeto=nombreObjeto;
    }
    public void setObPunto(int obPunto){
        this.obPunto=obPunto;
    }
    public void setSpMenos(int spMenos){
        this.spMenos=spMenos;
    }
}
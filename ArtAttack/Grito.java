import javafx.scene.control.Label;
public class Grito extends Boss{
    private Label img= new Label("");
    public Grito(){
        super("El Grito",150,30,0,20,30);
        img.setPrefSize(300,300);
        img.setStyle("-fx-background-image:url('assets/grito.jpg'); -fx-background-size: stretch;");
        super.setImg(img);
    }
    

}
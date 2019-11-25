import javafx.scene.control.Label;
public class VanGogh extends Boss{
    private Label img= new Label("");
    public VanGogh(){
        super("Van Gogh",150,30,0,20,30);
        img.setPrefSize(300,300);
        img.setStyle("-fx-background-image:url('assets/van.jpg'); -fx-background-size: stretch;");
        super.setImg(img);
    }
    

}
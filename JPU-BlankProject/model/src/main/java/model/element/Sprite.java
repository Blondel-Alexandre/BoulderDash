package model.element;

<<<<<<< HEAD
import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.IOException;

public class Sprite {

    private String filename;

    private Image image;

    public Sprite(String filename) {
        this.filename = filename;
    }

	public void loadImage() {
        try {
            this.image = ImageIO.read(getClass().getClassLoader().getResourceAsStream(this.filename));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Image getImage() {
        return this.image;
    }
=======
import java.awt.Image;

public class Sprite {
 Image image;
 String imageName;
 
public Image getImage() {
	return image;
}
public void setImage(Image image) {
	this.image = image;
}
public String getImageName() {
	return imageName;
}
public void setImageName(String imageName) {
	this.imageName = imageName;
}
 
 
>>>>>>> b31652291ce4b62f6ce9cedb4f578398845d758d
}

package model.element;

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
}

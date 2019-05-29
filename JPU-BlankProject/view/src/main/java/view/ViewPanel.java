package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import contract.IElement;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame					viewFrame;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;

	public Image img;
	
	
	
	
	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		System.out.println("jsqbcqkc");
		//int a = 0,b = 0;
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());	
		int size = this.viewFrame.getModel().getSprites().size();
		for(int i = 0; i < size ; i++) {
			IElement element = this.viewFrame.getModel().getSprites().get(i);
			//graphics.drawImage(element.getImage(), element.getX(), element.getY(), null);
			//System.out.println();
			ImageIcon i1 = new ImageIcon(element.getFileName());
			img = i1.getImage();
			graphics.drawImage(img,element.getX()*16, element.getY()*16, null);
		}
		
		//score
		Font f = new Font("Impact",Font.BOLD,20);
		graphics.setColor(Color.BLUE);
		graphics.setFont(f);
		graphics.drawString("Diamants : " ,20,30);
		
		Font B = new Font("Impact",Font.BOLD,20);
		graphics.setColor(Color.RED);
		graphics.setFont(B);
		graphics.drawString("Vies: " , 20, 50);
		
		//rocher 
		
		//for (int i = 0 ; i<Model.Rock.rocks.size() ; i++)
		//{
		//	Rock r = Model.Rock.rocks.get(i);
		//	graphics.drawImage(r.image, r.x, r.y, null);
		
		//	}
}
}

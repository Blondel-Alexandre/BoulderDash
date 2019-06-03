package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Observable;
import java.util.Observer;
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
	private int spriteSize = 16;
	public Image img;
	
	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getElement().getObservable().addObserver(this);
		for(int i = 0; i < viewFrame.getModel().elementList().size(); i++) {
			viewFrame.getModel().elementList().get(i).getObservable().addObserver(this);
		}
		System.out.println(viewFrame.getModel().elementList().size());
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
	@Override
	public void update(final Observable arg0, final Object o) {
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	public void paintComponent(final Graphics graphics) {
		graphics.clearRect(0, 0, 550, 550);	
		int size = this.viewFrame.getModel().elementList().size();
		for(int i = 0; i < size ; i++) {			
			IElement element = this.viewFrame.getModel().elementList().get(i);
            //System.err.println("je je peint la fenetre en ce moment ");
			graphics.drawImage(element.getImage(),element.getX()*spriteSize, element.getY()*spriteSize, null);
		}		
		IElement character = this.viewFrame.getModel().getElement();
		graphics.drawImage(character.getImage(), character.getX()*spriteSize, character.getY()*spriteSize, null);
		
		//score
		Font f = new Font("Impact",Font.BOLD,20);
		graphics.setColor(Color.BLUE);
		graphics.setFont(f);
		graphics.drawString("Diamants : " + this.viewFrame.getModel().getScore(),5,500);
		
		Font B = new Font("Impact",Font.BOLD,20);
		graphics.setColor(Color.RED);
		graphics.setFont(B);
		graphics.drawString("Vies: " , 155, 500);

			}
}

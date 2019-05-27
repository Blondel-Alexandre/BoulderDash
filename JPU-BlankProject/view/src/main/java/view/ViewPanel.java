package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

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
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
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
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		int y = 20;
		//separate string chain
		for(String s: this.getViewFrame().getModel().getHelloWorld().getMessage().split("@")) {
			graphics.drawString(s, 10, y += graphics.getFontMetrics().getHeight());
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

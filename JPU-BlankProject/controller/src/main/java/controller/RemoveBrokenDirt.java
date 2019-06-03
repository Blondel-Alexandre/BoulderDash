package controller;

import java.util.ArrayList;

import contract.ElementType;
import contract.IElement;
import contract.IModel;
import contract.Permeability;

public class RemoveBrokenDirt implements Runnable {
	
	private IModel model;
	
	
    private IModel getModel() {
        return this.model;
    }
    
    private synchronized ArrayList<IElement> getCopyOfElementList() {
		ArrayList<IElement> copy = new ArrayList<>();
		copy.addAll(this.getModel().elementList());
		return copy;
	}
	
	public void removeBrokenDirt() {
		
			for(IElement a : this.getModel().elementList()) {
				if(a.getElementType() == ElementType.BrokenDirt)
				for(IElement b : getCopyOfElementList()) {
					if(b.getX() == a.getX() && b.getY() == a.getY() && b.getPermeability() == Permeability.BLOCKING) {
						IElement issou = b;
						
						this.getModel().elementList().remove(issou);
					}
				}
			}
	}

	@Override
	public void run() {
		removeBrokenDirt();
		System.err.println("qufbkvjvbsqbwuiobvbwmxubmsdiuwvbduvdmu");
	}	
}

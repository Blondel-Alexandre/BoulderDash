/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package main;


import controller.Controller;
import controller.RemoveBrokenDirt;
import model.BoulderDashModel;
import view.View;

/**
 * The Class Main.
 *
 * @author Jean-Aymeric Diet
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        final BoulderDashModel model = new BoulderDashModel();
        final View view = new View(model);
        final Controller controller = new Controller(view, model);
        //final RemoveBrokenDirt broken = new RemoveBrokenDirt();
        view.setController(controller);
        controller.control();
        controller.run();

    }
}

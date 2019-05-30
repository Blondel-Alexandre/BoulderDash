/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package main;

import contract.ControllerOrder;
import controller.Controller;
import model.BoulderDashModel;
import model.element.*;
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
        view.setController(controller);

        controller.control();
        controller.orderPerform(ControllerOrder.C);

    }
}

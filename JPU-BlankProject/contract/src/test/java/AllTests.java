import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import contract.ControllerOrderTest;
import contract.ElementTypeTest;
import contract.PermeabilityTest;

@RunWith(Suite.class)
@SuiteClasses({ ControllerOrderTest.class, ElementTypeTest.class, PermeabilityTest.class })
public class AllTests {

}

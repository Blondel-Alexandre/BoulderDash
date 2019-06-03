import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import contract.ControllerOrderTest;
import contract.ElementTypeTest;


@RunWith(Suite.class)
@SuiteClasses({ ControllerOrderTest.class, ElementTypeTest.class,  })
public class AllTests {

}

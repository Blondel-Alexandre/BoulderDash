package model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BoulderDashModelTest.class, DBConnectionTest.class, DBPropertiesTest.class})
public class AllTests {

}

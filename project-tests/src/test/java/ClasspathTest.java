import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ClasspathTest {

  @Test
  public void classpath() throws Exception {
    String cp = System.getProperty("java.class.path");
    assertTrue("log4j 1.2.17 not in classpath", cp.contains("log4j-1.2.17"));
    assertFalse("log4j 1.2.14 in classpath", cp.contains("log4j-1.2.14"));
  }
}

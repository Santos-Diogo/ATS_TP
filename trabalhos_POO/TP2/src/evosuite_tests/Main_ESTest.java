/*
 * This file was automatically generated by EvoSuite
 * Mon May 27 16:37:46 GMT 2024
 */

package projeto;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;
import projeto.Main;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Main_ESTest extends Main_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "2 - Vendedor que mais faturou num per\u00EDodo de tempo";
      stringArray0[1] = "=jw?GU~|+?P";
      stringArray0[2] = "1 - Criar transportadora";
      stringArray0[3] = "";
      SystemInUtil.addInputLine("2 - Vendedor que mais faturou num per\u00EDodo de tempo");
      Main.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }
}

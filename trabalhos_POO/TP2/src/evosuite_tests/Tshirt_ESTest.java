/*
 * This file was automatically generated by EvoSuite
 * Mon May 27 16:36:54 GMT 2024
 */

package projeto;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDate;
import java.time.LocalTime;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.MockLocalTime;
import org.junit.runner.RunWith;
import projeto.Artigo;
import projeto.Padrao;
import projeto.Tamanho;
import projeto.Tshirt;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Tshirt_ESTest extends Tshirt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Long long0 = Long.getLong("Zr84I", (-1261L));
      Tamanho tamanho0 = Tamanho.S;
      Padrao padrao0 = Padrao.palmeiras;
      Tshirt tshirt0 = new Tshirt("", "Nqq=z];_VH/", 847.66, false, 39, 1236, long0, long0, tamanho0, padrao0);
      LocalDate localDate0 = MockLocalDate.ofEpochDay(3686L);
      double double0 = tshirt0.preco_atual(localDate0);
      assertEquals(423.83, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Long long0 = new Long((-1910L));
      Tamanho tamanho0 = Tamanho.XL;
      Padrao padrao0 = Padrao.liso;
      Tshirt tshirt0 = new Tshirt((String) null, (String) null, (-1.0), false, 0, 0, long0, long0, tamanho0, padrao0);
      double double0 = tshirt0.preco_atual((LocalDate) null);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Tshirt tshirt0 = new Tshirt();
      tshirt0.getTamanho();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Tshirt tshirt0 = new Tshirt();
      tshirt0.getPadrao();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Long long0 = new Long(0);
      Tamanho tamanho0 = Tamanho.L;
      Padrao padrao0 = Padrao.liso;
      Tshirt tshirt0 = new Tshirt("8vm*H,3,)L}w/~{0k", "TcpR2%V!TDs8dc{7", (-3303.1558), false, 0, 0, long0, long0, tamanho0, padrao0);
      Tshirt tshirt1 = tshirt0.clone();
      assertEquals(2L, tshirt1.getContador());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Long long0 = new Long((-1));
      Tamanho tamanho0 = Tamanho.L;
      Padrao padrao0 = Padrao.palmeiras;
      Tshirt tshirt0 = new Tshirt("", "", 74.304, true, (-1), (-1), long0, long0, tamanho0, padrao0);
      Tshirt tshirt1 = tshirt0.clone();
      assertEquals(2L, tshirt1.getContador());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Long long0 = new Long(1020L);
      Tamanho tamanho0 = Tamanho.L;
      Padrao padrao0 = Padrao.liso;
      Tshirt tshirt0 = new Tshirt("", "", 0.0, false, 2602, 1109, long0, long0, tamanho0, padrao0);
      Tshirt tshirt1 = tshirt0.clone();
      assertEquals("A1", tshirt1.getCodigo_barras());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Tshirt tshirt0 = new Tshirt();
      Artigo.setContador(0L);
      Tshirt tshirt1 = tshirt0.clone();
      assertEquals("A", tshirt1.getCodigo());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Long long0 = new Long((-1711L));
      Tamanho tamanho0 = Tamanho.M;
      Padrao padrao0 = Padrao.liso;
      Tshirt tshirt0 = new Tshirt("H`MGu", "H`MGu", 1.0, false, 0, 2, long0, long0, tamanho0, padrao0);
      Artigo.setContador((-717L));
      Tshirt tshirt1 = tshirt0.clone();
      assertNotSame(tshirt1, tshirt0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Tshirt tshirt0 = new Tshirt();
      // Undeclared exception!
      try { 
        tshirt0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Tshirt", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Tshirt tshirt0 = new Tshirt();
      LocalDate localDate0 = tshirt0.getData_venda();
      // Undeclared exception!
      try { 
        tshirt0.preco_atual(localDate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Tshirt", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Tshirt tshirt0 = null;
      try {
        tshirt0 = new Tshirt((Tshirt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Artigo", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Long long0 = new Long(877);
      Tamanho tamanho0 = Tamanho.XL;
      Padrao padrao0 = Padrao.riscas;
      Tshirt tshirt0 = null;
      try {
        tshirt0 = new Tshirt((String) null, (String) null, 0.0, true, 877, 877, long0, (Long) null, tamanho0, padrao0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Artigo", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Long long0 = new Long((-1));
      Tamanho tamanho0 = Tamanho.L;
      Padrao padrao0 = Padrao.palmeiras;
      Tshirt tshirt0 = new Tshirt("", "", 74.304, true, (-1), (-1), long0, long0, tamanho0, padrao0);
      Padrao padrao1 = tshirt0.getPadrao();
      assertSame(padrao0, padrao1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Long long0 = new Long((-1));
      Tamanho tamanho0 = Tamanho.L;
      Padrao padrao0 = Padrao.palmeiras;
      Tshirt tshirt0 = new Tshirt("", "", 74.304, true, (-1), (-1), long0, long0, tamanho0, padrao0);
      Tamanho tamanho1 = tshirt0.getTamanho();
      assertSame(tamanho0, tamanho1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Long long0 = new Long((-891));
      Tamanho tamanho0 = Tamanho.S;
      Padrao padrao0 = Padrao.riscas;
      Tshirt tshirt0 = new Tshirt("<a))+PxjlA0Cyd\"$O`", "<a))+PxjlA0Cyd\"$O`", 0.0, true, 0, (-891), long0, long0, tamanho0, padrao0);
      LocalDate localDate0 = tshirt0.getData_venda();
      double double0 = tshirt0.preco_atual(localDate0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Long long0 = new Long(0L);
      Tamanho tamanho0 = Tamanho.L;
      Padrao padrao0 = Padrao.liso;
      Tshirt tshirt0 = new Tshirt("", "DMO3,FW", 0.0, true, (-2438), (-1278), long0, long0, tamanho0, padrao0);
      Tshirt tshirt1 = new Tshirt(tshirt0);
      boolean boolean0 = tshirt0.equals(tshirt1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Tshirt tshirt0 = new Tshirt();
      Tamanho tamanho0 = Tamanho.M;
      tshirt0.setTamanho(tamanho0);
      Tshirt tshirt1 = tshirt0.clone();
      Padrao padrao0 = Padrao.liso;
      tshirt1.setPadrao(padrao0);
      boolean boolean0 = tshirt1.equals(tshirt0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Tshirt tshirt0 = new Tshirt();
      Tamanho tamanho0 = Tamanho.M;
      tshirt0.setTamanho(tamanho0);
      Tshirt tshirt1 = tshirt0.clone();
      // Undeclared exception!
      try { 
        tshirt1.equals(tshirt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Tshirt", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Long long0 = new Long(0L);
      Tamanho tamanho0 = Tamanho.L;
      Padrao padrao0 = Padrao.liso;
      Tshirt tshirt0 = new Tshirt("", "DMO3,FW", 0.0, true, (-2438), (-1278), long0, long0, tamanho0, padrao0);
      Tshirt tshirt1 = new Tshirt(tshirt0);
      assertTrue(tshirt1.equals((Object)tshirt0));
      
      Tamanho tamanho1 = Tamanho.XL;
      tshirt0.setTamanho(tamanho1);
      boolean boolean0 = tshirt0.equals(tshirt1);
      assertFalse(tshirt1.equals((Object)tshirt0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Long long0 = new Long((-891));
      Tamanho tamanho0 = Tamanho.S;
      Padrao padrao0 = Padrao.riscas;
      Tshirt tshirt0 = new Tshirt("<a))+PxjlA0Cyd\"$O`", "<a))+PxjlA0Cyd\"$O`", 0.0, true, 0, (-891), long0, long0, tamanho0, padrao0);
      Tshirt tshirt1 = new Tshirt("", "", 0.0, true, 0, (-891), long0, long0, tamanho0, padrao0);
      boolean boolean0 = tshirt0.equals(tshirt1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Long long0 = new Long(0);
      Tamanho tamanho0 = Tamanho.S;
      Padrao padrao0 = Padrao.liso;
      Tshirt tshirt0 = new Tshirt("", "", 1088.43599949, true, 0, 0, long0, long0, tamanho0, padrao0);
      boolean boolean0 = tshirt0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Tshirt tshirt0 = new Tshirt();
      boolean boolean0 = tshirt0.equals(tshirt0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Tshirt tshirt0 = new Tshirt();
      LocalTime localTime0 = MockLocalTime.now();
      boolean boolean0 = tshirt0.equals(localTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Long long0 = new Long(0L);
      Tamanho tamanho0 = Tamanho.L;
      Padrao padrao0 = Padrao.liso;
      Tshirt tshirt0 = new Tshirt("", "DMO3,FW", 0.0, true, (-2438), (-1278), long0, long0, tamanho0, padrao0);
      String string0 = tshirt0.toString();
      assertEquals("T-shirt:: {Artigo:: { C\u00F3digo de barras: A1 Descri\u00E7\u00E3o:  Marca: DMO3,FW Pre\u00E7o base: 0.0 Novo: true Estado de uso: -2438 N\u00FAmero de utilizadores: -1278 Disponivel: true Id da transportadora: 0 Id do vendedor: 0 } Tamanho: L Padr\u00E3o: liso}", string0);
  }
}

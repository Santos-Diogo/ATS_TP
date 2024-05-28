/*
 * This file was automatically generated by EvoSuite
 * Mon May 27 16:34:08 GMT 2024
 */

package projeto;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.Clock;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.IsoChronology;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.junit.runner.RunWith;
import projeto.Artigo;
import projeto.GestorEncomendas;
import projeto.Gestor_Artigos;
import projeto.Gestor_Transportadoras;
import projeto.Gestor_Utilizadores;
import projeto.Menu;
import projeto.Parsing;
import projeto.Transportadora;
import projeto.Utilizador;
import projeto.Vintage;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Parsing_ESTest extends Parsing_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Integer, Artigo> hashMap0 = new HashMap<Integer, Artigo>();
      Gestor_Artigos gestor_Artigos0 = new Gestor_Artigos(hashMap0);
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      HashMap<Long, Transportadora> hashMap1 = new HashMap<Long, Transportadora>(2420, 2420);
      Gestor_Transportadoras gestor_Transportadoras0 = new Gestor_Transportadoras(hashMap1);
      Menu menu0 = new Menu();
      Vintage vintage0 = new Vintage(gestor_Artigos0, gestor_Utilizadores0, gestorEncomendas0, gestor_Transportadoras0, menu0, 1538);
      Parsing parsing0 = new Parsing(vintage0, menu0);
      Clock clock0 = MockClock.systemDefaultZone();
      LocalDate localDate0 = MockLocalDate.now(clock0);
      String[] stringArray0 = new String[6];
      parsing0.venderTshit(1538, localDate0, stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vintage vintage0 = new Vintage();
      Menu menu0 = new Menu();
      Parsing parsing0 = new Parsing(vintage0, menu0);
      LocalDate localDate0 = MockLocalDate.now();
      String[] stringArray0 = new String[7];
      parsing0.venderSapatilha(0L, localDate0, stringArray0);
      assertEquals(7, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vintage vintage0 = Vintage.load();
      Menu menu0 = new Menu();
      Parsing parsing0 = new Parsing(vintage0, menu0);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      String[] stringArray0 = new String[6];
      parsing0.venderMala((-863L), localDate0, stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Gestor_Artigos gestor_Artigos0 = new Gestor_Artigos();
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores(hashMap0, hashMap1, (Map<String, Long>) null);
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      HashMap<Long, Transportadora> hashMap2 = new HashMap<Long, Transportadora>();
      Gestor_Transportadoras gestor_Transportadoras0 = new Gestor_Transportadoras(hashMap2);
      Menu menu0 = new Menu();
      Vintage vintage0 = new Vintage(gestor_Artigos0, gestor_Utilizadores0, gestorEncomendas0, gestor_Transportadoras0, menu0);
      Parsing parsing0 = new Parsing(vintage0, menu0);
      Vintage vintage1 = parsing0.getVintage();
      assertEquals(0L, vintage1.getUtilizador());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      HashMap<String, Long> hashMap1 = new HashMap<String, Long>();
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores(hashMap0, map0, hashMap1);
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      Gestor_Transportadoras gestor_Transportadoras0 = new Gestor_Transportadoras();
      Menu menu0 = new Menu();
      Vintage vintage0 = new Vintage((Gestor_Artigos) null, gestor_Utilizadores0, gestorEncomendas0, gestor_Transportadoras0, menu0, 427);
      Parsing parsing0 = new Parsing(vintage0, menu0);
      Vintage vintage1 = parsing0.getVintage();
      assertSame(vintage0, vintage1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vintage vintage0 = new Vintage();
      Menu menu0 = new Menu();
      Parsing parsing0 = new Parsing(vintage0, menu0);
      Vintage vintage1 = parsing0.getVintage();
      assertSame(vintage0, vintage1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vintage vintage0 = Vintage.load();
      Parsing parsing0 = new Parsing(vintage0, (Menu) null);
      Menu menu0 = parsing0.getMenu();
      assertNull(menu0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Gestor_Artigos gestor_Artigos0 = new Gestor_Artigos();
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      Gestor_Transportadoras gestor_Transportadoras0 = new Gestor_Transportadoras();
      Vintage vintage0 = new Vintage(gestor_Artigos0, gestor_Utilizadores0, gestorEncomendas0, gestor_Transportadoras0, (Menu) null);
      Parsing parsing0 = new Parsing(vintage0, (Menu) null);
      Period period0 = Period.ofMonths(2);
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        parsing0.venderTshit(0L, localDate0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Parsing", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vintage vintage0 = Vintage.load();
      Parsing parsing0 = new Parsing(vintage0, (Menu) null);
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        parsing0.venderMala(0L, (LocalDate) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Parsing", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Menu menu0 = new Menu();
      LocalDate localDate0 = MockLocalDate.now();
      Vintage vintage0 = Vintage.load();
      Parsing parsing0 = new Parsing(vintage0, menu0);
      // Undeclared exception!
      try { 
        parsing0.leitura_ficheiro("nU:j :b]", localDate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Parsing", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Gestor_Artigos gestor_Artigos0 = new Gestor_Artigos();
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      Gestor_Transportadoras gestor_Transportadoras0 = new Gestor_Transportadoras();
      Menu menu0 = new Menu();
      Vintage vintage0 = new Vintage(gestor_Artigos0, (Gestor_Utilizadores) null, gestorEncomendas0, gestor_Transportadoras0, menu0, (-621));
      Parsing parsing0 = new Parsing(vintage0, menu0);
      // Undeclared exception!
      try { 
        parsing0.createScanner((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name can't be null
         //
         verifyException("java.io.FilePermission", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vintage vintage0 = Vintage.load();
      Menu menu0 = new Menu();
      Parsing parsing0 = new Parsing(vintage0, menu0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "e::T^uZ*^$o#HO%K{+";
      // Undeclared exception!
      try { 
        parsing0.adicionar_comando(stringArray0, (LocalDate) null);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"e\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Menu menu0 = new Menu();
      Parsing parsing0 = new Parsing((Vintage) null, menu0);
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        parsing0.adicionar_comando(stringArray0, (LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Parsing", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vintage vintage0 = new Vintage();
      Menu menu0 = new Menu();
      Parsing parsing0 = new Parsing(vintage0, menu0);
      String[] stringArray0 = new String[0];
      Period period0 = Period.ofYears(0);
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      // Undeclared exception!
      try { 
        parsing0.adicionar_comando(stringArray0, localDate0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("projeto.Parsing", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vintage vintage0 = Vintage.load();
      Parsing parsing0 = new Parsing(vintage0, (Menu) null);
      File file0 = MockFile.createTempFile("6xP8z3pS", "", (File) null);
      try { 
        parsing0.createScanner(file0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // /var/folders/zq/dt8l0bvs3bdcxw28m0v857r00000gn/T/6xP8z3pS0 (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Menu menu0 = new Menu();
      Parsing parsing0 = new Parsing((Vintage) null, menu0);
      parsing0.setMenu(menu0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Menu menu0 = new Menu();
      Parsing parsing0 = new Parsing((Vintage) null, menu0);
      parsing0.setVintage((Vintage) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Menu menu0 = new Menu();
      Parsing parsing0 = new Parsing((Vintage) null, menu0);
      Menu menu1 = parsing0.getMenu();
      assertSame(menu1, menu0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Menu menu0 = new Menu();
      Parsing parsing0 = new Parsing((Vintage) null, menu0);
      Vintage vintage0 = parsing0.getVintage();
      assertNull(vintage0);
  }
}

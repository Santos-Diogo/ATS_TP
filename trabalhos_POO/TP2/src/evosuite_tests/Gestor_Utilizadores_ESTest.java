/*
 * This file was automatically generated by EvoSuite
 * Mon May 27 16:35:46 GMT 2024
 */

package projeto;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Clock;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.IsoChronology;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.junit.runner.RunWith;
import projeto.Gestor_Utilizadores;
import projeto.Utilizador;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Gestor_Utilizadores_ESTest extends Gestor_Utilizadores_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.adicionaFaturaVendedor((-357L), true, (-357L), 0L, " Utilizadores: ", 1994.47067954831, false, 1994.47067954831, 113.40862449);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.adicionaFaturaVendedor(0L, true, (-1L), 0L, "", 0.0, true, 0L, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      Locale locale0 = Locale.ITALIAN;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.adicionaFaturaComprador((-2036L), true, (-2036L), (-1282L), set0, (-2036L), 0.0, (-1.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores(hashMap0, hashMap1, (Map<String, Long>) null);
      Long long0 = Long.getLong("A:MX>qt#i{e1SqX%d>", 0L);
      Utilizador utilizador0 = new Utilizador((String) null, "", "", long0, (String) null);
      Set<String> set0 = utilizador0.getProdutosVender();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.adicionaFaturaComprador(1L, false, 0L, 0L, set0, 1L, 0.0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.devolveEncomenda(0L, (-4026L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      long long0 = gestor_Utilizadores0.adicionaUtilizador("uKVzN9bg", "RKy", "Gestor de Utilizadores:: {", (-1L), "");
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      Long long0 = new Long(0L);
      Utilizador utilizador0 = new Utilizador();
      hashMap0.put(long0, utilizador0);
      gestor_Utilizadores0.setUtilizadores(hashMap0);
      gestor_Utilizadores0.novoCarrinho(0L);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      Long long0 = new Long(0L);
      Utilizador utilizador0 = new Utilizador();
      hashMap0.put(long0, utilizador0);
      gestor_Utilizadores0.setUtilizadores(hashMap0);
      gestor_Utilizadores0.adicionaFaturaVendedor(0L, true, 0L, 0L, "uKVzN9bg", 0L, false, (-2830.143828988), 0L);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      Long long0 = new Long(0L);
      Utilizador utilizador0 = new Utilizador();
      hashMap0.put(long0, utilizador0);
      gestor_Utilizadores0.setUtilizadores(hashMap0);
      Set<String> set0 = gestor_Utilizadores0.verCarrinho(0L);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      HashMap<String, Long> hashMap1 = new HashMap<String, Long>();
      Long long0 = new Long(0L);
      Utilizador utilizador0 = new Utilizador("0os]E", "0os]E", "0os]E", long0, "0os]E");
      hashMap0.put(long0, utilizador0);
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores(hashMap0, map0, hashMap1);
      Set<String> set0 = gestor_Utilizadores0.removeTodosComprador(0L);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      HashMap<String, Long> hashMap1 = new HashMap<String, Long>();
      Long long0 = new Long(0L);
      Utilizador utilizador0 = new Utilizador("0os]E", "0os]E", "0os]E", long0, "0os]E");
      hashMap0.put(long0, utilizador0);
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores(hashMap0, map0, hashMap1);
      String string0 = gestor_Utilizadores0.imprimeFaturasVendas(0L);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      gestor_Utilizadores0.adicionaUtilizador(" Utilizadores: ", " Utilizadores: ", " Utilizadores: ", 4384L, " Utilizadores: ");
      String string0 = gestor_Utilizadores0.imprimeFaturasCompras(1L);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      gestor_Utilizadores0.adicionaUtilizador("-FUpq9dY77@wu]", "-FUpq9dY77@wu]", "-FUpq9dY77@wu]", (-920L), "-FUpq9dY77@wu]");
      Set<Long> set0 = gestor_Utilizadores0.chaves();
      assertFalse(set0.contains((-920L)));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      HashMap<String, Long> hashMap1 = new HashMap<String, Long>();
      Long long0 = new Long(0L);
      Utilizador utilizador0 = new Utilizador("0os]E", "0os]E", "0os]E", long0, "0os]E");
      hashMap0.put(long0, utilizador0);
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores(hashMap0, map0, hashMap1);
      try { 
        gestor_Utilizadores0.voltaAVenderArtigo("N=?<r;}", 0L);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // O artigo N=?<r;} n\u00E3o existe no carrinho
         //
         verifyException("projeto.Utilizador", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      hashMap0.put((Long) null, (Utilizador) null);
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.setUtilizadores(hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.setIdUtilizadores((Map<String, Long>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      HashMap<String, Long> hashMap1 = new HashMap<String, Long>();
      Long long0 = new Long(0L);
      Utilizador utilizador0 = new Utilizador("0os]E", "0os]E", "0os]E", long0, "0os]E");
      hashMap0.put(long0, utilizador0);
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores(hashMap0, map0, hashMap1);
      try { 
        gestor_Utilizadores0.passaArtigoParaVendido("0os]E", 0L);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // O artigo 0os]E n\u00E3o existe no carrinho
         //
         verifyException("projeto.Utilizador", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      Period period0 = Period.ofWeeks(0);
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.adicionaArtigoEncomenda("Compra\n", (-1L), (-1149), localDate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = null;
      try {
        gestor_Utilizadores0 = new Gestor_Utilizadores((Gestor_Utilizadores) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      Map<String, Long> map0 = gestor_Utilizadores0.getIdUtilizadores();
      Gestor_Utilizadores gestor_Utilizadores1 = null;
      try {
        gestor_Utilizadores1 = new Gestor_Utilizadores((Map<Long, Utilizador>) null, hashMap0, map0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      boolean boolean0 = gestor_Utilizadores0.existeIdUtilizador("q-z+xWc-v");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      Map<Long, Utilizador> map0 = gestor_Utilizadores0.getUtilizadores();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "");
      Map<String, Long> map1 = gestor_Utilizadores0.getIdUtilizadores();
      Gestor_Utilizadores gestor_Utilizadores1 = new Gestor_Utilizadores(map0, hashMap0, map1);
      boolean boolean0 = gestor_Utilizadores1.existeIdUtilizador("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      HashMap<String, Long> hashMap1 = new HashMap<String, Long>();
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores(hashMap0, map0, hashMap1);
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.get1IdUtilizador("dh__%eS'");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      HashMap<String, Long> hashMap1 = new HashMap<String, Long>();
      Long long0 = new Long(0L);
      Utilizador utilizador0 = new Utilizador("0os]E", "0os]E", "0os]E", long0, "0os]E");
      hashMap0.put(long0, utilizador0);
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores(hashMap0, map0, hashMap1);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      try { 
        gestor_Utilizadores0.adicionaArtigoEncomenda("", 0L, 0L, localDate0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // O artigo  n\u00E3o se encontra \u00E0 venda
         //
         verifyException("projeto.Utilizador", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      Long long0 = new Long(0L);
      Utilizador utilizador0 = new Utilizador();
      hashMap0.put(long0, utilizador0);
      gestor_Utilizadores0.setUtilizadores(hashMap0);
      Utilizador utilizador1 = gestor_Utilizadores0.devolveUtilizador(0L);
      assertEquals("n/d", utilizador1.getNome());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      HashMap<String, Long> hashMap1 = new HashMap<String, Long>();
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores(hashMap0, map0, hashMap1);
      Utilizador utilizador0 = gestor_Utilizadores0.devolveUtilizador((-2L));
      assertNull(utilizador0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      boolean boolean0 = gestor_Utilizadores0.equals("}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      Map<Long, Utilizador> map0 = gestor_Utilizadores0.getUtilizadores();
      Map<String, String> map1 = ZoneId.SHORT_IDS;
      Map<String, Long> map2 = gestor_Utilizadores0.getIdUtilizadores();
      Gestor_Utilizadores gestor_Utilizadores1 = new Gestor_Utilizadores(map0, map1, map2);
      boolean boolean0 = gestor_Utilizadores1.equals(gestor_Utilizadores0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      boolean boolean0 = gestor_Utilizadores0.equals(gestor_Utilizadores0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      boolean boolean0 = gestor_Utilizadores0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      long long0 = gestor_Utilizadores0.verificaPassword("Gestor de Utilizadores:: { Utilizadores: java.util.HashMap@0000000003 Emails associados ao id do utilizador correspondente: java.util.HashMap@0000000004}", "Gestor de Utilizadores:: { Utilizadores: java.util.HashMap@0000000003 Emails associados ao id do utilizador correspondente: java.util.HashMap@0000000004}");
      assertEquals((-2L), long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      HashMap<String, Long> hashMap1 = new HashMap<String, Long>();
      Long long0 = new Long(0L);
      Utilizador utilizador0 = new Utilizador("0os]E", "0os]E", "0os]E", long0, "0os]E");
      hashMap0.put(long0, utilizador0);
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores(hashMap0, map0, hashMap1);
      boolean boolean0 = gestor_Utilizadores0.existeUtilizador(0L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      boolean boolean0 = gestor_Utilizadores0.existeUtilizador((-2L));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      HashMap<String, Long> hashMap0 = new HashMap<String, Long>();
      Long long0 = new Long(0L);
      hashMap0.put("", long0);
      gestor_Utilizadores0.setIdUtilizadores(hashMap0);
      Map<String, Long> map0 = gestor_Utilizadores0.getIdUtilizadores();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      HashMap<String, Long> hashMap1 = new HashMap<String, Long>();
      Long long0 = new Long(0L);
      Utilizador utilizador0 = new Utilizador("0os]E", "0os]E", "0os]E", long0, "0os]E");
      hashMap0.put(long0, utilizador0);
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores(hashMap0, map0, hashMap1);
      Gestor_Utilizadores gestor_Utilizadores1 = gestor_Utilizadores0.clone();
      assertFalse(gestor_Utilizadores1.equals((Object)gestor_Utilizadores0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.devolveNif((-995L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      String string0 = gestor_Utilizadores0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.removeTodosComprador(60L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.meusArtigos(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.removeArtigoEncomenda("", (-2496L), 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.get1Utilizador(21L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.imprimeFaturasCompras(1L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.getEncomendas(1L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.alteraQuantiVendida((-1L), 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.imprime1FaturaVenda((-2656L), 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      HashMap<String, Long> hashMap1 = new HashMap<String, Long>();
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores(hashMap0, map0, hashMap1);
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.imprimeFaturasVendas(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.verCarrinho(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      HashMap<String, Long> hashMap1 = new HashMap<String, Long>();
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores(hashMap0, map0, hashMap1);
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.artigosVendidos((-727L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>(2203, 2203);
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores(hashMap0, hashMap1, (Map<String, Long>) null);
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.getEncomendasDevolvidas(2203);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      HashMap<String, Long> hashMap2 = new HashMap<String, Long>();
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores(hashMap0, hashMap1, hashMap2);
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.passaVendidoParaVender("(mp*Ooio/?8WN)a|5", 555L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.getCarrinho(3224L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.voltaAVenderArtigo("Taxa Vintage: ", 2761L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      gestor_Utilizadores0.adicionaUtilizador(" Utilizadores: ", " Utilizadores: ", " Utilizadores: ", 4384L, " Utilizadores: ");
      long long0 = gestor_Utilizadores0.verificaPassword(" Utilizadores: ", (String) null);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.vendeArtigo(" Utilizadores: ", 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.getIdCarrinho(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.imprime1FaturaCompra(785L, (-424L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.passaArtigoParaVendido("", 1L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.novoCarrinho(1L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      Gestor_Utilizadores gestor_Utilizadores1 = new Gestor_Utilizadores(gestor_Utilizadores0);
      boolean boolean0 = gestor_Utilizadores0.equals(gestor_Utilizadores1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      Set<Long> set0 = gestor_Utilizadores0.chaves();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.alteraQuantiComprada((-316L), (-2061584300));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      HashMap<Long, Utilizador> hashMap0 = new HashMap<Long, Utilizador>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      HashMap<String, Long> hashMap2 = new HashMap<String, Long>();
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores(hashMap0, hashMap1, hashMap2);
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.retiraArtigo("}", (-270L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.artigosVendidos2(4066);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(0);
      Clock clock0 = MockClock.system(zoneOffset0);
      LocalDate localDate0 = MockLocalDate.now(clock0);
      // Undeclared exception!
      try { 
        gestor_Utilizadores0.finalizaEncomenda(0L, localDate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.Gestor_Utilizadores", e);
      }
  }
}

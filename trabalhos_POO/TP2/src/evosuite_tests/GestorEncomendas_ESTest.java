/*
 * This file was automatically generated by EvoSuite
 * Mon May 27 16:33:51 GMT 2024
 */

package projeto;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.junit.runner.RunWith;
import projeto.Dimensao;
import projeto.Encomenda;
import projeto.GestorEncomendas;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GestorEncomendas_ESTest extends GestorEncomendas_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      Long long0 = new Long(0L);
      Encomenda encomenda0 = new Encomenda();
      hashMap0.put(long0, encomenda0);
      gestorEncomendas0.setEncomendas(hashMap0);
      LinkedHashSet<Long> linkedHashSet0 = new LinkedHashSet<Long>();
      linkedHashSet0.add(long0);
      Set<String> set0 = gestorEncomendas0.encomendasToArtigos(linkedHashSet0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      Long long0 = new Long(0L);
      Encomenda encomenda0 = new Encomenda();
      hashMap0.put(long0, encomenda0);
      gestorEncomendas0.setEncomendas(hashMap0);
      int int0 = gestorEncomendas0.tamanhoEncomenda(0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      Long long0 = new Long(0L);
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      Dimensao dimensao0 = Dimensao.Pequeno;
      LocalDate localDate0 = MockLocalDate.now();
      Encomenda encomenda0 = new Encomenda(set0, 0L, dimensao0, localDate0);
      hashMap0.put(long0, encomenda0);
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas(hashMap0);
      int int0 = gestorEncomendas0.tamanhoEncomenda(0L);
      assertEquals(600, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      Long long0 = new Long(0L);
      Encomenda encomenda0 = new Encomenda();
      hashMap0.put(long0, encomenda0);
      gestorEncomendas0.setEncomendas(hashMap0);
      long long1 = gestorEncomendas0.removeEncomenda(0L);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      Long long0 = new Long((-1L));
      Encomenda encomenda0 = new Encomenda();
      hashMap0.put(long0, encomenda0);
      gestorEncomendas0.setEncomendas(hashMap0);
      long long1 = gestorEncomendas0.removeEncomenda((-1L));
      assertEquals((-1L), long1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      Long long0 = new Long((-1L));
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setIdComprador(0L);
      hashMap0.put(long0, encomenda0);
      gestorEncomendas0.setEncomendas(hashMap0);
      Encomenda encomenda1 = gestorEncomendas0.getEncomenda((-1L));
      assertEquals(0L, encomenda1.getIdComprador());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      Long long0 = new Long((-1L));
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setId(0L);
      hashMap0.put(long0, encomenda0);
      gestorEncomendas0.setEncomendas(hashMap0);
      Encomenda encomenda1 = gestorEncomendas0.getEncomenda((-1L));
      assertNotSame(encomenda1, encomenda0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      Long long0 = new Long((-1L));
      Encomenda encomenda0 = new Encomenda();
      hashMap0.put(long0, encomenda0);
      gestorEncomendas0.setEncomendas(hashMap0);
      Encomenda.setDiasDevolver((-172));
      Encomenda encomenda1 = gestorEncomendas0.getEncomenda((-1L));
      assertEquals(0, encomenda1.numeroArtigos());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      Long long0 = new Long(0L);
      Encomenda encomenda0 = new Encomenda();
      hashMap0.put(long0, encomenda0);
      gestorEncomendas0.setEncomendas(hashMap0);
      Encomenda.setCodigo(0L);
      Encomenda encomenda1 = gestorEncomendas0.getEncomenda(0L);
      assertEquals(0L, encomenda1.getCodigo());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      Long long0 = new Long(0L);
      Encomenda encomenda0 = new Encomenda();
      hashMap0.put(long0, encomenda0);
      gestorEncomendas0.setEncomendas(hashMap0);
      LinkedHashSet<Long> linkedHashSet0 = new LinkedHashSet<Long>();
      linkedHashSet0.add(long0);
      String string0 = gestorEncomendas0.encomendasToString(linkedHashSet0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      Long long0 = new Long(0L);
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      Dimensao dimensao0 = Dimensao.Pequeno;
      LocalDate localDate0 = MockLocalDate.now();
      Encomenda encomenda0 = new Encomenda(set0, 0L, dimensao0, localDate0);
      hashMap0.put(long0, encomenda0);
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas(hashMap0);
      int int0 = gestorEncomendas0.EncomendaToQuantidade(0L);
      assertEquals(600, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      // Undeclared exception!
      try { 
        gestorEncomendas0.setEncomendas((Map<Long, Encomenda>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.GestorEncomendas", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      // Undeclared exception!
      try { 
        gestorEncomendas0.adicionaEncomenda((Encomenda) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.GestorEncomendas", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = null;
      try {
        gestorEncomendas0 = new GestorEncomendas((GestorEncomendas) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.GestorEncomendas", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = null;
      try {
        gestorEncomendas0 = new GestorEncomendas((Map<Long, Encomenda>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.GestorEncomendas", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      Long long0 = new Long(0L);
      Encomenda encomenda0 = new Encomenda();
      hashMap0.put(long0, encomenda0);
      gestorEncomendas0.setEncomendas(hashMap0);
      Map<Long, Encomenda> map0 = gestorEncomendas0.getEncomendas();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      try { 
        gestorEncomendas0.getEncomenda((-1L));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // N\u00E3o existe nehuma encomenda com o ID -1
         //
         verifyException("projeto.GestorEncomendas", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      Long long0 = new Long(0L);
      Encomenda encomenda0 = new Encomenda();
      hashMap0.put(long0, encomenda0);
      gestorEncomendas0.setEncomendas(hashMap0);
      gestorEncomendas0.FinalizadaToExpedida(0L, (LocalDate) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      LocalDate localDate0 = MockLocalDate.now();
      try { 
        gestorEncomendas0.FinalizadaToExpedida(0L, localDate0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // A encomenda com o ID 0n\u00E3o foi expedida
         //
         verifyException("projeto.GestorEncomendas", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      Long long0 = new Long(0L);
      LinkedHashSet<Long> linkedHashSet0 = new LinkedHashSet<Long>();
      linkedHashSet0.add(long0);
      // Undeclared exception!
      try { 
        gestorEncomendas0.encomendasToString(linkedHashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.GestorEncomendas", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      LinkedHashSet<Long> linkedHashSet0 = new LinkedHashSet<Long>();
      String string0 = gestorEncomendas0.encomendasToString(linkedHashSet0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      Long long0 = new Long(0L);
      Encomenda encomenda0 = new Encomenda();
      hashMap0.put(long0, encomenda0);
      gestorEncomendas0.setEncomendas(hashMap0);
      String string0 = gestorEncomendas0.encomendaToString(0L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas(hashMap0);
      try { 
        gestorEncomendas0.encomendaToString(0L);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // N\u00E3o exite nenhuma encomenda com o ID 0
         //
         verifyException("projeto.GestorEncomendas", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      Long long0 = new Long(0L);
      Encomenda encomenda0 = new Encomenda();
      hashMap0.put(long0, encomenda0);
      gestorEncomendas0.setEncomendas(hashMap0);
      int int0 = gestorEncomendas0.EncomendaToQuantidade(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      try { 
        gestorEncomendas0.EncomendaToQuantidade((-2881L));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // N\u00E3o exite nenhuma encomenda com o ID -2881
         //
         verifyException("projeto.GestorEncomendas", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      Encomenda encomenda0 = new Encomenda();
      gestorEncomendas0.adicionaEncomenda(encomenda0);
      Set<String> set0 = gestorEncomendas0.EncomendaToArtigos(1L);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      try { 
        gestorEncomendas0.EncomendaToArtigos(0L);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // N\u00E3o exite nenhuma encomenda com o ID 0
         //
         verifyException("projeto.GestorEncomendas", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      Long long0 = new Long(0L);
      LinkedHashSet<Long> linkedHashSet0 = new LinkedHashSet<Long>();
      linkedHashSet0.add(long0);
      // Undeclared exception!
      try { 
        gestorEncomendas0.encomendasToArtigos(linkedHashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.GestorEncomendas", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      Long long0 = new Long(0L);
      Encomenda encomenda0 = new Encomenda();
      hashMap0.put(long0, encomenda0);
      gestorEncomendas0.setEncomendas(hashMap0);
      // Undeclared exception!
      try { 
        gestorEncomendas0.podeDevolvida(0, (LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.time.temporal.ChronoUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      LocalDate localDate0 = MockLocalDate.now();
      try { 
        gestorEncomendas0.podeDevolvida(913L, localDate0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // N\u00E3o exite nenhuma encomenda com o ID 913
         //
         verifyException("projeto.GestorEncomendas", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas(hashMap0);
      try { 
        gestorEncomendas0.removeEncomenda((-1294L));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // N\u00E3o exite nenhuma encomenda com o ID -1294
         //
         verifyException("projeto.GestorEncomendas", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      Encomenda encomenda0 = new Encomenda();
      gestorEncomendas0.adicionaEncomenda(encomenda0);
      try { 
        gestorEncomendas0.adicionaEncomenda(encomenda0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // J\u00E1 existe uma encomenda com o ID 1
         //
         verifyException("projeto.GestorEncomendas", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas(hashMap0);
      LinkedHashSet<Long> linkedHashSet0 = new LinkedHashSet<Long>();
      Set<String> set0 = gestorEncomendas0.encomendasToArtigos(linkedHashSet0);
      Dimensao dimensao0 = Dimensao.Medio;
      LocalDate localDate0 = MockLocalDate.ofEpochDay(540L);
      Encomenda encomenda0 = new Encomenda(set0, 540L, dimensao0, localDate0);
      gestorEncomendas0.adicionaEncomenda(encomenda0);
      long long0 = gestorEncomendas0.removeEncomenda(1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      LocalDate localDate0 = MockLocalDate.now();
      boolean boolean0 = gestorEncomendas0.equals(localDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      boolean boolean0 = gestorEncomendas0.equals(gestorEncomendas0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      boolean boolean0 = gestorEncomendas0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      HashMap<Long, Encomenda> hashMap0 = new HashMap<Long, Encomenda>();
      Long long0 = new Long(0L);
      Encomenda encomenda0 = new Encomenda();
      hashMap0.put(long0, encomenda0);
      gestorEncomendas0.setEncomendas(hashMap0);
      GestorEncomendas gestorEncomendas1 = new GestorEncomendas(gestorEncomendas0);
      assertFalse(gestorEncomendas1.equals((Object)gestorEncomendas0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      Map<Long, Encomenda> map0 = gestorEncomendas0.getEncomendas();
      GestorEncomendas gestorEncomendas1 = new GestorEncomendas(map0);
      assertTrue(gestorEncomendas1.equals((Object)gestorEncomendas0));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      GestorEncomendas gestorEncomendas1 = gestorEncomendas0.clone();
      assertNotSame(gestorEncomendas1, gestorEncomendas0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      GestorEncomendas gestorEncomendas1 = new GestorEncomendas(gestorEncomendas0);
      boolean boolean0 = gestorEncomendas0.equals(gestorEncomendas1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      String string0 = gestorEncomendas0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      // Undeclared exception!
      try { 
        gestorEncomendas0.tamanhoEncomenda(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("projeto.GestorEncomendas", e);
      }
  }
}

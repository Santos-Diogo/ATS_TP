/*
 * This file was automatically generated by EvoSuite
 * Mon May 27 00:40:49 GMT 2024
 */

package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Model.Artigo;
import Model.Malas;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Malas_ESTest extends Malas_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.setDim(10.0F);
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutesSeconds(0, 0, 0);
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      malas0.toString(localDate0);
      assertEquals(10.0F, malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 3008.719F, "%owRU5-|P~", (-2286), "%owRU5-|P~", artigo_Estado0, (-2286), artigo_Avaliação0, "", "Nwu?4XB'H{", "%owRU5-|P~", 1180.0, 2477.2028, "Avalia\u00E7\u00E3o: ");
      Malas malas1 = malas0.clone();
      malas1.setDim((-2286));
      Malas malas2 = new Malas(malas1);
      boolean boolean0 = malas0.equals(malas2);
      assertEquals((-2286.0F), malas1.getDim(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, (-1310.9199F), "%J`AL1UQ!l-7&F9", (-3586), "JA{&{|&|+4R=N`86t", artigo_Estado0, (-3586), artigo_Avaliação0, "%J`AL1UQ!l-7&F9", "%J`AL1UQ!l-7&F9", "Dimens\u00F5es: ", (-1310.9199F), (-923.8384798100409), "Dimens\u00F5es: ");
      LocalDate localDate0 = MockLocalDate.now();
      double double0 = malas0.precoFinal(localDate0);
      assertEquals("%J`AL1UQ!l-7&F9", malas0.getMaterial());
      assertEquals((-2588058.6633899896), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Malas malas0 = new Malas();
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      malas0.setTipo_mala(malas_Tipos_Malas0);
      malas0.getTipo_mala();
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      assertEquals(0, malas0.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, (-3310.8F), (String) null, 1161, (String) null, artigo_Estado0, 0, artigo_Avaliação0, ">EC^S7jGU6._", (String) null, "0<q_X]0L", (-3310.8F), (-3310.8F), "8o");
      String string0 = malas0.getMaterial();
      assertEquals(1161, malas0.getAno_da_colecao());
      assertNull(string0);
      assertEquals((-3310.8F), malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.getMaterial();
      assertEquals(0, malas0.getAno_da_colecao());
      assertEquals(0.0F, malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Malas malas0 = new Malas();
      float float0 = malas0.getDim();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0, malas0.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.setDim((-2390.1008F));
      float float0 = malas0.getDim();
      assertEquals((-2390.1008F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 547.083F, "Marca: ", 3948, "'(f~&T)fCc6Y", artigo_Estado0, 1, artigo_Avaliação0, "", "Marca: ", "Ano da cole\u00E7\u00E3o: ", 0.5, 1.0, "'(f~&T)fCc6Y");
      int int0 = malas0.getAno_da_colecao();
      assertEquals(3948, int0);
      assertEquals(547.083F, malas0.getDim(), 0.01F);
      assertEquals("Marca: ", malas0.getMaterial());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.setAno_da_colecao((-1583));
      int int0 = malas0.getAno_da_colecao();
      assertEquals((-1583), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 676.0F, "Transportadora: ", 1014, "", artigo_Estado0, 1014, artigo_Avaliação0, "9&W_0|{`W2;a8NKm6", "", "", 1014, 676.0F, "o&ea28~)/xjc");
      Malas malas1 = malas0.clone();
      assertEquals(676.0F, malas0.getDim(), 0.01F);
      assertEquals(676.0F, malas1.getDim(), 0.01F);
      assertTrue(malas1.equals((Object)malas0));
      assertEquals("Transportadora: ", malas1.getMaterial());
      assertEquals(1014, malas0.getAno_da_colecao());
      assertEquals(1014, malas1.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.setNumeroDonos((-937));
      Malas malas1 = malas0.clone();
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      assertEquals(0, malas1.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.setId(0);
      Malas malas1 = malas0.clone();
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      assertEquals(0, malas1.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.setId((-937));
      Malas malas1 = malas0.clone();
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      assertEquals(0, malas1.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, (-51.9622F), "Tipo de mala: ", 1296, "", artigo_Estado0, 1296, artigo_Avaliação0, "", "Tipo de mala: ", "SrDfvwV[", 1296, 1296, "Tipo de mala: ");
      Malas malas1 = malas0.clone();
      assertTrue(malas1.equals((Object)malas0));
      assertEquals((-51.9622F), malas0.getDim(), 0.01F);
      assertEquals("Tipo de mala: ", malas1.getMaterial());
      assertEquals(1296, malas0.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 0.0F, "", 0, "", artigo_Estado0, 0, artigo_Avaliação0, "", "", "", (-1.0), (-3869.581876), "");
      Malas malas1 = malas0.clone();
      assertEquals(0, malas1.getAno_da_colecao());
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      assertTrue(malas1.equals((Object)malas0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Malas malas0 = new Malas();
      Malas malas1 = malas0.clone();
      malas0.setAno_da_colecao(278);
      boolean boolean0 = malas0.equals(malas1);
      assertEquals(278, malas0.getAno_da_colecao());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 3519.9983F, "$VALUES", 2078, "$VALUES", artigo_Estado0, 2078, artigo_Avaliação0, "$VALUES", "Preco Final: ", "", 2078, 3519.9983F, "");
      // Undeclared exception!
      try { 
        malas0.toString((LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Malas", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Malas malas0 = new Malas();
      // Undeclared exception!
      try { 
        malas0.precoFinal((LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Malas", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Malas malas0 = null;
      try {
        malas0 = new Malas((Malas) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Artigo", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 20.0F, "wkCl_aYs/Gb14", 3, "wkCl_aYs/Gb14", artigo_Estado0, 1919, artigo_Avaliação0, "Transportadora: ", "wkCl_aYs/Gb14", "h1)s/8.x", 20.0F, 1.0, (String) null);
      LocalDate localDate0 = MockLocalDate.now();
      double double0 = malas0.precoFinal(localDate0);
      assertEquals(2031.0, double0, 0.01);
      assertEquals("wkCl_aYs/Gb14", malas0.getMaterial());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.setDim(1102.676F);
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1L);
      double double0 = malas0.precoFinal(localDate0);
      assertEquals(1102.676F, malas0.getDim(), 0.01F);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 2124.0F, "> 3nI'", 428, "> 3nI'", artigo_Estado0, 0, artigo_Avaliação0, (String) null, "es4?ax`ab+H05`", "ID: ", 0.0, 0.0, (String) null);
      String string0 = malas0.getMaterial();
      assertEquals(428, malas0.getAno_da_colecao());
      assertNotNull(string0);
      assertEquals("> 3nI'", string0);
      assertEquals(2124.0F, malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 3519.9983F, "$VALUES", 2078, "$VALUES", artigo_Estado0, 2078, artigo_Avaliação0, "$VALUES", "Preco Final: ", "", 2078, 3519.9983F, "");
      float float0 = malas0.getDim();
      assertEquals("$VALUES", malas0.getMaterial());
      assertEquals(2078, malas0.getAno_da_colecao());
      assertEquals(3519.9983F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Malas malas0 = new Malas();
      int int0 = malas0.getAno_da_colecao();
      assertEquals(0, int0);
      assertEquals(0.0F, malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 547.083F, "Marca: ", 3948, "'(f~&T)fCc6Y", artigo_Estado0, 1, artigo_Avaliação0, "", "Marca: ", "Ano da cole\u00E7\u00E3o: ", 0.5, 1.0, "'(f~&T)fCc6Y");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(3948);
      String string0 = malas0.toString(localDate0);
      assertEquals("ID: 1\nTipo: '(f~&T)fCc6Y\nEstado: USADO\nN\u00FAmero de Donos: 1\nAvalia\u00E7\u00E3o: IMPEC\u00C1VEL\nDescri\u00E7\u00E3o: \nMarca: Marca: \nC\u00F3digo: Ano da cole\u00E7\u00E3o: \nPre\u00E7o Base: 0.5\nCorre\u00E7\u00E3o do Pre\u00E7o: 1.0\nTransportadora: '(f~&T)fCc6Y\nTipo de mala: PREMIUM\nDimens\u00F5es: 547.083\nMaterial: Marca: \nAno da cole\u00E7\u00E3o: 3948\nPreco Final: -2951.5\n", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 0.0F, "ID: ", 2, "ID: ", artigo_Estado0, 2, artigo_Avaliação0, "ID: ", "ID: ", "ID: ", 2, 2, "ID: ");
      Malas malas1 = new Malas(malas_Tipos_Malas0, 0.0F, "ID: ", 1804, "ID: ", artigo_Estado0, 1804, artigo_Avaliação0, "", "ID: ", "M%L7", 1804, 1804, "ID: ");
      boolean boolean0 = malas0.equals(malas1);
      assertEquals("ID: ", malas1.getMaterial());
      assertEquals(0.0F, malas1.getDim(), 0.01F);
      assertFalse(malas1.equals((Object)malas0));
      assertFalse(boolean0);
      assertEquals(1804, malas1.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 0.0F, "ID: ", 2, "ID: ", artigo_Estado0, 2, artigo_Avaliação0, "ID: ", "}zw,", "ID: ", 2, 2, "ID: ");
      Malas malas1 = new Malas(malas_Tipos_Malas0, 0.0F, "}zw,", 2, "}zw,", artigo_Estado0, 2, artigo_Avaliação0, "", "ID: ", "M%L7", 2, 2, "tlRY(");
      boolean boolean0 = malas0.equals(malas1);
      assertEquals(0.0F, malas1.getDim(), 0.01F);
      assertEquals("}zw,", malas1.getMaterial());
      assertFalse(boolean0);
      assertEquals(2, malas1.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, (-51.9622F), "Tipo de mala: ", 1296, "", artigo_Estado0, 1296, artigo_Avaliação0, "", "Tipo de mala: ", "SrDfvwV[", 1296, 1296, "Tipo de mala: ");
      Malas malas1 = new Malas(malas_Tipos_Malas0, 1296, "$VALUES", 165, "", artigo_Estado0, (-2080374783), artigo_Avaliação0, "NORMAL", "SrDfvwV[", "Tipo de mala: ", 482.6465, 165, "Transportadora: ");
      boolean boolean0 = malas0.equals(malas1);
      assertEquals(165, malas1.getAno_da_colecao());
      assertEquals("$VALUES", malas1.getMaterial());
      assertFalse(boolean0);
      assertEquals(1296.0F, malas1.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Malas malas0 = new Malas();
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      malas0.setTipo_mala(malas_Tipos_Malas0);
      Malas malas1 = new Malas();
      boolean boolean0 = malas0.equals(malas1);
      assertEquals(0.0F, malas1.getDim(), 0.01F);
      assertFalse(boolean0);
      assertEquals(0, malas1.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Malas malas0 = new Malas();
      Malas malas1 = new Malas();
      boolean boolean0 = malas0.equals(malas1);
      assertEquals(0.0F, malas1.getDim(), 0.01F);
      assertEquals(0, malas1.getAno_da_colecao());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 3519.9983F, "$VALUES", 2078, "$VALUES", artigo_Estado0, 2078, artigo_Avaliação0, "$VALUES", "Preco Final: ", "", 2078, 3519.9983F, "");
      boolean boolean0 = malas0.equals(artigo_Estado0);
      assertFalse(boolean0);
      assertEquals(2078, malas0.getAno_da_colecao());
      assertEquals("$VALUES", malas0.getMaterial());
      assertEquals(3519.9983F, malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Malas malas0 = new Malas();
      boolean boolean0 = malas0.equals(malas0);
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      assertEquals(0, malas0.getAno_da_colecao());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 2124.0F, "> 3nI'", 428, "> 3nI'", artigo_Estado0, 0, artigo_Avaliação0, (String) null, "es4?ax`ab+H05`", "ID: ", 0.0, 0.0, (String) null);
      boolean boolean0 = malas0.equals((Object) null);
      assertEquals(428, malas0.getAno_da_colecao());
      assertEquals(2124.0F, malas0.getDim(), 0.01F);
      assertFalse(boolean0);
      assertEquals("> 3nI'", malas0.getMaterial());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.setMaterial(" Wt");
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      assertEquals(0, malas0.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Malas malas0 = new Malas();
      Malas.Tipos_Malas malas_Tipos_Malas0 = malas0.getTipo_mala();
      malas0.setTipo_mala(malas_Tipos_Malas0);
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      assertEquals(0, malas0.getAno_da_colecao());
  }
}

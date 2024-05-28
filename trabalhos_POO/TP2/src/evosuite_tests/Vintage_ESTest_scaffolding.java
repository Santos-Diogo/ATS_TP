/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon May 27 16:34:26 GMT 2024
 */

package projeto;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Vintage_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "projeto.Vintage"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/zq/dt8l0bvs3bdcxw28m0v857r00000gn/T/"); 
    java.lang.System.setProperty("user.country", "PT"); 
    java.lang.System.setProperty("user.dir", "/Users/martimfelix/Desktop/3ano/2semestre/ATS/ATS_TP/trabalhos_POO/TP2"); 
    java.lang.System.setProperty("user.home", "/Users/martimfelix"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "martimfelix"); 
    java.lang.System.setProperty("user.timezone", "Europe/Lisbon"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Vintage_ESTest_scaffolding.class.getClassLoader() ,
      "projeto.Utilizador",
      "projeto.GestorEncomendas",
      "projeto.ArtigoNaoEncontradoException",
      "projeto.Transportadora",
      "projeto.Estado",
      "projeto.Encomenda",
      "projeto.Menu",
      "projeto.Gestor_Utilizadores",
      "projeto.Dimensao",
      "projeto.Padrao",
      "projeto.EncomendaDevolucaoImpossivelException",
      "projeto.Fatura",
      "projeto.Sapatilha",
      "projeto.EncomendaExistenteException",
      "projeto.Artigo",
      "projeto.Tamanho",
      "projeto.Mala",
      "projeto.ArtigoExistenteException",
      "projeto.Gestor_Artigos",
      "projeto.Gestor_Transportadoras",
      "projeto.CarrinhoVazioException",
      "projeto.EncomendaNaoEncontradaException",
      "projeto.TransportadoraNaoEncontradaException",
      "projeto.Vintage",
      "projeto.Tshirt",
      "projeto.ComparatorVendas"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Vintage_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "projeto.Vintage",
      "projeto.Gestor_Artigos",
      "projeto.Artigo",
      "projeto.Encomenda",
      "projeto.Fatura",
      "projeto.Transportadora",
      "projeto.Utilizador",
      "projeto.Gestor_Utilizadores",
      "projeto.Gestor_Transportadoras",
      "projeto.GestorEncomendas",
      "projeto.ArtigoNaoEncontradoException",
      "projeto.Menu",
      "projeto.Tshirt",
      "projeto.Estado",
      "projeto.Mala",
      "projeto.Sapatilha",
      "projeto.EncomendaNaoEncontradaException",
      "projeto.ComparatorVendas",
      "projeto.TransportadoraNaoEncontradaException",
      "projeto.Dimensao"
    );
  }
}

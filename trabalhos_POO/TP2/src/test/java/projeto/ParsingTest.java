/* import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Scanner;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

public class ParsingTest {

    private Vintage vintageMock;
    private Menu menuMock;
    private Parsing parsing;



    @BeforeEach
    void setUp() {
        vintageMock = mock(Vintage.class);
        menuMock = mock(Menu.class);
        parsing = new Parsing(vintageMock, menuMock);
    }

    @Test
    void testGetMenu() {
        assertEquals(menuMock, parsing.getMenu());
    }

    @Test
    void testGetVintage() {
        assertEquals(vintageMock, parsing.getVintage());
    }

    @Test
    void testSetMenu() {
        Menu newMenu = mock(Menu.class);
        parsing.setMenu(newMenu);
        assertEquals(newMenu, parsing.getMenu());
    }

    @Test
    void testSetVintage() {
        Vintage newVintage = mock(Vintage.class);
        parsing.setVintage(newVintage);
        assertEquals(newVintage, parsing.getVintage());
    }


    @Test
    void testLeituraFicheiro() throws FileNotFoundException {
        String fileName = "testFile.txt";
        LocalDate data = LocalDate.of(2023, 5, 15);
        String fileContent = "15:05:2023,1,Comprar,A1\n16:05:2023,2,Vender,Sapatilha,false,Descricao,Marca,100.0,true,5,3,1,40,true,Preto,2021,10.0";
        InputStream inputStream = new ByteArrayInputStream(fileContent.getBytes());
        Scanner scanner = new Scanner(inputStream);

        when(vintageMock.existeIdUtilizador(1L)).thenReturn(true);
        when(vintageMock.existeArtigoId("A1")).thenReturn(true);
        when(vintageMock.comprarArtigo(1L, "A1", LocalDate.of(2023, 5, 15))).thenReturn(true);

        Parsing parsingSpy = Mockito.spy(parsing);
        doReturn(scanner).when(parsingSpy).createScanner(any(File.class));

        LocalDate newDate = parsingSpy.leitura_ficheiro(fileName, data);
        assertEquals(LocalDate.of(2023, 5, 16), newDate);
    }

    @Test
    void testAdicionarComandoComprar() throws ArtigoExistenteException {
        String[] comando = {"15:05:2023", "1", "Comprar", "A1"};
        LocalDate data = LocalDate.of(2023, 5, 14);

        when(vintageMock.existeIdUtilizador(1L)).thenReturn(true);
        when(vintageMock.existeArtigoId("A1")).thenReturn(true);
        when(vintageMock.comprarArtigo(1L, "A1", LocalDate.of(2023, 5, 15))).thenReturn(true);

        LocalDate result = parsing.adicionar_comando(comando, data);

        assertEquals(LocalDate.of(2023, 5, 15), result);
        verify(menuMock, times(1)).imprimir("Compra efetuada com sucesso do artigo A1 para o utilizador 1");
    }

    @Test
    void testAdicionarComandoVenderSapatilha() throws ArtigoExistenteException {
        String[] comando = {"16:05:2023", "1", "Vender", "Sapatilha", "false", "Descricao", "Marca", "100.0", "true", "5", "3", "1", "40", "true", "Preto", "2021"};
        LocalDate data = LocalDate.of(2023, 5, 15);

        when(vintageMock.existeIdUtilizador(1L)).thenReturn(true);
        when(vintageMock.existe_transpotadoraNormal(1L)).thenReturn(true);
        when(vintageMock.ColocarvenderSapatilha(eq(1L), any(LocalDate.class), eq("Descricao"), eq("Marca"), eq(100.0), eq(true), eq(5), eq(3), eq(1L), eq(1L), eq(40), eq(true), eq("Preto"), eq(2021), eq(false), eq(0.0))).thenReturn(true);

        LocalDate result = parsing.adicionar_comando(comando, data);

        assertEquals(LocalDate.of(2023, 5, 16), result);
        verify(menuMock, times(1)).imprimir("Venda efetuada com sucesso da sapatilha Marca do utlizador1");
    }

    @Test
    void testVenderTshit() throws ArtigoExistenteException {
        String[] comando = {"15:05:2023", "1", "Vender", "T-shirt", "Descricao", "Marca", "100.0", "true", "5", "3", "1", "M", "liso"};
        LocalDate data = LocalDate.of(2023, 5, 15);

        when(vintageMock.existeIdUtilizador(1L)).thenReturn(true);
        when(vintageMock.existe_transpotadoraNormal(1L)).thenReturn(true);
        when(vintageMock.ColocarVenderTshit(eq(1L), any(LocalDate.class), eq("Descricao"), eq("Marca"), eq(100.0), eq(true), eq(5), eq(3), eq(1L), eq(Tamanho.M), eq(Padrao.liso))).thenReturn(true);

        parsing.venderTshit(1L, data, comando);

        verify(menuMock, times(1)).imprimir("Venda efetuada com sucesso da t-shirt Marca do utlizador 1");
    }

    @Test
    void testVenderMala() throws ArtigoExistenteException {
        String[] comando = {"15:05:2023", "1", "Vender", "Mala", "Descricao", "Marca", "100.0", "true", "5", "3", "1", "30", "Couro", "2022", "true", "0.5"};
        LocalDate data = LocalDate.of(2023, 5, 15);

        when(vintageMock.existeIdUtilizador(1L)).thenReturn(true);
        when(vintageMock.existe_transpotadoraPremium(1L)).thenReturn(true);
        when(vintageMock.ColocarVenderMala(eq(1L), any(LocalDate.class), eq("Descricao"), eq("Marca"), eq(100.0), eq(true), eq(5), eq(3), eq(1L), eq(30), eq("Couro"), eq(2022), eq(true), eq(0.5f))).thenReturn(true);

        parsing.venderMala(1L, data, comando);

        verify(menuMock, times(1)).imprimir("Venda efetuada com sucesso da mala Marca do utlizador 1");
    }
}
 */
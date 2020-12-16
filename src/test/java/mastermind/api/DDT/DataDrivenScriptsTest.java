package mastermind.api.DDT;

import static org.junit.Assert.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import mastermind.InterfazAleatorio;
import mastermind.InterfazEscaner;
import mastermind.MockAleatorio;
import mastermind.MockEscaner;
import mastermind.api.MockVista;
import mastermind.api.controller.Controlador;
import mastermind.api.model.Modelo;


import com.opencsv.*;

public class DataDrivenScriptsTest {

    private List<String> getListFromString(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(",");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }

    private List<String> readHeadersCSV(String archCSV) throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader(archCSV));
        return Arrays.asList(csvReader.readNext());
    }

    private List<String[]> readCSV(String archCSV) throws IOException {
        CSVReader csvReader = new CSVReaderBuilder(new FileReader(archCSV)).withSkipLines(1).build();
        return csvReader.readAll();
    }

    

    @Test
    public void GameWonTest() {
        try {
            List<String[]> listaArrayEntradas = readCSV("src/test/java/mastermind/api/DDT/GamesWon.csv");
            for (String[] arrayEntradas : listaArrayEntradas) {
                WinGame(arrayEntradas);
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
            assertTrue("csv not found", false);
        }     
    }

   
    public void WinGame(String[] arrayEntradas) {
        String secretCode = arrayEntradas[0];
        
        ArrayList<String> mockEntradaJugadorParametro = new ArrayList<String>(Arrays.asList(Arrays.copyOfRange(arrayEntradas, 1, arrayEntradas.length)));
        InterfazEscaner interfazEscaner = new MockEscaner(mockEntradaJugadorParametro);

        String[] arrayAleatorios = {secretCode};
        ArrayList<String> listaAleatoriaParametro = new ArrayList<String>(Arrays.asList(arrayAleatorios));
        InterfazAleatorio interfazAleatorio = new MockAleatorio(listaAleatoriaParametro);
        MockVista vista = new MockVista();
        Modelo modelo = new Modelo();
        Controlador controladorMain = new Controlador(vista, modelo);
        // controladorMain.gestorMastermind(interfazEscaner, interfazAleatorio);
        controladorMain.jugarMastermind(interfazEscaner, interfazAleatorio);
        //assertEquals(mockEntradaJugadorParametro.size(), vista.getVecesJugado());
        assertTrue(vista.isGameWon());
        assertFalse(vista.isLostGame());
    }

    @Test
    public void LostGameTest() {
        try {
            List<String[]> listaArrayEntradas = readCSV("src/test/java/mastermind/api/DDT/LostGames.csv");
            for (String[] arrayEntradas : listaArrayEntradas) {
                LoseGame(arrayEntradas);
            }
        } catch (Exception e) {
            System.out.println(e);
            assertTrue("csv not found", false);
        }     
    }
    
    public void LoseGame(String[] arrayEntradas) {
        String secretCode = arrayEntradas[0];
        
        ArrayList<String> mockEntradaJugadorParametro = new ArrayList<String>(Arrays.asList(Arrays.copyOfRange(arrayEntradas, 1, arrayEntradas.length)));
        InterfazEscaner interfazEscaner = new MockEscaner(mockEntradaJugadorParametro);

        String[] arrayAleatorios = {secretCode};
        ArrayList<String> listaAleatoriaParametro = new ArrayList<String>(Arrays.asList(arrayAleatorios));
        InterfazAleatorio interfazAleatorio = new MockAleatorio(listaAleatoriaParametro);
        MockVista vista = new MockVista();
        Modelo modelo = new Modelo();
        Controlador controladorMain = new Controlador(vista, modelo);
        // controladorMain.gestorMastermind(interfazEscaner, interfazAleatorio);
        controladorMain.jugarMastermind(interfazEscaner, interfazAleatorio);
        assertFalse(vista.isGameWon());
        assertTrue(vista.isLostGame());
    }

    @Test
    public void GameWonTestWithWrongInputsTest() {
        try {
            List<String[]> listaArrayEntradas = readCSV("src/test/java/mastermind/api/DDT/GamesWonWrongInputs.csv");
            for (String[] arrayEntradas : listaArrayEntradas) {
                WinGame(arrayEntradas);
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
            assertTrue("csv not found", false);
        }     
    }

    /*
    Nomes funciona en debug 
    */
    @Test
    public void LostGametWithWrongInputsTest() {
        try {
            List<String[]> listaArrayEntradas = readCSV("src/test/java/mastermind/api/DDT/LostGamesWrongInputs.csv");
            for (String[] arrayEntradas : listaArrayEntradas) {
                LoseGame(arrayEntradas);
            }
        } catch (Exception e) {
            System.out.println(e);
            assertTrue("csv not found", false);
        }     
    }
    
    @Test
    public void KeysTest(){
        try {
            List<String[]> listaArrayEntradas = readCSV("src/test/java/mastermind/api/DDT/CompareCodes.csv");
            for (String[] arrayEntradas : listaArrayEntradas) {
                char[] combinacionSecreta = arrayEntradas[0].toCharArray();
                char[] combinacionJugador = arrayEntradas[1].toCharArray();
                char[] expectedKeys = arrayEntradas[2].toCharArray();
               // assertEquals(expectedKeys, CompareCodeTest(combinacionSecreta, combinacionJugador));
               assertArrayEquals(expectedKeys, CompareCodeTest(combinacionSecreta, combinacionJugador));
            }
        } catch (Exception e) {
            System.out.println(e);
            assertTrue("csv not found", false);
        }   
    }

    public char[] CompareCodeTest(char[] combinacionSecreta,char[] combinacionJugador) {
        return Modelo.compararCombinaciones(combinacionSecreta, combinacionJugador);
    }

}

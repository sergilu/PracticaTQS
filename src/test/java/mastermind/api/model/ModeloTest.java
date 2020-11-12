package mastermind.api.model;

import static org.junit.Assert.*;
import org.junit.Test;
import mastermind.api.view.*;

/**
 * Clase ModeloTest - Clase donde se encuentran los metodos de test relacionados
 * con el modelo del juego.
 * 
 * @author Daniel Luis Garcia
 * @author Daniel Villagrasa Ramirez
 */
public class ModeloTest {
	/**
	 * Instancia de la clase Modelo.
	 */
	Modelo modelo = new Modelo();
	
	/**
	 * Instancia de la clase Vista.
	 */
	Vista vista = new Vista();
	
	/**
	 * Numero de posiciones del tablero del juego. En este caso son 4 tanto para los numeros 
	 * (serian los colores exceptuando el blanco y negro), como para mostrar los aciertos de 
	 * numeros y/o posicion (serian los colores blanco y negro).
	 */
	public static final int MAX_CLAVIJAS = 4;
	
	/**
	 * Array de cadenas de caracteres de un rango de 0 a 8, que son los numeros para el codigo aleatorio secreto.
	 */
	static String[] numeros = {"0","1","2","3","4","5","6","7","8"};

	
	/**
	 * 	            Pair-wise testing de numeros [0-8]
	 * 			-------------------------------------------
	 * 						0 | 0 | 0 | 0 
	 * 						1 | 1 | 1 | 1 
	 * 						2 | 2 | 2 | 2 
	 * 						3 | 3 | 3 | 3 
	 * 						4 | 4 | 4 | 4 
	 * 						5 | 5 | 5 | 5 
	 * 						6 | 6 | 6 | 6 
	 * 						7 | 7 | 7 | 7 
	 * 						8 | 8 | 8 | 8 
	 * 
	 * 			https://pairwise.teremokgames.com/x4a8/		
	 */
	////////////////////////////////////////////////////////////////////////////////////////////////////////Particiones equivalentes validas.
	String combinacionJugador0000 = "0000";
	String combinacionJugador0111 = "0111";
	String combinacionJugador0222 = "0222";
	String combinacionJugador0333 = "0333";
	String combinacionJugador0444 = "0444";
	String combinacionJugador0555 = "0555";
	String combinacionJugador0666 = "0666";
	String combinacionJugador0777 = "0777";
	String combinacionJugador0888 = "0888";
	String combinacionJugador1123 = "1123";
	String combinacionJugador1234 = "1234";
	String combinacionJugador1345 = "1345";
	String combinacionJugador1456 = "1456";
	String combinacionJugador1567 = "1567";
	String combinacionJugador1678 = "1678";
	String combinacionJugador1780 = "1780";
	String combinacionJugador1801 = "1801";
	String combinacionJugador1012 = "1012";
	String combinacionJugador2246 = "2246";
	String combinacionJugador2357 = "2357";
	String combinacionJugador2468 = "2468";
	String combinacionJugador2570 = "2570";
	String combinacionJugador2681 = "2681";
	String combinacionJugador2702 = "2702";
	String combinacionJugador2813 = "2813";
	String combinacionJugador2024 = "2024";
	String combinacionJugador2135 = "2135";
	String combinacionJugador3360 = "3360";
	String combinacionJugador3471 = "3471";
	String combinacionJugador3582 = "3582";
	String combinacionJugador3603 = "3603";
	String combinacionJugador3714 = "3714";
	String combinacionJugador3825 = "3825";
	String combinacionJugador3036 = "3036";
	String combinacionJugador3147 = "3147";
	String combinacionJugador3258 = "3258";
	String combinacionJugador4483 = "4483";
	String combinacionJugador4504 = "4504";
	String combinacionJugador4615 = "4615";
	String combinacionJugador4726 = "4726";
	String combinacionJugador4837 = "4837";
	String combinacionJugador4048 = "4048";
	String combinacionJugador4150 = "4150";
	String combinacionJugador4261 = "4261";
	String combinacionJugador4372 = "4372";
	String combinacionJugador5516 = "5516";
	String combinacionJugador5627 = "5627";
	String combinacionJugador5738 = "5738";
	String combinacionJugador5840 = "5840";
	String combinacionJugador5051 = "5051";
	String combinacionJugador5162 = "5162";
	String combinacionJugador5273 = "5273";
	String combinacionJugador5384 = "5384";
	String combinacionJugador5405 = "5405";
	String combinacionJugador6630 = "6630";
	String combinacionJugador6741 = "6741";
	String combinacionJugador6852 = "6852";
	String combinacionJugador6063 = "6063";
	String combinacionJugador6174 = "6174";
	String combinacionJugador6285 = "6285";
	String combinacionJugador6306 = "6306";
	String combinacionJugador6417 = "6417";
	String combinacionJugador6528 = "6528";
	String combinacionJugador7753 = "7753";
	String combinacionJugador7864 = "7864";
	String combinacionJugador7075 = "7075";
	String combinacionJugador7186 = "7186";
	String combinacionJugador7207 = "7207";
	String combinacionJugador7318 = "7318";
	String combinacionJugador7420 = "7420";
	String combinacionJugador7531 = "7531";
	String combinacionJugador7642 = "7642";
	String combinacionJugador8876 = "8876";
	String combinacionJugador8087 = "8087";
	String combinacionJugador8108 = "8108";
	String combinacionJugador8210 = "8210";
	String combinacionJugador8321 = "8321";
	String combinacionJugador8432 = "8432";
	String combinacionJugador8543 = "8543";
	String combinacionJugador8654 = "8654";
	String combinacionJugador8765 = "8765";
	
	char[] combinacionCasteada0000 = modelo.castearEntradaJugador(combinacionJugador0000);
	char[] combinacionCasteada0111 = modelo.castearEntradaJugador(combinacionJugador0111);
	char[] combinacionCasteada0222 = modelo.castearEntradaJugador(combinacionJugador0222);
	char[] combinacionCasteada0333 = modelo.castearEntradaJugador(combinacionJugador0333);
	char[] combinacionCasteada0444 = modelo.castearEntradaJugador(combinacionJugador0444);
	char[] combinacionCasteada0555 = modelo.castearEntradaJugador(combinacionJugador0555);
	char[] combinacionCasteada0666 = modelo.castearEntradaJugador(combinacionJugador0666);
	char[] combinacionCasteada0777 = modelo.castearEntradaJugador(combinacionJugador0777);
	char[] combinacionCasteada0888 = modelo.castearEntradaJugador(combinacionJugador0888);
	char[] combinacionCasteada1123 = modelo.castearEntradaJugador(combinacionJugador1123);
	char[] combinacionCasteada1234 = modelo.castearEntradaJugador(combinacionJugador1234);
	char[] combinacionCasteada1345 = modelo.castearEntradaJugador(combinacionJugador1345);
	char[] combinacionCasteada1456 = modelo.castearEntradaJugador(combinacionJugador1456);
	char[] combinacionCasteada1567 = modelo.castearEntradaJugador(combinacionJugador1567);
	char[] combinacionCasteada1678 = modelo.castearEntradaJugador(combinacionJugador1678);
	char[] combinacionCasteada1780 = modelo.castearEntradaJugador(combinacionJugador1780);
	char[] combinacionCasteada1801 = modelo.castearEntradaJugador(combinacionJugador1801);
	char[] combinacionCasteada1012 = modelo.castearEntradaJugador(combinacionJugador1012);
	char[] combinacionCasteada2246 = modelo.castearEntradaJugador(combinacionJugador2246);
	char[] combinacionCasteada2357 = modelo.castearEntradaJugador(combinacionJugador2357);
	char[] combinacionCasteada2468 = modelo.castearEntradaJugador(combinacionJugador2468);
	char[] combinacionCasteada2570 = modelo.castearEntradaJugador(combinacionJugador2570);
	char[] combinacionCasteada2681 = modelo.castearEntradaJugador(combinacionJugador2681);
	char[] combinacionCasteada2702 = modelo.castearEntradaJugador(combinacionJugador2702);
	char[] combinacionCasteada2813 = modelo.castearEntradaJugador(combinacionJugador2813);
	char[] combinacionCasteada2024 = modelo.castearEntradaJugador(combinacionJugador2024);
	char[] combinacionCasteada2135 = modelo.castearEntradaJugador(combinacionJugador2135);
	char[] combinacionCasteada3360 = modelo.castearEntradaJugador(combinacionJugador3360);
	char[] combinacionCasteada3471 = modelo.castearEntradaJugador(combinacionJugador3471);
	char[] combinacionCasteada3582 = modelo.castearEntradaJugador(combinacionJugador3582);
	char[] combinacionCasteada3603 = modelo.castearEntradaJugador(combinacionJugador3603);
	char[] combinacionCasteada3714 = modelo.castearEntradaJugador(combinacionJugador3714);
	char[] combinacionCasteada3825 = modelo.castearEntradaJugador(combinacionJugador3825);
	char[] combinacionCasteada3036 = modelo.castearEntradaJugador(combinacionJugador3036);
	char[] combinacionCasteada3147 = modelo.castearEntradaJugador(combinacionJugador3147);
	char[] combinacionCasteada3258 = modelo.castearEntradaJugador(combinacionJugador3258);
	char[] combinacionCasteada4483 = modelo.castearEntradaJugador(combinacionJugador4483);
	char[] combinacionCasteada4504 = modelo.castearEntradaJugador(combinacionJugador4504);
	char[] combinacionCasteada4615 = modelo.castearEntradaJugador(combinacionJugador4615);
	char[] combinacionCasteada4726 = modelo.castearEntradaJugador(combinacionJugador4726);
	char[] combinacionCasteada4837 = modelo.castearEntradaJugador(combinacionJugador4837);
	char[] combinacionCasteada4048 = modelo.castearEntradaJugador(combinacionJugador4048);
	char[] combinacionCasteada4150 = modelo.castearEntradaJugador(combinacionJugador4150);
	char[] combinacionCasteada4261 = modelo.castearEntradaJugador(combinacionJugador4261);
	char[] combinacionCasteada4372 = modelo.castearEntradaJugador(combinacionJugador4372);
	char[] combinacionCasteada5516 = modelo.castearEntradaJugador(combinacionJugador5516);
	char[] combinacionCasteada5627 = modelo.castearEntradaJugador(combinacionJugador5627);
	char[] combinacionCasteada5738 = modelo.castearEntradaJugador(combinacionJugador5738);
	char[] combinacionCasteada5840 = modelo.castearEntradaJugador(combinacionJugador5840);
	char[] combinacionCasteada5051 = modelo.castearEntradaJugador(combinacionJugador5051);
	char[] combinacionCasteada5162 = modelo.castearEntradaJugador(combinacionJugador5162);
	char[] combinacionCasteada5273 = modelo.castearEntradaJugador(combinacionJugador5273);
	char[] combinacionCasteada5384 = modelo.castearEntradaJugador(combinacionJugador5384);
	char[] combinacionCasteada5405 = modelo.castearEntradaJugador(combinacionJugador5405);
	char[] combinacionCasteada6630 = modelo.castearEntradaJugador(combinacionJugador6630);
	char[] combinacionCasteada6741 = modelo.castearEntradaJugador(combinacionJugador6741);
	char[] combinacionCasteada6852 = modelo.castearEntradaJugador(combinacionJugador6852);
	char[] combinacionCasteada6063 = modelo.castearEntradaJugador(combinacionJugador6063);
	char[] combinacionCasteada6174 = modelo.castearEntradaJugador(combinacionJugador6174);
	char[] combinacionCasteada6285 = modelo.castearEntradaJugador(combinacionJugador6285);
	char[] combinacionCasteada6306 = modelo.castearEntradaJugador(combinacionJugador6306);
	char[] combinacionCasteada6417 = modelo.castearEntradaJugador(combinacionJugador6417);
	char[] combinacionCasteada6528 = modelo.castearEntradaJugador(combinacionJugador6528);
	char[] combinacionCasteada7753 = modelo.castearEntradaJugador(combinacionJugador7753);
	char[] combinacionCasteada7864 = modelo.castearEntradaJugador(combinacionJugador7864);
	char[] combinacionCasteada7075 = modelo.castearEntradaJugador(combinacionJugador7075);
	char[] combinacionCasteada7186 = modelo.castearEntradaJugador(combinacionJugador7186);
	char[] combinacionCasteada7207 = modelo.castearEntradaJugador(combinacionJugador7207);
	char[] combinacionCasteada7318 = modelo.castearEntradaJugador(combinacionJugador7318);
	char[] combinacionCasteada7420 = modelo.castearEntradaJugador(combinacionJugador7420);
	char[] combinacionCasteada7531 = modelo.castearEntradaJugador(combinacionJugador7531);
	char[] combinacionCasteada7642 = modelo.castearEntradaJugador(combinacionJugador7642);
	char[] combinacionCasteada8876 = modelo.castearEntradaJugador(combinacionJugador8876);
	char[] combinacionCasteada8087 = modelo.castearEntradaJugador(combinacionJugador8087);
	char[] combinacionCasteada8108 = modelo.castearEntradaJugador(combinacionJugador8108);
	char[] combinacionCasteada8210 = modelo.castearEntradaJugador(combinacionJugador8210);
	char[] combinacionCasteada8321 = modelo.castearEntradaJugador(combinacionJugador8321);
	char[] combinacionCasteada8432 = modelo.castearEntradaJugador(combinacionJugador8432);
	char[] combinacionCasteada8543 = modelo.castearEntradaJugador(combinacionJugador8543);
	char[] combinacionCasteada8654 = modelo.castearEntradaJugador(combinacionJugador8654);
	char[] combinacionCasteada8765 = modelo.castearEntradaJugador(combinacionJugador8765);

	/**
	 * Test caja negra de castearEntradaJugador.
	 * R -> Simbolo de restar (-).
	 * A -> Simbolo asterisco (*). 
	 */
	@Test
	public void testCastearEntradaJugadorPairWise() {
		
		/**
		 * --------------- Test del metodo castearEntradaJugador() ---------------
		 * 
		 * 			  Pair-wise testing de numeros y simbolos
		 * 			-------------------------------------------
		 * Char numerico | Char simbolo  | Char numerico | Char simbolo
		 * Char simbolo  | Char numerico | Char simbolo  | Char numerico
		 *  
		 *  R -> Simbolo de restar (-).
		 *  A -> Simbolo asterisco (*). 
		 * 
		 */
		String combinacionJugador0R0A = "0-0*";
		char[] combinacionCasteadaEsperada0R0A = {'0','-','0','*'};
		char[] combinacionCasteada0R0A = modelo.castearEntradaJugador(combinacionJugador0R0A);
		assertArrayEquals(combinacionCasteadaEsperada0R0A, combinacionCasteada0R0A);
		
		String combinacionJugadorR2A8 = "-2*8";
		char[] combinacionCasteadaEsperadaR2A8 = {'-','2','*','8'};
		char[] combinacionCasteadaR2A8 = modelo.castearEntradaJugador(combinacionJugadorR2A8);
		assertArrayEquals(combinacionCasteadaEsperadaR2A8, combinacionCasteadaR2A8);
		
		char[] combinacionEsperada0000 = {'0', '0', '0', '0'};
		char[] combinacionEsperada0111 = {'0', '1', '1', '1'};
		char[] combinacionEsperada0222 = {'0', '2', '2', '2'};
		char[] combinacionEsperada0333 = {'0', '3', '3', '3'};
		char[] combinacionEsperada0444 = {'0', '4', '4', '4'};
		char[] combinacionEsperada0555 = {'0', '5', '5', '5'};
		char[] combinacionEsperada0666 = {'0', '6', '6', '6'};
		char[] combinacionEsperada0777 = {'0', '7', '7', '7'};
		char[] combinacionEsperada0888 = {'0', '8', '8', '8'};
		char[] combinacionEsperada1123 = {'1', '1', '2', '3'};
		char[] combinacionEsperada1234 = {'1', '2', '3', '4'};
		char[] combinacionEsperada1345 = {'1', '3', '4', '5'};
		char[] combinacionEsperada1456 = {'1', '4', '5', '6'};
		char[] combinacionEsperada1567 = {'1', '5', '6', '7'};
		char[] combinacionEsperada1678 = {'1', '6', '7', '8'};
		char[] combinacionEsperada1780 = {'1', '7', '8', '0'};
		char[] combinacionEsperada1801 = {'1', '8', '0', '1'};
		char[] combinacionEsperada1012 = {'1', '0', '1', '2'};
		char[] combinacionEsperada2246 = {'2', '2', '4', '6'};
		char[] combinacionEsperada2357 = {'2', '3', '5', '7'};
		char[] combinacionEsperada2468 = {'2', '4', '6', '8'};
		char[] combinacionEsperada2570 = {'2', '5', '7', '0'};
		char[] combinacionEsperada2681 = {'2', '6', '8', '1'};
		char[] combinacionEsperada2702 = {'2', '7', '0', '2'};
		char[] combinacionEsperada2813 = {'2', '8', '1', '3'};
		char[] combinacionEsperada2024 = {'2', '0', '2', '4'};
		char[] combinacionEsperada2135 = {'2', '1', '3', '5'};
		char[] combinacionEsperada3360 = {'3', '3', '6', '0'};
		char[] combinacionEsperada3471 = {'3', '4', '7', '1'};
		char[] combinacionEsperada3582 = {'3', '5', '8', '2'};
		char[] combinacionEsperada3603 = {'3', '6', '0', '3'};
		char[] combinacionEsperada3714 = {'3', '7', '1', '4'};
		char[] combinacionEsperada3825 = {'3', '8', '2', '5'};
		char[] combinacionEsperada3036 = {'3', '0', '3', '6'};
		char[] combinacionEsperada3147 = {'3', '1', '4', '7'};
		char[] combinacionEsperada3258 = {'3', '2', '5', '8'};
		char[] combinacionEsperada4483 = {'4', '4', '8', '3'};
		char[] combinacionEsperada4504 = {'4', '5', '0', '4'};
		char[] combinacionEsperada4615 = {'4', '6', '1', '5'};
		char[] combinacionEsperada4726 = {'4', '7', '2', '6'};
		char[] combinacionEsperada4837 = {'4', '8', '3', '7'};
		char[] combinacionEsperada4048 = {'4', '0', '4', '8'};
		char[] combinacionEsperada4150 = {'4', '1', '5', '0'};
		char[] combinacionEsperada4261 = {'4', '2', '6', '1'};
		char[] combinacionEsperada4372 = {'4', '3', '7', '2'};
		char[] combinacionEsperada5516 = {'5', '5', '1', '6'};
		char[] combinacionEsperada5627 = {'5', '6', '2', '7'};
		char[] combinacionEsperada5738 = {'5', '7', '3', '8'};
		char[] combinacionEsperada5840 = {'5', '8', '4', '0'};
		char[] combinacionEsperada5051 = {'5', '0', '5', '1'};
		char[] combinacionEsperada5162 = {'5', '1', '6', '2'};
		char[] combinacionEsperada5273 = {'5', '2', '7', '3'};
		char[] combinacionEsperada5384 = {'5', '3', '8', '4'};
		char[] combinacionEsperada5405 = {'5', '4', '0', '5'};
		char[] combinacionEsperada6630 = {'6', '6', '3', '0'};
		char[] combinacionEsperada6741 = {'6', '7', '4', '1'};
		char[] combinacionEsperada6852 = {'6', '8', '5', '2'};
		char[] combinacionEsperada6063 = {'6', '0', '6', '3'};
		char[] combinacionEsperada6174 = {'6', '1', '7', '4'};
		char[] combinacionEsperada6285 = {'6', '2', '8', '5'};
		char[] combinacionEsperada6306 = {'6', '3', '0', '6'};
		char[] combinacionEsperada6417 = {'6', '4', '1', '7'};
		char[] combinacionEsperada6528 = {'6', '5', '2', '8'};
		char[] combinacionEsperada7753 = {'7', '7', '5', '3'};
		char[] combinacionEsperada7864 = {'7', '8', '6', '4'};
		char[] combinacionEsperada7075 = {'7', '0', '7', '5'};
		char[] combinacionEsperada7186 = {'7', '1', '8', '6'};
		char[] combinacionEsperada7207 = {'7', '2', '0', '7'};
		char[] combinacionEsperada7318 = {'7', '3', '1', '8'};
		char[] combinacionEsperada7420 = {'7', '4', '2', '0'};
		char[] combinacionEsperada7531 = {'7', '5', '3', '1'};
		char[] combinacionEsperada7642 = {'7', '6', '4', '2'};
		char[] combinacionEsperada8876 = {'8', '8', '7', '6'};
		char[] combinacionEsperada8087 = {'8', '0', '8', '7'};
		char[] combinacionEsperada8108 = {'8', '1', '0', '8'};
		char[] combinacionEsperada8210 = {'8', '2', '1', '0'};
		char[] combinacionEsperada8321 = {'8', '3', '2', '1'};
		char[] combinacionEsperada8432 = {'8', '4', '3', '2'};
		char[] combinacionEsperada8543 = {'8', '5', '4', '3'};
		char[] combinacionEsperada8654 = {'8', '6', '5', '4'};
		char[] combinacionEsperada8765 = {'8', '7', '6', '5'};
				
		assertArrayEquals(combinacionEsperada0000, combinacionCasteada0000);
		assertArrayEquals(combinacionEsperada0111, combinacionCasteada0111);
		assertArrayEquals(combinacionEsperada0222, combinacionCasteada0222);
		assertArrayEquals(combinacionEsperada0333, combinacionCasteada0333);
		assertArrayEquals(combinacionEsperada0444, combinacionCasteada0444);
		assertArrayEquals(combinacionEsperada0555, combinacionCasteada0555);
		assertArrayEquals(combinacionEsperada0666, combinacionCasteada0666);
		assertArrayEquals(combinacionEsperada0777, combinacionCasteada0777);
		assertArrayEquals(combinacionEsperada0888, combinacionCasteada0888);
		assertArrayEquals(combinacionEsperada1123, combinacionCasteada1123);
		assertArrayEquals(combinacionEsperada1234, combinacionCasteada1234);
		assertArrayEquals(combinacionEsperada1345, combinacionCasteada1345);
		assertArrayEquals(combinacionEsperada1456, combinacionCasteada1456);
		assertArrayEquals(combinacionEsperada1567, combinacionCasteada1567);
		assertArrayEquals(combinacionEsperada1678, combinacionCasteada1678);
		assertArrayEquals(combinacionEsperada1780, combinacionCasteada1780);
		assertArrayEquals(combinacionEsperada1801, combinacionCasteada1801);
		assertArrayEquals(combinacionEsperada1012, combinacionCasteada1012);
		assertArrayEquals(combinacionEsperada2246, combinacionCasteada2246);
		assertArrayEquals(combinacionEsperada2357, combinacionCasteada2357);
		assertArrayEquals(combinacionEsperada2468, combinacionCasteada2468);
		assertArrayEquals(combinacionEsperada2570, combinacionCasteada2570);
		assertArrayEquals(combinacionEsperada2681, combinacionCasteada2681);
		assertArrayEquals(combinacionEsperada2702, combinacionCasteada2702);
		assertArrayEquals(combinacionEsperada2813, combinacionCasteada2813);
		assertArrayEquals(combinacionEsperada2024, combinacionCasteada2024);
		assertArrayEquals(combinacionEsperada2135, combinacionCasteada2135);
		assertArrayEquals(combinacionEsperada3360, combinacionCasteada3360);
		assertArrayEquals(combinacionEsperada3471, combinacionCasteada3471);
		assertArrayEquals(combinacionEsperada3582, combinacionCasteada3582);
		assertArrayEquals(combinacionEsperada3603, combinacionCasteada3603);
		assertArrayEquals(combinacionEsperada3714, combinacionCasteada3714);
		assertArrayEquals(combinacionEsperada3825, combinacionCasteada3825);
		assertArrayEquals(combinacionEsperada3036, combinacionCasteada3036);
		assertArrayEquals(combinacionEsperada3147, combinacionCasteada3147);
		assertArrayEquals(combinacionEsperada3258, combinacionCasteada3258);
		assertArrayEquals(combinacionEsperada4483, combinacionCasteada4483);
		assertArrayEquals(combinacionEsperada4504, combinacionCasteada4504);
		assertArrayEquals(combinacionEsperada4615, combinacionCasteada4615);
		assertArrayEquals(combinacionEsperada4726, combinacionCasteada4726);
		assertArrayEquals(combinacionEsperada4837, combinacionCasteada4837);
		assertArrayEquals(combinacionEsperada4048, combinacionCasteada4048);
		assertArrayEquals(combinacionEsperada4150, combinacionCasteada4150);
		assertArrayEquals(combinacionEsperada4261, combinacionCasteada4261);
		assertArrayEquals(combinacionEsperada4372, combinacionCasteada4372);
		assertArrayEquals(combinacionEsperada5516, combinacionCasteada5516);
		assertArrayEquals(combinacionEsperada5627, combinacionCasteada5627);
		assertArrayEquals(combinacionEsperada5738, combinacionCasteada5738);
		assertArrayEquals(combinacionEsperada5840, combinacionCasteada5840);
		assertArrayEquals(combinacionEsperada5051, combinacionCasteada5051);
		assertArrayEquals(combinacionEsperada5162, combinacionCasteada5162);
		assertArrayEquals(combinacionEsperada5273, combinacionCasteada5273);
		assertArrayEquals(combinacionEsperada5384, combinacionCasteada5384);
		assertArrayEquals(combinacionEsperada5405, combinacionCasteada5405);
		assertArrayEquals(combinacionEsperada6630, combinacionCasteada6630);
		assertArrayEquals(combinacionEsperada6741, combinacionCasteada6741);
		assertArrayEquals(combinacionEsperada6852, combinacionCasteada6852);
		assertArrayEquals(combinacionEsperada6063, combinacionCasteada6063);
		assertArrayEquals(combinacionEsperada6174, combinacionCasteada6174);
		assertArrayEquals(combinacionEsperada6285, combinacionCasteada6285);
		assertArrayEquals(combinacionEsperada6306, combinacionCasteada6306);
		assertArrayEquals(combinacionEsperada6417, combinacionCasteada6417);
		assertArrayEquals(combinacionEsperada6528, combinacionCasteada6528);
		assertArrayEquals(combinacionEsperada7753, combinacionCasteada7753);
		assertArrayEquals(combinacionEsperada7864, combinacionCasteada7864);
		assertArrayEquals(combinacionEsperada7075, combinacionCasteada7075);
		assertArrayEquals(combinacionEsperada7186, combinacionCasteada7186);
		assertArrayEquals(combinacionEsperada7207, combinacionCasteada7207);
		assertArrayEquals(combinacionEsperada7318, combinacionCasteada7318);
		assertArrayEquals(combinacionEsperada7420, combinacionCasteada7420);
		assertArrayEquals(combinacionEsperada7531, combinacionCasteada7531);
		assertArrayEquals(combinacionEsperada7642, combinacionCasteada7642);
		assertArrayEquals(combinacionEsperada8876, combinacionCasteada8876);
		assertArrayEquals(combinacionEsperada8087, combinacionCasteada8087);
		assertArrayEquals(combinacionEsperada8108, combinacionCasteada8108);
		assertArrayEquals(combinacionEsperada8210, combinacionCasteada8210);
		assertArrayEquals(combinacionEsperada8321, combinacionCasteada8321);
		assertArrayEquals(combinacionEsperada8432, combinacionCasteada8432);
		assertArrayEquals(combinacionEsperada8543, combinacionCasteada8543);
		assertArrayEquals(combinacionEsperada8654, combinacionCasteada8654);
		assertArrayEquals(combinacionEsperada8765, combinacionCasteada8765);
	}
	
	/**
	 * --------------- Test del metodo validarEntradaJugador() ---------------
	 * Comprueba los valores interiores, limite y frontera ademas de las particiones
	 * equivalentes.
	 */
	@Test
	public void testValidarEntradaJugador() {
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////Particiones equivalentes validas.
		String combinacionJugador0000 = "0000"; // Valores frontera 0.
		String combinacionJugador8888 = "8888"; // Valores frontera 8.
		
		String combinacionJugador0628 = "0628"; // Valores frontera 0 y 8.
		String combinacionJugador8462 = "8462"; // Valor frontera 8.
		String combinacionJugador4860 = "4860"; // Valores frontera 0 y 8.
		String combinacionJugador4602 = "4602"; // Valor frontera 0.
		
		String combinacionJugador4127 = "4127"; // Valores limite 1 y 7.
		String combinacionJugador7461 = "7461"; // Valores limite 1 y 7.
		String combinacionJugador4712 = "4712"; // Valores limite 1 y 7.
		String combinacionJugador1672 = "1672"; // Valores limite 1 y 7.
		
		char[] entradaCasteada0000 = modelo.castearEntradaJugador(combinacionJugador0000);
		char[] entradaCasteada8888 = modelo.castearEntradaJugador(combinacionJugador8888);
		
		char[] combinacionCasteada4127 = modelo.castearEntradaJugador(combinacionJugador4127);
		char[] combinacionCasteada7461 = modelo.castearEntradaJugador(combinacionJugador7461);
		char[] combinacionCasteada4712 = modelo.castearEntradaJugador(combinacionJugador4712);
		char[] combinacionCasteada1672 = modelo.castearEntradaJugador(combinacionJugador1672);
		
		char[] combinacionCasteada0628 = modelo.castearEntradaJugador(combinacionJugador0628);
		char[] combinacionCasteada8462 = modelo.castearEntradaJugador(combinacionJugador8462);
		char[] combinacionCasteada4860 = modelo.castearEntradaJugador(combinacionJugador4860);
		char[] combinacionCasteada4602 = modelo.castearEntradaJugador(combinacionJugador4602);
	
		assertTrue(Modelo.validarEntradaJugador(entradaCasteada0000));
		assertTrue(Modelo.validarEntradaJugador(entradaCasteada8888));
		
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada4127));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada7461));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada4712));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada1672));
		
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada0628));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada8462));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada4860));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada4602));
		
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada0000));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada0111));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada0222));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada0333));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada0444));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada0555));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada0666));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada0777));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada0888));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada1123));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada1234));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada1345));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada1456));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada1567));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada1678));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada1780));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada1801));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada1012));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada2246));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada2357));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada2468));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada2570));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada2681));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada2702));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada2813));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada2024));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada2135));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada3360));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada3471));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada3582));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada3603));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada3714));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada3825));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada3036));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada3147));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada3258));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada4483));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada4504));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada4615));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada4726));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada4837));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada4048));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada4150));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada4261));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada4372));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada5516));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada5627));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada5738));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada5840));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada5051));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada5162));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada5273));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada5384));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada5405));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada6630));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada6741));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada6852));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada6063));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada6174));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada6285));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada6306));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada6417));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada6528));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada7753));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada7864));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada7075));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada7186));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada7207));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada7318));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada7420));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada7531));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada7642));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada8876));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada8087));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada8108));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada8210));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada8321));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada8432));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada8543));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada8654));
		assertTrue(Modelo.validarEntradaJugador(combinacionCasteada8765));
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////// Particiones equivalentes invalidas
		//if(X == 4)
		String combinacionJugadorNULL = "";													// Valor limite 0.
		String combinacionJugadorEspacio = " ";												// Valor limite 1.
		String combinacionJugador0 = "0";													// Valor limite 1.
		String combinacionJugador00 = "00";													// Valor limite 2.
		String combinacionJugador000 = "000";												// Valor limite 3.
		String combinacionJugador00000 = "00000";											// Valor limite 5.
		String combinacionJugador50 = "00000000000000000000000000000000000000000000000000"; // Valor limite 50.
		
		//if((Y < '0') || (Y > '8'))
		String combinacionJugador4629 = "4629";												// Valor limite 9.
		String combinacionJugador9462 = "9462";												// Valor limite 9.
		String combinacionJugador4962 = "4962";												// Valor limite 9.
		String combinacionJugador4692 = "4692";												// Valor limite 9.
		String combinacionJugador12R3 = "12-3";												// Valor limite -
		String combinacionJugador12R34 = "12-34";											// Valor limite -
		
		//Ambos casos
		String combinacionJugador9 = "9";													// Valor limite 1 y valor limite 9.
		String combinacionJugador96 = "96";													// Valor limite 2 y valor limite 9.
		String combinacionJugador969 = "969";												// Valor limite 3 y valor limite 9.
		String combinacionJugador96999 = "96999";											// Valor limite 5 y valor limite 9.
		
		String combinacionJugador96250 = "96250";											// Valor limite 5 y valor limite 9.
		String combinacionJugador90462 = "90462";											// Valor limite 5 y valor limite 9.
		String combinacionJugador95062 = "95062";											// Valor limite 5 y valor limite 9.
		String combinacionJugador96502 = "96502";											// Valor limite 5 y valor limite 9.
		
		char[] entradaCasteada0 = modelo.castearEntradaJugador(combinacionJugador0);
		char[] entradaCasteada00 = modelo.castearEntradaJugador(combinacionJugador00);
		char[] entradaCasteadaNULL = modelo.castearEntradaJugador(combinacionJugadorNULL);
		char[] entradaCasteadaEspacio = modelo.castearEntradaJugador(combinacionJugadorEspacio);
		char[] entradaCasteada000 = modelo.castearEntradaJugador(combinacionJugador000);
		char[] entradaCasteada00000 = modelo.castearEntradaJugador(combinacionJugador00000);
		char[] entradaCasteada50 = modelo.castearEntradaJugador(combinacionJugador50);
		
		char[] combinacionCasteada4629 = modelo.castearEntradaJugador(combinacionJugador4629);
		char[] combinacionCasteada9462 = modelo.castearEntradaJugador(combinacionJugador9462);
		char[] combinacionCasteada4962 = modelo.castearEntradaJugador(combinacionJugador4962);
		char[] combinacionCasteada4692 = modelo.castearEntradaJugador(combinacionJugador4692);
		char[] entradaCasteada12R3 = modelo.castearEntradaJugador(combinacionJugador12R3);
		char[] entradaCasteada12R34 = modelo.castearEntradaJugador(combinacionJugador12R34);
		
		char[] combinacionCasteada9 = modelo.castearEntradaJugador(combinacionJugador9);
		char[] combinacionCasteada96 = modelo.castearEntradaJugador(combinacionJugador96);
		char[] combinacionCasteada969 = modelo.castearEntradaJugador(combinacionJugador969);
		char[] combinacionCasteada96999 = modelo.castearEntradaJugador(combinacionJugador96999);
		
		char[] combinacionCasteada96250 = modelo.castearEntradaJugador(combinacionJugador96250);
		char[] combinacionCasteada90462 = modelo.castearEntradaJugador(combinacionJugador90462);
		char[] combinacionCasteada95062 = modelo.castearEntradaJugador(combinacionJugador95062);
		char[] combinacionCasteada96502 = modelo.castearEntradaJugador(combinacionJugador96502);
		
		assertFalse(Modelo.validarEntradaJugador(entradaCasteada0));
		assertFalse(Modelo.validarEntradaJugador(entradaCasteada00));
		assertFalse(Modelo.validarEntradaJugador(entradaCasteada000));
		assertFalse(Modelo.validarEntradaJugador(entradaCasteada00000));
		assertFalse(Modelo.validarEntradaJugador(entradaCasteadaNULL));
		assertFalse(Modelo.validarEntradaJugador(entradaCasteadaEspacio));
		assertFalse(Modelo.validarEntradaJugador(entradaCasteada50));
		
		assertFalse(Modelo.validarEntradaJugador(entradaCasteada12R3));
		assertFalse(Modelo.validarEntradaJugador(entradaCasteada12R34));
		assertFalse(Modelo.validarEntradaJugador(combinacionCasteada4629));
		assertFalse(Modelo.validarEntradaJugador(combinacionCasteada9462));
		assertFalse(Modelo.validarEntradaJugador(combinacionCasteada4962));
		assertFalse(Modelo.validarEntradaJugador(combinacionCasteada4692));
		
		assertFalse(Modelo.validarEntradaJugador(combinacionCasteada9));
		assertFalse(Modelo.validarEntradaJugador(combinacionCasteada96));
		assertFalse(Modelo.validarEntradaJugador(combinacionCasteada969));
		assertFalse(Modelo.validarEntradaJugador(combinacionCasteada96999));
		
		assertFalse(Modelo.validarEntradaJugador(combinacionCasteada96250));
		assertFalse(Modelo.validarEntradaJugador(combinacionCasteada90462));
		assertFalse(Modelo.validarEntradaJugador(combinacionCasteada95062));
		assertFalse(Modelo.validarEntradaJugador(combinacionCasteada96502));
	}
	
	/**
	 * --------------- Test del metodo validarCombinacionSecreta() ---------------
	 * Comprueba el correcto funcionamiento de la funcion generarCombinacionSecreta, 
	 * verificando si realmente no se repite ningun numero dentro de la combinacion secreta.
	 */
	@Test
	public void testValidarCombinacionSecreta() {
		///////////////////////////////////////////////////////////////////////////////////// Particion equivalente valida.
		//if(X[i] != X[j])
		char[] combinacionSecretaCasteadaValida = Modelo.generarCombinacionSecreta(numeros); // Siempre sera valida.
		char[] combinacionSecretaCasteada0123 = {'0','1','2','3'};
		char[] combinacionSecretaCasteada3210 = {'3','2','1','0'};
		char[] combinacionSecretaCasteada5678 = {'5','6','7','8'};
		char[] combinacionSecretaCasteada8765 = {'8','7','6','5'};
		char[] combinacionSecretaCasteada1357 = {'1','3','5','7'};
		char[] combinacionSecretaCasteada7531 = {'7','5','3','1'};
		
		assertTrue(modelo.validarCombinacionSecreta(combinacionSecretaCasteadaValida));
		assertTrue(modelo.validarCombinacionSecreta(combinacionSecretaCasteada0123));
		assertTrue(modelo.validarCombinacionSecreta(combinacionSecretaCasteada3210));
		assertTrue(modelo.validarCombinacionSecreta(combinacionSecretaCasteada5678));
		assertTrue(modelo.validarCombinacionSecreta(combinacionSecretaCasteada8765));
		assertTrue(modelo.validarCombinacionSecreta(combinacionSecretaCasteada1357));
		assertTrue(modelo.validarCombinacionSecreta(combinacionSecretaCasteada7531));
		
		///////////////////////////////////////////////////////////////////////////////////// Particion equivalente invalida.
		//if(X[i] == X[j])
		char[] combinacionSecretaCasteada0113 = {'0','1','1','3'}; // 1==1.
		char[] combinacionSecretaCasteada3320 = {'3','3','2','0'}; // 3==3.
		char[] combinacionSecretaCasteada5668 = {'5','6','6','8'}; // 6==6.
		char[] combinacionSecretaCasteada8755 = {'8','7','5','5'}; // 5==5.
		char[] combinacionSecretaCasteada0083 = {'0','0','8','3'}; // 0==0.
		char[] combinacionSecretaCasteada8428 = {'8','4','2','8'}; // 8==8.
		
		assertFalse(modelo.validarCombinacionSecreta(combinacionSecretaCasteada0113));
		assertFalse(modelo.validarCombinacionSecreta(combinacionSecretaCasteada3320));
		assertFalse(modelo.validarCombinacionSecreta(combinacionSecretaCasteada5668));
		assertFalse(modelo.validarCombinacionSecreta(combinacionSecretaCasteada8755));
		assertFalse(modelo.validarCombinacionSecreta(combinacionSecretaCasteada0083));
		assertFalse(modelo.validarCombinacionSecreta(combinacionSecretaCasteada8428));
	}
	
	/**
	 * --------------- Test del metodo compararCombinaciones ---------------
	 * Comprueba que en funcion secreta y una combinacion del jugador simuladas devuelva el array
	 * de aciertos que se espera.
	 */
	@Test
	public void testCompararCombinaciones() {
		//////////////////////////////////////////////////////////////////////////////////////////////////////// Particiones equivalentes validas (no hay invalidas)
		char[] combinacionSecreta2357 = {'2', '3', '5', '7'};
		char[] combinacionJugador2357 = {'2', '3', '5', '7'};
		char[] aciertosComparativa2357X2357 = Modelo.compararCombinaciones(combinacionSecreta2357, combinacionJugador2357);
		char[] aciertosEsperadosNNNN = {'N', 'N', 'N', 'N'};
		
		char[] combinacionSecreta2367 = {'2', '3', '6', '7'};
		char[] combinacionJugador3276 = {'3', '2', '7', '6'};
		char[] aciertosComparativa2367X3276 = Modelo.compararCombinaciones(combinacionSecreta2367, combinacionJugador3276);
		char[] aciertosEsperadosBBBB = {'B', 'B', 'B', 'B'};
		
		char[] combinacionSecreta2356 = {'2', '3', '5', '6'};
		char[] combinacionJugador1234 = {'1', '2', '3', '4'};
		char[] aciertosComparativa2356X1234 = Modelo.compararCombinaciones(combinacionSecreta2356, combinacionJugador1234);
		char[] aciertosEsperados0BB0 = {'0', 'B', 'B', '0'};
		
		char[] combinacionSecreta8740 = {'8', '7', '4', '0'};
		char[] combinacionJugador1235 = {'1', '2', '3', '5'};
		char[] aciertosComparativa8740X1235 = Modelo.compararCombinaciones(combinacionSecreta8740, combinacionJugador1235);
		char[] aciertosEsperados0000 = {'0', '0', '0', '0'};
		
		char[] combinacionSecreta7856 = {'7', '8', '5', '6'};
		char[] combinacionJugador7236 = {'7', '2', '3', '6'};
		char[] aciertosComparativa7856X7236 = Modelo.compararCombinaciones(combinacionSecreta7856, combinacionJugador7236);
		char[] aciertosEsperadosN00N = {'N', '0', '0', 'N'};
		
		char[] combinacionSecreta4207 = {'4', '2', '0', '7'};
		char[] combinacionJugador4082 = {'4', '0', '8', '2'};
		char[] aciertosComparativa4207X4082 = Modelo.compararCombinaciones(combinacionSecreta4207, combinacionJugador4082);
		char[] aciertosEsperadosNBB0 = {'N', 'B', '0', 'B'};
		
		char[] combinacionSecreta0351 = {'0', '3', '5', '1'};
		char[] combinacionJugador0531 = {'0', '5', '3', '1'};
		char[] aciertosComparativa0351X0531 = Modelo.compararCombinaciones(combinacionSecreta0351, combinacionJugador0531);
		char[] aciertosEsperadosNBBN = {'N', 'B', 'B', 'N'};
		
		assertArrayEquals(aciertosEsperadosNNNN, aciertosComparativa2357X2357);
		assertArrayEquals(aciertosEsperadosBBBB, aciertosComparativa2367X3276);
		assertArrayEquals(aciertosEsperados0BB0, aciertosComparativa2356X1234);
		assertArrayEquals(aciertosEsperados0000, aciertosComparativa8740X1235);
		assertArrayEquals(aciertosEsperadosN00N, aciertosComparativa7856X7236);
		assertArrayEquals(aciertosEsperadosNBB0, aciertosComparativa4207X4082);
		assertArrayEquals(aciertosEsperadosNBBN, aciertosComparativa0351X0531);
	}
	
	/**
	 * --------------- Test del metodo comprobarVictoria ---------------
	 * Comprueba todas las combinaciones posibles de 0, B y N en un array de 4 posiciones. 
	 * 
	 * https://pairwise.teremokgames.com/x4to/
	 * 
	 * La unica vez que el assert es true es cuando el array es {'N','N','N','N'}.
	 */
	@Test
	public void testComprobarVictoriaTodasCombinaciones() {
		
		char[] aciertos0000 = {'0','0','0','0'};
		char[] aciertos000B = {'0','0','0','B'};
		char[] aciertos000N = {'0','0','0','N'};
		char[] aciertos00B0 = {'0','0','B','0'};
		char[] aciertos00BB = {'0','0','B','B'};
		char[] aciertos00BN = {'0','0','B','N'};
		char[] aciertos00N0 = {'0','0','N','0'};
		char[] aciertos00NB = {'0','0','N','B'};
		char[] aciertos00NN = {'0','0','N','N'};
		char[] aciertos0B00 = {'0','B','0','0'};
		char[] aciertos0B0B = {'0','B','0','B'};
		char[] aciertos0B0N = {'0','B','0','N'};
		char[] aciertos0BB0 = {'0','B','B','0'};
		char[] aciertos0BBB = {'0','B','B','B'};
		char[] aciertos0BBN = {'0','B','B','N'};
		char[] aciertos0BN0 = {'0','B','N','0'};
		char[] aciertos0BNB = {'0','B','N','B'};
		char[] aciertos0BNN = {'0','B','N','N'};
		char[] aciertos0N00 = {'0','N','0','0'};
		char[] aciertos0N0B = {'0','N','0','B'};
		char[] aciertos0N0N = {'0','N','0','N'};
		char[] aciertos0NB0 = {'0','N','B','0'};
		char[] aciertos0NBB = {'0','N','B','B'};
		char[] aciertos0NBN = {'0','N','B','N'};
		char[] aciertos0NN0 = {'0','N','N','0'};
		char[] aciertos0NNB = {'0','N','N','B'};
		char[] aciertos0NNN = {'0','N','N','N'};
		char[] aciertosB000 = {'B','0','0','0'};
		char[] aciertosB00B = {'B','0','0','B'};
		char[] aciertosB00N = {'B','0','0','N'};
		char[] aciertosB0B0 = {'B','0','B','0'};
		char[] aciertosB0BB = {'B','0','B','B'};
		char[] aciertosB0BN = {'B','0','B','N'};
		char[] aciertosB0N0 = {'B','0','N','0'};
		char[] aciertosB0NB = {'B','0','N','B'};
		char[] aciertosB0NN = {'B','0','N','N'};
		char[] aciertosBB00 = {'B','B','0','0'};
		char[] aciertosBB0B = {'B','B','0','B'};
		char[] aciertosBB0N = {'B','B','0','N'};
		char[] aciertosBBB0 = {'B','B','B','0'};
		char[] aciertosBBBB = {'B','B','B','B'};
		char[] aciertosBBBN = {'B','B','B','N'};
		char[] aciertosBBN0 = {'B','B','N','0'};
		char[] aciertosBBNB = {'B','B','N','B'};
		char[] aciertosBBNN = {'B','B','N','N'};
		char[] aciertosBN00 = {'B','N','0','0'};
		char[] aciertosBN0B = {'B','N','0','B'};
		char[] aciertosBN0N = {'B','N','0','N'};
		char[] aciertosBNB0 = {'B','N','B','0'};
		char[] aciertosBNBB = {'B','N','B','B'};
		char[] aciertosBNBN = {'B','N','B','N'};
		char[] aciertosBNN0 = {'B','N','N','0'};
		char[] aciertosBNNB = {'B','N','N','B'};
		char[] aciertosBNNN = {'B','N','N','N'};
		char[] aciertosN000 = {'N','0','0','0'};
		char[] aciertosN00B = {'N','0','0','B'};
		char[] aciertosN00N = {'N','0','0','N'};
		char[] aciertosN0B0 = {'N','0','B','0'};
		char[] aciertosN0BB = {'N','0','B','B'};
		char[] aciertosN0BN = {'N','0','B','N'};
		char[] aciertosN0N0 = {'N','0','N','0'};
		char[] aciertosN0NB = {'N','0','N','B'};
		char[] aciertosN0NN = {'N','0','N','N'};
		char[] aciertosNB00 = {'N','B','0','0'};
		char[] aciertosNB0B = {'N','B','0','B'};
		char[] aciertosNB0N = {'N','B','0','N'};
		char[] aciertosNBB0 = {'N','B','B','0'};
		char[] aciertosNBBB = {'N','B','B','B'};
		char[] aciertosNBBN = {'N','B','B','N'};
		char[] aciertosNBN0 = {'N','B','N','0'};
		char[] aciertosNBNB = {'N','B','N','B'};
		char[] aciertosNBNN = {'N','B','N','N'};
		char[] aciertosNN00 = {'N','N','0','0'};
		char[] aciertosNN0B = {'N','N','0','B'};
		char[] aciertosNN0N = {'N','N','0','N'};
		char[] aciertosNNB0 = {'N','N','B','0'};
		char[] aciertosNNBB = {'N','N','B','B'};
		char[] aciertosNNBN = {'N','N','B','N'};
		char[] aciertosNNN0 = {'N','N','N','0'};
		char[] aciertosNNNB = {'N','N','N','B'};
		char[] aciertosNNNN = {'N','N','N','N'};

		assertFalse(Modelo.comprobarVictoria(aciertos0000));
		assertFalse(Modelo.comprobarVictoria(aciertos000B));
		assertFalse(Modelo.comprobarVictoria(aciertos000N));
		assertFalse(Modelo.comprobarVictoria(aciertos00B0));
		assertFalse(Modelo.comprobarVictoria(aciertos00BB));
		assertFalse(Modelo.comprobarVictoria(aciertos00BN));
		assertFalse(Modelo.comprobarVictoria(aciertos00N0));
		assertFalse(Modelo.comprobarVictoria(aciertos00NB));
		assertFalse(Modelo.comprobarVictoria(aciertos00NN));
		assertFalse(Modelo.comprobarVictoria(aciertos0B00));
		assertFalse(Modelo.comprobarVictoria(aciertos0B0B));
		assertFalse(Modelo.comprobarVictoria(aciertos0B0N));
		assertFalse(Modelo.comprobarVictoria(aciertos0BB0));
		assertFalse(Modelo.comprobarVictoria(aciertos0BBB));
		assertFalse(Modelo.comprobarVictoria(aciertos0BBN));
		assertFalse(Modelo.comprobarVictoria(aciertos0BN0));
		assertFalse(Modelo.comprobarVictoria(aciertos0BNB));
		assertFalse(Modelo.comprobarVictoria(aciertos0BNN));
		assertFalse(Modelo.comprobarVictoria(aciertos0N00));
		assertFalse(Modelo.comprobarVictoria(aciertos0N0B));
		assertFalse(Modelo.comprobarVictoria(aciertos0N0N));
		assertFalse(Modelo.comprobarVictoria(aciertos0NB0));
		assertFalse(Modelo.comprobarVictoria(aciertos0NBB));
		assertFalse(Modelo.comprobarVictoria(aciertos0NBN));
		assertFalse(Modelo.comprobarVictoria(aciertos0NN0));
		assertFalse(Modelo.comprobarVictoria(aciertos0NNB));
		assertFalse(Modelo.comprobarVictoria(aciertos0NNN));
		assertFalse(Modelo.comprobarVictoria(aciertosB000));
		assertFalse(Modelo.comprobarVictoria(aciertosB00B));
		assertFalse(Modelo.comprobarVictoria(aciertosB00N));
		assertFalse(Modelo.comprobarVictoria(aciertosB0B0));
		assertFalse(Modelo.comprobarVictoria(aciertosB0BB));
		assertFalse(Modelo.comprobarVictoria(aciertosB0BN));
		assertFalse(Modelo.comprobarVictoria(aciertosB0N0));
		assertFalse(Modelo.comprobarVictoria(aciertosB0NB));
		assertFalse(Modelo.comprobarVictoria(aciertosB0NN));
		assertFalse(Modelo.comprobarVictoria(aciertosBB00));
		assertFalse(Modelo.comprobarVictoria(aciertosBB0B));
		assertFalse(Modelo.comprobarVictoria(aciertosBB0N));
		assertFalse(Modelo.comprobarVictoria(aciertosBBB0));
		assertFalse(Modelo.comprobarVictoria(aciertosBBBB));
		assertFalse(Modelo.comprobarVictoria(aciertosBBBN));
		assertFalse(Modelo.comprobarVictoria(aciertosBBN0));
		assertFalse(Modelo.comprobarVictoria(aciertosBBNB));
		assertFalse(Modelo.comprobarVictoria(aciertosBBNN));
		assertFalse(Modelo.comprobarVictoria(aciertosBN00));
		assertFalse(Modelo.comprobarVictoria(aciertosBN0B));
		assertFalse(Modelo.comprobarVictoria(aciertosBN0N));
		assertFalse(Modelo.comprobarVictoria(aciertosBNB0));
		assertFalse(Modelo.comprobarVictoria(aciertosBNBB));
		assertFalse(Modelo.comprobarVictoria(aciertosBNBN));
		assertFalse(Modelo.comprobarVictoria(aciertosBNN0));
		assertFalse(Modelo.comprobarVictoria(aciertosBNNB));
		assertFalse(Modelo.comprobarVictoria(aciertosBNNN));
		assertFalse(Modelo.comprobarVictoria(aciertosN000));
		assertFalse(Modelo.comprobarVictoria(aciertosN00B));
		assertFalse(Modelo.comprobarVictoria(aciertosN00N));
		assertFalse(Modelo.comprobarVictoria(aciertosN0B0));
		assertFalse(Modelo.comprobarVictoria(aciertosN0BB));
		assertFalse(Modelo.comprobarVictoria(aciertosN0BN));
		assertFalse(Modelo.comprobarVictoria(aciertosN0N0));
		assertFalse(Modelo.comprobarVictoria(aciertosN0NB));
		assertFalse(Modelo.comprobarVictoria(aciertosN0NN));
		assertFalse(Modelo.comprobarVictoria(aciertosNB00));
		assertFalse(Modelo.comprobarVictoria(aciertosNB0B));
		assertFalse(Modelo.comprobarVictoria(aciertosNB0N));
		assertFalse(Modelo.comprobarVictoria(aciertosNBB0));
		assertFalse(Modelo.comprobarVictoria(aciertosNBBB));
		assertFalse(Modelo.comprobarVictoria(aciertosNBBN));
		assertFalse(Modelo.comprobarVictoria(aciertosNBN0));
		assertFalse(Modelo.comprobarVictoria(aciertosNBNB));
		assertFalse(Modelo.comprobarVictoria(aciertosNBNN));
		assertFalse(Modelo.comprobarVictoria(aciertosNN00));
		assertFalse(Modelo.comprobarVictoria(aciertosNN0B));
		assertFalse(Modelo.comprobarVictoria(aciertosNN0N));
		assertFalse(Modelo.comprobarVictoria(aciertosNNB0));
		assertFalse(Modelo.comprobarVictoria(aciertosNNBB));
		assertFalse(Modelo.comprobarVictoria(aciertosNNBN));
		assertFalse(Modelo.comprobarVictoria(aciertosNNN0));
		assertFalse(Modelo.comprobarVictoria(aciertosNNNB));
		assertTrue(Modelo.comprobarVictoria(aciertosNNNN));		
	}
	
	/**
	 * --------------- Test del metodo comprobarVictoria ---------------
	 * Comprueba todas las combinaciones posibles de: 
	 * - 0, B y N en un array de 4 posiciones | https://pairwise.teremokgames.com/x4to/
	 * - 0 y B en un array de 4 posiciones    | https://pairwise.teremokgames.com/x4wg/
	 * - 0 y N en un array de 4 posiciones    | https://pairwise.teremokgames.com/x520/
	 * - B y N en un array de 4 posiciones    | https://pairwise.teremokgames.com/x4z8/
	 * 
	 * Todo ello usando pair-wise testing. 
	 * La unica vez que el assert es true es cuando el array es {'N','N','N','N'}.
	 */
	@Test
	public void comprobarVictoriaPairWise() {
		
		// Pair-wise testing de los posibles valores 0, B y N.
		char[] aciertosNNNN = {'N','N','N','N'};
		char[] aciertosN000 = {'N','0','0','0'};
		char[] aciertosNBBB = {'N','B','B','B'};
		char[] aciertos00BN = {'0','0','B','N'};
		char[] aciertos0BN0 = {'0','B','N','0'};
		char[] aciertos0N0B = {'0','N','0','B'};
		char[] aciertosBB0N = {'B','B','0','N'};
		char[] aciertosBNB0 = {'B','N','B','0'};
		char[] aciertosB0NB = {'B','0','N','B'};

		assertTrue(Modelo.comprobarVictoria(aciertosNNNN));
		assertFalse(Modelo.comprobarVictoria(aciertosN000));
		assertFalse(Modelo.comprobarVictoria(aciertosNBBB));
		assertFalse(Modelo.comprobarVictoria(aciertos00BN));
		assertFalse(Modelo.comprobarVictoria(aciertos0BN0));
		assertFalse(Modelo.comprobarVictoria(aciertos0N0B));
		assertFalse(Modelo.comprobarVictoria(aciertosBB0N));
		assertFalse(Modelo.comprobarVictoria(aciertosBNB0));
		assertFalse(Modelo.comprobarVictoria(aciertosB0NB));
		
		// Pair-wise testing de los valores 0 y B.
		char[] aciertos0BBB = {'0','B','B','B'};
		char[] aciertosBB00 = {'B','B','0','0'};
		char[] aciertosB00B = {'B','0','0','B'};
		char[] aciertosB0B0 = {'B','0','B','0'};
		char[] aciertos00B0 = {'0','0','B','0'};
		char[] aciertos000B = {'0','0','0','B'};
		char[] aciertos0B00 = {'0','B','0','0'};

		assertFalse(Modelo.comprobarVictoria(aciertos0BBB));
		assertFalse(Modelo.comprobarVictoria(aciertosBB00));
		assertFalse(Modelo.comprobarVictoria(aciertosB00B));
		assertFalse(Modelo.comprobarVictoria(aciertosB0B0));
		assertFalse(Modelo.comprobarVictoria(aciertos00B0));
		assertFalse(Modelo.comprobarVictoria(aciertos000B));
		assertFalse(Modelo.comprobarVictoria(aciertos0B00));
		
		// Pair-wise testing de los valores 0 y N.
		char[] aciertos0NNN = {'0','N','N','N'};
		char[] aciertosNN00 = {'N','N','0','0'};
		char[] aciertosN00N = {'N','0','0','N'};
		char[] aciertosN0N0 = {'N','0','N','0'};
		char[] aciertos00N0 = {'0','0','N','0'};
		char[] aciertos000N = {'0','0','0','N'};
		char[] aciertos0N00 = {'0','N','0','0'};

		assertFalse(Modelo.comprobarVictoria(aciertos0NNN));
		assertFalse(Modelo.comprobarVictoria(aciertosNN00));
		assertFalse(Modelo.comprobarVictoria(aciertosN00N));
		assertFalse(Modelo.comprobarVictoria(aciertosN0N0));
		assertFalse(Modelo.comprobarVictoria(aciertos00N0));
		assertFalse(Modelo.comprobarVictoria(aciertos000N));
		assertFalse(Modelo.comprobarVictoria(aciertos0N00));
		
		// Pair-wise testing de los valores B y N.
		char[] aciertosBNNN = {'B','N','N','N'};
		char[] aciertosNNBB = {'N','N','B','B'};
		char[] aciertosNBBN = {'N','B','B','N'};
		char[] aciertosNBNB = {'N','B','N','B'};
		char[] aciertosBBNB = {'B','B','N','B'};
		char[] aciertosBBBN = {'B','B','B','N'};
		char[] aciertosBNBB = {'B','N','B','B'};

		assertFalse(Modelo.comprobarVictoria(aciertosBNNN));
		assertFalse(Modelo.comprobarVictoria(aciertosNNBB));
		assertFalse(Modelo.comprobarVictoria(aciertosNBBN));
		assertFalse(Modelo.comprobarVictoria(aciertosNBNB));
		assertFalse(Modelo.comprobarVictoria(aciertosBBNB));
		assertFalse(Modelo.comprobarVictoria(aciertosBBBN));
		assertFalse(Modelo.comprobarVictoria(aciertosBNBB));
	}
}
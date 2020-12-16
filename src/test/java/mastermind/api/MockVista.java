package mastermind.api;

import mastermind.api.view.Vista;

public class MockVista extends Vista {

    private boolean GameWon = false;
    private boolean LostGame = false;

    private char[] resultadosEntradaJugador = null;
    private int vecesJugado = -1;
    private char[] aciertos = {'0'};
    

    @Override
    public String mostrarJugada(char[] resultadoEntradaJugador, int vecesJugado, char[] aciertos) {
        this.resultadosEntradaJugador = resultadoEntradaJugador;
        this.vecesJugado = vecesJugado;
        this.aciertos = aciertos;
        return super.mostrarJugada(resultadoEntradaJugador, vecesJugado, aciertos);
    }

    @Override
    public String mostrarMensajeDerrota(char[] combinacionSecreta) {
        this.LostGame = true;
        return super.mostrarMensajeDerrota(combinacionSecreta);
    }

    @Override
    public String mostrarMensajeDespedida() {
        // TODO Auto-generated method stub
        return super.mostrarMensajeDespedida();
    }

    @Override
    public String mostrarMensajeVictoria(char[] resultadoEntradaJugador) {
        GameWon = true;
        return super.mostrarMensajeVictoria(resultadoEntradaJugador);
    }

    @Override
    public String mostrarMenu() {
        // TODO Auto-generated method stub
        return super.mostrarMenu();
    }

    @Override
    public String mostrarOpcionInvalida() {
        // TODO Auto-generated method stub
        return super.mostrarOpcionInvalida();
    }

    @Override
    public String solicitarCombinacion() {
        // TODO Auto-generated method stub
        return super.solicitarCombinacion();
    }

    public boolean isGameWon() {
        return GameWon;
    }

    public boolean isLostGame() {
        return LostGame;
    }

    public char[] getResultadosEntradaJugador() {
        return resultadosEntradaJugador;
    }


    public int getVecesJugado() {
        return vecesJugado;
    }

    public char[] getAciertos() {
        return aciertos;
    }


    
}

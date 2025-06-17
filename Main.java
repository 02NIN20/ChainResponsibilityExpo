public class Main {
    public static void main(String[] args) {
        Ataque ataque = new Ataque(Ataque.TipoDaño.FUEGO, 50);
        
        Defensa electricidad = new ResistenciaElectricidad(20, 10);
        Defensa hielo = new ResistenciaHielo(25, 15);
        Defensa fuego = new ResistenciaFuego(15);
        Defensa escudo = new Escudo(50);
        Defensa vida = new PuntosDeVida(100);

        electricidad.setSiguiente(hielo);
        hielo.setSiguiente(fuego);
        fuego.setSiguiente(escudo);
        escudo.setSiguiente(vida);

        electricidad.procesar(ataque);
    }
}

public class PuntosDeVida extends DefensaBase{
    private int vida;

    public PuntosDeVida(int vida) {
    this.vida = vida;
    }

    @Override
    public void procesar(Ataque ataque) {
        int daño = ataque.getDaño();
        vida -= daño;
        System.out.println("Puntos de vida afectados: -" + daño + " (vida restante: " + vida + ")");
    }
}

public class ResistenciaFuego extends DefensaBase {
    private final int reduccion;

    public ResistenciaFuego(int reduccion) {
    this.reduccion = reduccion;
    }

    @Override
    public void procesar(Ataque ataque) {
        if (ataque.getTipo() == Ataque.TipoDaño.FUEGO) {
            ataque.reducirDaño(reduccion);
            System.out.println("ResistenciaFuego absorbió " + reduccion + " de daño.");
        }
        super.procesar(ataque);
    }
}

public class ResistenciaHielo extends DefensaBase {
    private final int reduccion;
    private final int estamina;

    public ResistenciaHielo(int reduccion, int estamina) {
    this.reduccion = reduccion;
    this.estamina = estamina;
    }

    @Override
    public void procesar(Ataque ataque) {
        if (ataque.getTipo() == Ataque.TipoDaño.HIELO) {
            ataque.reducirDaño(reduccion);
            System.out.println("❄️ ResistenciaHielo absorbió " + reduccion + " de daño. -" + estamina + " de estamina");
        }
        super.procesar(ataque);
    }
}

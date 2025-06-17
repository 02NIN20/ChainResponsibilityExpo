public class ResistenciaElectricidad extends DefensaBase{
    private final int reduccion;
    private final int mana;

    public ResistenciaElectricidad(int reduccion, int mana) {
    this.reduccion = reduccion;
    this.mana = mana;
    }

    @Override
    public void procesar(Ataque ataque) {
        if (ataque.getTipo() == Ataque.TipoDaño.ELECTRICIDAD) {
            ataque.reducirDaño(reduccion);
            System.out.println("⚡ ResistenciaElectricidad absorbió " + reduccion + " de daño. -" + mana + " de maná");
        }
        super.procesar(ataque);
    }
}

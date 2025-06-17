public class Escudo extends DefensaBase {
    
    private int capacidad;

    public Escudo(int capacidad) {
    this.capacidad = capacidad;
    }

    @Override
    public void procesar(Ataque ataque) {
        int absorbido = Math.min(capacidad, ataque.getDaño());
        capacidad -= absorbido;
        ataque.reducirDaño(absorbido);
        System.out.println("Escudo absorbió " + absorbido + " de daño restante (capacidad restante: " + capacidad + ")");
        super.procesar(ataque);
    }
}

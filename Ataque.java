public class Ataque {

    
    public enum TipoDaño { ELECTRICIDAD, HIELO, FUEGO }

    private TipoDaño tipo;
    private int daño;

    public Ataque(TipoDaño tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
    }

    public TipoDaño getTipo() {
        return tipo;
    }

    public int getDaño() {
        return daño;
    }

    public void reducirDaño(int cantidad) {
        this.daño = Math.max(0, this.daño - cantidad);
    }

    public boolean estaNeutralizado() {
        return this.daño == 0;
    }
}

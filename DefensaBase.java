abstract class DefensaBase implements Defensa {
    
    protected Defensa siguiente;

    @Override
    public void setSiguiente(Defensa siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void procesar(Ataque ataque) {
        if (siguiente != null && !ataque.estaNeutralizado()) {
            siguiente.procesar(ataque);
        }
    }
}

public class Ship {
    private final double draft;
    private final int crew;

    public Ship(double draft, int crew){
        this.draft = draft;
        this.crew = crew;
    }
    public boolean isWorthIt() {
        //Al usar los objetos draft y crew que se refieren al peso del barco y peso de la tripulacion
        //puedo hacer la operacion de peso de barco - peso de tripulacion * 1,5 que son las unidades que pesa cada tripulante
        //Una vez hecho esto si el barco sigue pesando mas de 20 unidades es valido para robar.
        return this.draft-(this.crew * 1.5) > 20;
    }
}
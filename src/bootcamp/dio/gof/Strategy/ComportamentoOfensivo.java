package bootcamp.dio.gof.Strategy;

public class ComportamentoOfensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movimento Ofensivo");
    }

}

package bootcamp.dio.gof.Strategy;

public class Test {

    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNorma();
        Comportamento ofensivo = new ComportamentoOfensivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

    }
}

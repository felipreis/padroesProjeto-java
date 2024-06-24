package bootcamp.dio.gof.Strategy;

public class ComportamentoNorma implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente");
    }

}

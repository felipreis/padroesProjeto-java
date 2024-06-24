package bootcamp.dio.gof.subsistema2;



public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    };

    public static CepApi getInstancia(){
        return instancia;
    };

    public String recupercarCidade(String cep){
        return "Araraquara";
    }

    public String recupercarEstado(String cep){
        return "São Paulo";
    }
}


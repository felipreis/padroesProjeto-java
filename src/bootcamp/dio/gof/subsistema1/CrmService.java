package bootcamp.dio.gof.subsistema1;

public class CrmService {

    private CrmService(){
        super();
    };
    public static void gravarCliente(String nome, String cep,String cidade, String estado){
        System.out.println("Cliente salvo no sistema de CRM");
    }
}

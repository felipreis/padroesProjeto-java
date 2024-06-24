package bootcamp.dio.gof.Facade;

import bootcamp.dio.gof.subsistema1.CrmService;
import bootcamp.dio.gof.subsistema2.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recupercarCidade(cep);
        String estado = CepApi.getInstancia().recupercarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}

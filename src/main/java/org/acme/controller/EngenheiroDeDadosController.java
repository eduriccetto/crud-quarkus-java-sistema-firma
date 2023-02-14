package org.acme.controller;

import org.acme.modal.Desenvolvedor;
import org.acme.modal.EngenheiroDeDados;
import org.acme.service.DesenvolvedorService;
import org.acme.service.EngenheiroDeDadosService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Path("/engenheiroDeDados") // Path diz o endereço de URL que vamos utilizar para acessar
// os métodos desta classe.
public class EngenheiroDeDadosController {

    @Inject
    EngenheiroDeDadosService service;

    @GET // método de consulta
    public List<EngenheiroDeDados> listEngenheiroDeDados(){
        List<EngenheiroDeDados> devList = new ArrayList<>();
        devList =  service.findAllEng();
        return devList;
    }

    @POST // método de cadastrar
    @Transactional // Serve para permitir que possamos salvar ou editar (modificar) no DB.
    // Pode estar aqui ou no método "addDev".
    public void addEngenheiroDeDados(EngenheiroDeDados engenheiroDeDados){
        service.addEng(engenheiroDeDados);
    }

}

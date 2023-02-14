package org.acme.controller;

import org.acme.modal.Desenvolvedor;
import org.acme.service.DesenvolvedorService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Path("/desenvolvedor") // Path diz o endereço de URL que vamos utilizar para acessar
// os métodos desta classe.
public class DesenvolvedorController {

    @Inject
    DesenvolvedorService service;

    @GET // método de consulta
    public List<Desenvolvedor> listDesenvolvedor(){
        List<Desenvolvedor> devList = new ArrayList<>();
        devList =  service.findAllDev();
        return devList;
    }

    @POST // método de cadastrar
    @Transactional // Serve para permitir que possamos salvar ou editar (modificar) no DB.
    // Pode estar aqui ou no método "addDev".
    public void addDesenvolvedor(Desenvolvedor desenvolvedor){
        service.addDev(desenvolvedor);
    }

}

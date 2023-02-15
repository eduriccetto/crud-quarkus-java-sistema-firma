package org.acme.controller;

import org.acme.modal.Administrador;
import org.acme.service.AdministradorService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

@Path("/administrador")
public class AdministradorController {

    @Inject
    AdministradorService service;

    @GET
    public List<Administrador> listAllAdm(){
        List<Administrador> list = service.listAllAdm();
        return list;
    }

    @POST
    @Transactional
    public void addAdm(Administrador administrador){
        service.addAdm(administrador);
    }

}

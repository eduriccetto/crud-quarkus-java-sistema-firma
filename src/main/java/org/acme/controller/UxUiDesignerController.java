package org.acme.controller;

import org.acme.modal.Desenvolvedor;
import org.acme.modal.UxUiDesigner;
import org.acme.service.DesenvolvedorService;
import org.acme.service.UxUiDesignerService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Path("/UxUiDesigner") // Path diz o endereço de URL que vamos utilizar para acessar
// os métodos desta classe.
public class UxUiDesignerController {

    @Inject
    UxUiDesignerService service;

    @GET // método de consulta
    public List<UxUiDesigner> listUxUiDesigner(){
        List<UxUiDesigner> devList = new ArrayList<>();
        devList =  service.findAllUxUi();
        return devList;
    }

    @POST // método de cadastrar
    @Transactional // Serve para permitir que possamos salvar ou editar (modificar) no DB.
    // Pode estar aqui ou no método "addDev".
    public void addUxUiDesigner(UxUiDesigner uxUiDesigner){
        service.addUxUi(uxUiDesigner);
    }

}

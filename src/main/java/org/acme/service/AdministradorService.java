package org.acme.service;

import org.acme.modal.Administrador;
import org.acme.repository.AdministradorRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class AdministradorService {

    @Inject
    AdministradorRepository repository;

    public AdministradorService(AdministradorRepository repository) { this.repository = repository; }

    public List<Administrador> listAllAdm(){
        return repository.listAllAdm();
    }

    public void addAdm(Administrador administrador){
        repository.addAdm(administrador);
    }

}

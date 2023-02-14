package org.acme.service;

import org.acme.modal.Desenvolvedor;
import org.acme.repository.DesenvolvedorRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class DesenvolvedorService {

    @Inject
    DesenvolvedorRepository repository;

    public DesenvolvedorService(DesenvolvedorRepository repository) { this.repository = repository; }

    public List<Desenvolvedor> findAllDev(){
        return this.repository.findAll().list();
    }

    public void addDev(Desenvolvedor desenvolvedor){
        repository.persist(desenvolvedor);
    }

}

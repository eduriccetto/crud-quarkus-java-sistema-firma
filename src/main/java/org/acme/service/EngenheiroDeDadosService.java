package org.acme.service;

import org.acme.modal.Desenvolvedor;
import org.acme.modal.EngenheiroDeDados;
import org.acme.repository.DesenvolvedorRepository;
import org.acme.repository.EngenheiroDeDadosRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class EngenheiroDeDadosService {

    @Inject
    EngenheiroDeDadosRepository repository;

    public EngenheiroDeDadosService(EngenheiroDeDadosRepository repository) { this.repository = repository; }

    public List<EngenheiroDeDados> findAllEng(){
        return this.repository.findAll().list();
    }

    public void addEng(EngenheiroDeDados engenheiroDeDados){
        repository.persist(engenheiroDeDados);
    }

}

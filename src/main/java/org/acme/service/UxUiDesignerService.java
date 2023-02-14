package org.acme.service;

import org.acme.modal.Desenvolvedor;
import org.acme.modal.UxUiDesigner;
import org.acme.repository.DesenvolvedorRepository;
import org.acme.repository.UxUiDesignerRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class UxUiDesignerService {

    @Inject
    UxUiDesignerRepository repository;

    public UxUiDesignerService(UxUiDesignerRepository repository) { this.repository = repository; }

    public List<UxUiDesigner> findAllUxUi(){
        return this.repository.findAll().list();
    }

    public void addUxUi(UxUiDesigner uxUiDesigner){
        repository.persist(uxUiDesigner);
    }

}

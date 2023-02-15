package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.modal.Administrador;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class AdministradorRepository implements PanacheRepository<Administrador> {

    public List<Administrador> listAllAdm(){
        return findAll().list();
    }

    public void addAdm(Administrador administrador){
        persist(administrador);
    }

}

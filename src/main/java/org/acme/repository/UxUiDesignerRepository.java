package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.modal.Desenvolvedor;
import org.acme.modal.UxUiDesigner;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped // Vai dizer para o quarkus que está classe quando a aplicação for inicializada
// faz parte do contexto de classes que ele precisa gerir. Que vai utilizar as suas dependências.
public class UxUiDesignerRepository implements PanacheRepository<UxUiDesigner> {

    public List<UxUiDesigner> findAllUxUi() {
        return findAll().list();
    }

    public void addUxUi(UxUiDesigner uxUiDesigner){
        persist(uxUiDesigner);
    }

}

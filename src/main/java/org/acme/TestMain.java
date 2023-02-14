package org.acme;

import org.acme.modal.Desenvolvedor;

public class TestMain {

    public static void main(String[] args) {

        Desenvolvedor backEnd =  new Desenvolvedor();
        backEnd.setNome("Eduardo");
        backEnd.setDescricao("Desenvolvedor Back-End");

        System.out.println("Nome: "+backEnd.getNome());
        System.out.println("Cargo: "+backEnd.getDescricao());

    }

}

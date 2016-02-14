package br.com.teste.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.teste.model.grupo;
import java.io.Serializable;

/**
 *
 * @author Junior
 */
public class usuario implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private long id = 1;
    private boolean logado;
    private grupo grupo;
    


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    public grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(grupo grupo) {
        this.grupo = grupo;
    }
    
    


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final usuario other = (usuario) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
}

package br.com.teste.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;

/**
 *
 * @author Junior
 */
public class grupo implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id = 1;
    private boolean index;
    private boolean index2;
    private boolean index3;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isIndex() {
        return index;
    }

    public void setIndex(boolean index) {
        this.index = index;
    }

    public boolean isIndex2() {
        return index2;
    }

    public void setIndex2(boolean index2) {
        this.index2 = index2;
    }

    public boolean isIndex3() {
        return index3;
    }

    public void setIndex3(boolean index3) {
        this.index3 = index3;
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
        final grupo other = (grupo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}

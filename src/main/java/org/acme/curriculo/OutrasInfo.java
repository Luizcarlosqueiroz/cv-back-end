package org.acme.curriculo;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;

@Entity
@Cacheable
public class OutrasInfo extends PanacheEntity {

    private String hobbie;
    private String habilidade;

    @Deprecated
    public OutrasInfo(){}

    public OutrasInfo(String hobbie, String habilidade) {
        this.hobbie = hobbie;
        this.habilidade = habilidade;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
}

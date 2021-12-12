package org.acme.curriculo;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
@Cacheable
public class Curriculo extends PanacheEntity {

    @OneToOne
    private Profissional profissional;


    @Deprecated
    public Curriculo(){}

    public Curriculo(Profissional profissional) {
        this.profissional = profissional;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }


}

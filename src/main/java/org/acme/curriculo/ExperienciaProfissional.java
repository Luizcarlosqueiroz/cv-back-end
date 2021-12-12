package org.acme.curriculo;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Cacheable
public class ExperienciaProfissional extends PanacheEntity {

    private String empresa;
    private String cargo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String atividades;

    @Deprecated
    public ExperienciaProfissional(){}

    public ExperienciaProfissional(String empresa, String cargo, LocalDate dataInicio, LocalDate dataFim, String atividades) {
        this.empresa = empresa;
        this.cargo = cargo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.atividades = atividades;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getAtividades() {
        return atividades;
    }

    public void setAtividades(String atividades) {
        this.atividades = atividades;
    }
}

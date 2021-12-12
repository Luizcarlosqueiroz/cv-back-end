package org.acme.curriculo;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Cacheable
public class Profissional extends PanacheEntity {

    private String nome;
    private String especialidade;
    private String Endereço;
    private String email;
    private String telefone;

    @OneToMany
    private List<FormacaoAcademica> formacoesAcademicas = new ArrayList<>();

    @OneToMany
    private List<ExperienciaProfissional> experienciasProfissionais = new ArrayList<>();

    @OneToMany
    private List<OutrasInfo> outrasInfos = new ArrayList<>();

    @Deprecated
    public Profissional(){}

    public Profissional(String nome, String especialidade, String endereço, String email, String telefone) {
        this.nome = nome;
        this.especialidade = especialidade;
        Endereço = endereço;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String endereço) {
        Endereço = endereço;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<FormacaoAcademica> getFormacoesAcademicas() {
        return formacoesAcademicas;
    }

    public void setFormacoesAcademicas(FormacaoAcademica formacoesAcademicas) {
        this.formacoesAcademicas.add(formacoesAcademicas);
    }

    public List<ExperienciaProfissional> getExperienciasProfissionais() {
        return experienciasProfissionais;
    }

    public void setExperienciasProfissionais(ExperienciaProfissional experienciasProfissionais) {
        this.experienciasProfissionais.add(experienciasProfissionais);
    }

    public List<OutrasInfo> getOutrasInfos() {
        return outrasInfos;
    }

    public void setOutrasInfos(OutrasInfo outrasInfos) {
        this.outrasInfos.add(outrasInfos);
    }
}

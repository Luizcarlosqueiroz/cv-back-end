package org.acme.curriculo;

import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/curriculos")
@ApplicationScoped
public class CurriculoController {

    @GET
    public Uni<List<Curriculo>> findAll() {
        return Curriculo.listAll();
    }

    @GET
    @Path("/{id}")
    public Uni<Curriculo> getSingle(Long id) {
        return Curriculo.findById(id);
    }

    @POST
    @Transactional
    public Response criarProfissional(Profissional profissional) {
        profissional.persist();
        return Response.ok(profissional).build();
    }

    @POST
    @Transactional
    @Path("/{id}/adicionar-formacoes-academicas")
    public Response adicionarFormacaoAcademica(@PathParam("id") int id, FormacaoAcademica formacaoAcademica) {
        Profissional profissional = (Profissional) Profissional.findById(id);
        formacaoAcademica.persist();
        profissional.setFormacoesAcademicas(formacaoAcademica);
        return Response.ok(profissional.getFormacoesAcademicas()).build();
    }

    @POST
    @Transactional
    @Path("/{id}/adicionar-experiencias-profissionais")
    public Response adicionarExperienciaProfissional(@PathParam("id") int id, ExperienciaProfissional experienciaProfissional) {
        Profissional profissional = (Profissional) Profissional.findById(id);
        experienciaProfissional.persist();
        profissional.setExperienciasProfissionais(experienciaProfissional);
        return Response.ok(profissional.getExperienciasProfissionais()).build();
    }

    @POST
    @Transactional
    @Path("/{id}/adicionar-outras-informacoes")
    public Response adicionarOutrasInformacoes(@PathParam("id") int id, OutrasInfo outrasInformacoes) {
        Profissional profissional = (Profissional) Profissional.findById(id);
        outrasInformacoes.persist();
        profissional.setOutrasInfos(outrasInformacoes);
        return Response.ok(profissional.getOutrasInfos()).build();
    }

    @POST
    @Transactional
    @Path("/{id}/criar-meu-curriculo")
    public Response criarCurriculo(@PathParam("id") int id) {
        Profissional profissional = (Profissional) Profissional.findById(id);
        Curriculo curriculo = new Curriculo(profissional);
        curriculo.persist();
        return Response.ok(curriculo).build();
    }

    @DELETE
    public void deleteById(@PathParam("id") int id){
        Curriculo.deleteById(id);
    }
}

package service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import dao.DAOGenerico;
import modelo.Adocao;


@Path("/ServiceAdocao")
@ApplicationPath("/resource")
public class ServiceAdocao extends Application{
	DAOGenerico dao = new DAOGenerico();
	private List<Adocao> listaAdocoes = new ArrayList<>();
	
	@GET
	@Path("/hello")
	@Produces("application/json")
	public String getHello() {
		return "Service Adoção";
	}
	
	@POST
	@Path("/cadastraAdocao")
	public void cadastraAdocao(
			@FormParam("nomeAnunciante") String nomeAnunciante,
            @FormParam("estado") String estado,
            @FormParam("cidade") String cidade,
            @FormParam("telefone") String telefone,
            @FormParam("observacao") String observacao,
            @FormParam("nomeanimal") String nomeAnimal,
            @FormParam("descricaoanimal") String descricaoAnimal,
            @FormParam("castracao") Boolean castracao,
            @FormParam("especie") String especie,
            @FormParam("idade") Integer idade,
            @FormParam("raca") String raca,
            @FormParam("sexo") String sexo,
            @FormParam("pelagem") String pelagem,
            @FormParam("portepeso") String portePeso			
			){
	
		Adocao adocao = new Adocao();
		try {
			adocao.setCastrado(castracao);
			adocao.setNomeAnunciante(nomeAnunciante);
            adocao.setEstado(estado);
            adocao.setCidade(cidade);
            adocao.setTelefone(telefone);
            adocao.setObservacao(observacao);
            adocao.setNomeAnimal(nomeAnimal);
            adocao.setDescricaoAnimal(descricaoAnimal);
            adocao.setEspecie(especie);
            adocao.setIdade(idade);
            adocao.setRaca(raca);
            adocao.setSexo(sexo);
            adocao.setPelagem(pelagem);
            adocao.setPortePeso(portePeso);
			
			dao.inserir(adocao);
			listaAdocoes = dao.lista(Adocao.class);
			System.out.println("Cadastrando");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	@GET
	@Path("/listaAdocoes")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Adocao> listaAdocoes() {
	System.out.println("Chamando o Método Listar");
		listaAdocoes = dao.lista(Adocao.class);
		return listaAdocoes;
		
	}
	
	
	
}

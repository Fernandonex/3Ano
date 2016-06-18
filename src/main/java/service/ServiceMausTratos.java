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
import modelo.MausTratos;


@Path("/ServiceMausTratos")
@ApplicationPath("/resource")
public class ServiceMausTratos extends Application{
	DAOGenerico dao = new DAOGenerico();
	private List<MausTratos> listaDenuncias = new ArrayList<>();
	
	@GET
	@Path("/hello")
	@Produces("application/json")
	public String getHello() {
		return "Service Maus Tratos";
	}
	
	@POST
	@Path("/cadastraDenuncia")
	public void cadastraDenuncia(@FormParam("endereco") String endereco,@FormParam("descricao") String descricao,
			@FormParam("longitude") Integer longitude,	@FormParam("latitude") Integer latitude){
		System.out.println(endereco);
		System.out.println(descricao);
		System.out.println(longitude);
		System.out.println(latitude);
		MausTratos denuncia = new MausTratos();
		try {
			denuncia.setEndereco(endereco);
			denuncia.setDescricao(descricao);
			denuncia.setLatitude(latitude);
			denuncia.setLongitude(longitude);
			dao.inserir(denuncia);
			listaDenuncias = dao.lista(MausTratos.class);
			System.out.println("Cadastrando");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	@GET
	@Path("/listaDenuncias")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<MausTratos> listaDenuncias() {
	System.out.println("Chamando o Método Listar");
		listaDenuncias = dao.lista(MausTratos.class);
		return listaDenuncias;
		
	}
	
	
}

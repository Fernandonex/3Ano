package dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import modelo.MausTratos;

public class TestaDAOGenerico {
	@Test
	public void TestaCRUD() throws Exception {
		
		DAOGenerico dao = new DAOGenerico();
		/*INICIO INSERIR*/
		MausTratos denuncia1 = new MausTratos("Rua X, 1200",10,10,"Gato abandonado.");
		MausTratos denuncia2 = new MausTratos("Rua X, 1222",10,10,"Cachorro abandonado.");
		MausTratos denuncia3 = new MausTratos("Rua X, 100",10,10,"Animal sofrendo maus tratos.");
		dao.inserir(denuncia1);
		dao.inserir(denuncia2);
		dao.inserir(denuncia3);
		System.out.println("##########Dados Persistidos.##########");
		List<MausTratos> denuncias = dao.lista(MausTratos.class);
		Assert.assertEquals(3, denuncias.size());
		/*FIM INICIO INSERIR*/
		
		/*INICIO ALTERAR*/
		System.out.println("Denuncia 1 "+denuncia1.getEndereco() );
		denuncia1.setEndereco("Rua Z, 1221");
		dao.salvar(denuncia1);
		System.out.println("Denuncia 1 "+denuncia1.getEndereco()); 
		MausTratos objetoRec1 = (MausTratos) dao.recupera(MausTratos.class, 1L);
		Assert.assertEquals("Rua Z, 1221", objetoRec1.getEndereco());
		/*FIM ALTERAR*/
		
		/*INICIO DELETAR*/
		List<MausTratos> denuncias1 = dao.lista(MausTratos.class);
		System.out.println(denuncias1.size());
		
		MausTratos objetoRec2 = (MausTratos) dao.recupera(MausTratos.class, 1L);
		dao.exluir(objetoRec2);
		//Teste 1
		List<MausTratos> denuncias2 = dao.lista(MausTratos.class);
		Assert.assertEquals(2, denuncias2.size());
		//Teste 2
		MausTratos objetoRec = (MausTratos) dao.recupera(MausTratos.class, 1L);
		Assert.assertEquals(null, objetoRec);
		
		List<MausTratos> denuncias3 = dao.lista(MausTratos.class);
		System.out.println(denuncias3.size());
		/*FIM DELETAR*/
		
	}
}

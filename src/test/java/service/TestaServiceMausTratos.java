package service;

import org.junit.Assert;
import org.junit.Test;

import modelo.MausTratos;

public class TestaServiceMausTratos {

	@Test
	public void testaCadastraDenuncia() {
		ServiceMausTratos service = new ServiceMausTratos();
		MausTratos denuncia1 = new MausTratos("Rua X, 1200", 10, 10, "Gato abandonado.");
		MausTratos denuncia2 = new MausTratos("Rua X, 1222", 10, 10, "Cachorro abandonado.");
		MausTratos denuncia3 = new MausTratos("Rua X, 100", 10, 10, "Animal sofrendo maus tratos.");
		service.cadastraDenuncia(denuncia1.getEndereco(), denuncia1.getDescricao(), denuncia1.getLongitude(),
				denuncia1.getLatitude());
		service.cadastraDenuncia(denuncia2.getEndereco(), denuncia2.getDescricao(), denuncia2.getLongitude(),
				denuncia2.getLatitude());
		service.cadastraDenuncia(denuncia3.getEndereco(), denuncia3.getDescricao(), denuncia3.getLongitude(),
				denuncia3.getLatitude());
		System.out.println("###################### " + service.listaDenuncias().size());
		Assert.assertEquals(3, service.listaDenuncias().size());
	}

}

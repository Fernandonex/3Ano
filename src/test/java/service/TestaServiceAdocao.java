package service;

import org.junit.Assert;
import org.junit.Test;

import modelo.Adocao;

public class TestaServiceAdocao {

	@Test
	public void testaCadastraAdocao() {
		ServiceAdocao service = new ServiceAdocao();
		Adocao adocao1 = new Adocao("Dog", "Cachorro", "Cachorro", "Macho", "Médio, 20kg", 12, "Branco", "Sem raca",
				false, "video.com", "Fernando", "Parana", "Paranavai", "123456", "xyz@xyz.com", "asd");

		service.cadastraAdocao(adocao1.getNomeAnunciante(), adocao1.getEstado(), adocao1.getCidade(),
				adocao1.getTelefone(), adocao1.getObservacao(), adocao1.getNomeAnimal(), adocao1.getDescricaoAnimal(),
				adocao1.getCastrado(), adocao1.getEspecie(), adocao1.getIdade(), adocao1.getRaca(), adocao1.getSexo(),
				adocao1.getPelagem(), adocao1.getPortePeso());

		System.out.println("###################### " + service.listaAdocoes().size());
		System.out.println("###################### Nome do anunciante "+service.listaAdocoes().get(0).getNomeAnunciante());
		Assert.assertEquals(1, service.listaAdocoes().size());
	}
	
	

}

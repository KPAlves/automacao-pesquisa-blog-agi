package pageObject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.openqa.selenium.support.PageFactory;

import driver.Driver;

public class PesquisaPage extends PesquisaElementMap {

	public PesquisaPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	public void validarMensagemExibidaPositiva(String mensagemExibida) {
		
		assertEquals(mensagemExibida, archive_title.getText());		
	}

	public void validarGeradaListaArtigos() {

		assertNotNull(artigos.getText());		
	}

	public void validarMensagemExibidaNegativa(String mensagemExibida) {
		
		assertEquals(mensagemExibida, entry_title.getText());			
	}
	
	public void validarDescricaoExibida(String descricaoExibida) {
		
		assertEquals(descricaoExibida, descricao.getText());
	}

}

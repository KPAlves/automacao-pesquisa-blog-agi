package stepDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObject.HomePage;
import pageObject.PesquisaPage;

public class PesquisaSteps {
    @Dado ("que eu esteja na {}")
    public void acessarHomePage(String paginaPrincipal) {
    	HomePage homePage = new HomePage();
    	homePage.acessarHomePage(paginaPrincipal);
    	
    }
    
	@E ("clico na lupa")
	public void clicarIconeLupa() {
		HomePage homePage = new HomePage();
		homePage.clicarIconeLupa();
	}
	
    @Quando ("preencho o campo pesquisar com o {}")
    public void preencherCampoPesquisar(String termoPesquisado) {
    	HomePage homePage = new HomePage();
		homePage.preencherCampoPesquisar(termoPesquisado);
    	
    }
    
    @E ("clico no botão Pesquisar")
    public void clicarBtnPesquisar() {
    	HomePage homePage = new HomePage();
    	homePage.clicarBtnPesquisar();
    	
    }
    
    @Então ("deve ser exibido a positiva {}")
    public void validarMensagemExibidaPositiva(String mensagemExibida) {
    	PesquisaPage pesquisaPage = new PesquisaPage();
    	pesquisaPage.validarMensagemExibidaPositiva(mensagemExibida);
    	
    }
    
    @E ("uma lista de artigos")
    public void validarGeradaListaArtigos() {
    	PesquisaPage pesquisaPage = new PesquisaPage();
    	pesquisaPage.validarGeradaListaArtigos();
    }
    
    @E ("exibe a {}")
    public void validarDescricaoExibida(String descricaoExibida) {
    	PesquisaPage pesquisaPage = new PesquisaPage();
    	pesquisaPage.validarDescricaoExibida(descricaoExibida);
    	
    }
    
    @Então ("deve ser exibido a negativa {}")
    public void validarMensagemExibidaNegativa(String mensagemExibida) {
    	PesquisaPage pesquisaPage = new PesquisaPage();
    	pesquisaPage.validarMensagemExibidaNegativa(mensagemExibida);
    	
    }

}

package pageObject;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import driver.Driver;

public class HomePage extends HomeElementMap {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	public void acessarHomePage(String paginaPrincipal) {
		
		assertEquals(paginaPrincipal, home_title);

	}

	public void clicarIconeLupa() {
		search_open.click();

	}

	public void preencherCampoPesquisar(String termoPesquisado) {
		search_field.sendKeys(termoPesquisado);

	}

	public void clicarBtnPesquisar() {
		search_submit.click();

	}

}

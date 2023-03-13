package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PesquisaElementMap {
	
	@FindBy(className = "archive-title")
	protected WebElement archive_title;
	
	@FindBy(tagName = "article")
	protected WebElement artigos;
	
	@FindBy(className = "entry-title")
	protected WebElement entry_title; 
	
	@FindBy(xpath = "//*[@id=\"primary\"]/section/div/p")
	protected WebElement descricao;
	
}
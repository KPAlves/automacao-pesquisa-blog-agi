#language: pt
@Pesquisa
Funcionalidade: Funcionalidade de pesquisa
  Testes relacionados a funcionalidade de pesquisa

  Cenário: Usuário faz uma pesquisa válida
    Dado que eu esteja na <PaginaPrincipal>
    E clico na lupa
    Quando preencho o campo pesquisar com o <TermoPesquisado>
    E clico no botão Pesquisar
    Então deve ser exibido a positiva <MensagemExibida>
    E uma lista de artigos
    
    Exemplos: 
      | PaginaPrincipal | TermoPesquisado  | MensagemExibida                  |
      | Blog do Agi			| AgiBank          | Resultados da busca por: AgiBank |


  Cenário: Usuário faz uma pesquisa que não retorna resultados
    Dado que eu esteja na <PaginaPrincipal>
    E clico na lupa
    Quando preencho o campo pesquisar com o <TermoPesquisado>
    E clico no botão Pesquisar
    Então deve ser exibido a negativa <MensagemExibida1>
    E exibe a <MensagemExibida2>
    
    Exemplos: 
    	| PaginaPrincipal | TermoPesquisado  | MensagemExibida1 	|	MensagemExibida2																																								|
      | Blog do Agi			| P3squ1s4Inv4l1d4 | Nenhum resultado		| Não encontramos nada para estes termos de busca. Tente novamente com palavras-chave diferentes.	|
    
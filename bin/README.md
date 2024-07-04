<h1 align="center">
 Desafio Iphone DIO
</h1>

<p align="center">
	<b><i>
Modelagem e diagramação da representação em UML e implementação do código relacionado ao componente iPhone. 
  </i></b>
</p>

<p align="center">
	<img alt="Tamanho do código no GitHub em bytes" src="https://img.shields.io/github/languages/code-size/seu-usuario/seu-repositorio?color=6272a4" />
	<img alt="Linguagem principal" src="https://img.shields.io/github/languages/top/seu-usuario/seu-repositorio?color=6272a4"/>
</p>

## 💡 Sobre o projeto
Baseado no lançamento do iPhone, este projeto visa a diagramação das classes e interfaces usando uma ferramenta UML para representar as funcionalidades de Reprodutor Musical, Aparelho Telefônico e Navegador na Internet. Após a diagramação, serão implementadas as classes e interfaces correspondentes em arquivos .java.
 <br> <br>

## 📁 Estrutura/
- [src] código do fonte 
- Diagrama de Classes listado abaixo.
- ```README.md```  Informações do projeto.  
## 📍 Instruções 

### Exemplo de Diagrama UML (Mermaid)
```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorrerioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet


    ### Pré-Requisitos

###### Comportamentos esperados:
* Repodutor Musicial: tocar, pausar, selecionarMusica
* Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz
* Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina

##  🔧 Tecnologias
![JAVA](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
  
## 🔗 Referências
- Videoaulas do Bootcamp Desenvolvimento Java com IA na plataforma da DIO


## ✅ Feedback

Caso tenha algum feedback, entre em contato!

<a href = "mailto:alexx.sandro76@gmail.com"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white"></a> 
<a href="https:/[/https://www.linkedin.com/in/alexsandro-da-silva-antunes-b52a76267?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app/]/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>

<p align="center"> Desenvolvido por Alexsandro Antunes </p>



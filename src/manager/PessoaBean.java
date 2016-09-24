package manager;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import persistence.PessoaDao;
import entity.Pessoa;

@ManagedBean(name="pBean")
@RequestScoped
public class PessoaBean {

	@ManagedProperty(name="pessoa", value="#{pessoa}")
	private Pessoa pessoa;
	@ManagedProperty(name="pessoaDao", value="#{pessoadao}")
	private PessoaDao pessoaDao;
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public PessoaDao getPessoaDao() {
		return pessoaDao;
	}
	public void setPessoaDao(PessoaDao pessoaDao) {
		this.pessoaDao = pessoaDao;
	}
	
	public String cadastrar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		try{
			
			pessoaDao.cadastrar(pessoa);
			fc.addMessage("form1", new FacesMessage("Pessoa cadastrada com sucesso!"));
			
		}catch(Exception e){
			fc.addMessage("form1", new FacesMessage("Erro: " + e.getMessage()));
		}
		return null;
	}
	
}

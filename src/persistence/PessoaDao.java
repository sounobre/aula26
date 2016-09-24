package persistence;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import entity.Pessoa;

public class PessoaDao {

	HibernateTemplate hibernate;
	
	public void setSession(SessionFactory sf){
		hibernate = new HibernateTemplate(sf);
	}
	
	public void cadastrar(Pessoa p)throws Exception{
		hibernate.persist(p);
	}
	
	public List<Pessoa> listar()throws Exception{
		return hibernate.loadAll(Pessoa.class);
	}
	
}

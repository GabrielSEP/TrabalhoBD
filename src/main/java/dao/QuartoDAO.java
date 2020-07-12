package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Quarto;
import utils.HibernateUtil;

public class QuartoDAO {
	public void getAllQuarto() {
		EntityManager em = HibernateUtil.getEntityManager();
		String ql = "select a from Quarto a";
		TypedQuery<Quarto> query = em.createQuery(ql, Quarto.class);
		List<Quarto> projects = query.getResultList();
		System.out.println("Quarto: " + projects);

	}

	public void insertNewQuarto(Quarto a) {
		EntityManager em = HibernateUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		System.out.println("Valor gerado pelo insert na tabela Quarto: " + a.getN_quarto());
	}

	public void updateQuarto(Quarto a) {
		EntityManager em = HibernateUtil.getEntityManager();
		Quarto aux = em.find(Quarto.class, a.getId_Quarto());
		if (aux != null) {
			em.getTransaction().begin();
			em.merge(a);
			em.getTransaction().commit();
		} else {
			System.out.println("Quarto " + a.getId_quarto() + " não encontrado.");
		}
	}

	public void deleteQuarto(Integer id) {
		EntityManager em = HibernateUtil.getEntityManager();
		Quarto aux = em.find(Quarto.class, id);
		if (aux != null) {
			em.getTransaction().begin();
			em.remove(aux);
			em.getTransaction().commit();
		} else {
			System.out.println("Quarto " + id + " não encontrado.");
		}
	}

}
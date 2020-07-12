package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Reserva;
import utils.HibernateUtil;

public class ReservaDAO {

	public void getAllReservas() {
		EntityManager em = HibernateUtil.getEntityManager();
		String ql = "select r from reserva r";
		TypedQuery<Reserva> query = em.createQuery(ql, Reserva.class);
		List<Reserva> reserva = query.getResultList();
		System.out.println("Reserva: " + reserva);
	}
	
	public void insertNewVoo(Voo v) {
		EntityManager em = HibernateUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(v);
		em.getTransaction().commit();
		System.out.println("Valor gerado pelo insert na tabela quarto: " + r.getReserva());
	}
	
	public void updateReserva(Reserva r) {
		EntityManager em = HibernateUtil.getEntityManager();

		Reserva reserva = em.find(Reserva.class, r.getId_reserva());
		if (voo != null) {
			em.getTransaction().begin();
			em.merge(r);
			em.getTransaction().commit();
		} else {
			System.out.println("Reserva" + r.getId_reserva() + " não encontrado.");
		}
	}
	public void deleteReserva(Integer id) {
		EntityManager em = HibernateUtil.getEntityManager();
		Reserva reserva = em.find(Reserva.class, id);
		if (reserva != null) {
			em.getTransaction().begin();
			em.remove(reserva);
			em.getTransaction().commit();
		} else {
			System.out.println("reserva" + id + " não encontrado.");
		}
	}

}
package main;

import java.util.Date;

import dao.QuartoDAO;
import dao.ReservaDAO;
import model.Quarto;
import model.Reserva;

public class StartApp {

	public static void main(String[] args) {
		executeReserva();
	}

	public static void executeReserva() {
		//insert
		Reserva reserva = new Reserva();
		ReservaDAO reservaDao = new ReservaDAO();
		Quarto quarto = new Quarto();
//		quarto.setId_quarto(2);
//		reserva.setData_reserva(new Date());
//		reserva.setHotel("pouso alegre");
//		reserva.setclass("bla bla");
//		reserva.setId_quarto(quarto);
//		reservaDao.insertNewReserva(reserva);
		
		//select
//		reservaDao.getAllReservas();
		
		//delete
//		reservaDao.deleteReserva(2);
		
		//update
//		Quarto quarto = new Quarto();
//		reserva.setId_Quarto(2);
//		quarto.setId_quarto(1);
//		quarto.setData_quarto(new Date());
//		quarto.setHotel("sao paulo");
//		quarto.setclass("blablabla");
//		quarto.setId_reserva(reserva);
//		reservaDao.updateQuarto(quarto);
		
		
		
		
	}
	
	
	public static void executeQuarto() {
		// selecct
//		QuartoDAO aDao = new QuartoDAO();
//		aDao.getAllQuartos();

		// insert
//				Quarto a = new Quarto();
//				a.setAndar("4");
//				a.setHotel("Plaza");
//				a.setClass("A");
//				aDao.insertNewQuarto(a);

//				update
//				Quarto a = new Quarto();
//				a.setAndar("5");
//				a.setsetHotel("P");
//				a.setClass("A");
//				aDao.insertNewQuarto(a);

		// delete
//				aDao.deleteQuarto(1);
	}

}
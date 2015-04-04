package services.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import services.interfaces.GameManagementServicesLocal;
import services.interfaces.GameManagementServicesRemote;

/**
 * Session Bean implementation class GameManagementServices
 */
@Stateless
@LocalBean
public class GameManagementServices implements GameManagementServicesRemote,
		GameManagementServicesLocal {
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public GameManagementServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayAhla(String name) {
		// TODO Auto-generated method stub
		return "Sbe7 il5ir (Mr/Mmr)"+name;
	}

}

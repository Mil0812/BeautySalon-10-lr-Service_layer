package com.mil0812.beautySalon.domain.impl;


import com.mil0812.beautySalon.domain.contracts.ClientService;
import com.mil0812.beautySalon.persistence.dao.ClientDao;
import com.mil0812.beautySalon.persistence.entity.Client;
import java.util.Optional;

public class ClientServiceImpl implements ClientService {

	private ClientServiceImpl() {
	}

	private static class UserServiceImplHolder {

		public static final ClientServiceImpl USER_SERVICE_INSTANCE = new ClientServiceImpl();
	}

	public static ClientServiceImpl getInstance() {
		return UserServiceImplHolder.USER_SERVICE_INSTANCE;
	}

	private final ClientDao clientDao = ClientDao.getInstance();

	@Override
	public boolean createClient(Client client) {
		return clientDao.create(client);
	}

	@Override
	public Optional<Client> getClientById(Integer id) {
		return Optional.ofNullable(clientDao.getById(id));
	}

}

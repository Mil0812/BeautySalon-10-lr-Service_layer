package com.mil0812.beautySalon.domain.contracts;

import com.mil0812.beautySalon.persistence.entity.Client;
import java.util.Optional;

public interface ClientService {

	boolean createClient(Client client);
	Optional<Client> getClientById(Integer id);
}

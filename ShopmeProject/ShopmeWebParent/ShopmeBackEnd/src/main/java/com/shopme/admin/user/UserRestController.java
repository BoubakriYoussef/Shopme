package com.shopme.admin.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//Contrôlleur de type REST conçue pour gérer les opérations RESTful. Fournie une API web qui peut être consommée par d'autres apps, souvent clients 
//front end (mobile apps, apps web en javaScrip). Renvoie des données JSON ou XML plutôt que des vues HTML. 

@RestController
public class UserRestController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/users/check_email")
	public String checkDuplicateEmail(@Param("email") String email,
			@Param("id") Integer id) {
		return service.isEmailUnique(id,email) ? "OK" : "Duplicated";
	}
}

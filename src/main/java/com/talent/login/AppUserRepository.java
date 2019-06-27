package com.talent.login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long>{

	
	AppUser findByUserId(String string);

	AppUser findByUserName(String userName);
}

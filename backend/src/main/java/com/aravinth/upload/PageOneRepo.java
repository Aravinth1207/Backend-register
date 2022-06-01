package com.aravinth.upload;

import org.springframework.data.jpa.repository.JpaRepository;



public interface PageOneRepo extends JpaRepository<PageOne,Long> {

		PageOne findByEmail(String email);
}

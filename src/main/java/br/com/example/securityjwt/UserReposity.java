package br.com.example.securityjwt;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

/**
 * UserReposity
 */
public interface UserReposity  extends CrudRepository<User, String>{

    Optional<User> findByUsername(String username);
}
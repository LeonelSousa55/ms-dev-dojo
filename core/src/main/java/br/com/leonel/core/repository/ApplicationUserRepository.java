package br.com.leonel.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.leonel.core.model.ApplicationUser;

public interface ApplicationUserRepository extends PagingAndSortingRepository<ApplicationUser, Long> {
   
    public ApplicationUser findByUsername(String username) ;
}

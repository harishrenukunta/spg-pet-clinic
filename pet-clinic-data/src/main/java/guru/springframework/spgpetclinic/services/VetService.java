package guru.springframework.spgpetclinic.services;

import guru.springframework.spgpetclinic.model.Pet;

import java.util.Set;

public interface VetService {

    Set<Pet> findAll();

    Pet findByLastName();

    Pet save(Pet pet);

    Pet findById(Long id);
}

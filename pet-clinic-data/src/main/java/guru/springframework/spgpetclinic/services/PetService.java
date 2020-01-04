package guru.springframework.spgpetclinic.services;

import guru.springframework.spgpetclinic.model.Owner;
import guru.springframework.spgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Set<Pet> findAll();

    Pet findByLastName();

    Pet save(Pet pet);

    Pet findById(Long id);
}

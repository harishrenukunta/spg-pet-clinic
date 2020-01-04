package guru.springframework.spgpetclinic.services;

import guru.springframework.spgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Set<Owner> findAll();

    Owner findByLastName();

    Owner save(Owner owner);

    Owner findById(Long id);
}

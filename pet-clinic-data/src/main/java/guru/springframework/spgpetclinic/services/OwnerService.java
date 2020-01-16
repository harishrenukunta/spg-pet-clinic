package guru.springframework.spgpetclinic.services;

import guru.springframework.spgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName();

}

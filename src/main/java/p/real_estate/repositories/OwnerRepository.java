package p.real_estate.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import p.real_estate.entities.Owner;

@Component
@Qualifier("owner")
public interface OwnerRepository extends CrudRepository<Owner, Integer> {
	
	Owner findByNameIgnoreCase (String name);
	
}

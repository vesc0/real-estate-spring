package p.real_estate.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import p.real_estate.entities.Owner;
import p.real_estate.entities.RealEstate;

@Component
@Qualifier("realestate")
public interface RealEstateRepository extends CrudRepository<RealEstate, Integer>{
	
	List<RealEstate> findAllRealEstatesByOwner (Owner owner);
}

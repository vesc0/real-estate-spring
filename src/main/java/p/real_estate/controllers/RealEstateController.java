package p.real_estate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import p.real_estate.entities.Owner;
import p.real_estate.entities.RealEstate;
import p.real_estate.repositories.RealEstateRepository;

@RestController
public class RealEstateController {
	
	@Autowired
	private RealEstateRepository repository;
	
	@GetMapping("/subjects")
	public List<RealEstate> getAll(){
		return (List<RealEstate>) repository.findAll();
	}
	
	@GetMapping("/subjects/{id}")
	public RealEstate getOne(@PathVariable int id){
		return repository.findById(id).orElse(null);
	}
	
	@PostMapping("/subjects")
	public RealEstate createRealEstate(@RequestBody RealEstate realEstate){
		return repository.save(realEstate);
	}
	
	@DeleteMapping("/subjects/{id}")
	public void deleteRealEstate(@PathVariable int id){
		repository.deleteById(id);
	}
	
	@PutMapping("/subjects/{id}")
	public RealEstate updateRealEstate(@PathVariable int id, @RequestBody RealEstate realEstate){
		return repository.save(realEstate);
	}
	
	@GetMapping("/subjects/")
	public List<RealEstate> getSubjectsByOwner(@RequestBody Owner owner){
	return repository.findAllRealEstatesByOwner(owner);
	}
}

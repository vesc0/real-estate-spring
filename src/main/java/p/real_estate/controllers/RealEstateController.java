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
	
	@GetMapping("/realestate")
	public List<RealEstate> getAll(){
		return (List<RealEstate>) repository.findAll();
	}
	
	@GetMapping("/realestate/{id}")
	public RealEstate getOne(@PathVariable int id){
		return repository.findById(id).orElse(null);
	}
	
	@PostMapping("/realestate")
	public RealEstate createRealEstate(@RequestBody RealEstate realEstate){
		return repository.save(realEstate);
	}
	
	@DeleteMapping("/realestate/{id}")
	public void deleteRealEstate(@PathVariable int id){
		repository.deleteById(id);
	}
	
	@PutMapping("/realestate/{id}")
	public RealEstate updateRealEstate(@PathVariable int id, @RequestBody RealEstate realEstate){
		return repository.save(realEstate);
	}
	
	@PostMapping("/realestate/by-owner")
	public List<RealEstate> getRealEstatesByOwner(@RequestBody Owner owner){
		return repository.findAllRealEstatesByOwner(owner);
	}
}

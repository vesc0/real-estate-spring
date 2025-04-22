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
import p.real_estate.repositories.OwnerRepository;

@RestController
public class OwnerController {
	
	@Autowired
	private OwnerRepository repository;
	
	@GetMapping("/owner")
	public List<Owner> getAllOwners(){
		return (List<Owner>) repository.findAll();
	}
	
	@GetMapping("/owner/{id}")
	public Owner getOwner(@PathVariable int id){
		return repository.findById(id).orElse(null);
	}
	
	@PostMapping("/owner")
	public Owner addOwner(@RequestBody Owner owner){
		return repository.save(owner);
	}
	
	@PutMapping("/owner/{id}")
	public Owner updateOwner(@PathVariable int id, @RequestBody Owner owner){
		return repository.save(owner);
	}
	
	@DeleteMapping("/owner/{id}")
	public void deleteOwner(@PathVariable int id){
		repository.deleteById(id);
	}
	
	@GetMapping("/owner/count")
	public long countOwners(@PathVariable int id){
		return repository.count();
	}
	
	@GetMapping("/owner/searchignorecase/{name}")
	public Owner getOwnerByNameIgnoreCase(@PathVariable String name) {
		return repository.findByNameIgnoreCase(name);
	}
	
}

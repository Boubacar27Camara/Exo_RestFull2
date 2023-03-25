package Exo_RestFull.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Exo_RestFull.entities.Utilisateur;
import Exo_RestFull.services.UtilisateurService;

@RestController
@RequestMapping("/utilisateur") // localhost:8080/utilisateur
public class UtilisateurController {
	
	@Autowired
	private UtilisateurService utilisateurService;
	
	@GetMapping     //(path = "/getAllUtilisateurs")   // localhost:8080/utilisateur/getAllUtilisateurs
	public List<Utilisateur> getAllUtilisateurs() {
		
		return utilisateurService.getAllUtilisateurs();
	}
	
	@GetMapping(path = "/{id}")
	public Utilisateur findUtilisateurById(@PathVariable Long id) {
		return utilisateurService.findUtilisateurById(id);
	}
	
	@PostMapping
	public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.createUtilisateur(utilisateur);
	}
	
	@PutMapping
	public Utilisateur updateUtilisateur(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.updateUtilisateur(utilisateur);
	}
	
	@DeleteMapping(path = "/{id}") // localhost:8080/utilisateur/3
	public void deleteUtilisateur(@PathVariable Long id) {
		utilisateurService.deleteUtilisateur(id);
	}

}

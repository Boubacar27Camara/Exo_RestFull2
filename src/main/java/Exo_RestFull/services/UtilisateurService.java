package Exo_RestFull.services;

import java.util.List;

import Exo_RestFull.entities.Utilisateur;

public interface UtilisateurService {
	
	public List<Utilisateur> getAllUtilisateurs();
	public Utilisateur findUtilisateurById(Long id);
	public Utilisateur createUtilisateur(Utilisateur utilisateur);
	public Utilisateur updateUtilisateur(Utilisateur utilisateur);
	public void deleteUtilisateur(Long id);

}

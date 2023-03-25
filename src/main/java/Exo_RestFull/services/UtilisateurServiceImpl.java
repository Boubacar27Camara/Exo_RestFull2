package Exo_RestFull.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Exo_RestFull.entities.Utilisateur;
import Exo_RestFull.repository.UtilisateurRepository;

@Service
public class UtilisateurServiceImpl implements UtilisateurService{
	
	private UtilisateurRepository utilisateurRepository;

	@Override
	public List<Utilisateur> getAllUtilisateurs() {
		return utilisateurRepository.findAll();
	}

	@Override
	public Utilisateur findUtilisateurById(Long id) {
		Optional<Utilisateur> eOptional = utilisateurRepository.findById(id);
		
		if(eOptional.isEmpty()) {
			return null;
		}else {
			return eOptional.get();
		}
		
	}

	@Override
	public Utilisateur createUtilisateur(Utilisateur utilisateur) {
	
		return utilisateurRepository.save(utilisateur);
	}

	@Override
	public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
		Optional<Utilisateur> eOptional = utilisateurRepository.findById(utilisateur.getId());
		
		if(eOptional.isEmpty()) {
			return null;
		}else {
			return utilisateurRepository.save(utilisateur);
		}
	}

	@Override
	public void deleteUtilisateur(Long id) {
		utilisateurRepository.deleteById(id);
		
	}

}

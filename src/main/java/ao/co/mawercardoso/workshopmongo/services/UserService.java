package ao.co.mawercardoso.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ao.co.mawercardoso.workshopmongo.domain.User;
import ao.co.mawercardoso.workshopmongo.repository.UserRepository;
import ao.co.mawercardoso.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
		
		@Autowired
		private UserRepository repo;
		
		public List<User> findAll () {
			return repo.findAll();
		}
		
		public User findById(String id) {
			Optional<User> user = repo.findById(id);
			return user.orElseThrow(() -> new ObjectNotFoundException("Objecto não encontrado"));
		}
}

package ao.co.mawercardoso.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ao.co.mawercardoso.workshopmongo.domain.User;
import ao.co.mawercardoso.workshopmongo.repository.UserRepository;

@Service
public class UserService {
		
		@Autowired
		private UserRepository repo;
		
		public List<User> findAll () {
			return repo.findAll();
		}
}

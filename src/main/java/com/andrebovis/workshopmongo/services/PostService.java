package com.andrebovis.workshopmongo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrebovis.workshopmongo.domain.Post;
import com.andrebovis.workshopmongo.repository.PostRepository;
import com.andrebovis.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	
	@Autowired
	private PostRepository repo ;
	
	
	
	public Post findById(String id) {
		Post user = repo.findOne(id);
		if (user == null) {
			throw new  ObjectNotFoundException("Objeto nao encontrado");
		
		}
return user ;
	}
}


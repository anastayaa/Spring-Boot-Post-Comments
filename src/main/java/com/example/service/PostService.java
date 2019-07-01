package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Post;
import com.example.model.PostRespository;

@Service
public class PostService {
	
	@Autowired
	protected PostRespository postRespository;

	public List<Post> getAllPosts(){
		return postRespository.findAll();
	}
	
	public Post addPost(Post post) {
		return postRespository.saveAndFlush(post);
	}
	
}

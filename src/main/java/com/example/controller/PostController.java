package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Post;
import com.example.service.PostService;

@RestController
@RequestMapping(value="/posts")
public class PostController {
	
	@Autowired(required=true)
	protected PostService postService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Post> getPosts(){
		return postService.getAllPosts();
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public Post addPost(@RequestBody Post post) {
		return postService.addPost(post);
	}

}

package com.example.demo.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.PostsData;
import com.example.demo.service.PostsService;

@RestController
public class Posts {
	
	@Autowired
	private PostsService posts;
	
	@GetMapping("/posts")
	public List<PostsData> getPosts() {
		return posts.getPosts();
	}
	
	@GetMapping("/post/{id}")
	public Optional<PostsData> getPost(@PathVariable int id) {
		return posts.getPost(id);
	}
	
	@PostMapping("/post")
	public PostsData createPost(@RequestBody PostsData postData) {
		return posts.createPost(postData);
	}
	
	@PutMapping("/post/{id}")
	public PostsData updatePost(@PathVariable int id, @RequestBody PostsData postData) {
		return posts.updatePost(id,postData);
	}	
	
	@DeleteMapping("/post/{id}")
	public String deletePost(@PathVariable int id) {
		posts.deletePost(id);
		return("Deleted successfully");
	}	
	
	@DeleteMapping("/posts")
	public String deletePosts() {
		posts.deletePosts();
		return("All posts deleted successfully");
	}	
}

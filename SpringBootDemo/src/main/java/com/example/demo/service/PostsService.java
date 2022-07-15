package com.example.demo.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.data.PostsData;
import com.example.demo.repository.PostsRepository;

@Service
public class PostsService {
	
	@Autowired
	private PostsRepository postsRepo;
	
	public List<PostsData> getPosts() {
		return postsRepo.findAll();
	}
	
	public Optional<PostsData> getPost(int id) {
		return postsRepo.findById(id);
	}
	
	public PostsData createPost(PostsData postData) {
		return postsRepo.save(postData);
	}
	
	public PostsData updatePost(int id,PostsData postData) {
		//usersRepo.findById(id);
		return postsRepo.save(postData);
	}

	public void deletePost(int id) {
		postsRepo.deleteById(id);
	}
	
	public void deletePosts() {
		postsRepo.deleteAll();
	}

}

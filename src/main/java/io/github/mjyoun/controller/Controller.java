package io.github.mjyoun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.github.mjyoun.client.GitHubClient;

@RestController
public class Controller {

	@Autowired
	private GitHubClient gitHubClient;
	
	@RequestMapping(path = "/{owner}/{repo}", method = RequestMethod.GET)
	public ResponseEntity<String> contributors(@PathVariable("owner") String owner, @PathVariable("repo") String repo) {
		return ResponseEntity.ok(gitHubClient.contributors(owner, repo));
	}
	
}

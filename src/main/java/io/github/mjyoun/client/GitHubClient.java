package io.github.mjyoun.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient(url = "https://api.github.com", name = "GitHub")
public interface GitHubClient {

	@RequestMapping(path = "/repos/{owner}/{repo}", method = RequestMethod.GET)
	public String contributors(@PathVariable("owner") String owner, @PathVariable("repo") String repo);
	
}



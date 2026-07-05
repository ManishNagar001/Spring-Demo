package com.example;

import java.io.IOException;
import java.util.List;

import org.springframework.ai.image.ImageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class GenAiController {

	ChatService chatService;
	// ImageService imageService;
	RecipeGenerator recipeGeneratior;

	public GenAiController(ChatService chatService,
			// ImageService imageService,
			RecipeGenerator recipeGeneratior) {
		this.chatService = chatService;
		// this.imageService=imageService;
		this.recipeGeneratior = recipeGeneratior;
	}

	@GetMapping("/test")
	public String test() {
		return "Test is succesffuly done, server is running, 2nd Test case";
	}

	@GetMapping("/askai")
	public String getResponse(@RequestParam String prompt) {
		return chatService.getResponse(prompt);
	}

	// @GetMapping("/generateImage")
	// public void generateImage(HttpServletResponse response,@RequestParam String
	// prompt) throws IOException {
	// ImageResponse imageResponse= imageService.imageGeneration(prompt);
	// String url=imageResponse.getResult().getOutput().getUrl();
	// response.sendRedirect(url);
	// }
	//
	// @GetMapping("/generateImages")
	// public List<String> generateImages(HttpServletResponse response,@RequestParam
	// String prompt,
	// @RequestParam(defaultValue="hd") String quality,
	// @RequestParam(defaultValue="1") int n,
	// @RequestParam(defaultValue="1024") int height,
	// @RequestParam(defaultValue="1024") int width
	//
	// ) throws IOException {
	// ImageResponse imageResponse=
	// imageService.imageGeneration(prompt,quality,n,height,width);
	//
	// List<String> urls=imageResponse.getResults().stream()
	// .map(result->result.getOutput().getUrl()).toList();
	// return urls;
	// }

	@GetMapping("/recipeGenerator")
	public String recipeGenerator(@RequestParam String ingredients,
			@RequestParam(defaultValue = "any") String cusine,
			@RequestParam(defaultValue = "") String dietartRestrication) {
		try {
			return recipeGeneratior.createRecipe(ingredients, cusine, dietartRestrication);
		} catch (Exception e) {
			return "EROOR " + e.getMessage();
		}
	}
}

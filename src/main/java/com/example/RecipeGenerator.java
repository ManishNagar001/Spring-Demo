package com.example;

import java.util.Map;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.stereotype.Service;



@Service
public class RecipeGenerator {
	
	private final ChatModel chatModel;

	public RecipeGenerator(ChatModel chatModel) {
		
		this.chatModel = chatModel;
	}
	
	public String createRecipe(String ingredients, String  cuisine, String dietaryRestications) {
		
		var template = """
				I want to create a receipe using the following ingredients:{ingredients}
				The cuisine type i prefer is {cuisine}.
				Please consider the followig dietart restrication :{dietaryRestications}.
				Please provide me with a detailed recipe including title, list of ingredients, and cooking instructions
			""";
		
		PromptTemplate promptTemplate =new PromptTemplate(template);
		Map<String, Object> params=Map.of(
				"ingredients",ingredients,
				"cuisine",cuisine,
				"dietaryRestications",dietaryRestications
				
				);
		
		Prompt prompt=promptTemplate.create(params);
		
		return  chatModel.call(prompt).getResult().getOutput().getText();
	}
	

	

}

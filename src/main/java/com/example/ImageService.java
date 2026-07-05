//package com.example;
//
//import org.springframework.ai.image.ImagePrompt;
//import org.springframework.ai.image.ImageResponse;
//import org.springframework.ai.openai.OpenAiImageModel;
//import org.springframework.ai.openai.OpenAiImageOptions;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ImageService {
//	
//	private final OpenAiImageModel openAiImageModel;
//
//	public ImageService(OpenAiImageModel openAiImageModel) {
//		this.openAiImageModel = openAiImageModel;
//	}
//	
//	public ImageResponse imageGeneration(String prompt) {
//		return openAiImageModel.call(new ImagePrompt(prompt,
//				OpenAiImageOptions.builder()
//				.quality("hd")
//				.n(3)
//				.height(1024)
//				.width(1024).build()
//				
//				));
//		 
//	}
//
//	public ImageResponse imageGeneration(String prompt, String quality, int n, int height, int width) {
//		// TODO Auto-generated method stub
//		return openAiImageModel.call(new ImagePrompt(prompt,
//				OpenAiImageOptions.builder()
//				.quality(quality)
//				.n(n)
//				.height(height)
//				.width(width).build()
//				
//				));
//	}
//
//}

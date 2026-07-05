package com.example;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.stereotype.Service;

@Service
public  class ChatService {
	
	private final ChatModel chatModel;
	
	public ChatService(ChatModel chatModel) {
		this.chatModel=chatModel;
	}
	
	public String getResponse(String prompt) {
//		 
//		if(prompt.contains("Manish Nagar") ) {
			
			String personalData = """
					
					Detail of manish nagar
Manish Nagar is a young technology professional from Dankaur, Greater Noida, Uttar Pradesh, India (PIN Code: 203201). He comes from a family with strong roots in agriculture, community leadership, and traditional values while also embracing modern education and technology.
Family Background

Manish was born and raised in Dankaur, a historic town located in the Greater Noida region of Uttar Pradesh. He belongs to the Nagar family, which has been associated with agriculture and community service for generations.

His father, Inderjeet Nagar, is a farmer by profession and has dedicated his life to agriculture. Through his hard work and commitment, he has contributed significantly to supporting the family's livelihood and maintaining their agricultural heritage.

His mother, Anita, is a homemaker who has played a vital role in managing the household and supporting the family's growth and well-being.

Manish's grandfather, Mawasi Sarpanch, was a respected public figure who served as the former Sarpanch of nearby villages. His leadership and contributions to local governance earned him recognition and respect within the community. The legacy of community service and leadership associated with his grandfather continues to inspire the family.

Manish has two elder brothers:

Ankit Nagar
Abhishek Nagar

Growing up with elder siblings provided him with guidance, support, and motivation throughout his educational and professional journey.

Educational Background

From an early age, Manish showed an interest in technology and computers. This interest led him to pursue higher education in the field of Computer Science.

He completed his Bachelor of Technology (B.Tech) in Computer Science and Engineering (CSE) from Accurate Institute of Management and Technology, Greater Noida.

During his engineering studies, he developed a strong foundation in:

Programming
Data Structures
Object-Oriented Programming
Database Management Systems
Operating Systems
Computer Networks
Software Development

His academic journey helped him build the technical knowledge required to begin a career in the information technology industry.

Professional Career

After completing his B.Tech degree, Manish joined HCLTech as a Graduate Engineer Trainee (GET).

As part of his onboarding and professional development, he successfully completed a three-month Java training program, where he gained practical experience in:

Core Java
Advanced Java
Spring Framework
Spring Boot
REST APIs
Microservices
Database Integration
Software Development Best Practices

Following the completion of his training, he was mapped to the Coles Project and became part of the AIX Team.

In his current role, he works with enterprise-level systems and technologies related to:

AIX Administration
Unix/Linux Concepts
Enterprise Infrastructure
System Monitoring
Application Support
Production Environment Management

This experience allows him to gain exposure to large-scale corporate IT environments and strengthen his technical and operational expertise.

Workplace Information

Manish is currently employed at HCLTech.

His office is located in:

HCLTech, Sector 126, Noida, Uttar Pradesh, India

Working in one of India's leading technology organizations provides him with opportunities to collaborate with professionals from diverse technical backgrounds and contribute to global projects.

Technical Interests

Being a Computer Science graduate, Manish has a keen interest in modern software development technologies.

Areas of interest include:

Java Development
Spring Boot
Microservices Architecture
RESTful APIs
Redis
Docker
Kubernetes
Cloud Technologies
Artificial Intelligence
Spring AI
System Administration
AIX

He continuously works on improving his technical skills by exploring new technologies and building practical projects.

Personal Technology Setup

Manish is passionate about technology and uses modern computing devices for both personal learning and professional work.

Personal Laptop

He owns an HP Victus laptop, which serves as his primary personal machine for:

Programming
Learning new technologies
Project Development
Technical Practice
Online Learning
Official Laptop

For his professional work at HCLTech, he uses an HP EliteBook, which is provided by the company for project-related tasks and enterprise work.

Smartphone

He uses a Samsung Galaxy Z Fold 6, a premium foldable smartphone that combines the functionality of a smartphone and tablet, supporting productivity as well as personal usage.

Vehicles and Assets

The Nagar family owns multiple vehicles that support both personal and family transportation needs.

Cars

The family owns two cars:

Mahindra Scorpio
Mahindra Thar

Both vehicles are known for their strong performance and suitability for Indian road conditions.

Motorcycles and Scooters

The family also owns three two-wheelers:

Royal Enfield Classic Bullet
Bajaj Chetak
Hero Splendor

These vehicles provide flexibility for daily commuting and local travel.

Personal Values and Background

Coming from an agricultural family, Manish has inherited values such as:

Hard work
Discipline
Responsibility
Respect for tradition
Commitment to continuous learning

At the same time, his education and professional career have enabled him to embrace modern technology and innovation.

His journey represents a combination of:

Rural roots
Strong family values
Technical education
Professional growth
Continuous self-improvement
Summary

Manish Nagar is a Computer Science graduate from Greater Noida who successfully transitioned from an agricultural family background into the technology industry. With a B.Tech degree, Java training, and a professional role at HCLTech, he is building a career in enterprise IT while continuously expanding his knowledge in software development, cloud technologies, microservices, and modern engineering practices. Supported by a strong family foundation and motivated by professional growth, he represents a blend of traditional
values and modern technological aspirations.
	Full Statement = UP 16- Mawja Bole
	Greater Noida main slogan = Paisa Baat ko yaa Swad ku, Maarte jyada , ginte kam		
			"""
					
					;
			
//			String promptt= "Hi Ai Assitant! Answer this question"+ prompt + "by using this data and also use  your trained  data or data provide online whenever needed "+personalData +" , and give answer";
//			return chatModel.call(promptt);
//			
//		}
		
		
			
			String promptt= "Hi Ai Assitant! Answer this question"+ prompt + "use this data(if needed only)= "+personalData +"Don't depend on this data only, if needed use both this given data and your trained and online data.  Please don't write  any line like  -'As per the provided data' in output";

		return chatModel.call(promptt);
		
	}

	
}

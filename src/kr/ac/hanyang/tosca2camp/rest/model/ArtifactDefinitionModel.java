package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class ArtifactDefinitionModel {
	
	private String type;
	private String file;
	private String repository;
	private String description;
	private String deploy_path;

	
	
	private ArtifactDefinitionModel(){ }
	
	public static ArtifactDefinitionModel of(){
		return new ArtifactDefinitionModel();
	}
	
	public ArtifactDefinitionModel type(String type){	this.type = type; 	return this; 	}
	public ArtifactDefinitionModel file(String file){	this.file = file; 	return this; 	}
	public ArtifactDefinitionModel repository(String repository){	this.repository = repository; 	return this; 	}
	public ArtifactDefinitionModel description(String description){	this.description = description; 	return this; 	}
	public ArtifactDefinitionModel deploy_path(String deploy_path){	this.deploy_path = deploy_path; 	return this; 	}
	
	@XmlElement(name="type")
	public String getType(){
		return type;
	}
	
	@XmlElement(name="file")
	public String getFile(){
		return file;
	}
	
	@XmlElement(name="repository")
	public String getRepository(){
		return repository;
	}
	
	@XmlElement(name="description")
	public String getDescription(){
		return description;
	}
	
	@XmlElement(name="deploy_path")
	public String getDeploy_path(){
		return deploy_path;
	}
	
	
}

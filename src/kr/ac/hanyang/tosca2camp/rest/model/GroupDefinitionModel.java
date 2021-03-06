package kr.ac.hanyang.tosca2camp.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import kr.ac.hanyang.tosca2camp.templates.ServiceTemplate;

public class GroupDefinitionModel {
	
	private String name;
	private String type;
	private String description;
	private List<PropertyAssignmentModel> properties;
	private List<NodeTemplateModel> members;
	private List<InterfaceTypeModel> interfaces;
	
	
	private GroupDefinitionModel(){ }
	
	public static GroupDefinitionModel of(){
		return new GroupDefinitionModel();
	}
	
	public GroupDefinitionModel name(String name){	this.name = name; 	return this; 	}
	public GroupDefinitionModel typeName(String name){	this.type = name; 	return this; 	}
	public GroupDefinitionModel description(String description){	this.description = description; 	return this; 	}
	public GroupDefinitionModel properties(List<PropertyAssignmentModel> properties){	this.properties = properties; 	return this; 	}
	public GroupDefinitionModel members(List<NodeTemplateModel> members){	this.members = members; 	return this; 	}
	public GroupDefinitionModel interfaces(List<InterfaceTypeModel> interfaces){	this.interfaces = interfaces; 	return this; 	}
	
	@XmlElement(name="name")
	public String getName(){
		return name;
	}
	
	@XmlElement(name="type")
	public String getType(){
		return type;
	}
	
	@XmlElement(name="description")
	public String getDescription(){
		return description;
	}
	
	@XmlElement(name="properties")
	public List<PropertyAssignmentModel> getProperties(){
		return properties;
	}
	
	@XmlElement(name="members")
	public List<NodeTemplateModel> getMembers(){
		return members;
	}
	
	@XmlElement(name="interfaces")
	public List<InterfaceTypeModel> getInterfaces(){
		return interfaces;
	}
	
}

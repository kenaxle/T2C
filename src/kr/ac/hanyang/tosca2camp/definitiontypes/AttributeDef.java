package kr.ac.hanyang.tosca2camp.definitiontypes;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class AttributeDef implements Cloneable{

	private String name;
	private String type;
	private String description; // description are treated as their own type but for now they will be string
	private DataTypeDef attributeValue;
	private DataTypeDef defaultVal;  //TODO
	private String status; 
	private EntrySchemaDef entry_schema;
	
	public static class Builder{
		private String name;
		private String type;
		private String description; // description are treated as their own type but for now they will be string
		private DataTypeDef attributeValue;
		private DataTypeDef defaultVal;  //TODO
		private String status; 
		private EntrySchemaDef entry_schema;
		
		public Builder(String name){
			this.name = name;
		}
		
		public Builder(){ }
		
		public Builder type(String type) {
			this.type = type;
			return this;
		}

		public Builder description(String description){
			this.description = description;
			return this;
		}
		
		public Builder defaultVal(DataTypeDef defaultVal){
			this.defaultVal = defaultVal;
			return this;
		}
		
		public Builder status(String status){
			this.status = status;
			return this;
		}
		
		public Builder entry_schema(EntrySchemaDef entry_schema){
			this.entry_schema = entry_schema;
			return this;
		}
		
		public AttributeDef peek(){
			return new AttributeDef(this);
		}
		
		public AttributeDef build(){
			return new AttributeDef(this);
		}
	}
	
	public Object clone(){
		try{
			AttributeDef toReturn = (AttributeDef) super.clone();
			//toReturn.propertyValue = (DataTypeDef) propertyValue.clone();
			//toReturn.defaultVal = (DataTypeDef) defaultVal.clone();
			if (entry_schema != null) toReturn.entry_schema = (EntrySchemaDef) entry_schema.clone();
			return toReturn;
		}catch(CloneNotSupportedException e){
			return null;
		}	
	}
	
	private AttributeDef(Builder builder){
		this.name = builder.name;
		this.type = builder.type;
		this.description = builder.description;
		this.defaultVal = builder.defaultVal;
		this.status = builder.status;
		this.entry_schema = builder.entry_schema;
	}
	
	public Builder getBuilder(){ 
		Builder builder = new Builder();
		builder.name = this.name;
		builder.type = type;
		builder.description = this.description;
		builder.defaultVal = this.defaultVal;
		builder.status = this.status;
		builder.entry_schema = this.entry_schema;
		return builder;
	}
	
	public String getName(){return name;}
	public String getType(){return this.type;}	
	public String getDescription(){return description;}
	public DataTypeDef getDefaultVal(){return defaultVal;}
	
	public void setAttributeValue(DataTypeDef value){
		attributeValue = value;
	}
	
	public DataTypeDef getAttributeValue(){
		return this.attributeValue;
	}
	
	
	public String toString(){
		return new ToStringBuilder(this)
					.append("name: ",name)
					.append("value: ",defaultVal)
					.toString();
	}
	
}


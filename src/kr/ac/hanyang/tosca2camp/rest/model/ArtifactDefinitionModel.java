package kr.ac.hanyang.tosca2camp.rest.model;

import javax.xml.bind.annotation.XmlElement;
import org.eclipse.emf.ecore.EObject;
/**
 * @model 
 */
public interface ArtifactDefinitionModel extends EObject{
	

	/**
	 * @model 
	 */
	@XmlElement(name="type")
	public String getType();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="file")
	public String getFile();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="repository")
	public String getRepository();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getRepository <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' attribute.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="description")
	public String getDescription();
	
	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * @model 
	 */
	@XmlElement(name="deploy_path")
	public String getDeploy_path();

	/**
	 * Sets the value of the '{@link kr.ac.hanyang.tosca2camp.rest.model.ArtifactDefinitionModel#getDeploy_path <em>Deploy path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy path</em>' attribute.
	 * @see #getDeploy_path()
	 * @generated
	 */
	void setDeploy_path(String value);
	
	public void eSet(int featureID, Object newValue);
	
}

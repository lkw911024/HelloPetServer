/**
 * 
 */
package VO;

/**
 * @author ael
 *
 */
public class PetVO {
	private String petId;
	private String petType;
	private String petName;
	private String petAge;
	private String petGender;
	private String petHairColor;
	private String petWeight;
	private String petNeutralization;
	private String petAttribute;
	private String petDetails;
	private String memberId;
	
	public PetVO() {
		// TODO Auto-generated constructor stub
	}
	
	public PetVO(String petId, String petType, String petName, String petAge, String petGender, String petHairColor,
			String petWeight, String petNeutralization, String petAttribute, String petDetails, String memberId) {
		super();
		this.petId = petId;
		this.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
		this.petGender = petGender;
		this.petHairColor = petHairColor;
		this.petWeight = petWeight;
		this.petNeutralization = petNeutralization;
		this.petAttribute = petAttribute;
		this.petDetails = petDetails;
		this.memberId = memberId;
	}

	/**
	 * @return the petId
	 */
	public String getPetId() {
		return petId;
	}

	/**
	 * @param petId the petId to set
	 */
	public void setPetId(String petId) {
		this.petId = petId;
	}

	/**
	 * @return the petType
	 */
	public String getPetType() {
		return petType;
	}

	/**
	 * @param petType the petType to set
	 */
	public void setPetType(String petType) {
		this.petType = petType;
	}

	/**
	 * @return the petName
	 */
	public String getPetName() {
		return petName;
	}

	/**
	 * @param petName the petName to set
	 */
	public void setPetName(String petName) {
		this.petName = petName;
	}

	/**
	 * @return the petAge
	 */
	public String getPetAge() {
		return petAge;
	}

	/**
	 * @param petAge the petAge to set
	 */
	public void setPetAge(String petAge) {
		this.petAge = petAge;
	}

	/**
	 * @return the petGender
	 */
	public String getPetGender() {
		return petGender;
	}

	/**
	 * @param petGender the petGender to set
	 */
	public void setPetGender(String petGender) {
		this.petGender = petGender;
	}

	/**
	 * @return the petHairColor
	 */
	public String getPetHairColor() {
		return petHairColor;
	}

	/**
	 * @param petHairColor the petHairColor to set
	 */
	public void setPetHairColor(String petHairColor) {
		this.petHairColor = petHairColor;
	}

	/**
	 * @return the petWeight
	 */
	public String getPetWeight() {
		return petWeight;
	}

	/**
	 * @param petWeight the petWeight to set
	 */
	public void setPetWeight(String petWeight) {
		this.petWeight = petWeight;
	}

	/**
	 * @return the petNeutralization
	 */
	public String getPetNeutralization() {
		return petNeutralization;
	}

	/**
	 * @param petNeutralization the petNeutralization to set
	 */
	public void setPetNeutralization(String petNeutralization) {
		this.petNeutralization = petNeutralization;
	}

	/**
	 * @return the petAttribute
	 */
	public String getPetAttribute() {
		return petAttribute;
	}

	/**
	 * @param petAttribute the petAttribute to set
	 */
	public void setPetAttribute(String petAttribute) {
		this.petAttribute = petAttribute;
	}

	/**
	 * @return the petDetails
	 */
	public String getPetDetails() {
		return petDetails;
	}

	/**
	 * @param petDetails the petDetails to set
	 */
	public void setPetDetails(String petDetails) {
		this.petDetails = petDetails;
	}

	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PetVO [petId=" + petId + ", petType=" + petType + ", petName=" + petName + ", petAge=" + petAge
				+ ", petGender=" + petGender + ", petHairColor=" + petHairColor + ", petWeight=" + petWeight
				+ ", petNeutralization=" + petNeutralization + ", petAttribute=" + petAttribute + ", petDetails="
				+ petDetails + ", memberId=" + memberId + "]";
	}


}

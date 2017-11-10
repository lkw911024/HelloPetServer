/**
 * 
 */
package VO;

/**
 * @author ael
 *
 */
public class DisappearVO extends Report {
	private String petId;
	private String petType;
	private String petRace;
	private String petName;
	private String petAge;
	private String petGender;
	private String petHairColor;
	private String petWeight;
	private String petNeutralization;
	private String petAttribute;
	
	public DisappearVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DisappearVO(String petId, String petType, String petRace, String petName, String petAge, String petGender,
			String petHairColor, String petWeight, String petNeutralization, String petAttribute) {
		super();
		this.petId = petId;
		this.petType = petType;
		this.petRace = petRace;
		this.petName = petName;
		this.petAge = petAge;
		this.petGender = petGender;
		this.petHairColor = petHairColor;
		this.petWeight = petWeight;
		this.petNeutralization = petNeutralization;
		this.petAttribute = petAttribute;
	}
	
	public DisappearVO(String reportId, String reportType, String reportPlace, String reportTime,
			String reportWrittenDate, String reportDetails, String reportReportCnt, String memberId, String memberName,
			String memberNickname, String petId, String petType, String petRace, String petName, String petAge,
			String petGender, String petHairColor, String petWeight, String petNeutralization, String petAttribute) {
		super(reportId, reportType, reportPlace, reportTime, reportWrittenDate, reportDetails, reportReportCnt,
				memberId, memberName, memberNickname);
		this.petId = petId;
		this.petType = petType;
		this.petRace = petRace;
		this.petName = petName;
		this.petAge = petAge;
		this.petGender = petGender;
		this.petHairColor = petHairColor;
		this.petWeight = petWeight;
		this.petNeutralization = petNeutralization;
		this.petAttribute = petAttribute;
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
	 * @return the petRace
	 */
	public String getPetRace() {
		return petRace;
	}

	/**
	 * @param petRace the petRace to set
	 */
	public void setPetRace(String petRace) {
		this.petRace = petRace;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DisappearVO [petId=" + petId + ", petType=" + petType + ", petRace=" + petRace + ", petName=" + petName
				+ ", petAge=" + petAge + ", petGender=" + petGender + ", petHairColor=" + petHairColor + ", petWeight="
				+ petWeight + ", petNeutralization=" + petNeutralization + ", petAttribute=" + petAttribute + "]";
	}
	
}

/**
 * 
 */
package VO;

/**
 * @author ael
 *
 */
public class WitnessVO extends Report {
	private String petType;
	private String petRace;
	private String petGender;
	private String petHairColor;
	private String petAttribute;
	private String petDetails;
	private String petNeutralization;
	
	public WitnessVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WitnessVO(String petType, String petRace, String petGender, String petHairColor, String petAttribute,
			String petDetails, String petNeutralization) {
		super();
		this.petType = petType;
		this.petRace = petRace;
		this.petGender = petGender;
		this.petHairColor = petHairColor;
		this.petAttribute = petAttribute;
		this.petDetails = petDetails;
		this.petNeutralization = petNeutralization;
	}

	public WitnessVO(String reportId, String reportType, String reportPlace, String reportTime,
			String reportWrittenDate, String reportDetails, String reportReportCnt, String memberId, String memberName,
			String memberNickname, String petType, String petRace, String petGender, String petHairColor,
			String petAttribute, String petDetails, String petNeutralization) {
		super(reportId, reportType, reportPlace, reportTime, reportWrittenDate, reportDetails, reportReportCnt,
				memberId, memberName, memberNickname);
		this.petType = petType;
		this.petRace = petRace;
		this.petGender = petGender;
		this.petHairColor = petHairColor;
		this.petAttribute = petAttribute;
		this.petDetails = petDetails;
		this.petNeutralization = petNeutralization;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WitnessVO [petType=" + petType + ", petRace=" + petRace + ", petGender=" + petGender + ", petHairColor="
				+ petHairColor + ", petAttribute=" + petAttribute + ", petDetails=" + petDetails
				+ ", petNeutralization=" + petNeutralization + "]";
	}
	
	
}

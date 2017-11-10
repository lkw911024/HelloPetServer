/**
 * 
 */
package VO;

/**
 * @author ael
 *
 */
public class ProtectVO extends Report {
	private String petType;
	private String petRace;
	private String petGender;
	private String petHairColor;
	private String petAttribute;
	private String petDetails;
	private String petNeutralization;
	private String protectFinish;
	private String shelterId;
	private String shelterName;
	private String shelterAddress;
	private String shelterCall;
	
	public ProtectVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProtectVO(String petType, String petRace, String petGender, String petHairColor, String petAttribute,
			String petDetails, String petNeutralization, String protectFinish, String shelterId, String shelterName,
			String shelterAddress, String shelterCall) {
		super();
		this.petType = petType;
		this.petRace = petRace;
		this.petGender = petGender;
		this.petHairColor = petHairColor;
		this.petAttribute = petAttribute;
		this.petDetails = petDetails;
		this.petNeutralization = petNeutralization;
		this.protectFinish = protectFinish;
		this.shelterId = shelterId;
		this.shelterName = shelterName;
		this.shelterAddress = shelterAddress;
		this.shelterCall = shelterCall;
	}

	public ProtectVO(String reportId, String reportType, String reportPlace, String reportTime,
			String reportWrittenDate, String reportDetails, String reportReportCnt, String memberId, String memberName,
			String memberNickname, String petType, String petRace, String petGender, String petHairColor,
			String petAttribute, String petDetails, String petNeutralization, String protectFinish, String shelterId,
			String shelterName, String shelterAddress, String shelterCall) {
		super(reportId, reportType, reportPlace, reportTime, reportWrittenDate, reportDetails, reportReportCnt,
				memberId, memberName, memberNickname);
		this.petType = petType;
		this.petRace = petRace;
		this.petGender = petGender;
		this.petHairColor = petHairColor;
		this.petAttribute = petAttribute;
		this.petDetails = petDetails;
		this.petNeutralization = petNeutralization;
		this.protectFinish = protectFinish;
		this.shelterId = shelterId;
		this.shelterName = shelterName;
		this.shelterAddress = shelterAddress;
		this.shelterCall = shelterCall;
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

	/**
	 * @return the protectFinish
	 */
	public String getProtectFinish() {
		return protectFinish;
	}

	/**
	 * @param protectFinish the protectFinish to set
	 */
	public void setProtectFinish(String protectFinish) {
		this.protectFinish = protectFinish;
	}

	/**
	 * @return the shelterId
	 */
	public String getShelterId() {
		return shelterId;
	}

	/**
	 * @param shelterId the shelterId to set
	 */
	public void setShelterId(String shelterId) {
		this.shelterId = shelterId;
	}

	/**
	 * @return the shelterName
	 */
	public String getShelterName() {
		return shelterName;
	}

	/**
	 * @param shelterName the shelterName to set
	 */
	public void setShelterName(String shelterName) {
		this.shelterName = shelterName;
	}

	/**
	 * @return the shelterAddress
	 */
	public String getShelterAddress() {
		return shelterAddress;
	}

	/**
	 * @param shelterAddress the shelterAddress to set
	 */
	public void setShelterAddress(String shelterAddress) {
		this.shelterAddress = shelterAddress;
	}

	/**
	 * @return the shelterCall
	 */
	public String getShelterCall() {
		return shelterCall;
	}

	/**
	 * @param shelterCall the shelterCall to set
	 */
	public void setShelterCall(String shelterCall) {
		this.shelterCall = shelterCall;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProtectVO [petType=" + petType + ", petRace=" + petRace + ", petGender=" + petGender + ", petHairColor="
				+ petHairColor + ", petAttribute=" + petAttribute + ", petDetails=" + petDetails
				+ ", petNeutralization=" + petNeutralization + ", protectFinish=" + protectFinish + ", shelterId="
				+ shelterId + ", shelterName=" + shelterName + ", shelterAddress=" + shelterAddress + ", shelterCall="
				+ shelterCall + "]";
	}	
	
}

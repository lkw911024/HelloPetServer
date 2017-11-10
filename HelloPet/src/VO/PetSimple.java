/**
 * 
 */
package VO;

/**
 * @author ael
 *
 */
public class PetSimple {
	private String petId;
	private String petType;
	private String petRacec;
	private String petName;
	private String petAge;
	private String petGender;
	
	public PetSimple() {
		// TODO Auto-generated constructor stub
	}

	public PetSimple(String petId, String petType, String petRacec, String petName, String petAge, String petGender) {
		super();
		this.petId = petId;
		this.petType = petType;
		this.petRacec = petRacec;
		this.petName = petName;
		this.petAge = petAge;
		this.petGender = petGender;
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
	 * @return the petRacec
	 */
	public String getPetRacec() {
		return petRacec;
	}

	/**
	 * @param petRacec the petRacec to set
	 */
	public void setPetRacec(String petRacec) {
		this.petRacec = petRacec;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PetSimple [petId=" + petId + ", petType=" + petType + ", petRacec=" + petRacec + ", petName=" + petName
				+ ", petAge=" + petAge + ", petGender=" + petGender + "]";
	}
}

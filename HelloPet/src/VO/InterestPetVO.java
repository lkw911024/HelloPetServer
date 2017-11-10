/**
 * 
 */
package VO;

/**
 * @author ael
 *
 */
public class InterestPetVO {
	private String interestId;
	private String memberId;
	private String shelterPetId;
	private String shelterPetType;
	private String shelterPetGender;
	private String shelterPetAge;
	private String shelterPetNoticeLimit;
	
	public InterestPetVO() {
		// TODO Auto-generated constructor stub
	}

	public InterestPetVO(String interestId, String memberId, String shelterPetId, String shelterPetType,
			String shelterPetGender, String shelterPetAge, String shelterPetNoticeLimit) {
		super();
		this.interestId = interestId;
		this.memberId = memberId;
		this.shelterPetId = shelterPetId;
		this.shelterPetType = shelterPetType;
		this.shelterPetGender = shelterPetGender;
		this.shelterPetAge = shelterPetAge;
		this.shelterPetNoticeLimit = shelterPetNoticeLimit;
	}

	/**
	 * @return the interestId
	 */
	public String getInterestId() {
		return interestId;
	}

	/**
	 * @param interestId the interestId to set
	 */
	public void setInterestId(String interestId) {
		this.interestId = interestId;
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

	/**
	 * @return the shelterPetId
	 */
	public String getShelterPetId() {
		return shelterPetId;
	}

	/**
	 * @param shelterPetId the shelterPetId to set
	 */
	public void setShelterPetId(String shelterPetId) {
		this.shelterPetId = shelterPetId;
	}

	/**
	 * @return the shelterPetType
	 */
	public String getShelterPetType() {
		return shelterPetType;
	}

	/**
	 * @param shelterPetType the shelterPetType to set
	 */
	public void setShelterPetType(String shelterPetType) {
		this.shelterPetType = shelterPetType;
	}

	/**
	 * @return the shelterPetGender
	 */
	public String getShelterPetGender() {
		return shelterPetGender;
	}

	/**
	 * @param shelterPetGender the shelterPetGender to set
	 */
	public void setShelterPetGender(String shelterPetGender) {
		this.shelterPetGender = shelterPetGender;
	}

	/**
	 * @return the shelterPetAge
	 */
	public String getShelterPetAge() {
		return shelterPetAge;
	}

	/**
	 * @param shelterPetAge the shelterPetAge to set
	 */
	public void setShelterPetAge(String shelterPetAge) {
		this.shelterPetAge = shelterPetAge;
	}

	/**
	 * @return the shelterPetNoticeLimit
	 */
	public String getShelterPetNoticeLimit() {
		return shelterPetNoticeLimit;
	}

	/**
	 * @param shelterPetNoticeLimit the shelterPetNoticeLimit to set
	 */
	public void setShelterPetNoticeLimit(String shelterPetNoticeLimit) {
		this.shelterPetNoticeLimit = shelterPetNoticeLimit;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InterestPetVO [interestId=" + interestId + ", memberId=" + memberId + ", shelterPetId=" + shelterPetId
				+ ", shelterPetType=" + shelterPetType + ", shelterPetGender=" + shelterPetGender + ", shelterPetAge="
				+ shelterPetAge + ", shelterPetNoticeLimit=" + shelterPetNoticeLimit + "]";
	}
	
}

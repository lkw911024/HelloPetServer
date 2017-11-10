/**
 * 
 */
package VO;

/**
 * @author ael
 *
 */
public class ShelterVO {
	private String shelterId;
	private String shelterName;
	private String shelterAddress;
	private String shelterCall;
	
	public ShelterVO() {
		// TODO Auto-generated constructor stub
	}

	public ShelterVO(String shelterId, String shelterName, String shelterAddress, String shelterCall) {
		super();
		this.shelterId = shelterId;
		this.shelterName = shelterName;
		this.shelterAddress = shelterAddress;
		this.shelterCall = shelterCall;
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
		return "ShelterVO [shelterId=" + shelterId + ", shelterName=" + shelterName + ", shelterAddress="
				+ shelterAddress + ", shelterCall=" + shelterCall + "]";
	}
	
}

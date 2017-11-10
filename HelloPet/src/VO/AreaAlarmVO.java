/**
 * 
 */
package VO;

/**
 * @author ael
 *
 */
public class AreaAlarmVO {
	private String areaAlarmId;
	private String areaAlarmAreaInfo;
	private String whether;
	private String memberId;
	
	public AreaAlarmVO() {
		// TODO Auto-generated constructor stub
	}

	public AreaAlarmVO(String areaAlarmId, String areaAlarmAreaInfo, String whether, String memberId) {
		super();
		this.areaAlarmId = areaAlarmId;
		this.areaAlarmAreaInfo = areaAlarmAreaInfo;
		this.whether = whether;
		this.memberId = memberId;
	}

	/**
	 * @return the areaAlarmId
	 */
	public String getAreaAlarmId() {
		return areaAlarmId;
	}

	/**
	 * @param areaAlarmId the areaAlarmId to set
	 */
	public void setAreaAlarmId(String areaAlarmId) {
		this.areaAlarmId = areaAlarmId;
	}

	/**
	 * @return the areaAlarmAreaInfo
	 */
	public String getAreaAlarmAreaInfo() {
		return areaAlarmAreaInfo;
	}

	/**
	 * @param areaAlarmAreaInfo the areaAlarmAreaInfo to set
	 */
	public void setAreaAlarmAreaInfo(String areaAlarmAreaInfo) {
		this.areaAlarmAreaInfo = areaAlarmAreaInfo;
	}

	/**
	 * @return the whether
	 */
	public String getWhether() {
		return whether;
	}

	/**
	 * @param whether the whether to set
	 */
	public void setWhether(String whether) {
		this.whether = whether;
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
		return "AreaAlarmVO [areaAlarmId=" + areaAlarmId + ", areaAlarmAreaInfo=" + areaAlarmAreaInfo + ", whether="
				+ whether + ", memberId=" + memberId + "]";
	}
	
}

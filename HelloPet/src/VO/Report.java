/**
 * 
 */
package VO;

/**
 * @author ael
 *
 */
public class Report {
	private String reportId;
	private String reportType;
	private String reportPlace;
	private String reportTime;
	private String reportWrittenDate;
	private String reportDetails;
	private String reportReportCnt;
	private String memberId;
	private String memberName;
	private String memberNickname;
	
	public Report() {
		// TODO Auto-generated constructor stub
	}

	public Report(String reportId, String reportType, String reportPlace, String reportTime, String reportWrittenDate,
			String reportDetails, String reportReportCnt, String memberId, String memberName, String memberNickname) {
		super();
		this.reportId = reportId;
		this.reportType = reportType;
		this.reportPlace = reportPlace;
		this.reportTime = reportTime;
		this.reportWrittenDate = reportWrittenDate;
		this.reportDetails = reportDetails;
		this.reportReportCnt = reportReportCnt;
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberNickname = memberNickname;
	}

	/**
	 * @return the reportId
	 */
	public String getReportId() {
		return reportId;
	}

	/**
	 * @param reportId the reportId to set
	 */
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	/**
	 * @return the reportType
	 */
	public String getReportType() {
		return reportType;
	}

	/**
	 * @param reportType the reportType to set
	 */
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	/**
	 * @return the reportPlace
	 */
	public String getReportPlace() {
		return reportPlace;
	}

	/**
	 * @param reportPlace the reportPlace to set
	 */
	public void setReportPlace(String reportPlace) {
		this.reportPlace = reportPlace;
	}

	/**
	 * @return the reportTime
	 */
	public String getReportTime() {
		return reportTime;
	}

	/**
	 * @param reportTime the reportTime to set
	 */
	public void setReportTime(String reportTime) {
		this.reportTime = reportTime;
	}

	/**
	 * @return the reportWrittenDate
	 */
	public String getReportWrittenDate() {
		return reportWrittenDate;
	}

	/**
	 * @param reportWrittenDate the reportWrittenDate to set
	 */
	public void setReportWrittenDate(String reportWrittenDate) {
		this.reportWrittenDate = reportWrittenDate;
	}

	/**
	 * @return the reportDetails
	 */
	public String getReportDetails() {
		return reportDetails;
	}

	/**
	 * @param reportDetails the reportDetails to set
	 */
	public void setReportDetails(String reportDetails) {
		this.reportDetails = reportDetails;
	}

	/**
	 * @return the reportReportCnt
	 */
	public String getReportReportCnt() {
		return reportReportCnt;
	}

	/**
	 * @param reportReportCnt the reportReportCnt to set
	 */
	public void setReportReportCnt(String reportReportCnt) {
		this.reportReportCnt = reportReportCnt;
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
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * @param memberName the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * @return the memberNickname
	 */
	public String getMemberNickname() {
		return memberNickname;
	}

	/**
	 * @param memberNickname the memberNickname to set
	 */
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Report [reportId=" + reportId + ", reportType=" + reportType + ", reportPlace=" + reportPlace
				+ ", reportTime=" + reportTime + ", reportWrittenDate=" + reportWrittenDate + ", reportDetails="
				+ reportDetails + ", reportReportCnt=" + reportReportCnt + ", memberId=" + memberId + ", memberName="
				+ memberName + ", memberNickname=" + memberNickname + "]";
	}
	
	
}

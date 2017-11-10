/**
 * 
 */
package DAO;

import java.util.LinkedList;

import VO.InterestPetVO;

/**
 * @author ael
 *
 */
public class InterestPetDAO {
	private static InterestPetDAO instance;
	private LinkedList<InterestPetVO> interestPetInfo;
	private DBConnection conn;
	
	public InterestPetDAO() {
		// TODO Auto-generated constructor stub
	}
	public static InterestPetDAO getInstance()
	{
		return instance;
	}
	/**
	 * @return the interestPetInfo
	 */
	public LinkedList<InterestPetVO> getInterestPetInfo() {
		return interestPetInfo;
	}
	/**
	 * @param interestPetInfo the interestPetInfo to set
	 */
	public void setInterestPetInfo(LinkedList<InterestPetVO> interestPetInfo) {
		this.interestPetInfo = interestPetInfo;
	}
	/**
	 * @return the conn
	 */
	public DBConnection getConn() {
		return conn;
	}
	/**
	 * @param conn the conn to set
	 */
	public void setConn(DBConnection conn) {
		this.conn = conn;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InterestPetDAO [interestPetInfo=" + interestPetInfo + ", conn=" + conn + "]";
	}
	
}

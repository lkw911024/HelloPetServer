/**
 * 
 */
package DAO;

import java.util.LinkedList;

import VO.ShelterVO;

/**
 * @author ael
 *
 */
public class ShelterDAO {
	private static ShelterDAO instance;
	private LinkedList<ShelterVO> shelterInfo;
	private DBConnection conn;
	
	private ShelterDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static ShelterDAO getInstance()
	{
		return instance;
	}

	/**
	 * @return the shelterInfo
	 */
	public LinkedList<ShelterVO> getShelterInfo() {
		return shelterInfo;
	}

	/**
	 * @param shelterInfo the shelterInfo to set
	 */
	public void setShelterInfo(LinkedList<ShelterVO> shelterInfo) {
		this.shelterInfo = shelterInfo;
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
		return "ShelterDAO [shelterInfo=" + shelterInfo + ", conn=" + conn + "]";
	}
	
	
}

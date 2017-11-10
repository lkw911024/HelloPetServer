/**
 * 
 */
package DAO;

import java.util.LinkedList;

import VO.ShelterPetVO;

/**
 * @author ael
 *
 */
public class ShelterPetDAO {
	private static ShelterPetDAO instance;
	private LinkedList<ShelterPetVO> shelterPetInfo;
	private DBConnection conn;
	
	private ShelterPetDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static ShelterPetDAO getInstance()
	{
		return instance;
	}

	/**
	 * @return the shelterPetInfo
	 */
	public LinkedList<ShelterPetVO> getShelterPetInfo() {
		return shelterPetInfo;
	}

	/**
	 * @param shelterPetInfo the shelterPetInfo to set
	 */
	public void setShelterPetInfo(LinkedList<ShelterPetVO> shelterPetInfo) {
		this.shelterPetInfo = shelterPetInfo;
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
		return "ShelterPetDAO [shelterPetInfo=" + shelterPetInfo + ", conn=" + conn + "]";
	}
	
	
}

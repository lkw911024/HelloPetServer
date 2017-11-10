/**
 * 
 */
package DAO;

import java.util.LinkedList;

import VO.PetVO;

/**
 * @author ael
 *
 */
public class PetDAO {	
	private static PetDAO instance;
	private LinkedList<PetVO> petInfo;
	private DBConnection conn;

	private PetDAO() {
		// TODO Auto-generated constructor stub
	}
	public static PetDAO getInstance()
	{
		return instance;
	}
	/**
	 * @return the petInfo
	 */
	public LinkedList<PetVO> getPetInfo() {
		return petInfo;
	}
	/**
	 * @param petInfo the petInfo to set
	 */
	public void setPetInfo(LinkedList<PetVO> petInfo) {
		this.petInfo = petInfo;
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
		return "PetDAO [petInfo=" + petInfo + ", conn=" + conn + "]";
	}
	
	
}

/**
 * 
 */
package DAO;

import java.util.LinkedList;

import VO.ProtectVO;

/**
 * @author ael
 *
 */
public class ProtectDAO {
	private static ProtectDAO instance;
	private LinkedList<ProtectVO> protectInfo;
	private DBConnection conn;
	
	private ProtectDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static ProtectDAO getInstance()
	{
		return instance;
	}

	/**
	 * @return the protectInfo
	 */
	public LinkedList<ProtectVO> getProtectInfo() {
		return protectInfo;
	}

	/**
	 * @param protectInfo the protectInfo to set
	 */
	public void setProtectInfo(LinkedList<ProtectVO> protectInfo) {
		this.protectInfo = protectInfo;
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
		return "ProtectDAO [protectInfo=" + protectInfo + ", conn=" + conn + "]";
	}
	
	
}

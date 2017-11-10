/**
 * 
 */
package DAO;

import java.util.LinkedList;

import VO.WitnessVO;

/**
 * @author ael
 *
 */
public class WitnessDAO {
	private static WitnessDAO instance;
	private LinkedList<WitnessVO> witnessInfo;
	private DBConnection conn;
	
	private WitnessDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static WitnessDAO getInstance()
	{
		return instance;
	}

	/**
	 * @return the witnessInfo
	 */
	public LinkedList<WitnessVO> getWitnessInfo() {
		return witnessInfo;
	}

	/**
	 * @param witnessInfo the witnessInfo to set
	 */
	public void setWitnessInfo(LinkedList<WitnessVO> witnessInfo) {
		this.witnessInfo = witnessInfo;
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
		return "WitnessDAO [witnessInfo=" + witnessInfo + ", conn=" + conn + "]";
	}
	
	
}

/**
 * 
 */
package DAO;

import java.util.LinkedList;

import VO.DisappearVO;

/**
 * @author ael
 *
 */
public class DisappearDAO {
	private static DisappearDAO instance;
	private LinkedList<DisappearVO> disappearInfo;
	private DBConnection conn;
	
	private DisappearDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static DisappearDAO getInstance()
	{
		return instance;
	}

	/**
	 * @return the disappearInfo
	 */
	public LinkedList<DisappearVO> getDisappearInfo() {
		return disappearInfo;
	}

	/**
	 * @param disappearInfo the disappearInfo to set
	 */
	public void setDisappearInfo(LinkedList<DisappearVO> disappearInfo) {
		this.disappearInfo = disappearInfo;
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
		return "DisappearDAO [disappearInfo=" + disappearInfo + ", conn=" + conn + "]";
	}
	
}

/**
 * 
 */
package DAO;

import java.util.LinkedList;

import VO.AreaAlarmVO;

/**
 * @author ael
 *
 */
public class AreaAlarmDAO {
	private static AreaAlarmDAO instance;
	private LinkedList<AreaAlarmVO> areaAlarmInfo;
	private DBConnection conn;
	
	private AreaAlarmDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static AreaAlarmDAO getInstance()
	{
		return instance;
	}

	/**
	 * @return the areaAlarmInfo
	 */
	public LinkedList<AreaAlarmVO> getAreaAlarmInfo() {
		return areaAlarmInfo;
	}

	/**
	 * @param areaAlarmInfo the areaAlarmInfo to set
	 */
	public void setAreaAlarmInfo(LinkedList<AreaAlarmVO> areaAlarmInfo) {
		this.areaAlarmInfo = areaAlarmInfo;
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
		return "AreaAlarmDAO [areaAlarmInfo=" + areaAlarmInfo + ", conn=" + conn + "]";
	}
	
}

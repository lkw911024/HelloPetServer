/**
 * 
 */
package controller;

import DAO.AreaAlarmDAO;
import DAO.InterestPetDAO;

/**
 * @author ael
 *
 */
public class AlarmController {
	private AreaAlarmDAO areaAlarm;
	private InterestPetDAO interestPet;
	
	public AlarmController() {
		this.areaAlarm = AreaAlarmDAO.getInstance();
		this.interestPet = InterestPetDAO.getInstance();
	}
}

/**
 * 
 */
package controller;

import DAO.ShelterDAO;
import DAO.ShelterPetDAO;

/**
 * @author ael
 *
 */
public class ShelterController {
	private ShelterDAO shelter;
	private ShelterPetDAO shelterPet;
	//private CommentDAO comment;
	
	public ShelterController() {
		this.shelter = ShelterDAO.getInstance();
		this.shelterPet = ShelterPetDAO.getInstance();
		//this.comment = CommentDAO.getInstance();
	}
}

/**
 * 
 */
package controller;

import DAO.WitnessDAO;

/**
 * @author ael
 *
 */
public class WitnessController {
	private WitnessDAO witness;
	//private CommentDAO comment;
	
	public WitnessController() {
		this.witness = WitnessDAO.getInstance();
		//this.comment = CommentDAO.getInstance();
	}
}

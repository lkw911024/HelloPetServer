/**
 * 
 */
package controller;

import DAO.DisappearDAO;

/**
 * @author ael
 *
 */
public class DisappearController {
	private DisappearDAO disappear;
	//private CommentDAO comment;
	
	public DisappearController() {
		this.disappear = DisappearDAO.getInstance();
		//this.comment = CommentDAO.getInstance();
	}
}

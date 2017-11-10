/**
 * 
 */
package controller;

import DAO.ProtectDAO;

/**
 * @author ael
 *
 */
public class ProtectController {
	private ProtectDAO protect;
	//private CommentDAO comment;
	
	public ProtectController() {
		this.protect = ProtectDAO.getInstance();
		//this.comment = CommentDAO.getInstance();
	}
}

/**
 * 
 */
package controller;

import DAO.MemberDAO;
import DAO.PetDAO;
import VO.MemberVO;

/**
 * @author ael
 *
 */
public class MemberController {
	private MemberDAO member;
	private PetDAO pet;
	
	public MemberController() {
		this.member = MemberDAO.getInstance();
		this.pet = PetDAO.getInstance();
	}
	
	
	public MemberVO checkLogin(String userId, String userPwd)
	{
		System.out.println("여기 오니>2");
		return member.checkLogin(userId, userPwd);	
	}
}

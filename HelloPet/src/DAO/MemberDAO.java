/**
 * 
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.ListIterator;

import VO.MemberVO;

/**
 * @author ael
 *
 */
public class MemberDAO {
	private static MemberDAO instance = new MemberDAO();
	private LinkedList<MemberVO> memberInfo;
	private Connection conn;
	
	private MemberDAO() {
		// TODO Auto-generated constructor stub
		// 디비에 접속해서 테이블에 있는 데이터 모두 memberinfo에 넣는 작
		
		this.conn = DBConnection.getInstance().getConn();
		this.memberInfo = searchAllMemberInfo();
	}
	
	public static MemberDAO getInstance()
	{
		return instance;
	}
	
	private LinkedList<MemberVO> searchAllMemberInfo()
	{
		PreparedStatement pstmt = null;
		LinkedList<MemberVO> result = new LinkedList<MemberVO>();

		
		try {
			String sql = "select * from member_tb";
			pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				String memberId = rs.getString("member_id");
				String memberName = rs.getString("member_name");
				String memberEmail = rs.getString("member_email");
				String memberPwd = rs.getString("member_pwd");
				String memberPhone = rs.getString("member_phone");
				String memberNickname = rs.getString("member_nickname");
				
				result.add(new MemberVO(memberId, memberName, memberEmail, memberPwd, memberPhone, memberNickname));
			}
			
		} catch(SQLException se){
			se.printStackTrace();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			try{
				if(pstmt != null){
					pstmt.close();
				}
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		
		
		
		// 데이터 테스트 
		ListIterator<MemberVO> testData =  result.listIterator();
		while(testData.hasNext())
		{
			System.out.println(testData.next().toString());
		}
		//
		
		return result;
	}
	
	public MemberVO checkLogin(String userId, String userPwd)
	{
		// 서블릿에서 일단 id 부터 체크를 해서 아이디가 있는지 체크를 먼저 하고나서
		// checklogin()로 아이디와 비밀번호가 일치하는지 확인해야 한다.
		// 그래야지 아이디가 없는건지 비밀번호가 틀린건지 확인할 수 있겠다
		// 안드로이드 앱에서 에러메시지를 따로 출력해주는건 나중에 하더라도 서버에서 처리는 이렇게 하자.
		System.out.println("여기 오니3");
		ListIterator<MemberVO> list = this.memberInfo.listIterator();
		System.out.println("여기 오니4");
		while(list.hasNext())
		{
			MemberVO temp = list.next();
			
			if(temp.getEmail().equals(userId) && temp.getPwd().equals(userPwd))
			{
				System.out.println("여기 오니?1");
				return temp;
			}
		}
	
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * @return the memberInfo
	 */
	public LinkedList<MemberVO> getMemberInfo() {
		return memberInfo;
	}

	/**
	 * @param memberInfo the memberInfo to set
	 */
	public void setMemberInfo(LinkedList<MemberVO> memberInfo) {
		this.memberInfo = memberInfo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MemberDAO [memberInfo=" + memberInfo + ", conn=" + conn + "]";
	}


	
	
}

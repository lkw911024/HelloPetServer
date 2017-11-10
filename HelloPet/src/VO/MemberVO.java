/**
 * 
 */
package VO;

/**
 * @author ael
 *
 */
public class MemberVO {
	private String id;
	private String name;
	private String email;
	private String pwd;
	private String phone;
	private String nickname;
	
	public MemberVO() {
		// TODO Auto-generated constructor stub
	}

	public MemberVO(String id, String name, String email, String pwd, String phone, String nickname) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.phone = phone;
		this.nickname = nickname;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", name=" + name + ", email=" + email + ", pwd=" + pwd + ", phone=" + phone
				+ ", nickname=" + nickname + "]";
	}
	
}

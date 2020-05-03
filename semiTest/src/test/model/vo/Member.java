package test.model.vo;

import java.io.Serializable;

public class Member implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3395718309515674927L;

	private String id;
	private String password;
	private int phone;
	
	public Member() {
		super();
	}
	public Member(String id, String password, int phone) {
		super();
		this.id = id;
		this.password = password;
		this.phone = phone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", phone=" + phone + "]";
	}
	
	
    
    
	
	
	
}

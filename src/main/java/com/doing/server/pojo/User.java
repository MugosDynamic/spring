package com.doing.server.pojo;

// Generated Aug 24, 2015 10:35:45 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "murat", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User implements java.io.Serializable {

	private Integer id;
	private String fullname;
	private int role;
	private String email;
	private String phone1;
	private String phone2;
	private String password;
	private String photo;
	private double xlocation;
	private double ylocation;
	private int companyid;

	public User() {
	}

	public User(String fullname, int role, String email, String password,
			double xlocation, double ylocation, int companyid) {
		this.fullname = fullname;
		this.role = role;
		this.email = email;
		this.password = password;
		this.xlocation = xlocation;
		this.ylocation = ylocation;
		this.companyid = companyid;
	}

	public User(String fullname, int role, String email, String phone1,
			String phone2, String password, String photo, double xlocation,
			double ylocation, int companyid) {
		this.fullname = fullname;
		this.role = role;
		this.email = email;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.password = password;
		this.photo = photo;
		this.xlocation = xlocation;
		this.ylocation = ylocation;
		this.companyid = companyid;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "fullname", nullable = false, length = 50)
	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Column(name = "role", nullable = false)
	public int getRole() {
		return this.role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	@Column(name = "email", unique = true, nullable = false, length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "phone1", length = 20)
	public String getPhone1() {
		return this.phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	@Column(name = "phone2", length = 20)
	public String getPhone2() {
		return this.phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	@Column(name = "password", nullable = false, length = 20)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "photo", length = 100)
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Column(name = "xlocation", nullable = false, precision = 22, scale = 0)
	public double getXlocation() {
		return this.xlocation;
	}

	public void setXlocation(double xlocation) {
		this.xlocation = xlocation;
	}

	@Column(name = "ylocation", nullable = false, precision = 22, scale = 0)
	public double getYlocation() {
		return this.ylocation;
	}

	public void setYlocation(double ylocation) {
		this.ylocation = ylocation;
	}

	@Column(name = "companyid", nullable = false)
	public int getCompanyid() {
		return this.companyid;
	}

	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}

}

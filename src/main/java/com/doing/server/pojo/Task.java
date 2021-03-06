package com.doing.server.pojo;

// Generated Aug 24, 2015 10:35:45 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Task generated by hbm2java
 */
@Entity
@Table(name = "task", catalog = "murat")
public class Task implements java.io.Serializable {

	private Integer id;
	private String detail;
	private double xlocation;
	private double ylocation;
	private Date startdate;
	private Date enddate;
	private Date createdate;
	private String address;
	private int status;
	private int userid;
	private int customerid;
	private int companyid;

	public Task() {
	}

	public Task(String detail, double xlocation, double ylocation,
			Date startdate, Date enddate, Date createdate, String address,
			int status, int userid, int customerid, int companyid) {
		this.detail = detail;
		this.xlocation = xlocation;
		this.ylocation = ylocation;
		this.startdate = startdate;
		this.enddate = enddate;
		this.createdate = createdate;
		this.address = address;
		this.status = status;
		this.userid = userid;
		this.customerid = customerid;
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

	@Column(name = "detail", nullable = false, length = 1024)
	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "startdate", nullable = false, length = 19)
	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "enddate", nullable = false, length = 19)
	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdate", nullable = false, length = 19)
	public Date getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	@Column(name = "address", nullable = false, length = 1024)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "status", nullable = false)
	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Column(name = "userid", nullable = false)
	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Column(name = "customerid", nullable = false)
	public int getCustomerid() {
		return this.customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	@Column(name = "companyid", nullable = false)
	public int getCompanyid() {
		return this.companyid;
	}

	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}

}

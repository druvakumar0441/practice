package com.javafeature;

import java.util.Objects;

public class student implements Comparable<student>{

	private Integer sid;
	private String sname;
	private Integer sage;
	private String sbranch;
	private Double sfee;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	public String getSbranch() {
		return sbranch;
	}
	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}
	public Double getSfee() {
		return sfee;
	}
	public void setSfee(Double sfee) {
		this.sfee = sfee;
	}
	public student(Integer sid, String sname, Integer sage, String sbranch, Double sfee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.sbranch = sbranch;
		this.sfee = sfee;
	}
	public student() {
		super();
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", sbranch=" + sbranch + ", sfee=" + sfee
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(sage, sbranch, sfee, sid, sname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		return Objects.equals(sage, other.sage) && Objects.equals(sbranch, other.sbranch)
				&& Objects.equals(sfee, other.sfee) && Objects.equals(sid, other.sid)
				&& Objects.equals(sname, other.sname);
	}
	@Override
	public int compareTo(student o) {
		
		return this.getSid().compareTo(o.getSid());
	}
	
}

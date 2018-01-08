package com.tmy.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "psy_survey_answer")
public class SurveyAnswer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String sds1;
	private String sds2;
	private String sds3;
	private String sds4;
	private String sds5;
	private String sds6;
	private String sds7;
	private String sds8;
	private String sds9;
	private String sds10;
	private String sds11;
	private String sds12;
	private String sds13;
	private String sds14;
	private String sds15;
	private String sds16;
	private String sds17;
	private String sds18;
	private String sds19;
	private String sds20;
	private String sas1;
	private String sas2;
	private String sas3;
	private String sas4;
	private String sas5;
	private String sas6;
	private String sas7;
	private String sas8;
	private String sas9;
	private String sas10;
	private String sas11;
	private String sas12;
	private String sas13;
	private String sas14;
	private String sas15;
	private String sas16;
	private String sas17;
	private String sas18;
	private String sas19;
	private String sas20;
	private String bdi1;
	private String bdi2;
	private String bdi3;
	private String bdi4;
	private String bdi5;
	private String bdi6;
	private String bdi7;
	private String bdi8;
	private String bdi9;
	private String bdi10;
	private String bdi11;
	private String bdi12;
	private String bdi13;
	private String bdi14;
	private String bdi15;
	private String bdi16;
	private String bdi17;
	private String bdi18;
	private String bdi19;
	private String bdi20;
	private String bdi21;
	private Integer time;
	private Date createTime;
	@OneToOne
	private User user;

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getSds1() {
		return sds1;
	}

	public void setSds1(String sds1) {
		this.sds1 = sds1;
	}

	public String getSds2() {
		return sds2;
	}

	public void setSds2(String sds2) {
		this.sds2 = sds2;
	}

	public String getSds3() {
		return sds3;
	}

	public void setSds3(String sds3) {
		this.sds3 = sds3;
	}

	public String getSds4() {
		return sds4;
	}

	public void setSds4(String sds4) {
		this.sds4 = sds4;
	}

	public String getSds5() {
		return sds5;
	}

	public void setSds5(String sds5) {
		this.sds5 = sds5;
	}

	public String getSds6() {
		return sds6;
	}

	public void setSds6(String sds6) {
		this.sds6 = sds6;
	}

	public String getSds7() {
		return sds7;
	}

	public void setSds7(String sds7) {
		this.sds7 = sds7;
	}

	public String getSds8() {
		return sds8;
	}

	public void setSds8(String sds8) {
		this.sds8 = sds8;
	}

	public String getSds9() {
		return sds9;
	}

	public void setSds9(String sds9) {
		this.sds9 = sds9;
	}

	public String getSds10() {
		return sds10;
	}

	public void setSds10(String sds10) {
		this.sds10 = sds10;
	}

	public String getSds11() {
		return sds11;
	}

	public void setSds11(String sds11) {
		this.sds11 = sds11;
	}

	public String getSds12() {
		return sds12;
	}

	public void setSds12(String sds12) {
		this.sds12 = sds12;
	}

	public String getSds13() {
		return sds13;
	}

	public void setSds13(String sds13) {
		this.sds13 = sds13;
	}

	public String getSds14() {
		return sds14;
	}

	public void setSds14(String sds14) {
		this.sds14 = sds14;
	}

	public String getSds15() {
		return sds15;
	}

	public void setSds15(String sds15) {
		this.sds15 = sds15;
	}

	public String getSds16() {
		return sds16;
	}

	public void setSds16(String sds16) {
		this.sds16 = sds16;
	}

	public String getSds17() {
		return sds17;
	}

	public void setSds17(String sds17) {
		this.sds17 = sds17;
	}

	public String getSds18() {
		return sds18;
	}

	public void setSds18(String sds18) {
		this.sds18 = sds18;
	}

	public String getSds19() {
		return sds19;
	}

	public void setSds19(String sds19) {
		this.sds19 = sds19;
	}

	public String getSds20() {
		return sds20;
	}

	public void setSds20(String sds20) {
		this.sds20 = sds20;
	}

	public String getSas1() {
		return sas1;
	}

	public void setSas1(String sas1) {
		this.sas1 = sas1;
	}

	public String getSas2() {
		return sas2;
	}

	public void setSas2(String sas2) {
		this.sas2 = sas2;
	}

	public String getSas3() {
		return sas3;
	}

	public void setSas3(String sas3) {
		this.sas3 = sas3;
	}

	public String getSas4() {
		return sas4;
	}

	public void setSas4(String sas4) {
		this.sas4 = sas4;
	}

	public String getSas5() {
		return sas5;
	}

	public void setSas5(String sas5) {
		this.sas5 = sas5;
	}

	public String getSas6() {
		return sas6;
	}

	public void setSas6(String sas6) {
		this.sas6 = sas6;
	}

	public String getSas7() {
		return sas7;
	}

	public void setSas7(String sas7) {
		this.sas7 = sas7;
	}

	public String getSas8() {
		return sas8;
	}

	public void setSas8(String sas8) {
		this.sas8 = sas8;
	}

	public String getSas9() {
		return sas9;
	}

	public void setSas9(String sas9) {
		this.sas9 = sas9;
	}

	public String getSas10() {
		return sas10;
	}

	public void setSas10(String sas10) {
		this.sas10 = sas10;
	}

	public String getSas11() {
		return sas11;
	}

	public void setSas11(String sas11) {
		this.sas11 = sas11;
	}

	public String getSas12() {
		return sas12;
	}

	public void setSas12(String sas12) {
		this.sas12 = sas12;
	}

	public String getSas13() {
		return sas13;
	}

	public void setSas13(String sas13) {
		this.sas13 = sas13;
	}

	public String getSas14() {
		return sas14;
	}

	public void setSas14(String sas14) {
		this.sas14 = sas14;
	}

	public String getSas15() {
		return sas15;
	}

	public void setSas15(String sas15) {
		this.sas15 = sas15;
	}

	public String getSas16() {
		return sas16;
	}

	public void setSas16(String sas16) {
		this.sas16 = sas16;
	}

	public String getSas17() {
		return sas17;
	}

	public void setSas17(String sas17) {
		this.sas17 = sas17;
	}

	public String getSas18() {
		return sas18;
	}

	public void setSas18(String sas18) {
		this.sas18 = sas18;
	}

	public String getSas19() {
		return sas19;
	}

	public void setSas19(String sas19) {
		this.sas19 = sas19;
	}

	public String getSas20() {
		return sas20;
	}

	public void setSas20(String sas20) {
		this.sas20 = sas20;
	}

	public String getBdi1() {
		return bdi1;
	}

	public void setBdi1(String bdi1) {
		this.bdi1 = bdi1;
	}

	public String getBdi2() {
		return bdi2;
	}

	public void setBdi2(String bdi2) {
		this.bdi2 = bdi2;
	}

	public String getBdi3() {
		return bdi3;
	}

	public void setBdi3(String bdi3) {
		this.bdi3 = bdi3;
	}

	public String getBdi4() {
		return bdi4;
	}

	public void setBdi4(String bdi4) {
		this.bdi4 = bdi4;
	}

	public String getBdi5() {
		return bdi5;
	}

	public void setBdi5(String bdi5) {
		this.bdi5 = bdi5;
	}

	public String getBdi6() {
		return bdi6;
	}

	public void setBdi6(String bdi6) {
		this.bdi6 = bdi6;
	}

	public String getBdi7() {
		return bdi7;
	}

	public void setBdi7(String bdi7) {
		this.bdi7 = bdi7;
	}

	public String getBdi8() {
		return bdi8;
	}

	public void setBdi8(String bdi8) {
		this.bdi8 = bdi8;
	}

	public String getBdi9() {
		return bdi9;
	}

	public void setBdi9(String bdi9) {
		this.bdi9 = bdi9;
	}

	public String getBdi10() {
		return bdi10;
	}

	public void setBdi10(String bdi10) {
		this.bdi10 = bdi10;
	}

	public String getBdi11() {
		return bdi11;
	}

	public void setBdi11(String bdi11) {
		this.bdi11 = bdi11;
	}

	public String getBdi12() {
		return bdi12;
	}

	public void setBdi12(String bdi12) {
		this.bdi12 = bdi12;
	}

	public String getBdi13() {
		return bdi13;
	}

	public void setBdi13(String bdi13) {
		this.bdi13 = bdi13;
	}

	public String getBdi14() {
		return bdi14;
	}

	public void setBdi14(String bdi14) {
		this.bdi14 = bdi14;
	}

	public String getBdi15() {
		return bdi15;
	}

	public void setBdi15(String bdi15) {
		this.bdi15 = bdi15;
	}

	public String getBdi16() {
		return bdi16;
	}

	public void setBdi16(String bdi16) {
		this.bdi16 = bdi16;
	}

	public String getBdi17() {
		return bdi17;
	}

	public void setBdi17(String bdi17) {
		this.bdi17 = bdi17;
	}

	public String getBdi18() {
		return bdi18;
	}

	public void setBdi18(String bdi18) {
		this.bdi18 = bdi18;
	}

	public String getBdi19() {
		return bdi19;
	}

	public void setBdi19(String bdi19) {
		this.bdi19 = bdi19;
	}

	public String getBdi20() {
		return bdi20;
	}

	public void setBdi20(String bdi20) {
		this.bdi20 = bdi20;
	}

	public String getBdi21() {
		return bdi21;
	}

	public void setBdi21(String bdi21) {
		this.bdi21 = bdi21;
	}

	@Override
	public String toString() {
		return "SurveyAnswer [id=" + id + ", sds1=" + sds1 + ", sds2=" + sds2 + ", sds3=" + sds3 + ", sds4=" + sds4
				+ ", sds5=" + sds5 + ", sds6=" + sds6 + ", sds7=" + sds7 + ", sds8=" + sds8 + ", sds9=" + sds9
				+ ", sds10=" + sds10 + ", sds11=" + sds11 + ", sds12=" + sds12 + ", sds13=" + sds13 + ", sds14=" + sds14
				+ ", sds15=" + sds15 + ", sds16=" + sds16 + ", sds17=" + sds17 + ", sds18=" + sds18 + ", sds19=" + sds19
				+ ", sds20=" + sds20 + ", sas1=" + sas1 + ", sas2=" + sas2 + ", sas3=" + sas3 + ", sas4=" + sas4
				+ ", sas5=" + sas5 + ", sas6=" + sas6 + ", sas7=" + sas7 + ", sas8=" + sas8 + ", sas9=" + sas9
				+ ", sas10=" + sas10 + ", sas11=" + sas11 + ", sas12=" + sas12 + ", sas13=" + sas13 + ", sas14=" + sas14
				+ ", sas15=" + sas15 + ", sas16=" + sas16 + ", sas17=" + sas17 + ", sas18=" + sas18 + ", sas19=" + sas19
				+ ", sas20=" + sas20 + ", bdi1=" + bdi1 + ", bdi2=" + bdi2 + ", bdi3=" + bdi3 + ", bdi4=" + bdi4
				+ ", bdi5=" + bdi5 + ", bdi6=" + bdi6 + ", bdi7=" + bdi7 + ", bdi8=" + bdi8 + ", bdi9=" + bdi9
				+ ", bdi10=" + bdi10 + ", bdi11=" + bdi11 + ", bdi12=" + bdi12 + ", bdi13=" + bdi13 + ", bdi14=" + bdi14
				+ ", bdi15=" + bdi15 + ", bdi16=" + bdi16 + ", bdi17=" + bdi17 + ", bdi18=" + bdi18 + ", bdi19=" + bdi19
				+ ", bdi20=" + bdi20 + ", bdi21=" + bdi21 + ", time=" + time + ", createTime=" + createTime + ", user="
				+ user + "]";
	}

}

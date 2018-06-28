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
	private String m1;
	private String m2;
	private String m3;
	private String m4;
	private String m5;
	private String m6;
	private String m7;
	private String m8;
	private String m9;
	private String m10;
	private String m11;
	private String m12;
	private String m13;
	private String m14;
	private String m15;
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

	public String getM1() {
		return m1;
	}

	public void setM1(String m1) {
		this.m1 = m1;
	}

	public String getM2() {
		return m2;
	}

	public void setM2(String m2) {
		this.m2 = m2;
	}

	public String getM3() {
		return m3;
	}

	public void setM3(String m3) {
		this.m3 = m3;
	}

	public String getM4() {
		return m4;
	}

	public void setM4(String m4) {
		this.m4 = m4;
	}

	public String getM5() {
		return m5;
	}

	public void setM5(String m5) {
		this.m5 = m5;
	}

	public String getM6() {
		return m6;
	}

	public void setM6(String m6) {
		this.m6 = m6;
	}

	public String getM7() {
		return m7;
	}

	public void setM7(String m7) {
		this.m7 = m7;
	}

	public String getM8() {
		return m8;
	}

	public void setM8(String m8) {
		this.m8 = m8;
	}

	public String getM9() {
		return m9;
	}

	public void setM9(String m9) {
		this.m9 = m9;
	}

	public String getM10() {
		return m10;
	}

	public void setM10(String m10) {
		this.m10 = m10;
	}

	public String getM11() {
		return m11;
	}

	public void setM11(String m11) {
		this.m11 = m11;
	}

	public String getM12() {
		return m12;
	}

	public void setM12(String m12) {
		this.m12 = m12;
	}

	public String getM13() {
		return m13;
	}

	public void setM13(String m13) {
		this.m13 = m13;
	}

	public String getM14() {
		return m14;
	}

	public void setM14(String m14) {
		this.m14 = m14;
	}

	public String getM15() {
		return m15;
	}

	public void setM15(String m15) {
		this.m15 = m15;
	}

	@Override
	public String toString() {
		return "SurveyAnswer [id=" + id + ", sds1=" + sds1 + ", sds2=" + sds2 + ", sds3=" + sds3 + ", sds4=" + sds4
				+ ", sds5=" + sds5 + ", sds6=" + sds6 + ", sds7=" + sds7 + ", sds8=" + sds8 + ", sds9=" + sds9
				+ ", sds10=" + sds10 + ", sds11=" + sds11 + ", sds12=" + sds12 + ", sds13=" + sds13 + ", sds14=" + sds14
				+ ", sds15=" + sds15 + ", sds16=" + sds16 + ", sds17=" + sds17 + ", sds18=" + sds18 + ", sds19=" + sds19
				+ ", sds20=" + sds20 + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 + ", m5=" + m5
				+ ", m6=" + m6 + ", m7=" + m7 + ", m8=" + m8 + ", m9=" + m9 + ", m10=" + m10 + ", m11=" + m11 + ", m12="
				+ m12 + ", m13=" + m13 + ", m14=" + m14 + ", m15=" + m15 + ", bdi1=" + bdi1 + ", bdi2=" + bdi2
				+ ", bdi3=" + bdi3 + ", bdi4=" + bdi4 + ", bdi5=" + bdi5 + ", bdi6=" + bdi6 + ", bdi7=" + bdi7
				+ ", bdi8=" + bdi8 + ", bdi9=" + bdi9 + ", bdi10=" + bdi10 + ", bdi11=" + bdi11 + ", bdi12=" + bdi12
				+ ", bdi13=" + bdi13 + ", bdi14=" + bdi14 + ", bdi15=" + bdi15 + ", bdi16=" + bdi16 + ", bdi17=" + bdi17
				+ ", bdi18=" + bdi18 + ", bdi19=" + bdi19 + ", bdi20=" + bdi20 + ", bdi21=" + bdi21 + ", time=" + time
				+ ", createTime=" + createTime + ", user=" + user + "]";
	}

}

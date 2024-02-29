package com.Leave_Management.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LeaveEn {
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
		private int emp_id;
		private String emp_name;
		private String leave_Status;
		private String mob_number;
		private String email;
		private String Date;
		public int getEmp_id() {
			return emp_id;
		}
		public void setEmp_id(int emp_id) {
			this.emp_id = emp_id;
		}
		public String getEmp_name() {
			return emp_name;
		}
		public void setEmp_name(String emp_name) {
			this.emp_name = emp_name;
		}
		public String getLeave_Status() {
			return leave_Status;
		}
		public void setLeave_Status(String leave_Status) {
			this.leave_Status = leave_Status;
		}
		public String getMob_number() {
			return mob_number;
		}
		public void setMob_number(String mob_number) {
			this.mob_number = mob_number;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getDate() {
			return Date;
		}
		public void setDate(String date) {
			Date = date;
		}
		public LeaveEn(int emp_id, String emp_name, String leave_Status, String mob_number, String email, String date) {
			super();
			this.emp_id = emp_id;
			this.emp_name = emp_name;
			this.leave_Status = leave_Status;
			this.mob_number = mob_number;
			this.email = email;
			Date = date;
		}
		public LeaveEn() {
			super();
			// TODO Auto-generated constructor stub
		}
	}


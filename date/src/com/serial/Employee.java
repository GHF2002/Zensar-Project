package com.serial;

import java.io.Serializable;

	public class Employee implements Serializable
	{
		public Employee(int eNo, String eName, float eSal) {
			super();
			this.eNo = eNo;
			this.eName = eName;
			this.eSal = eSal;
		}
		private int eNo;
		private String eName;
		private transient float eSal;
		/**
		 * @return the eNo
		 */
		public int geteNo() {
			return eNo;
		}
		/**
		 * @param eNo the eNo to set
		 */
		public void seteNo(int eNo) {
			this.eNo = eNo;
		}
		/**
		 * @return the eName
		 */
		public String geteName() {
			return eName;
		}
		/**
		 * @param eName the eName to set
		 */
		public void seteName(String eName) {
			this.eName = eName;
		}
		/**
		 * @return the eSal
		 */
		public float geteSal() {
			return eSal;
		}
		/**
		 * @param eSal the eSal to set
		 */
		public void seteSal(float eSal) {
			this.eSal = eSal;
		}
		@Override
		public String toString() {
			return "Employee [eNo=" + eNo + ", eName=" + eName + ", eSal=" + eSal + "]";
		}
	}


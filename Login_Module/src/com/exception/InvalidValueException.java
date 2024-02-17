package com.exception;

public class InvalidValueException extends Exception{

		private String msg;
		public InvalidValueException(String msg) {

			this.msg=msg;
		}

		@Override
		public String toString() {
			return "Kindly Enter all the values";
		}
		
		
	}



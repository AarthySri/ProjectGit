package com.hcl;

public class Employee {
		public void Add() {
			System.out.println("addition");
		}
		public void Sub() {
			System.out.println("subraction");
		}
		public void And() {
			System.out.println("To perform AND operation");
		}
		
		public static void main(String[] args) {
			
			Employee e = new Employee();
			e.Add();
			e.Sub();
			e.And();
		}

}

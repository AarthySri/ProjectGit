package com.hcl;

public class Employee {
		public void Add() {
			System.out.println("addition");
		}
		public void Sub() {
			System.out.println("subraction");
		}
		private void Div() {
			System.out.println("divition");

		}
		private void Mul() {
			System.out.println("multiplication");

		}
		
		public static void main(String[] args) {
			
			Employee e = new Employee();
			e.Add();
			e.Sub();
			e.Div();
			e.Mul();

		}

}

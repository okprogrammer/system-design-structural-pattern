package com.design.pattern.structural.adapter;

public class Client {

	public static void main(String[] args) {
		EmployeeClassAdapter adapter = new EmployeeClassAdapter();
		populateEmployeeData(adapter);
		BusinessCardDesigner designer = new BusinessCardDesigner();
		String card = designer.designCard(adapter);
		System.out.println(card);
	}

	private static void populateEmployeeData(EmployeeClassAdapter adapter) {
		adapter.setFullName("Om Kumar");
		adapter.setJobTitle("Senior Software Engineer");
		adapter.setOfficeLocation("Mumbai, Maharastra.");
	}

}

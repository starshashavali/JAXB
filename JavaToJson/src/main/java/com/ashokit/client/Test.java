package com.ashokit.client;

import com.ashokit.Car;
import com.ashokit.util.JsonUtil;

public class Test {

	public static void main(String[] args) {
		Car car = new Car();
		car.setNumber(1234);
		car.setName("ADI");
		car.setPrice(100000.0);
		String jsonCar = JsonUtil.convertJavaToJson(car);
		System.out.println(jsonCar);
System.out.println("============================");

Car r=JsonUtil.convertJsonToJava(jsonCar, Car.class);
System.out.println(r.getName()+" ,"+r.getNumber()+","+r.getPrice());
	}

}

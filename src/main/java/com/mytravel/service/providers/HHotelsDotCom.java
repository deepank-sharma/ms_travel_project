package com.mytravel.service.providers;

import java.util.Random;

import com.mytravel.plans.ServiceProvider;
import com.mytravel.vo.TripPlan;

/**
 * @author Deepank Sharma
 *
 */
public class HHotelsDotCom implements ServiceProvider {

	@Override
	public TripPlan createPlan(String origin, String destination) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int price = new Random().nextInt(300);
		TripPlan plan = TripPlan.builder().origin(origin).destination(destination).serviceProvider("Hotels.com")
				.Price(price).alliance(getAlliance()).build();
		System.out.println("Hotels.com :: $" + price);
		return plan;
	}

	@Override
	public String getAlliance() {
		return "West";
	}

}

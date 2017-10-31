package com.paulinopjc.distanceBetweenCities;

public class DistCalc {
	
	private static final double R = 6371.0;
	public double distance(double lat1, double lng1, double lat2, double lng2, char unit){
		
		double theta1 = Math.toRadians(lat2-lat1);
		double theta2 = Math.toRadians(lng2-lng1);
		lat1 = Math.toRadians(lat1);
		lat2 = Math.toRadians(lat2);
		double dist = Math.pow(Math.sin(theta1/2), 2) + Math.pow(Math.sin(theta2/2), 2) * Math.cos(lat1) * Math.cos(lat2);
		
		double c = 2 * Math.asin(Math.sqrt(dist));
		//dist = rad2deg(dist);
		dist = c * R;

		if(unit == 'K') {
			dist = dist;
		}else if(unit=='M'){
			dist = dist * 0.5400;
		}
		return (dist);
	}
	
	/*private double deg2rad(double deg){
		return(deg * Math.PI/180.0);
	}
	
	private double rad2deg(double rad){
		return (rad * 180.0 / Math.PI);
	}*/

}

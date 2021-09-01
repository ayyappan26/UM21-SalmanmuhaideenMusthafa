package com.ultramain.aicraftparts;

public class AircraftParts {
	public static String AircraftName;
	private static int BlackBoxNumber;
	private static int LandingGearModelNum;
	public static long AircraftPriceInFull;
	
	public static String getAircraftName() {
		return AircraftName;
	}
	public static void setAircraftName(String aircraftName) {
		AircraftName = aircraftName;
	}
	public static int getBlackBoxNumber() {
		return BlackBoxNumber;
	}
	public static void setBlackBoxNumber(int blackBoxNumber) {
		BlackBoxNumber = blackBoxNumber;
	}
	public static int getLandingGearModelNum() {
		return LandingGearModelNum;
	}
	public static void setLandingGearModelNum(int landingGearModelNum) {
		LandingGearModelNum = landingGearModelNum;
	}
	public static long getAircraftPriceInFull() {
		return AircraftPriceInFull;
	}
	public static void setAircraftPriceInFull(long aircraftPriceInFull) {
		AircraftPriceInFull = aircraftPriceInFull;
		System.out.println("The Full Price is :" + aircraftPriceInFull);
	}
	
	
}

class IndianArmy{

	static int activeSoldiers = 1237117;
	static int reservedSoldiers = 960000;
	int teamCount = 0;
	
	static void dispArmy(){
		System.out.println("Active soldiers count = " + activeSoldiers);
		System.out.println("Reserved soldiers count = " + reservedSoldiers);
	}
	
	void armyTeams(){
		System.out.println("Total Teams count = " + teamCount);
	}
}

class IndianNavy{
	
	static int activePersonnel = 67252;
	static int reservedPersonnel = 55000;
	int teamCount = 0;
	
	static void dispNavy(){
		System.out.println("Active Personnel count = " + activePersonnel);
		System.out.println("Reserved Personnel count = " + reservedPersonnel);
	}
	
	void navyTeams(){
		System.out.println("Total teams count = " + teamCount);
	}
}

class IndianAirForce{
	
	static int activeAirmen = 139576;
	static int reservedAirmen = 140000;
	int teamCount = 0;
	
	static void dispAirForce(){
		System.out.println("Active Airmen count = " + activeAirmen);
		System.out.println("Reserved Airmen count = " + reservedAirmen);
	}
	
	void airForceTeams(){
		System.out.println("Total teams count = " + teamCount);
	}
}

class ArmedForces{

	public static void main(String [] args){
	
		System.out.println("");
		System.out.println("Indian army:");
		
		IndianArmy alpha = new IndianArmy();
		
		IndianArmy.dispArmy();
		alpha.teamCount = 500;
		alpha.armyTeams();
		
		System.out.println("");
		System.out.println("Indian navy:");
		
		IndianNavy beta = new IndianNavy();
		
		IndianNavy.dispNavy();
		beta.teamCount = 200;
		beta.navyTeams();
		
		System.out.println("");
		System.out.println("IndianAirForce:");
		
		IndianAirForce charlie = new IndianAirForce();
		
		IndianAirForce.dispAirForce();
		charlie.teamCount = 300;
		charlie.airForceTeams();
	}
}


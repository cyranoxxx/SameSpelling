import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		ArrayList<String> pragController = new ArrayList<String>();
		ArrayList<Integer> pragIndex = new ArrayList<Integer>();
		String controller = "";
		String result = "";
		boolean isChecked;
		int num1 = 0;
		int num2 = 0;
		 String prag ="Yesthatssosaidsamandweshouldntbehereatallifwedknownmoreaboutit"
		 		+ "beforewestartedbutisupposeitsoftenthatwaythebravethingsintheoldtal"
		 		+ "esandsongsmrfrodoadventuresasiusedtocallthemiusedtothinkthattheywe"
		 		+ "rethingsthewonderfulfolkofthestorieswentoutandlookedforbecausethey"
		 		+ "wantedthembecausetheywereexcitingandlifewasabitdullakindofasportas"
		 		+ "youmightsaybutthatsnotthewayofitwiththetalesthatreallymatteredorth"
		 		+ "eonestharatstarayinthemindfolkseemtohavebeenjustlandedinthemusuall"
		 		+ "ytheirpathswerelaidthatwayasyouputitbutiexpecttheyhadlotsofchancesl"
		 		+ "ikeusofturningbackonlytheydidntandiftheyhadweshouldntknowbecausethe"
		 		+ "ydhavebeenforgottenwehearaboutthoseasjustwentonandnotalltoagoodend"
		 		+ "mindyouatleastnottowhatfolkinsideastoryandnotoutsideitcallagoodendy"
		 		+ "ouknowcominghomeandfindingsallrightthoughnotquitethesamelikeoldmrbil"
		 		+ "bobutthosearentalwaysthebesttalestohearthoughtheymaybethebesttalesto"
		 		+ "getlandediniwonderwhatsortofatalewevefalleninto";
		
		for (int i = 0; i < prag.length(); i++) {
			if (i < prag.length() - 2) {
				controller = prag.substring(i, i + 3);
				for (int a = 0; a < prag.length(); a++) {
					isChecked = prag.regionMatches(a, controller, 0, 3);
					if (isChecked == true) {
						if (!pragIndex.contains(a)) {
							pragController.add(controller);
							pragIndex.add(a);
							if (pragController.size() > 1) {
								if (pragController.get(pragController.size()-1)
										.equals(pragController.get(pragController.size() - 2).toString())) {
									num1=pragController.size()-1;
									num2=pragController.size()-2;
									result=prag.substring(pragIndex.get(num2),pragIndex.get(num1)+3);
									System.out.println(result);
								}
							}
						}
					}
				}
			}
		}
	}
}

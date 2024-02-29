import java.util.ArrayList;
class Client{

	public static void main(String[] args) {
		ArrayList<String> actions= new ArrayList<>();
		actions.add ("start game");
		actions.add("Resume game");
		actions.add("Pause game");
		actions.add("End game");

		GameMenu gm = new GameMenu(actions);

		gm.displayMenu();

		String userChoice = getAction();
		doAction(userChoice);


	}

		public static void doAction(int action){
			System.out.println(actions.get(action));
		}

}


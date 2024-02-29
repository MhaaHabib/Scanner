class GameMenu{



private ArrayList<String> actions;


GameMenu(ArrayList<String>actions){
this.actions= actions;

}

public void DisplayMenu(){
	for (String s: actions){
		System.out.println (s);
	}
}

}



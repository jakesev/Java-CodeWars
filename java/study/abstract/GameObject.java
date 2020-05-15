public abstract class GameObject{
	public abstract void draw();

	public static void main(String[] args){
		//create an instacne of game object
		GameObject player = new Player();

		GameObject m =  new menu();


		GameObject[] gameObjects = new GameObject[2];
		gameObjects[0] = player;
		gameObjects[1] = m;


		for(GameObject obj: gameObjects){
			obj.draw();
		}

	}

}

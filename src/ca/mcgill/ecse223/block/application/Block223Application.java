package ca.mcgill.ecse223.block.application;

import ca.mcgill.ecse223.block.model.Block223;
import ca.mcgill.ecse223.block.model.Game;
import ca.mcgill.ecse223.block.model.PlayedGame;
import ca.mcgill.ecse223.block.model.UserRole;
import ca.mcgill.ecse223.block.persistence.Block223Persistence;
import ca.mcgill.ecse223.block.view.Login;


public class Block223Application {
	
	private static Block223 block223;
	private static Game game;
	private static UserRole userRole;
	private static PlayedGame currentPlayableGame;

	
	public static void main(String[] args) {
		// start UI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login login = new Login();
                login.login();
            }
        });
	}
	//Done
	public static Block223 getBlock223() {
		if (block223 == null) {
			//changed
			block223 = Block223Persistence.load();
		}
 		return block223;
	}
	public static Block223 resetBlock223() {
		block223 = Block223Persistence.load();
		return block223;

	}

	public static void setCurrentGame (Game aGame) {
		game = aGame;
		}

	public static Game getCurrentGame() {
		if (game == null) {
			return null;
		}
 		return game;
		
	}

	public static void setCurrentUserRole(UserRole aUserRole) {
		userRole = aUserRole;
	}

	public static UserRole getCurrentUserRole() {
		if (userRole == null) {
			return null;
		}
		return userRole;	
	}
	
	public static void setCurrentPlayableGame(PlayedGame aGame){
		currentPlayableGame = aGame;
	}

	public static PlayedGame getCurrentPlayableGame(){
		return currentPlayableGame;
	}
	
}

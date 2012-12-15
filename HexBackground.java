package ch.games.snatch.jack4.utils;

import org.andengine.entity.scene.background.Background;

import android.util.Log;

public class HexBackground extends Background{
	public HexBackground(String hex){	
		if(hex.length()>6){
			Log.e("HexBackground", "Hex must be 6 character long.");
			Log.e("HexBackground", "Example:");
			Log.e("HexBackground", "setBackground(new HexBackground(\"028482\"));");
			setColor(1,1,1);
		}else{
			setColor(getRed(hex), getGreen(hex), getBlue(hex));
		}
	}

	private static float getGreen(String hex) {
		float mGreen 	= Integer.parseInt(hex.charAt(2)+""+hex.charAt(3),16)/255f;
		Log.d("HexBackground", "Green: "+mGreen);
		return mGreen;
	}

	private static float getRed(String hex) {
		float mRed 	= Integer.parseInt((hex.charAt(0)+""+hex.charAt(1)),16)/255f;
		Log.d("HexBackground", "Red: "+mRed);
		return mRed;
	}

	private static float getBlue(String hex) {
		float mBlue	 = Integer.parseInt(hex.charAt(4)+""+hex.charAt(5),16)/255f;
		Log.d("HexBackground", "Blue : "+mBlue);
		return mBlue;
	}
}

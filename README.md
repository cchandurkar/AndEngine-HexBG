AndEngine-Hexadecimal-Background-Wrapper
========================================

Find it difficult  to use OpenGL color values in AndEngine?<br />
This Wrapper will let you use Hexadecimal color values to render simple backgrounds.

##Usage

* Instead of **Background** class of [AndEngine](https://github.com/nicolasgramlich/AndEngine) use [HexBackground](https://github.com/cchandurkar/AndEngine-Hexadecimal-Background-Wrapper/blob/master/HexBackground.java) class to render background with hexadecimal color.
* Make sure you pass exactly 6 character string to HexBackground constructor.
* Do not use any special characters like "#".
* Invalid input will result in white background.

````java
public class SplashScene extends Scene{

	public SplashScene() {
		setBackground(new HexBackground("028482"));
	}
  
}
````

## Coming Soon
* Simple Gradient Backgrounds for AndEngine Scenes.


## Other Wrappers
* Make your TextView and Button text Glow - [Glowing Text Animation API](https://github.com/cchandurkar/Glowing-Text-Animation)

import java.awt.*;
import java.applet.*;
public class ButtonAppplet extends Applet {
	
	Button b1, b2, b3,b4, b5;
	public void init() {
		
		b5 = new Button("Dose nothing");
		
		b1 = new Button();
		b1.setLabel("Dissable middle button");
		b2 = new Button("Middle button");
		b3 = new Button("Enable the middle button");
		b4 = new Button("Restet all");
		b3.disable();
		
		// add components to the Applet using the default flowLayout
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		// this is necessary when adding buttons to an already existing 
		// container
		validate();
	}
	
	public boolean action(Event e, Object arg) {
		
		Object target = e.target;
		
		if(target == b1) { // they clicked disable the middle button
			b1.disable();
			b2.disable();
			b3.enable();
			return true;
		}
		if(target == b2) {
			b1.disable();
			b2.disable();
			b3.disable();
			b5.disable();
			return true;
		}
		if(target == b3) { // they clicked enable the middle button
			b1.enable();
			b2.enable();
			b3.disable();
			return true;
		}
		if(target == b4) {
			b1.enable();
			b2.enable();
			b3.enable();
			b4.enable();
			b5.enable();
			return true;
		}
		
		return false;
	}
}

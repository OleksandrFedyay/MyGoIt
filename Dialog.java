import javax.swing.JOptionPane;

public class Dialog {

	public static void main (String[] args){
		String name = JOptionPane.showInputDialog("Как тебя зовут?");
		
		String message = String.format("Ааааа! %s - рыжая писька!!!", name); 
		
		JOptionPane.showMessageDialog(null, message);
	}
}

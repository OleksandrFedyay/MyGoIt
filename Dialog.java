import javax.swing.JOptionPane;

public class Dialog {

	public static void main (String[] args){
		String name = JOptionPane.showInputDialog("��� ���� �����?");
		
		String message = String.format("�����! %s - ����� ������!!!", name); 
		
		JOptionPane.showMessageDialog(null, message);
	}
}

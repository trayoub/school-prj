package separateur;
import java.awt.*;
import java.text.*;
public class SeparateurMilliers {
	Frame f= new Frame();
	Button b;
	TextField tf1;
	TextField tf2;
	TextField tf3;
	Label l1;
	Label l2;
	Label l3;
	Label l4;
	Panel p1;
	Panel p2;
	Panel p3;
	Panel p4;
	public void afficher(){
		p1=new Panel();tf1=new TextField();
		p2=new Panel();tf2=new TextField();
		p3=new Panel();tf3=new TextField();
		p4=new Panel();
		l1=new Label("facilit� de caisse");
		l2=new Label("Montant");
		l3=new Label("Note");
		l4=new Label("Montant invalide");
		b=new Button("Enregistrer");
		p1.add(l1);
		p1.add(tf1);
		p2.add(l2);
		p2.add(tf2);
		p3.add(l3);
		p3.add(tf3);
		p4.add(l4);
		p4.add(b);
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(p4);
		f.setSize(500,300);
		f.setLayout(new GridLayout());
		f.setVisible(true);
	}
	public static String format(String montant)  {
		String str;
		DecimalFormat df = new DecimalFormat("######.00");
		str = (" + df.parse.format(montant)+ ");
	    try {
	        	str = (" + df.parse.format(montant)+ ");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		return str;
		}
	
	public static void main(String[]ags){
		SeparateurMilliers F=new SeparateurMilliers();
		F.afficher();
	}

}

package exerciciosparaconcurso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.Font;

public class Help extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException |InstantiationException |IllegalAccessException |javax.swing.UnsupportedLookAndFeelException ex) {
           System.err.println(ex);
        
        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help frame = new Help();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Help() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Help.class.getResource("/Icons/help03.jpg")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 274, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Developed By Denis Luiz", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(6, 6, 256, 400);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 16, 250, 378);
		panel.add(scrollPane);
		
		JEditorPane dtrpnOnserveParaLigar = new JEditorPane();
		dtrpnOnserveParaLigar.setFont(new Font("SansSerif", Font.BOLD, 12));
		dtrpnOnserveParaLigar.setForeground(new Color(0, 0, 0));
		dtrpnOnserveParaLigar.setBackground(new Color(211, 211, 211));
		dtrpnOnserveParaLigar.setEditable(false);
		dtrpnOnserveParaLigar.setText("On=Serve para Ligar a Calculadora.\r\nOff=Serve para Desligar a Calculadora. \r\nMod=Resto da Divis\u00E3o.Ex: 2%2=0.\r\n<-=Serve para Voltar Para o Primeiro Valor e Diminuir O valor digitado.\r\nPara ura essa Fun\u00E7\u00E3o basta digitar o valor desejado e por final Clicar na Fun\u00E7\u00E3o <-.Ex: 16<-=15. \r\nPara usar Essa fun\u00E7\u00E3o basta digitar o primeiro n\u00FAmero e depois Clicar na fun\u00E7\u00E3o Mod e depois Clicar no segundo Numero e por final Clicar no operador igual(\"=\").\r\nPT=Pot\u00EAncia ou  Exponencial.\r\nPara usar Essa fun\u00E7\u00E3o basta digitar o primeiro n\u00FAmero e depois Clicar na fun\u00E7\u00E3o PT e depois Clicar no segundo Numero e por final Clicar no operador igual(\"=\").\r\n%=Percentagem.\r\nPara usar essa Func\u00E3o basta digitar o valor desejado e por final Clicar na Fun\u00E7\u00E3o %.\r\nn!=Fatorial.\r\nPara usar essa Func\u00E3o basta digitar o valor desejado  e por final Clicar na Fun\u00E7\u00E3o n!.Ex: 3n!=6.\r\nSin=Seno.\r\nPara usar essa Func\u00E3o basta digitar o valor do Angulo desejado e por final Clicar na Fun\u00E7\u00E3o Sin.\r\nCos=Cosseno.\r\nPara usar essa Func\u00E3o basta digitar o valor do Angulo desejado e por final Clicar na Fun\u00E7\u00E3o Cos.\r\nM+=Essa Fun\u00E7\u00E3o serve para guardar o valor na Memoria da Calculadora.\r\nMR=Essa  Fun\u00E7\u00E3o serve recuperar o valor na Memoria da Calculadora.\r\nINV=Inversor de Sinal.\r\nPara usar esta Fun\u00E7\u00E3o basta digitar o valor desejado e por final Clicar na Fun\u00E7\u00E3o INV.Ex:12INV=-12 e vice-versa.");
		scrollPane.setViewportView(dtrpnOnserveParaLigar);
		
	}

}

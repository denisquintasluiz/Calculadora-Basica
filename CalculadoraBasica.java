package exerciciosparaconcurso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Dialog.ModalExclusionType;

public class CalculadoraBasica extends JFrame {

	private JPanel contentPane;
	private JTextField txtResultado;
	public double primeiro=0;
	public double segundo=0;
	public double soma=0;
	public double resto;
	public double subtra;
	public double divisao;
	public double fatorial;
	double inversor;
	public double multi;
	public double memoria;
	public String operador;

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
					CalculadoraBasica frame = new CalculadoraBasica();
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
	public CalculadoraBasica() {
		setResizable(false);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("Calculadora B\u00E1sica");
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalculadoraBasica.class.getResource("/Icons/calc02.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 327, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
       
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(6, 6, 305, 458);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 6, 293, 50);
		panel_1.setBackground(new Color(240, 255, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);

		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Arial", Font.BOLD, 16));
		txtResultado.setText("0");
		txtResultado.setEditable(false);
		txtResultado.setBounds(6, 6, 281, 38);
		panel_1.add(txtResultado);
		txtResultado.setColumns(10);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(224, 255, 255));
		panel_2.setBounds(6, 68, 293, 384);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JButton btnOn = new JButton("On");
		btnOn.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResultado.setEditable(true);
				txtResultado.setText("");

			}
		});
		btnOn.setBackground(new Color(50, 205, 50));
		btnOn.setForeground(new Color(245, 255, 250));
		btnOn.setBounds(10, 42, 90, 37);
		panel_2.add(btnOn);

		JButton btnOff = new JButton("Off");
		btnOff.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setEditable(false);
				txtResultado.setText("0");

			}
		});
		btnOff.setBackground(new Color(255, 0, 0));
		btnOff.setForeground(new Color(245, 245, 245));
		btnOff.setBounds(99, 41, 103, 38);
		panel_2.add(btnOff);

		JButton btnCe = new JButton("CE");
		btnCe.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					primeiro=0;
					segundo=0;
					txtResultado.setText("");
				}

			}
		});
		btnCe.setBackground(new Color(0, 255, 255));
		btnCe.setForeground(new Color(245, 245, 245));
		btnCe.setBounds(201, 42, 90, 37);
		panel_2.add(btnCe);

		JButton btnC = new JButton("C");
		btnC.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					int num=Integer.parseInt(txtResultado.getText());
					txtResultado.setText(Integer.toString(num-1));
					
				}
			}
		});
		btnC.setBackground(new Color(0, 255, 255));
		btnC.setForeground(new Color(245, 255, 250));
		btnC.setBounds(10, 160, 59, 37);
		panel_2.add(btnC);

		JButton btnDiv = new JButton("/");
		btnDiv.setFont(new Font("SansSerif", Font.PLAIN, 20));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					primeiro=Double.parseDouble(txtResultado.getText());
					operador="/";
					txtResultado.setText("");
				}
			}
		});
		btnDiv.setBackground(new Color(255, 215, 0));
		btnDiv.setBounds(211, 160, 80, 37);
		panel_2.add(btnDiv);

		JButton btnMult = new JButton("x");
		btnMult.setFont(new Font("SansSerif", Font.PLAIN, 20));
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					primeiro=Double.parseDouble(txtResultado.getText());
					operador="x";
					txtResultado.setText("");
				}
			}
		});
		btnMult.setBackground(new Color(255, 215, 0));
		btnMult.setBounds(211, 198, 80, 37);
		panel_2.add(btnMult);

		JButton btnLess = new JButton("-");
		btnLess.setFont(new Font("SansSerif", Font.PLAIN, 24));
		btnLess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					primeiro=Double.parseDouble(txtResultado.getText());
					operador="-";
					txtResultado.setText("");
				}
			}
		});
		btnLess.setBackground(new Color(255, 215, 0));
		btnLess.setBounds(211, 236, 80, 37);
		panel_2.add(btnLess);

		JButton btnMore = new JButton("+");
		btnMore.setFont(new Font("SansSerif", Font.PLAIN, 20));
		btnMore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					primeiro=(Double.parseDouble(txtResultado.getText()));
					if(primeiro<0 || primeiro>0) {
						operador="+";
						txtResultado.setText("");
					}
					/*else if(primeiro==0){
						txtResultado.setText(txtResultado.getText()+ "+");
					}*/
				}
			}
		});
		btnMore.setBackground(new Color(255, 215, 0));
		btnMore.setBounds(211, 278, 80, 37);
		panel_2.add(btnMore);

		JButton btnEquals = new JButton("=");
		btnEquals.setFont(new Font("SansSerif", Font.PLAIN, 20));
		btnEquals.addActionListener(new ActionListener() {
			private double potencia;

			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					 /*if(primeiro==0 && segundo==0 && operador==null) {
						txtResultado.setText(txtResultado.getText());
					}*/
					 segundo=Double.parseDouble(txtResultado.getText());
					 if(operador.equals("+") && primeiro!=0 && segundo!=0 ) {
                      soma=(primeiro+segundo);
                      txtResultado.setText(Double.toString(soma));
					}
					 if(operador.equals("-") && primeiro!=0 && segundo!=0) {
						 subtra=(primeiro-segundo);
						 txtResultado.setText(Double.toString(subtra));
					 }
					 if(operador.equals("x") && primeiro!=0 && segundo!=0) {
						 multi=(primeiro*segundo);
						 txtResultado.setText(Double.toString(multi));
					 }
					 if(operador.equals("/") && primeiro!=0 && segundo!=0) {
						 divisao=(primeiro/segundo);
						 txtResultado.setText(Double.toString(divisao));
					 }
					 if(operador.equals("%") && primeiro!=0 && segundo!=0) {
						 resto=(primeiro%segundo);
						 txtResultado.setText(Double.toString(resto));
					 }
					 if(operador.equals("pt") && primeiro!=0 && segundo!=0) {
						 potencia=(Math.pow(primeiro, segundo));
						 txtResultado.setText(Double.toString(potencia));
					 }
					
				}
			}
		});
		btnEquals.setBackground(new Color(255, 69, 0));
		btnEquals.setForeground(new Color(245, 255, 250));
		btnEquals.setBounds(201, 316, 90, 61);
		panel_2.add(btnEquals);

		JButton btnResDiv = new JButton("Mod");
		btnResDiv.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnResDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					primeiro=Double.parseDouble(txtResultado.getText());
					operador="%";
					txtResultado.setText("");
				}
			}
		});
		btnResDiv.setBackground(new Color(255, 215, 0));
		btnResDiv.setBounds(143, 160, 66, 37);
		panel_2.add(btnResDiv);

		JButton btnRight = new JButton("< --");
		btnRight.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
		        	txtResultado.setText(Integer.toString((int)primeiro));
		        	segundo=0;
		        	primeiro-=1;
				}
			}
		});
		btnRight.setBackground(new Color(0, 0, 0));
		btnRight.setForeground(new Color(245, 255, 250));
		btnRight.setBounds(72, 160, 69, 37);
		panel_2.add(btnRight);

		JButton btnOne = new JButton("1");
		btnOne.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					txtResultado.setText(txtResultado.getText()+ 1);
				}
			}
		});
		btnOne.setBackground(new Color(0, 0, 0));
		btnOne.setForeground(new Color(245, 255, 250));
		btnOne.setBounds(9, 203, 59, 37);
		panel_2.add(btnOne);

		JButton btnTwo = new JButton("2");
		btnTwo.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					txtResultado.setText(txtResultado.getText()+ 2);
				}
			}
		});
		btnTwo.setBackground(new Color(0, 0, 0));
		btnTwo.setForeground(new Color(245, 255, 250));
		btnTwo.setBounds(71, 203, 67, 37);
		panel_2.add(btnTwo);

		JButton btnThree = new JButton("3");
		btnThree.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					txtResultado.setText(txtResultado.getText()+ 3);
				}
			}

		});
		btnThree.setBackground(new Color(0, 0, 0));
		btnThree.setForeground(new Color(245, 255, 250));
		btnThree.setBounds(142, 203, 66, 37);
		panel_2.add(btnThree);

		JButton btnFor = new JButton("4");
		btnFor.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					txtResultado.setText(txtResultado.getText()+ 4);
				}

			}
		});
		btnFor.setBackground(new Color(0, 0, 0));
		btnFor.setForeground(new Color(245, 255, 250));
		btnFor.setBounds(9, 240, 59, 37);
		panel_2.add(btnFor);

		JButton btnFive = new JButton("5");
		btnFive.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					txtResultado.setText(txtResultado.getText()+ 5);
				}

			}
		});
		btnFive.setBackground(new Color(0, 0, 0));
		btnFive.setForeground(new Color(245, 255, 250));
		btnFive.setBounds(71, 240, 67, 37);
		panel_2.add(btnFive);

		JButton btnSix = new JButton("6");
		btnSix.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					txtResultado.setText(txtResultado.getText()+ 6);
				}

			}
		});
		btnSix.setBackground(new Color(0, 0, 0));
		btnSix.setForeground(new Color(245, 255, 250));
		btnSix.setBounds(142, 240, 66, 37);
		panel_2.add(btnSix);

		JButton btnPC = new JButton("%");
		btnPC.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnPC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtResultado.isEditable()==true) {
					primeiro=Double.parseDouble(txtResultado.getText());
					if(primeiro!=0) {
						txtResultado.setText(Double.toString(primeiro/100));
					}
					else if(primeiro==0){
						JOptionPane.showMessageDialog(null, "Digite um  Valor antes de Clicar em PC","Calculadora Basica",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnPC.setBackground(new Color(0, 0, 0));
		btnPC.setForeground(new Color(245, 255, 250));
		btnPC.setBounds(6, 319, 59, 59);
		panel_2.add(btnPC);

		JButton btnPoint = new JButton(".");
		btnPoint.setFont(new Font("SansSerif", Font.PLAIN, 20));
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					txtResultado.setText(txtResultado.getText()+ ".");
				}

			}
		});
		btnPoint.setBackground(new Color(0, 0, 0));
		btnPoint.setForeground(new Color(245, 255, 250));
		btnPoint.setBounds(68, 319, 62, 59);
		panel_2.add(btnPoint);

		JButton btnZero = new JButton("0");
		btnZero.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					txtResultado.setText(txtResultado.getText()+ 0);
				}

			}
		});
		btnZero.setBackground(new Color(0, 0, 0));
		btnZero.setForeground(new Color(245, 255, 250));
		btnZero.setBounds(132, 319, 66, 59);
		panel_2.add(btnZero);

		JButton btnSeven = new JButton("7");
		btnSeven.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					txtResultado.setText(txtResultado.getText()+ 7);
				}

			}
		});
		btnSeven.setBackground(new Color(0, 0, 0));
		btnSeven.setForeground(new Color(245, 255, 250));
		btnSeven.setBounds(9, 279, 59, 37);
		panel_2.add(btnSeven);

		JButton bnEight = new JButton("8");
		bnEight.setFont(new Font("SansSerif", Font.PLAIN, 16));
		bnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					txtResultado.setText(txtResultado.getText()+ 8);
				}

			}
		});
		bnEight.setBackground(new Color(0, 0, 0));
		bnEight.setForeground(new Color(245, 255, 250));
		bnEight.setBounds(69, 279, 67, 37);
		panel_2.add(bnEight);

		JButton btnNine = new JButton("9");
		btnNine.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					txtResultado.setText(txtResultado.getText()+ 9);
				}

			}
		});
		btnNine.setBackground(new Color(0, 0, 0));
		btnNine.setForeground(new Color(245, 255, 250));
		btnNine.setBounds(142, 279, 66, 37);
		panel_2.add(btnNine);
		
		JButton btnRz = new JButton("Rz");
		btnRz.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnRz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					primeiro=Double.parseDouble(txtResultado.getText());
					if(primeiro!=0) {
						txtResultado.setText(Double.toString(Math.sqrt(primeiro)));
					}
				}
			}
		});
		btnRz.setForeground(new Color(245, 255, 250));
		btnRz.setBackground(Color.CYAN);
		btnRz.setBounds(10, 127, 59, 37);
		panel_2.add(btnRz);
		
		JButton btnPt = new JButton("PT");
		btnPt.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnPt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					primeiro=Double.parseDouble(txtResultado.getText());
					operador="pt";
					txtResultado.setText("");
				}
			}
		});
		btnPt.setForeground(new Color(245, 255, 250));
		btnPt.setBackground(Color.BLACK);
		btnPt.setBounds(72, 127, 69, 37);
		panel_2.add(btnPt);
		
		JButton btnF = new JButton("n!");
		btnF.setFont(new Font("SansSerif", Font.PLAIN, 18));
		btnF.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					primeiro=Double.parseDouble(txtResultado.getText());
					if(primeiro!=0) {
					 double aux=1;
					 for(int i=2;i<=primeiro;i++) {
						 aux*=i;
					 }
					 fatorial=aux;
						txtResultado.setText(Double.toString(fatorial));
					}
				}
			}
		});
		btnF.setBackground(new Color(255, 215, 0));
		btnF.setBounds(143, 127, 66, 37);
		panel_2.add(btnF);
		
		JButton btnInv = new JButton("INV");
		btnInv.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnInv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtResultado.isEditable()==true) {
					inversor=Double.parseDouble(txtResultado.getText());
					txtResultado.setText(Integer.toString(Math.negateExact((int)inversor)));
				}
				
			}
		});
		btnInv.setBackground(new Color(255, 215, 0));
		btnInv.setBounds(211, 127, 80, 37);
		panel_2.add(btnInv);
		
		JButton btnM = new JButton("M+");
		btnM.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtResultado.isEditable()==true) {
					memoria=Double.parseDouble(txtResultado.getText());
					
				}
			}
		});
		btnM.setForeground(new Color(245, 255, 250));
		btnM.setBackground(Color.CYAN);
		btnM.setBounds(10, 81, 59, 37);
		panel_2.add(btnM);
		
		JButton btnMr = new JButton("MR");
		btnMr.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnMr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					txtResultado.setText(Double.toString(memoria));
				}
			}
		});
		btnMr.setForeground(new Color(245, 255, 250));
		btnMr.setBackground(Color.BLACK);
		btnMr.setBounds(72, 81, 69, 37);
		panel_2.add(btnMr);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					primeiro=Double.parseDouble(txtResultado.getText());
						double grauRadiano=Math.toRadians(primeiro);
						      double resultado=Math.sin(grauRadiano);
						      txtResultado.setText(Double.toString(resultado));
				}
			}
		});
		btnSin.setBackground(new Color(255, 215, 0));
		btnSin.setBounds(143, 81, 66, 37);
		panel_2.add(btnSin);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setFont(new Font("SansSerif", Font.PLAIN, 16));
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResultado.isEditable()==true) {
					primeiro=Double.parseDouble(txtResultado.getText());
						double grauRadiano=Math.toRadians(primeiro);
						      double resultado=Math.cos(grauRadiano);
						      txtResultado.setText(Double.toString(resultado));
				}
			}
		});
		btnCos.setBackground(new Color(255, 215, 0));
		btnCos.setBounds(211, 81, 80, 37);
		panel_2.add(btnCos);
		
		JButton btnAjuda = new JButton("Ajuda");
		btnAjuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Help ajuda= new Help();
				ajuda.setVisible(true);
			}
		});
		btnAjuda.setBounds(211, 8, 76, 22);
		panel_2.add(btnAjuda);
	}
}

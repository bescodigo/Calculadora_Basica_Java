package graphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import Logica.Logica;

public class Calculadora extends JFrame{
	
	//------------------------------------------------------------------------
	Panel panel = new Panel();
	
	static public DefaultListModel<String> pantalla = new DefaultListModel<>();
	
	JList mostrar;
	
	String acumulaValoresIntroducidos="";
	
	Logica negocio = new Logica();
	
	Font f = new Font("Dialog", Font.BOLD, 15);
	
	//-------------------------------------------------------------------------
	
	
	
	/** 
     *   Guarda el operador y verifica si es el primera operador ingreasado.
     *   Si ya se a ingresado un operador, realiza la operacion en base a el primero
     *   y guarda este segundo que se acaba de ingreasar.
     */
    public void AgregarOperador(String oper)
    {
        negocio.operacion.opActivado = true;

        if (negocio.operacion.op != "")
        {
            Calcular();
        }

        negocio.operacion.op = oper;

        acumulaValoresIntroducidos += oper;

        Calcular();
    }
	
	
	
	private void Calcular() {
	//  Limpia la Pantalla.
        pantalla.clear();

        // Limpia el acumulador de caracteres.
        acumulaValoresIntroducidos = "";


        switch (negocio.operacion.op)
        {
            case "+":
                negocio.operacion.resultado = negocio.operacion.Suma().toString();
                MostrarResultado(negocio.operacion.op);
                break;
            case "-":
                negocio.operacion.resultado = negocio.operacion.Resta().toString();
                MostrarResultado(negocio.operacion.op);
                break;
            case "/":
                negocio.operacion.resultado = negocio.operacion.Division().toString();
                MostrarResultado(negocio.operacion.op);
                break;
            case "*":
                negocio.operacion.resultado = negocio.operacion.Multiplicar().toString();
                MostrarResultado(negocio.operacion.op);
                break;

            case "%":
                negocio.operacion.resultado = negocio.operacion.Porciento().toString();
                MostrarResultado(negocio.operacion.op);
                break;


            default:
                break;
        }
        
        //	num2 en cero para que cuando apretemos otro boton/numero no sume un valor 
        //reciduo de la anterior operación.
        negocio.operacion.num2 = "0";
		
	}


	
	private void MostrarResultado(String op) {
		
		 //	Pasamos el resultado a num1 para que quede a la espera de el siguiente calculo.
		 negocio.operacion.num1 = negocio.operacion.resultado;
		 
		 //	Mostramos en pantalla el resultado.
         pantalla.insertElementAt(negocio.operacion.resultado, 0);
         
         //	Concatenamos el resultado con el operador para mostrarlo luego de apretar otro boton.
         acumulaValoresIntroducidos = negocio.operacion.resultado.toString() + op;
		
	}

	
	
	private void MostrarProcedimiento(String valor) {
		pantalla.clear();

        acumulaValoresIntroducidos += valor;
        
        pantalla.insertElementAt(acumulaValoresIntroducidos, 0);

	}


	//	BOTONES.
	JButton btn0 = new JButton();
	void crearBoton0() {
		btn0.setText("0");
		btn0.setBounds(50, 300, 50,50);
		btn0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//	Verifica si tiene que concatenar num1 o num2 con el valor introducido.
				negocio.valorIntroducido(btn0.getText());
	            MostrarProcedimiento(btn0.getText());
			}

			
		});
	}

	
	JButton btn1 = new JButton();
	void crearBoton1() {
		btn1.setText("1");
		btn1.setBounds(0, 250, 50,50);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				negocio.valorIntroducido(btn1.getText());
	            MostrarProcedimiento(btn1.getText());
			}
		});
	}
	
	JButton btn2 = new JButton();
	void crearBoton2() {
		btn2.setText("2");
		btn2.setBounds(50, 250, 50,50);
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				negocio.valorIntroducido(btn2.getText());
	            MostrarProcedimiento(btn2.getText());
			}
		});
	}
	
	JButton btn3 = new JButton();
	void crearBoton3() {
		btn3.setText("3");
		btn3.setBounds(100, 250, 50,50);
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				negocio.valorIntroducido(btn3.getText());
	            MostrarProcedimiento(btn3.getText());
			}
		});
	}
	
	
	
	JButton btn4 = new JButton();
	void crearBoton4() {
		btn4.setText("4");
		btn4.setBounds(0, 200, 50,50);
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				negocio.valorIntroducido(btn4.getText());
	            MostrarProcedimiento(btn4.getText());
			}
		});
	}
	
	JButton btn5 = new JButton();
	void crearBoton5() {
		btn5.setText("5");
		btn5.setBounds(50, 200, 50,50);
		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				negocio.valorIntroducido(btn5.getText());
	            MostrarProcedimiento(btn5.getText());
			}
		});
	}
	
	JButton btn6 = new JButton();
	void crearBoton6() {
		btn6.setText("6");
		btn6.setBounds(100, 200, 50,50);
		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				negocio.valorIntroducido(btn6.getText());
	            MostrarProcedimiento(btn6.getText());
			}
		});
	}
	
	JButton btn7 = new JButton();
	void crearBoton7() {
		btn7.setText("7");
		btn7.setBounds(0, 150, 50,50);
		btn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				negocio.valorIntroducido(btn7.getText());
	            MostrarProcedimiento(btn7.getText());
			}
		});
	}
	
	JButton btn8 = new JButton();
	void crearBoton8() {
		btn8.setText("8");
		btn8.setBounds(50, 150, 50,50);
		btn8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				negocio.valorIntroducido(btn8.getText());
	            MostrarProcedimiento(btn8.getText());
			}
		});
	}
	
	JButton btn9 = new JButton();
	void crearBoton9() {
		btn9.setText("9");
		btn9.setBounds(100, 150, 50,50);
		btn9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				negocio.valorIntroducido(btn9.getText());
	            MostrarProcedimiento(btn9.getText());
			}
		});
	}
	//----------------------------------------------------------------
	
	
	
	
	//	OPERADORES.
	JButton btnPunto = new JButton();
	void crearBotonPunto() {
		btnPunto.setFont(f);
		btnPunto.setText(".");
		
		btnPunto.setBounds(0, 320, 50,50);
		btnPunto.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				negocio.valorIntroducido(btnPunto.getText());
	            MostrarProcedimiento(btnPunto.getText());
			}
		});
	}
	
	JButton btnClear = new JButton();
	void crearBotonClear() {
		btnClear.setFont(f);
		btnClear.setText("C");
		btnClear.setBounds(205, 150, 50,50);
		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				 negocio.operacion.num1 = "0";
		            negocio.operacion.num2 = "0";
		            negocio.operacion.op = "";
		            negocio.operacion.opActivado = false;
		            pantalla.clear();
		            acumulaValoresIntroducidos = "";
			}
		});
	}
	
	JButton btnDiv = new JButton();
	void crearBotonDiv() {
		btnDiv.setFont(f);
		btnDiv.setText("/");
		btnDiv.setBounds(155, 150, 50,50);
		btnDiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				 AgregarOperador(btnDiv.getText());
			}
		});
	}
	

	JButton btnMulti = new JButton();
	void crearBotonMulti() {
		btnMulti.setFont(f);
		btnMulti.setText("*");
		btnMulti.setBounds(155, 250, 50,50);
		btnMulti.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				AgregarOperador(btnMulti.getText());
			}
		});
	}

	JButton btnRest = new JButton();
	void crearBotonRest() {
		btnRest.setFont(f);
		btnRest.setText("-");
		btnRest.setBounds(155, 200, 50,50);
		btnRest.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				AgregarOperador(btnRest.getText());
			}
		});
	}

	JButton btnSuma = new JButton();
	void crearBotonSuma() {
		btnSuma.setFont(f);
		btnSuma.setText("+");
		btnSuma.setBounds(205, 250, 50,50);
		btnSuma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				AgregarOperador(btnSuma.getText());
			}
		});
	}

	JButton btnIgual = new JButton();
	void crearBotonIgual() {
		btnIgual.setFont(f);
		btnIgual.setText("=");
		btnIgual.setBounds(100, 320, 50,50);
		btnIgual.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Calcular();
			}
		});
	}
	
	JButton btnPorciento = new JButton();
	
	void crearBotonPorciento() {
		btnPorciento.setText("%");
		btnPorciento.setFont(f);
		btnPorciento.setBounds(205, 200, 50,50);
		btnPorciento.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				AgregarOperador(btnPorciento.getText());
			}
		});
	}
	//-----------------------------------------------------------------
	
	
	
	//	FRAME.
	public Calculadora() {
		
		crearBoton0();
		crearBoton1();
		crearBoton2();
		crearBoton3();
		crearBoton4();
		crearBoton5();
		crearBoton6();
		crearBoton7();
		crearBoton8();
		crearBoton9();
		
		crearBotonPunto();
		crearBotonClear();
		crearBotonDiv();
		crearBotonMulti();
		crearBotonRest();
		crearBotonSuma();
		crearBotonIgual();
		crearBotonPorciento();
		
		
		mostrar = new JList(pantalla);
		
		mostrar.setBounds(10,40,240,50);
		
		
		
		panel.add(mostrar);
		
		panel.setBackground(Color.DARK_GRAY);
		
		panel.add(btn0);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		panel.add(btn7);
		panel.add(btn8);
		panel.add(btn9);
		panel.add(btnPunto);
		panel.add(btnClear);
		panel.add(btnDiv);
		panel.add(btnMulti);
		panel.add(btnRest);
		panel.add(btnSuma);
		panel.add(btnIgual);
		panel.add(btnPorciento);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla = miPantalla.getScreenSize();
		
		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;
		
		setSize(anchoPantalla/3, (alturaPantalla/2)+100);
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		
		setTitle("Calculadora Basica");
		
		Image icono = miPantalla.getImage("src/graphics/Sin título.png");
		
		setIconImage(icono);
		
		setVisible(true);
		
		panel.setLayout(null);
		
		add(panel);
		
	}
	//---------------------------------------------------------------------
	
	
	class Panel extends JPanel{
		
		
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
		
		}
		
	}
}

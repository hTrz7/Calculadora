package calculadora;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame{
	
	public double primeiroNum = 0;
	public String operacao = "";
	public boolean novaEntrada = true;
	
	public Screen() {
		setTitle("Teste Calculadora");
		setVisible(true);
		setSize(295, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(null);
		JTextField visor = new JTextField();
		visor.setBounds(20, 30, 240, 70);
		visor.setFont(new Font("Arial", Font.BOLD, 40));
		visor.setForeground(new Color(255, 255, 255));
		visor.setBackground(new Color(00, 00, 00));
		add(visor);
		
		JButton jButtonZero = new JButton("0");
		jButtonZero.setBounds(20, 320, 60, 60);
		jButtonZero.setFont(new Font("Arial", Font.BOLD, 30));
		jButtonZero.setForeground(new Color(255, 255, 255));
		jButtonZero.setBackground(new Color(00, 00, 00));			
		jButtonZero.addActionListener(e -> {
			if(!visor.getText().equals("0") || novaEntrada) {
				visor.setText(visor.getText() + "0");
				novaEntrada = false;
			}
		});
		add(jButtonZero);

		
		JButton jButtonUm = new JButton("1");
		jButtonUm.setBounds(20, 260, 60, 60);
		jButtonUm.setFont(new Font("Arial", Font.BOLD, 30));
		jButtonUm.setForeground(new Color(255, 255, 255));
		jButtonUm.setBackground(new Color(00, 00, 00));
		jButtonUm.addActionListener(e -> {
			if(novaEntrada) { /*verifica se é uma nova entrada*/
				visor.setText(jButtonUm.getText()); /*sendo uma nova entrada, o numero clicado ira para o visor*/
				novaEntrada = false; /*é atribuido false para a nova entrada, já que ela deixou de ser uma nova entrada*/
			}else { /*se nao for uma nova entrada*/
				visor.setText(visor.getText() + jButtonUm.getText()); /*é concatenado o numero clicado ao numero ja existente no visor*/
			}
		});
		add(jButtonUm);
		
		JButton jButtonDois = new JButton("2");
		jButtonDois.setBounds(80, 260, 60, 60);
		jButtonDois.setFont(new Font("Arial", Font.BOLD, 30));
		jButtonDois.setForeground(new Color(255, 255, 255));
		jButtonDois.setBackground(new Color(00, 00, 00));
		jButtonDois.addActionListener(e -> {
			if(novaEntrada) {
				visor.setText(jButtonDois.getText());
				novaEntrada = false;
			}else {
				visor.setText(visor.getText() + jButtonDois.getText());
			}
		});	
		add(jButtonDois);
		
		JButton jButtonTres = new JButton("3");
		jButtonTres.setBounds(140, 260, 60, 60);
		jButtonTres.setFont(new Font("Arial", Font.BOLD, 30));
		jButtonTres.setForeground(new Color(255, 255, 255));
		jButtonTres.setBackground(new Color(00, 00, 00));
		jButtonTres.addActionListener(e -> {
			if(novaEntrada) {
				visor.setText(jButtonTres.getText());
				novaEntrada = false;
			}else {
				visor.setText(visor.getText() + jButtonTres.getText());
			}
		});
		add(jButtonTres);
		
		JButton jButtonQuatro = new JButton("4");
		jButtonQuatro.setBounds(20, 200, 60, 60);
		jButtonQuatro.setFont(new Font("Arial", Font.BOLD, 30));
		jButtonQuatro.setForeground(new Color(255, 255, 255));
		jButtonQuatro.setBackground(new Color(00, 00, 00));
		jButtonQuatro.addActionListener(e -> {
			if(novaEntrada) {
				visor.setText(jButtonQuatro.getText());
				novaEntrada = false;
			}else {
				visor.setText(visor.getText() + jButtonQuatro.getText());
			}
		});
		add(jButtonQuatro);
		
		JButton jButtonCinco = new JButton("5");
		jButtonCinco.setBounds(80, 200, 60, 60);
		jButtonCinco.setFont(new Font("Arial", Font.BOLD, 30));
		jButtonCinco.setForeground(new Color(255, 255, 255));
		jButtonCinco.setBackground(new Color(00, 00, 00));
		jButtonCinco.addActionListener(e -> {
			if(novaEntrada) {
				visor.setText(jButtonCinco.getText());
				novaEntrada = false;
			}else {
				visor.setText(visor.getText() + jButtonCinco.getText());
			}
		});
		add(jButtonCinco);
		
		JButton jButtonSeis = new JButton("6");
		jButtonSeis.setBounds(140, 200, 60, 60);
		jButtonSeis.setFont(new Font("Arial", Font.BOLD, 30));
		jButtonSeis.setForeground(new Color(255, 255, 255));
		jButtonSeis.setBackground(new Color(00, 00, 00));
		jButtonSeis.addActionListener(e -> {
			if(novaEntrada) {
				visor.setText(jButtonSeis.getText());
				novaEntrada = false;
			}else {
				visor.setText(visor.getText() + jButtonSeis.getText());
			}
		});
		add(jButtonSeis);
		
		JButton jButtonSete = new JButton("7");
		jButtonSete.setBounds(20, 140, 60, 60);
		jButtonSete.setFont(new Font("Arial", Font.BOLD, 30));
		jButtonSete.setForeground(new Color(255, 255, 255));
		jButtonSete.setBackground(new Color(00, 00, 00));
		jButtonSete.addActionListener(e -> {
			if(novaEntrada) {
				visor.setText(jButtonSete.getText());
				novaEntrada = false;
			}else {
				visor.setText(visor.getText() + jButtonSete.getText());
			}
		});
		add(jButtonSete);
		
		JButton jButtonOito = new JButton("8");
		jButtonOito.setBounds(80, 140, 60, 60);
		jButtonOito.setFont(new Font("Arial", Font.BOLD, 30));
		jButtonOito.setForeground(new Color(255, 255, 255));
		jButtonOito.setBackground(new Color(00, 00, 00));
		jButtonOito.addActionListener(e -> {
			if(novaEntrada) {
				visor.setText(jButtonOito.getText());
				novaEntrada = false;
			}else {
				visor.setText(visor.getText() + jButtonOito.getText());
			}
		});
		add(jButtonOito);
		
		JButton jButtonNove = new JButton("9");
		jButtonNove.setBounds(140, 140, 60, 60);
		jButtonNove.setFont(new Font("Arial", Font.BOLD, 30));
		jButtonNove.setForeground(new Color(255, 255, 255));
		jButtonNove.setBackground(new Color(00, 00, 00));
		jButtonNove.addActionListener(e -> {
			if(novaEntrada) {
				visor.setText(jButtonNove.getText());
				novaEntrada = false;
			}else {
				visor.setText(visor.getText() + jButtonNove.getText());
			}
		});
		add(jButtonNove);
		
		JButton jButtonSoma = new JButton("+");
		jButtonSoma.setBounds(200, 320, 60, 60);
		jButtonSoma.setFont(new Font("Arial", Font.BOLD, 40));
		jButtonSoma.setForeground(new Color(255, 255, 255));
		jButtonSoma.setBackground(new Color(00, 00, 00));
		add(jButtonSoma);
		jButtonSoma.addActionListener(e -> {
			primeiroNum = Double.parseDouble(visor.getText());
			operacao = "+";
			novaEntrada = true;
		});
		
		JButton jButtonSub = new JButton("-");
		jButtonSub.setBounds(200, 260, 60, 60);
		jButtonSub.setFont(new Font("Arial", Font.BOLD, 50));
		jButtonSub.setForeground(new Color(255, 255, 255));
		jButtonSub.setBackground(new Color(00, 00, 00));
		add(jButtonSub);
		jButtonSub.addActionListener(e -> {
			primeiroNum = Double.parseDouble(visor.getText());
			operacao = "-";
			novaEntrada = true;
		});
		
		JButton jButtonMulti = new JButton("x");
		jButtonMulti.setBounds(200, 200, 60, 60);
		jButtonMulti.setFont(new Font("Arial", Font.BOLD, 35));
		jButtonMulti.setForeground(new Color(255, 255, 255));
		jButtonMulti.setBackground(new Color(00, 00, 00));
		add(jButtonMulti);
		jButtonMulti.addActionListener(e -> {
			primeiroNum = Double.parseDouble(visor.getText());
			operacao = "*";
			novaEntrada = true;
		});
		
		JButton jButtonDiv = new JButton("÷");
		jButtonDiv.setBounds(200, 140, 60, 60);
		jButtonDiv.setFont(new Font("Arial", Font.BOLD, 40));
		jButtonDiv.setForeground(new Color(255, 255, 255));
		jButtonDiv.setBackground(new Color(00, 00, 00));
		add(jButtonDiv);
		jButtonDiv.addActionListener(e -> {
			primeiroNum = Double.parseDouble(visor.getText());
			operacao = "%";
			novaEntrada = true;
		});
		
		JButton jButtonIgual = new JButton("=");
		jButtonIgual.setBounds(140, 320, 60, 60);
		jButtonIgual.setFont(new Font("Arial", Font.BOLD, 30));
		jButtonIgual.setForeground(new Color(255, 255, 255));
		jButtonIgual.setBackground(new Color(00, 00, 00));
		add(jButtonIgual);
		jButtonIgual.addActionListener(e -> {
			double segundoNum = Double.parseDouble(visor.getText());
			double resultado = 0;
			
			switch(operacao) {
				case "+":
					resultado = primeiroNum + segundoNum;
					break;
				case "-":
					resultado = primeiroNum - segundoNum;
					break;
				case "*":
					resultado = primeiroNum * segundoNum;
					break;
				case "%":
					if(segundoNum != 0) {
						resultado = primeiroNum / segundoNum;
					}else {
						visor.setText("Cannot divide by zero");	
						return;
					}
					break;					
			}
			visor.setText(String.valueOf(resultado));
			novaEntrada = true;
		});
		
		JButton jButtonPonto = new JButton(".");
		jButtonPonto.setBounds(80, 320, 60, 60);
		jButtonPonto.setFont(new Font("Arial", Font.BOLD, 40));
		jButtonPonto.setForeground(new Color(255, 255, 255));
		jButtonPonto.setBackground(new Color(00, 00, 00));
		jButtonPonto.addActionListener(e -> {String TxtVisor = visor.getText(); visor.setText(TxtVisor + jButtonPonto.getText());});
		add(jButtonPonto);
	
		JButton jButtonClear = new JButton("C");
		jButtonClear.setBounds(20, 99, 240, 41);
		jButtonClear.setFont(new Font("Arial", Font.BOLD, 30));
		jButtonClear.setForeground(new Color(255, 255, 255));
		jButtonClear.setBackground(new Color(00, 00, 00));
		add(jButtonClear);
		jButtonClear.addActionListener(e -> {
			primeiroNum = 0;
			operacao = "";
			visor.setText("");
			novaEntrada = true;
		});
	
	}
}

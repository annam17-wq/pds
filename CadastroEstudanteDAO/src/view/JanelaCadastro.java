package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * VIEW - a MESMA janela de antes, nas mesmas posicoes.
 *
 * O que saiu daqui: - os tres addActionListener (quem escuta agora e o
 * Controller); - o JOptionPane que montava a mensagem (quem decide o texto e o
 * Controller).
 *
 * O que entrou: - getters dos TRES BOTOES (antes so os campos tinham); -
 * metodos mostrarMensagem, mostrarErro, limparCampos e fechar.
 *
 * Confira com Ctrl+F: nao ha "addActionListener" e nao ha "if" nesta classe.
 */
public class JanelaCadastro extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEspecie;
	private JTextField txtPelagem;
	private JTextField txtTemperamento;
	private JTextField txtNascimento;
	private JTextField txtEndereco;
	private JTextField txtSobre;
// NOVO: os botoes viraram atributos. Antes eram variaveis locais do
// construtor, porque so o proprio construtor precisava deles para
// pendurar o ouvinte. Agora quem pendura o ouvinte e o Controller,
// e para isso ele precisa alcanca-los.
	private JButton btnCadastrar;
	private JButton btnLimpar;
	private JButton btnFechar;

	public JanelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(30, 21, 77, 14);
		contentPane.add(lblNome);
		txtNome = new JTextField();
		txtNome.setBounds(98, 18, 96, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
// 105 e nao 88: com 88 o texto aparece cortado como "Cada...".
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(238, 17, 105, 22);
		contentPane.add(btnCadastrar);
		
		JLabel lblEspecie = new JLabel("Especie");
		lblEspecie.setBounds(30, 46, 77, 14);
		contentPane.add(lblEspecie);
		txtEspecie = new JTextField();
		txtEspecie.setBounds(98, 46, 96, 20);
		contentPane.add(txtEspecie);
		txtEspecie.setColumns(10);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(238, 56, 105, 22);
		contentPane.add(btnLimpar);
		
		JLabel lblPelagem = new JLabel("Pelagem");
		lblPelagem.setBounds(30, 75, 77, 14);
		contentPane.add(lblPelagem);
		txtPelagem = new JTextField();
		txtPelagem.setBounds(98, 72, 96, 20);
		contentPane.add(txtPelagem);
		txtPelagem.setColumns(10);
		
		btnFechar = new JButton("Fechar");
		btnFechar.setBounds(238, 96, 105, 22);
		contentPane.add(btnFechar);
		
		JLabel lblTemperamento = new JLabel("Temperamento");
		lblTemperamento.setBounds(30, 113, 77, 14);
		contentPane.add(lblTemperamento);
		txtTemperamento = new JTextField();
		txtTemperamento.setBounds(108, 110, 96, 20);
		contentPane.add(txtTemperamento);
		txtTemperamento.setColumns(10);
		
		JLabel lblNascimento = new JLabel("Data de nascimento");
		lblNascimento.setBounds(30, 138, 77, 14);
		contentPane.add(lblNascimento);
		txtNascimento = new JTextField();
		txtNascimento.setBounds(118, 141, 96, 20);
		contentPane.add(txtNascimento);
		txtNascimento.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endereco");
		lblEndereco.setBounds(30, 173, 77, 14);
		contentPane.add(lblEndereco);
		txtEndereco = new JTextField();
		txtEndereco.setBounds(108, 170, 96, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblSobre = new JLabel("Sobre");
		lblSobre.setBounds(30, 210, 77, 14);
		contentPane.add(lblSobre);
		txtSobre = new JTextField();
		txtSobre.setBounds(98, 207, 96, 20);
		contentPane.add(txtSobre);
		txtSobre.setColumns(10);
		
	}


	public JTextField getTxtNome() {
		return txtNome;
	}


	public void setTxtNome(JTextField txtNome) {
		this.txtNome = txtNome;
	}


	public JTextField getTxtEspecie() {
		return txtEspecie;
	}


	public void setTxtEspecie(JTextField txtEspecie) {
		this.txtEspecie = txtEspecie;
	}


	public JTextField getTxtPelagem() {
		return txtPelagem;
	}


	public void setTxtPelagem(JTextField txtPelagem) {
		this.txtPelagem = txtPelagem;
	}


	public JTextField getTxtTemperamento() {
		return txtTemperamento;
	}


	public void setTxtTemperamento(JTextField txtTemperamento) {
		this.txtTemperamento = txtTemperamento;
	}


	public JTextField getTxtNascimento() {
		return txtNascimento;
	}


	public void setTxtNascimento(JTextField txtNascimento) {
		this.txtNascimento = txtNascimento;
	}


	public JTextField getTxtEndereco() {
		return txtEndereco;
	}


	public void setTxtEndereco(JTextField txtEndereco) {
		this.txtEndereco = txtEndereco;
	}


	public JTextField getTxtSobre() {
		return txtSobre;
	}


	public void setTxtSobre(JTextField txtSobre) {
		this.txtSobre = txtSobre;
	}


	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}


	public void setBtnCadastrar(JButton btnCadastrar) {
		this.btnCadastrar = btnCadastrar;
	}


	public JButton getBtnLimpar() {
		return btnLimpar;
	}


	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}


	public JButton getBtnFechar() {
		return btnFechar;
	}


	public void setBtnFechar(JButton btnFechar) {
		this.btnFechar = btnFechar;
	}


	// ---- Grupo 2: capacidades da propria tela -------------------------
	// Recebem o texto PRONTO. A View exibe; nao escolhe o que dizer.
	public void mostrarMensagem(String texto) {
		JOptionPane.showMessageDialog(this, texto);
	}

	public void mostrarErro(String texto) {
		JOptionPane.showMessageDialog(this, texto, "Atencao", JOptionPane.WARNING_MESSAGE);
	}

	public void limparCampos() {
		txtNome.setText("");
		txtEspecie.setText("");
		txtPelagem.setText("");
		txtTemperamento.setText("");
		txtNascimento.setText("");
		txtEndereco.setText("");
		txtSobre.setText("");
		txtNome.requestFocus();
		
	}

	public void fechar() {
		dispose();
	}
}
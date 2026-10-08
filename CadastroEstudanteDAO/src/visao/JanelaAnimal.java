package visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import dao.AnimalDAO;
import modelo.Animal;
import javax.swing.JScrollPane;
import java.awt.Color;

public class JanelaAnimal extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEspecie;
	private JTextField txtBusca;
	private JTable tabela;
	private JLabel lblStatus;

	/**
	 * 
	 * Launch the application.
	 * 
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaAnimal frame = new JanelaAnimal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();

				}

			}

		});

	}

	/**
	 * 
	 * Create the frame.
	 * 
	 */

	public JanelaAnimal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 639);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 225, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblStatus = new JLabel("Mensagens status");
		lblStatus.setBounds(10, 225, 142, 14);
		contentPane.add(lblStatus);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 57, 71, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Espécie:\r\n");
		lblNewLabel_1.setBounds(10, 88, 71, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Data de nascimento:\r\n");
		lblNewLabel_1.setBounds(10, 88, 71, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblBusca = new JLabel("Busca:");
		lblNewLabel_1.setBounds(10, 88, 71, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_4 = new JLabel("Data de nascimento::\r\n");
		lblNewLabel_1.setBounds(10, 88, 71, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_5 = new JLabel("Sobre:\r\n");
		lblNewLabel_1.setBounds(10, 88, 71, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_6 = new JLabel("Endereco:\r\n");
		lblNewLabel_2.setBounds(10, 184, 102, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_7 = new JLabel("Buscar:");
		lblBusca.setBounds(227, 164, 115, 14);
		contentPane.add(lblBusca);

		txtNome = new JTextField();
		txtNome.setBounds(115, 54, 102, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtEspecie = new JTextField();
		txtEspecie.setBounds(115, 85, 102, 20);
		contentPane.add(txtEspecie);
		txtEspecie.setColumns(10);

		txtBusca = new JTextField();
		txtBusca.setBounds(227, 181, 171, 20);
		contentPane.add(txtBusca);
		txtBusca.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBusca.setText("");
				cadastrar();
			}

		});

		btnCadastrar.setBounds(427, 25, 102, 23);
		contentPane.add(btnCadastrar);

		JButton btnAlterar = new JButton("Alterar");

		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alterar();
			}
		});
		btnAlterar.setBounds(427, 84, 102, 23);
		contentPane.add(btnAlterar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				excluir();
			}
		});
		btnExcluir.setBounds(427, 53, 102, 23);
		contentPane.add(btnExcluir);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBusca.setText("");
				limpar();

			}

		});

		btnLimpar.setBounds(427, 115, 102, 23);
		contentPane.add(btnLimpar);

		JButton btnListar = new JButton("Listar Todos");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBusca.setText("");
				listar();

			}

		});

		btnListar.setBounds(427, 149, 102, 23);
		contentPane.add(btnListar);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscar();

			}

		});

		btnBuscar.setBounds(427, 180, 102, 23);
		contentPane.add(btnBuscar);
		tabela = new JTable();

		JScrollPane scrollPane = new JScrollPane(tabela);
		scrollPane.setBounds(3, 250, 848, 339);
		contentPane.add(scrollPane);

		modelo = new DefaultTableModel(new String[] { "Nome", "Espécie", "Pelagem", "Temperamento",
				"Data de nascimento", "Sobre", "Endereço" }, 0);
		tabela.setModel(modelo);
		tabela.setRowHeight(22);

		txtPelagem = new JTextField();
		txtPelagem.setColumns(10);
		txtPelagem.setBounds(115, 116, 102, 20);
		contentPane.add(txtPelagem);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("Endereço:\r\n");
		lblNewLabel_2_1_1_1.setBounds(227, 98, 102, 14);
		contentPane.add(lblNewLabel_2_1_1_1);

		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Pelagem:\r\n");
		lblNewLabel_2_1_1_1_1.setBounds(10, 119, 71, 14);
		contentPane.add(lblNewLabel_2_1_1_1_1);

		txtTemperamento = new JTextField();
		txtTemperamento.setColumns(10);
		txtTemperamento.setBounds(115, 147, 102, 20);
		contentPane.add(txtTemperamento);

		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Temperamento:\r\n");
		lblNewLabel_2_1_1_1_1_1.setBounds(10, 150, 76, 14);
		contentPane.add(lblNewLabel_2_1_1_1_1_1);

		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(227, 115, 171, 38);
		contentPane.add(txtEndereco);

		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("Sobre:");
		lblNewLabel_2_1_1_1_1_1_1.setBounds(227, 29, 102, 14);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1);

		txtSobre = new JTextField();
		txtSobre.setColumns(10);
		txtSobre.setBounds(227, 49, 171, 38);
		contentPane.add(txtSobre);

		txtNascimento = new JTextField();
		txtNascimento.setColumns(10);
		txtNascimento.setBounds(115, 181, 102, 20);
		contentPane.add(txtNascimento);

		// Impede a edicao direta na celula: alterar passa pelo formulario.

		tabela.setDefaultEditor(Object.class, null);
		listar(); // a tabela ja abre preenchida
		tabela.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {
					carregarSelecionado();

				}

			}

		});

	}

	private void carregarSelecionado() {
		int linha = tabela.getSelectedRow();
		if (linha < 0)
			return; // -1 = nenhuma linha selecionada

		idSelecionado = (int) modelo.getValueAt(linha, 0);
		txtNome.setText(String.valueOf(modelo.getValueAt(linha, 1)));
		txtEspecie.setText(String.valueOf(modelo.getValueAt(linha, 2)));
		txtPelagem.setText(String.valueOf(modelo.getValueAt(linha, 3)));
		txtTemperamento.setText(String.valueOf(modelo.getValueAt(linha, 4)));
		txtNascimento.setText(String.valueOf(modelo.getValueAt(linha, 5)));
		txtSobre.setText(String.valueOf(modelo.getValueAt(linha, 6)));
		txtEndereco.setText(String.valueOf(modelo.getValueAt(linha, 7)));
		lblStatus.setText("Editando o animal id " + idSelecionado + ". Altere os campos e clique em Alterar.");

	}

	private void alterar() {
		if (idSelecionado == 0) {
			JOptionPane.showMessageDialog(this, "Selecione primeiro uma linha da tabela.", "Aviso",
					JOptionPane.WARNING_MESSAGE);
			return;

		}

		Animal e = lerFormulario();
		if (e == null)
			return;

		// O id vem da SELECAO, nao do que esta digitado.

		e.setId(idSelecionado);
		try {

			dao.alterar(e);
			JOptionPane.showMessageDialog(this, "Animal alterado.");
			limpar();
			listar();
		} catch (SQLException ex) {
			erro("Erro ao alterar", ex);

		}

	}

	private void excluir() {
		if (idSelecionado == 0) {
			JOptionPane.showMessageDialog(this, "Selecione primeiro uma linha da tabela.", "Aviso",
					JOptionPane.WARNING_MESSAGE);
			return;

		}

		int opcao = JOptionPane.showConfirmDialog(this, "Excluir o animal " + txtNome.getText() + "?", "Confirmacao",
				JOptionPane.YES_NO_OPTION);
		if (opcao != JOptionPane.YES_OPTION)
			return;

		try {
			dao.excluir(idSelecionado);
			JOptionPane.showMessageDialog(this, "Estudante excluido.");
			limpar();
			listar();

		} catch (SQLException ex) {
			erro("Erro ao excluir", ex);

		}

	}

	public JTextField getTxtNome() {
		return txtNome;
	}

	public JTextField getTxtEspecie() {
		return txtEspecie;
	}
	
	public JTextField getTxtPelagem() {
		return txtPelagem;
	}

	public JTextField getTxtTemperamento() {
		return txtTemperamento;
	}
	
	public JTextField getTxtNascimento() {
		return txtNascimento;
	}
	
	public JTextField getTxtSobre() {
		return txtSobre;
	}
	
	public JTextField getTxtEndereco() {
		return txtEndereco;
	}
	
	public JTextField getTxtBusca() {
		return txtBusca;
	}

	public JTable getTabela() {
		return tabela;
	}

	public JLabel getLblStatus() {
		return lblStatus;
	}

	private DefaultTableModel modelo;
	// Ponte com o banco: um unico objeto serve a janela inteira.
	private final AnimalDAO dao = new AnimalDAO();
	// Id do estudante selecionado na tabela. Zero = nenhum selecionado.
	private int idSelecionado = 0;
	private JTextField txtPelagem;
	private JTextField txtTemperamento;
	private JTextField txtEndereco;
	private JTextField txtSobre;
	private JTextField txtNascimento;

	private void listar() {

		try {
			preencherTabela(dao.listar());
		} catch (SQLException ex) {
			erro("Erro ao listar", ex);
		}

	}

	private void buscar() {
		try {
			preencherTabela(dao.buscarPorNome(txtBusca.getText().trim()));
		} catch (SQLException ex) {
			erro("Erro ao buscar", ex);

		}

	}

	private void preencherTabela(List<Animal> lista) {
		modelo.setRowCount(0);
		for (Animal e : lista) {
			modelo.addRow(new Object[] { e.getId(), e.getNome(), e.getEspecie(), e.getPelagem(), e.getTemperamento (),  e.getEndereco() , e.getSobre() , e.getNascimento()});

		}

		lblStatus.setText(lista.size() + " estudante(s) na tabela.");

	}

	private Animal lerFormulario() {
		String nome = txtNome.getText().trim();
		String especie = txtEspecie.getText().trim();
		String pelagem = txtPelagem.getText().trim();
		String temperamento = txtTemperamento.getText().trim();
		String nascimento = txtNascimento.getText().trim();
		String endereco = txtEndereco.getText().trim();
		String sobre = txtSobre.getText().trim();
		
		if (nome.isEmpty()) {

			JOptionPane.showMessageDialog(this, "Preencha o nome!", "Aviso", JOptionPane.WARNING_MESSAGE);
			txtNome.requestFocus();
			return null;

		}

		return new Animal(nome, especie, pelagem, temperamento, nascimento, endereco, sobre);
	}

	private void cadastrar() {
		Animal e = lerFormulario();
		if (e == null)
			return; // invalido: a mensagem ja apareceu

		try {
			dao.inserir(e);
			JOptionPane.showMessageDialog(this, "Animal cadastrado com o id " + e.getId() + ".");

			limpar();
			listar();
		} catch (SQLException ex) {
			erro("Erro ao cadastrar", ex);

		}

	}

	private void limpar() {
		idSelecionado = 0;
		txtNome.setText("");
		txtEspecie.setText("");
		tabela.clearSelection();
		txtNome.requestFocus();
		lblStatus.setText("Formulario limpo.");

	}

	private void erro(String contexto, SQLException ex) {
		JOptionPane.showMessageDialog(this, contexto + ": " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		lblStatus.setText(contexto + ".");

	}
}
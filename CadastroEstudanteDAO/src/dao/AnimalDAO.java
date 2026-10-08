package dao;

import modelo.Animal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAO {
	public List<Animal> listar() throws SQLException {
		String sql = "SELECT id, nome, especie, pelagem, temperamento, nascimento, sobre, endereco FROM animais ORDER BY nota DESC";
		List<Animal> lista = new ArrayList<>();
		try (Connection con = Conexao.abrir();
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				lista.add(new Animal(rs.getInt("id"), rs.getString("nome"), rs.getString("especie"),
						rs.getString("pelagem"), rs.getString("temperamento"), rs.getString("nascimento"),
						rs.getString("sobre"), rs.getString("endereco")));

			}
		}
		return lista;
	}

	public List<Animal> buscarPorNome(String trecho) throws SQLException {
		String sql = "SELECT id, nome, especie, pelagem, temperamento, nascimento, sobre, endereco FROM animais " + "WHERE nome LIKE ? ORDER BY nota DESC";
		List<Animal> lista = new ArrayList<>();
		try (Connection con = Conexao.abrir(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, "%" + trecho + "%");
			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					lista.add(new Animal(rs.getInt("id"), rs.getString("nome"), rs.getString("especie"),
							rs.getString("pelagem"), rs.getString("temperamento"), rs.getString("nascimento"),
							rs.getString("sobre"), rs.getString("endereco")));
				}
			}
		}
		return lista;
	}

	public void inserir(Animal e) throws SQLException {
		String sql = "INSERT INTO estudante (id, nome, especie, pelagem, temperamento, nascimento, sobre, endereco FROM animais) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try (Connection con = Conexao.abrir();
				PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
			ps.setString(1, e.getNome());
			ps.setString(2, e.getEspecie());
			ps.setString(3, e.getPelagem());
			ps.setString(4, e.getTemperamento());
			ps.setString(5, e.getNascimento());
			ps.setString(6, e.getSobre());
			ps.setString(7, e.getEndereco());
			ps.executeUpdate();

			try (ResultSet chaves = ps.getGeneratedKeys()) {
				if (chaves.next()) {
					e.setId(chaves.getInt(1));
				}
			}
		}
	}

	public boolean alterar(Animal e) throws SQLException {
		String sql = "UPDATE animal SET nome = ?, especie = ?, pelagem = ?, temperamento = ?, nascimento = ?, sobre = ?, endereco = ?, WHERE id = ?";
		try (Connection con = Conexao.abrir(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, e.getNome());
			ps.setString(2, e.getEspecie());
			ps.setString(3, e.getPelagem());
			ps.setString(4, e.getTemperamento());
			ps.setString(5, e.getNascimento());
			ps.setString(6, e.getSobre());
			ps.setString(7, e.getEndereco());
			ps.setInt(8, e.getId());

			return ps.executeUpdate() > 0;

		}
	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE FROM animais WHERE id = ?";
		try (Connection con = Conexao.abrir(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, id);

			return ps.executeUpdate() > 0;

		}
	}
}

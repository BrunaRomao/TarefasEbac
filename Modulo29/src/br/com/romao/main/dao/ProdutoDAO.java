package br.com.romao.main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.romao.dao.jdbc.ConnectionFactory;
import br.com.romao.main.domain.Produto;

public class ProdutoDAO implements IProdutoDAO{

	@Override
	public Integer cadastrar(Produto produto) throws Exception {
		// TODO Auto-generated method stub
		Connection connection = null;
    	PreparedStatement stm = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlInsert();
			stm = connection.prepareStatement(sql);
			adicionarParametrosInsert(stm, produto);
			return stm.executeUpdate();
		} catch(Exception e) {
			throw e;
		} finally {
			closeConnection(connection, stm, null);
		}
	}

	private void closeConnection(Connection connection, PreparedStatement stm, ResultSet rs) {
		// TODO Auto-generated method stub
		
		try {
			if (rs != null && !rs.isClosed()) {
				rs.close();
			}
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
	}

	private void adicionarParametrosInsert(PreparedStatement stm, Produto produto) throws SQLException {
		// TODO Auto-generated method stub
		
		stm.setString(1, produto.getCodigoProduto());
		stm.setString(2, produto.getNomeProduto());
		
	}

	private String getSqlInsert() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO TB_PRODUTO (ID, CODIGO, NOME) ");
		sb.append("VALUES (nextval('SQ_PRODUTO'),?,?)");
		return sb.toString();
	}

	@Override
	public Integer atualizar(Produto produto) throws Exception {
		// TODO Auto-generated method stub
		Connection connection = null;
    	PreparedStatement stm = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlUpdate();
			stm = connection.prepareStatement(sql);
			adicionarParametrosUpdate(stm, produto);
			return stm.executeUpdate();
		} catch(Exception e) {
			throw e;
		} finally {
			closeConnection(connection, stm, null);
		}
	}

	private void adicionarParametrosUpdate(PreparedStatement stm, Produto produto) throws SQLException {
		// TODO Auto-generated method stub
		stm.setString(1, produto.getNomeProduto());
		stm.setString(2, produto.getCodigoProduto());
		stm.setLong(3, produto.getId());
	}

	private String getSqlUpdate() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("UPDATE TB_PRODUTO ");
		sb.append("SET NOME = ?, CODIGO = ? ");
		sb.append("WHERE ID = ?");
		return sb.toString();
	}

	@Override
	public Produto buscar(String codigo) throws Exception {
		// TODO Auto-generated method stub
		Connection connection = null;
    	PreparedStatement stm = null;
    	ResultSet rs = null;
    	Produto produto = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlSelect();
			stm = connection.prepareStatement(sql);
			adicionarParametrosSelect(stm, codigo);
			rs = stm.executeQuery();
			
		    if (rs.next()) {
		    	produto = new Produto();
		    	Long id = rs.getLong("ID");
		    	String nome = rs.getString("NOME");
		    	String cd = rs.getString("CODIGO");
		    	produto.setId(id);
		    	produto.setNomeProduto(nome);
		    	produto.setCodigoProduto(cd);
		    }
		} catch(Exception e) {
			throw e;
		} finally {
			closeConnection(connection, stm, rs);
		}
		return produto;
	}

	private void adicionarParametrosSelect(PreparedStatement stm, String codigo) throws SQLException {
		// TODO Auto-generated method stub
		stm.setString(1, codigo);
		
	}

	private String getSqlSelect() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM TB_PRODUTO ");
		sb.append("WHERE CODIGO = ?");
		return sb.toString();
	}

	@Override
	public List<Produto> buscarTodos() throws Exception {
		// TODO Auto-generated method stub
		Connection connection = null;
    	PreparedStatement stm = null;
    	ResultSet rs = null;
    	List<Produto> list = new ArrayList<>();
    	Produto produto = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlSelectAll();
			stm = connection.prepareStatement(sql);
			rs = stm.executeQuery();
			
		    while (rs.next()) {
		    	produto = new Produto();
		    	Long id = rs.getLong("ID");
		    	String nome = rs.getString("NOME");
		    	String cd = rs.getString("CODIGO");
		    	produto.setId(id);
		    	produto.setNomeProduto(nome);
		    	produto.setCodigoProduto(cd);
		    	list.add(produto);
		    }
		} catch(Exception e) {
			throw e;
		} finally {
			closeConnection(connection, stm, rs);
		}
		return list;
	}

	private String getSqlSelectAll() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM TB_PRODUTO");
		return sb.toString();
	}

	@Override
	public Integer excluir(Produto produto) throws Exception {
		// TODO Auto-generated method stub
		Connection connection = null;
    	PreparedStatement stm = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlDelete();
			stm = connection.prepareStatement(sql);
			adicionarParametrosDelete(stm, produto);
			return stm.executeUpdate();
		} catch(Exception e) {
			throw e;
		} finally {
			closeConnection(connection, stm, null);
		}
	}

	private void adicionarParametrosDelete(PreparedStatement stm, Produto produto) throws SQLException {
		// TODO Auto-generated method stub
		stm.setString(1, produto.getCodigoProduto());
	}

	private String getSqlDelete() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("DELETE FROM TB_PRODUTO ");
		sb.append("WHERE CODIGO = ?");
		return sb.toString();
	}

}

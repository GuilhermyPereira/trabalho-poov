package poov.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class BancoSangueDAO {

    private final Connection conexao;

    public BancoSangueDAO(Connection conexao) {
        this.conexao = conexao;
    }

    /*public void gravar(Vacina vacina) throws SQLException {
        String sql = "INSERT INTO vacina(nome, descricao) VALUES (?, ?)";
        PreparedStatement pstmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        pstmt.setString(1, vacina.getNome());
        pstmt.setString(2, vacina.getDescricao());
        int inseridos = pstmt.executeUpdate();
        if (inseridos == 1) {
            ResultSet rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                vacina.setCodigo(rs.getLong(1));
            } else {
                System.out.println("Não foi possível pegar a chave da vacina inserida");
            }
            rs.close();
        } else {
            System.out.println("Não foi possível inserir a vacina");
        }
        pstmt.close();
    }

    public Vacina buscar(long codigo) throws SQLException {
        Vacina vacina = null;
        String sql = "SELECT * FROM vacina WHERE codigo = ? AND situacao = 'ATIVO'";
        PreparedStatement pstmt = conexao.prepareStatement(sql);
        pstmt.setLong(1, codigo);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            vacina = new Vacina(rs.getLong(1), rs.getString(2), rs.getString(3));
        }
        rs.close();
        pstmt.close();
        return vacina;
    }

    public List<Vacina> buscarTodas() throws SQLException {
        List<Vacina> vacinas = new ArrayList<>();
        Vacina vacina;
        String sql = "SELECT * FROM vacina WHERE situacao = 'ATIVO'";
        Statement stmt = conexao.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            vacina = new Vacina(rs.getLong(1), rs.getString(2), rs.getString(3));
            vacinas.add(vacina);
        }
        rs.close();
        stmt.close();
        return vacinas;
    }

    public boolean remover(Vacina vacina) throws SQLException {
        boolean resultado = false;
        String sqlAlteracao = "UPDATE vacina SET situacao = 'INATIVO' WHERE codigo = ?";
        PreparedStatement pstmtAlteracao = conexao.prepareStatement(sqlAlteracao);
        pstmtAlteracao.setLong(1, vacina.getCodigo());
        int alteradas = pstmtAlteracao.executeUpdate();
        if (alteradas == 1) {
            resultado = true;
        }
        pstmtAlteracao.close();
        return resultado;
    }

    public boolean atualizar(Vacina vacina) throws SQLException {
        boolean resultado = false;
        String sqlAlteracao = "UPDATE vacina SET nome = ?, descricao = ? WHERE codigo = ?";
        PreparedStatement pstmtAlteracao = conexao.prepareStatement(sqlAlteracao);
        pstmtAlteracao.setString(1, vacina.getNome());
        pstmtAlteracao.setString(2, vacina.getDescricao());
        pstmtAlteracao.setLong(3, vacina.getCodigo());
        int alteradas = pstmtAlteracao.executeUpdate();
        if (alteradas == 1) {
            resultado = true;
        }
        pstmtAlteracao.close();
        return resultado;
    }

    public List<Vacina> buscarNome(String nome) throws SQLException {
        List<Vacina> vacinas = new ArrayList<>();
        Vacina vacina;
        String sqlConsulta = "SELECT * FROM vacina WHERE nome ILIKE ? AND situacao = 'ATIVO'";
        PreparedStatement pstmt = conexao.prepareStatement(sqlConsulta);
        pstmt.setString(1, "%" + nome + "%");
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            vacina = new Vacina(rs.getLong(1), rs.getString(2), rs.getString(3));
            vacinas.add(vacina);
        }
        rs.close();
        pstmt.close();
        return vacinas;*/
    }


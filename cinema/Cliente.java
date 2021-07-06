package cinema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cliente {
	private String cpf;
	private String nome;
	private String email;
	private String telefone;

	public void Incluir() throws SQLException{
		String usuario = "root";
		String senha = "";
		String url = "jdbc:mysql://localhost/partemysql";
		java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
		String sql = "insert into cliente values ('" + getCpf() + "', '" + getNome() + "', '" + getEmail() + "', '" + getTelefone() + "')";
		PreparedStatement comando = (PreparedStatement) conn.prepareStatement(sql);
		comando.execute();
		comando.close();
		JOptionPane.showMessageDialog(null, "Cliente incluído");
	}
	
	public void Consultar() throws SQLException{
		String usuario = "root";
		String senha = "";
		String url = "jdbc:mysql://localhost/partemysql";
		Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "select * from cliente";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        ArrayList<String> registros = new ArrayList<>();
        while(resultado.next())
        {
            registros.add(resultado.getString("Cpf") + 
                    " " + resultado.getString("Nome") + 
                    " " + resultado.getString("Email") + 
                    " " + resultado.getString("Telefone"));
        }
        String lista = "";
        int j;
        for(j=0; j<registros.size(); j++) {
            lista = lista + registros.get(j) + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
        resultado.close();
        comando.close();
        conn.close();
	}

	public void Pesquisar() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/partemysql";
        Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "select * from cliente where cpf = " + getCpf();
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        resultado.next();
        setNome(resultado.getString("nome"));
        setEmail(resultado.getString("email"));
        setTelefone(resultado.getString("telefone"));
        resultado.close();
        comando.close();
        conn.close();
    }
    
    
    public void Alterar() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/partemysql";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
        String Sql = "update cliente set nome = '" + getNome() 
                + "', email = '" + getEmail() 
                + "', telefone = '" + getTelefone()
                + " where cpf = " + getCpf();
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        comando.execute();
        comando.close();
        JOptionPane.showMessageDialog(null,"Cliente alterado");
    }
    
    public void Excluir() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/partemysql";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
        String Sql = "delete from cliente where cpf = " + getCpf();
        if(JOptionPane.showConfirmDialog(null, "Confirma exclusão ?", "Atenção", JOptionPane.OK_CANCEL_OPTION) == 0) 
        {
        	PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        	comando.execute();
        	comando.close();       
        	JOptionPane.showMessageDialog(null,"Cliente excluído");
        }
        else
        	JOptionPane.showMessageDialog(null,"Exclusão de Cliente cancelada");
    }
	
	private String getCpf() {
		return cpf;
	}

	private void setCpf(String cpf) {
		this.cpf = cpf;
	}

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	private String getTelefone() {
		return telefone;
	}

	private void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}

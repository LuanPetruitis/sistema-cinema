package cinema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Filme {
	private String codigo;
	private String nome;
	private float preco;
	
	public void Incluir() throws SQLException{
		String usuario = "root";
		String senha = "";
		String url = "jdbc:mysql://localhost/partemysql";
		java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
		String sql = "insert into filmes values ('" + getCodigo() + "', '" + getNome() + "', '" + getPreco() + "')";
		PreparedStatement comando = (PreparedStatement) conn.prepareStatement(sql);
		comando.execute();
		comando.close();
		JOptionPane.showMessageDialog(null, "Filme incluído");
	}
	
	public void Consultar() throws SQLException{
		String usuario = "root";
		String senha = "";
		String url = "jdbc:mysql://localhost/partemysql";
		Connection conn = (Connection) DriverManager.getConnection(url, usuario, senha);
        String SqlCom = "select * from filmes";
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        ArrayList<String> registros = new ArrayList<>();
        while(resultado.next())
        {
            registros.add(resultado.getString("Codigo") + 
                    " " + resultado.getString("Nome") + 
                    " " + resultado.getString("Preco"));
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
        String SqlCom = "select * from cliente where cpf = " + getCodigo();
        PreparedStatement comando = (PreparedStatement) conn.prepareStatement(SqlCom);
        ResultSet resultado = comando.executeQuery();
        resultado.next();
        setNome(resultado.getString("nome"));
        setPreco(Float.parseFloat(resultado.getString("preco")));
        resultado.close();
        comando.close();
        conn.close();
    }
    
    
    public void Alterar() throws SQLException {
        String usuario = "root";
        String senha = "";
        String url = "jdbc:mysql://localhost/partemysql";
        java.sql.Connection conn = DriverManager.getConnection(url, usuario, senha);
        String Sql = "update filmes set nome = '" + getNome() 
                + "', preco = '" + getPreco()
                + " where codigo = " + getCodigo();
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
        String Sql = "delete from filmes where codigo = " + getCodigo();
        if(JOptionPane.showConfirmDialog(null, "Confirma exclusão ?", "Atenção", JOptionPane.OK_CANCEL_OPTION) == 0) 
        {
        	PreparedStatement comando = (PreparedStatement) conn.prepareStatement(Sql);
        	comando.execute();
        	comando.close();       
        	JOptionPane.showMessageDialog(null,"Filme excluído");
        }
        else
        	JOptionPane.showMessageDialog(null,"Exclusão de filme cancelada");
    }
	
	
	
	private String getCodigo() {
		return codigo;
	}
	private void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private float getPreco() {
		return preco;
	}
	private void setPreco(float preco) {
		this.preco = preco;
	}
}

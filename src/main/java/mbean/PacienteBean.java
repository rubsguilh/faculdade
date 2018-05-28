package mbean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import model.Paciente;
import servico.PacienteServico;

@ViewScoped
@ManagedBean
public class PacienteBean {
	private int codigo;
	private String nome;
	private Date datanasc;
	private String endereco;
	private String cep;
	private String bairro;
	private String estado;
	private String cidade;
	private String sexo;
	private byte foto;
	private Paciente paciente;
	private PacienteServico servico;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public byte getFoto() {
		return foto;
	}
	public void setFoto(byte foto) {
		this.foto = foto;
	}
	
    public String inserir() {
    	paciente = new Paciente();
    	servico = new PacienteServico();
    	paciente.setBairro(getBairro());
    	paciente.setCep(getCep());
    	paciente.setCidade(getCidade());
    	paciente.setCodigo(getCodigo());
    	paciente.setDatanasc(getDatanasc());
    	paciente.setEndereco(getEndereco());
    	paciente.setEstado(getEstado());
    	paciente.setFoto(getFoto());
    	paciente.setNome(getNome());
    	paciente.setSexo(getSexo());
    	servico.inserir(paciente);
    	
    	return "pacicadastrado.xhtml";
    }
	
	

}

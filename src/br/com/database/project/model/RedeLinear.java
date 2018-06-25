//package br.com.adaptaconsultoria.amr.model;
//
//import java.io.Serializable;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
///**
// *
// *
// * @author Will Zaniol
// * @author www.adaptaconsultoria.com.br
// * @version 1.0.0
// *
// */
//@SuppressWarnings("serial")
//@Entity
//@Table(name = "amr_redelinear")
//public class RedeLinear implements Serializable {
//
//	@Id
//	@Column(name = "amr_redelinear_id")
//	private String id;
//
//	@Column(name = "ad_client_id")
//	private String adClientId;
//
//	@Column(name = "ad_org_id")
//	private String adOrgId;
//
//	@Column(name = "ordem")
//	private Integer ordem;
//
//	@Column(name = "c_bpartner_id")
//	private String cBpartnerId;
//
//	@Column(name = "name")
//	private String name;
//
//	@Column(name = "username")
//	private String username;
//
//	@Column(name = "ad_user_id")
//	private String adUserId;
//
//	@Column(name = "direto")
//	private String direto;
//
//	@Column(name = "direto_nome")
//	private String diretoNome;
//
//	@Column(name = "direto_username")
//	private String diretoUsername;
//
//	@Column(name = "direto_id")
//	private String diretoId;
//
//	@Column(name = "nivel")
//	private String nivel;
//
//	@Column(name = "cidade")
//	private String cidade;
//
//	@Column(name = "posicionadoem")
//	private Date posicionadoEm;
//
//	@Column(name = "celular")
//	private String celular;
//
//	@Column(name = "email")
//	private String email;
//
//	@Column(name = "amr_perfil_id")
//	private String amrPerfilId;
//
//	@Column(name = "genero")
//	private String genero;
//
//	@Column(name = "ativopago")
//	private String ativoPago;
//
//	@Column(name = "perfil")
//	private String perfil;
//
//	@Column(name = "icone")
//	private String icone;
//	
//	@Column(name = "tooltip")
//	private String tooltip;
//
//	public RedeLinear() {
//		super();
//	}
//
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getAdClientId() {
//		return adClientId;
//	}
//
//	public void setAdClientId(String adClientId) {
//		this.adClientId = adClientId;
//	}
//
//	public String getAdOrgId() {
//		return adOrgId;
//	}
//
//	public void setAdOrgId(String adOrgId) {
//		this.adOrgId = adOrgId;
//	}
//
//	public Integer getOrdem() {
//		return ordem;
//	}
//
//	public void setOrdem(Integer ordem) {
//		this.ordem = ordem;
//	}
//
//	public String getcBpartnerId() {
//		return cBpartnerId;
//	}
//
//	public void setcBpartnerId(String cBpartnerId) {
//		this.cBpartnerId = cBpartnerId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getAdUserId() {
//		return adUserId;
//	}
//
//	public void setAdUserId(String adUserId) {
//		this.adUserId = adUserId;
//	}
//
//	public String getDireto() {
//		return direto;
//	}
//
//	public void setDireto(String direto) {
//		this.direto = direto;
//	}
//
//	public String getDiretoNome() {
//		return diretoNome;
//	}
//
//	public void setDiretoNome(String diretoNome) {
//		this.diretoNome = diretoNome;
//	}
//
//	public String getDiretoUsername() {
//		return diretoUsername;
//	}
//
//	public void setDiretoUsername(String diretoUsername) {
//		this.diretoUsername = diretoUsername;
//	}
//
//	public String getDiretoId() {
//		return diretoId;
//	}
//
//	public void setDiretoId(String diretoId) {
//		this.diretoId = diretoId;
//	}
//
//	public String getNivel() {
//		return nivel;
//	}
//
//	public void setNivel(String nivel) {
//		this.nivel = nivel;
//	}
//
//	public String getCidade() {
//		return cidade;
//	}
//
//	public void setCidade(String cidade) {
//		this.cidade = cidade;
//	}
//
//	public Date getPosicionadoEm() {
//		return posicionadoEm;
//	}
//
//	public void setPosicionadoEm(Date posicionadoEm) {
//		this.posicionadoEm = posicionadoEm;
//	}
//
//	public String getCelular() {
//		return celular;
//	}
//
//	public void setCelular(String celular) {
//		this.celular = celular;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getAmrPerfilId() {
//		return amrPerfilId;
//	}
//
//	public void setAmrPerfilId(String amrPerfilId) {
//		this.amrPerfilId = amrPerfilId;
//	}
//
//	public String getGenero() {
//		return genero;
//	}
//
//	public void setGenero(String genero) {
//		this.genero = genero;
//	}
//
//	public String getAtivoPago() {
//		return ativoPago;
//	}
//
//	public void setAtivoPago(String ativoPago) {
//		this.ativoPago = ativoPago;
//	}
//
//	public String getPerfil() {
//		return perfil;
//	}
//
//	public void setPerfil(String perfil) {
//		this.perfil = perfil;
//	}
//
//	public String getIcone() {
//		return icone;
//	}
//
//	public void setIcone(String icone) {
//		this.icone = icone;
//	}
//
//	public String getTooltip() {
//		return tooltip;
//	}
//
//	public void setTooltip(String tooltip) {
//		this.tooltip = tooltip;
//	}
//
//}
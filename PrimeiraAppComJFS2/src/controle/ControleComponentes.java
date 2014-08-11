package controle;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;

@ManagedBean(name="controleComponente")
@SessionScoped
public class ControleComponentes implements Serializable {
	private String texto;
	private String idComponente;
	
	public ControleComponentes() {

	}
	public String geraTexto() {
		texto="Texto gerado: < > & <b>Texto em negrito</b>";
		return "componentesParte2";
	}

	public void listener(ActionEvent event) {
		UIComponent source= event.getComponent();
		idComponente= source.getId();
	}
	
	public String Executar() {
		return "componetesParte3";
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getIdComponente() {
		return idComponente;
	}
	public void setIdComponente(String idComponente) {
		this.idComponente = idComponente;
	}
}

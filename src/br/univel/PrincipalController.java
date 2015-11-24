package br.univel;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrincipalController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField txf_cod;

	@FXML
	private TextField txf_nome;

	@FXML
	void salvar(ActionEvent event) {
		String codigo = txf_cod.getText();
		String nome = txf_nome.getText();

		System.out.println(codigo + "\t" + nome);
	}

	@FXML
	void initialize() {
		assert txf_cod != null : "fx:id=\"txf_cod\" was not injected: check your FXML file 'Principal.fxml'.";
		assert txf_nome != null : "fx:id=\"txf_nome\" was not injected: check your FXML file 'Principal.fxml'.";

	}
}

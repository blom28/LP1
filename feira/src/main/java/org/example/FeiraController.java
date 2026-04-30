package org.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FeiraController {
    @FXML
    private void BotaoPessoas() {
        try {
            App.setRoot("Pessoas");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void BotaoFruta() {
        try {
            App.setRoot("Fruta");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void Botao_Voltar() {
        try {
            App.setRoot("Feira");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void BotaoBarraca() {
        try {
            App.setRoot("Barraca");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Label texto;

    @FXML
    private Pessoa pessoa = new Pessoa();

    @FXML
    private Fruta fruta = new Fruta();

    @FXML
    private Barraca barraca = new Barraca();

    @FXML
    private void Botao_Armazenar() {texto.setText(barraca.armazenar());

    }

    @FXML
    private void Botao_Demonstrar() {texto.setText(barraca.demonstrar());

    }

    @FXML
    private void Botao_Organizar() {texto.setText(barraca.organizar());

    }


    @FXML
    private void Botao_Amadurecer() {texto.setText(fruta.amadurecer());

    }

    @FXML
    private void Botao_Comer() {texto.setText(fruta.comer());

    }

    @FXML
    private void Botao_Estragar() {texto.setText(fruta.estragar());

    }


    @FXML
    private void Botao_Andam() {texto.setText(pessoa.andam());

    }

    @FXML
    private void Botao_Compra() {texto.setText(pessoa.compra());

    }

    @FXML
    private void Botao_Consomem() {texto.setText(pessoa.consomem());

    }




}

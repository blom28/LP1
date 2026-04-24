package org.example;

import java.io.IOException;


import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class FarmaciaController {

    @FXML
    private void Botao_Farmaceutico() {
        try {
            App.setRoot("Farmaceutico");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void Botao_Pedidos() {
        try {
            App.setRoot("Pedidos");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void Botao_Remedios() {
        try {
            App.setRoot("Remedios");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void Botao_Voltar() {
        try {
            App.setRoot("Farmacia");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    private Label texto;

    @FXML
    private Farmaceutico farmaceutico = new Farmaceutico();

    @FXML
    private Remedios remedios = new Remedios();

    @FXML
    private Pedidos pedidos = new Pedidos();


    @FXML
    private void Botao_Atender() {texto.setText(farmaceutico.atender());

    }

    @FXML
    private void Botao_Cobrar() {texto.setText(farmaceutico.cobrar());

    }

    @FXML
    private void Botao_Organizar() {texto.setText(farmaceutico.organizar());

    }

    @FXML
    private void Botao_Entrega() {texto.setText(pedidos.entrega());

    }

    @FXML
    private void Botao_Medicamento() {texto.setText(pedidos.medicamento());

    }

    @FXML
    private void Botao_Receita() {texto.setText(pedidos.receita());

    }
    @FXML
    private void Botao_Antibiotico() {

    }

    @FXML
    private void Botao_Inflamatorio() {

    }

    @FXML
    private void Botao_Xarope() {

    }
}

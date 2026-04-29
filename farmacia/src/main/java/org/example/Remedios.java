package org.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class Remedios {
    private String antibiotico = " o estoque de antibioticos acabou ";
    private String inflamatorio =" existem 3 tipos de anti-inflamatorio na farmacia ";
    private String xarope = " otima opção para gripe ";

    public String getAntibiotico() {
        return antibiotico;
    }

    public Remedios getAntibiotico(String antibiotico) {
        this.antibiotico = antibiotico;
        return this;
    }

    public String getInflamatorio() {
        return inflamatorio;
    }

    public Remedios getinflamatorio(String inflamatorio) {
        this.inflamatorio = inflamatorio;
        return this;
    }

    public String getXarope() {
        return xarope;
    }

    public Remedios getXarope (String xarope) {
        this.xarope = xarope;
        return this;
    }



    public String antibiotico() {
        return antibiotico;
    }

    public String inflamatorio() {
        return inflamatorio;
    }

    public String xarope() {
        return xarope;
    }
}
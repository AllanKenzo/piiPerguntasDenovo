
package com.mycompany.mantendoperguntas;


public class Perguntas {
    private String idPergunta;
    private String enunciado;
    private String alternativa1;
    private String alternativa2;
    private String alternativa3;
    private String alternativa4;
    private String respostaCorreta;
    private String pontos;

    public Perguntas() {
    }

    public Perguntas(String enunciado, String alternativa1, String alternativa2, String alternativa3, String alternativa4, String respostaCorreta, String pontos) {
        this.enunciado = enunciado;
        this.alternativa1 = alternativa1;
        this.alternativa2 = alternativa2;
        this.alternativa3 = alternativa3;
        this.alternativa4 = alternativa4;
        this.respostaCorreta = respostaCorreta;
        this.pontos = pontos;
    }

    public Perguntas(String idPergunta, String enunciado, String alternativa1, String alternativa2, String alternativa3, String alternativa4, String respostaCorreta, String pontos) {
        this.idPergunta = idPergunta;
        this.enunciado = enunciado;
        this.alternativa1 = alternativa1;
        this.alternativa2 = alternativa2;
        this.alternativa3 = alternativa3;
        this.alternativa4 = alternativa4;
        this.respostaCorreta = respostaCorreta;
        this.pontos = pontos;
    }

    public Perguntas(String idPergunta) {
        this.idPergunta = idPergunta;
    }

    public String getIdPergunta() {
        return idPergunta;
    }

    public void setIdPergunta(String idPergunta) {
        this.idPergunta = idPergunta;
    }
    
    
    
    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getAlternativa1() {
        return alternativa1;
    }

    public void setAlternativa1(String alternativa1) {
        this.alternativa1 = alternativa1;
    }

    public String getAlternativa2() {
        return alternativa2;
    }

    public void setAlternativa2(String alternativa2) {
        this.alternativa2 = alternativa2;
    }

    public String getAlternativa3() {
        return alternativa3;
    }

    public void setAlternativa3(String alternativa3) {
        this.alternativa3 = alternativa3;
    }

    public String getAlternativa4() {
        return alternativa4;
    }

    public void setAlternativa4(String alternativa4) {
        this.alternativa4 = alternativa4;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(String respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    public String getPontos() {
        return pontos;
    }

    public void setPontos(String pontos) {
        this.pontos = pontos;
    }
    
    public String toString(){
        return idPergunta;
    }    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author marce
 */
public class Extrato {
    private int idUsuario;
    private Date data;
    private Time hora;
    private String transacao;
    private Double valor;
    
    public int getIdUsuario() {
        return idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public Date getData() {
        return data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    
    public Time getHora() {
        return hora;
    }
    
    public void setHora(Time hora) {
        this.hora = hora;
    }
    
    public String getTransacao() {
        return transacao;
    }
    
    public void setTransacao(String transacao) {
        this.transacao = transacao;
    }
    
    public Double getValor() {
        return valor;
    }
    
    public void setValor(Double valor) {
        this.valor = valor;
    }
}

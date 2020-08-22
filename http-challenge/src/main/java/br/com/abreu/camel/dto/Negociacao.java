package br.com.abreu.camel.dto;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Negociacao {

    private double preco;
    private int quantidade;
    private Calendar data;

    public Negociacao() {
	super();
    }

    public Negociacao(double preco, int quantidade, Calendar data) {
	super();
	this.preco = preco;
	this.quantidade = quantidade;
	this.data = data;
    }

    public double getPreco() {
	return preco;
    }

    public void setPreco(double preco) {
	this.preco = preco;
    }

    public int getQuantidade() {
	return quantidade;
    }

    public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
    }

    public Calendar getData() {
	return data;
    }

    public void setData(Calendar data) {
	this.data = data;
    }

    @Override
    public String toString() {
	return "Negociacao [preco=" + preco + ", quantidade=" + quantidade + "]";
    }
}
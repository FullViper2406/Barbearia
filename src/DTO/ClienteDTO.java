/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author breno
 */
public class ClienteDTO {
    private String Nome,Contato,Horario,Data;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getContato() {
        return Contato;
    }

    public void setContato(String Contato) {
        this.Contato = Contato;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }



    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }
}

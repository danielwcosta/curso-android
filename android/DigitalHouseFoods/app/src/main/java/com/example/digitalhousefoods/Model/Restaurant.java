package com.example.digitalhousefoods.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Restaurant implements Parcelable {

    private int foto;
    private String nome,endereco,horaFechar;

    public Restaurant(int foto, String nome, String endereco, String horaFechar) {
        this.foto = foto;
        this.nome = nome;
        this.endereco = endereco;
        this.horaFechar = horaFechar;
    }

    protected Restaurant(Parcel in) {
        foto = in.readInt();
        nome = in.readString();
        endereco = in.readString();
        horaFechar = in.readString();
    }

    public static final Creator<Restaurant> CREATOR = new Creator<Restaurant>() {
        @Override
        public Restaurant createFromParcel(Parcel in) {
            return new Restaurant(in);
        }

        @Override
        public Restaurant[] newArray(int size) {
            return new Restaurant[size];
        }
    };

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getHoraFechar() {
        return "Fecha às: " + horaFechar;
    }

    public void setHoraFechar(String horaFechar) {
        this.horaFechar = horaFechar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(foto);
        dest.writeString(nome);
        dest.writeString(endereco);
        dest.writeString(horaFechar);
    }
}

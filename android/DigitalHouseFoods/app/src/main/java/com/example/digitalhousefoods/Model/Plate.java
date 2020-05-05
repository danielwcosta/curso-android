package com.example.digitalhousefoods.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Plate implements Parcelable {
    private int fotoPrato;
    private String nomePrato,descricaoPrato;

    public Plate(int fotoPrato, String nomePrato, String descricaoPrato) {
        this.fotoPrato = fotoPrato;
        this.nomePrato = nomePrato;
        this.descricaoPrato = descricaoPrato;
    }

    protected Plate(Parcel in) {
        fotoPrato = in.readInt();
        nomePrato = in.readString();
        descricaoPrato = in.readString();
    }

    public static final Creator<Plate> CREATOR = new Creator<Plate>() {
        @Override
        public Plate createFromParcel(Parcel in) {
            return new Plate(in);
        }

        @Override
        public Plate[] newArray(int size) {
            return new Plate[size];
        }
    };

    public int getFotoPrato() {
        return fotoPrato;
    }

    public void setFotoPrato(int fotoPrato) {
        this.fotoPrato = fotoPrato;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public String getDescricaoPrato() {
        return descricaoPrato;
    }

    public void setDescricaoPrato(String descricaoPrato) {
        this.descricaoPrato = descricaoPrato;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(fotoPrato);
        dest.writeString(nomePrato);
        dest.writeString(descricaoPrato);
    }
}

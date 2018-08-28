package com.abhishek.fundhawk.model;

import android.os.Parcel;
import android.os.Parcelable;

public class SelectedFunds implements Parcelable {

    String name;

    String id;

    public SelectedFunds(String name, String id) {
        this.name = name;
        this.id = id;
    }

    protected SelectedFunds(Parcel in) {
        name = in.readString();
        id = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(id);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<SelectedFunds> CREATOR = new Creator<SelectedFunds>() {
        @Override
        public SelectedFunds createFromParcel(Parcel in) {
            return new SelectedFunds(in);
        }

        @Override
        public SelectedFunds[] newArray(int size) {
            return new SelectedFunds[size];
        }
    };

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

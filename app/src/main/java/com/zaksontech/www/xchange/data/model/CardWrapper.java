package com.zaksontech.www.xchange.data.model;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.example.ahmed.alcassessment.utils.DBSchema;



public class CardWrapper extends CursorWrapper {
    public CardWrapper(Cursor cursor) {
        super(cursor);
    }

    public Card getCard(){
        Card card = new Card();
        String from = getString(getColumnIndex(DBSchema.currencyFrom));
        String to = getString(getColumnIndex(DBSchema.currencyTo));
        double currentRate = getDouble(getColumnIndex(DBSchema.currentRate));
        String uuid = getString(getColumnIndex(DBSchema.UUID));
        card.setAll(from, to, currentRate, uuid);
        return card;
    }
}

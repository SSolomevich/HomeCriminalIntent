package com.solomevich.android.homecriminalintent;

import java.util.UUID;

/**
 * Created by 15 on 01.02.2018.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    public Crime() {
// Генерирование уникального идентификатора
        mId = UUID.randomUUID();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}

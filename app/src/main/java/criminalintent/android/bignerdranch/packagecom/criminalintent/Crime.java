package criminalintent.android.bignerdranch.packagecom.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by samgh on 11/13/2016.
 */

public class Crime {
    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }


    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    private Date mDate;
    private boolean mSolved;
    private UUID mId;
    private String mTitle;

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }

}

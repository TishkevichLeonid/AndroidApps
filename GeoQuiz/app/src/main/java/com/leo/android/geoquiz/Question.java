package com.leo.android.geoquiz;

/**
 * Created by leonidtiskevic on 04.02.17.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue){

        mTextResId = textResId;
        mAnswerTrue = answerTrue;

    }

}

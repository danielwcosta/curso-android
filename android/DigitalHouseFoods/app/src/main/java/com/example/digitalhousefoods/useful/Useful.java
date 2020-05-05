package com.example.digitalhousefoods.useful;

import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;

public class Useful {

    public static boolean editTextIsEmpty(EditText... editTexts){
        for(EditText editText : editTexts){
            if(editText.getText().toString().isEmpty()){
                return true;
            }
        }    return false;
    }

    public static void fazIntent(Activity activity, Class classe){
        Intent intent = new Intent(activity, classe);
        activity.startActivity(intent);
    }
}

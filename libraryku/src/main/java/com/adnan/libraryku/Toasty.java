package com.adnan.libraryku;

import android.content.Context;
import android.widget.Toast;

public class Toasty {
    public void showToast(Context context) {
        Toast.makeText(context, "hello", Toast.LENGTH_LONG).show();
    }
}

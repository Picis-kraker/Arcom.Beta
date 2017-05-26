package com.example.g40_70.agricularcom.attrs;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.net.Uri;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by G40-70 on 24/05/2017.
 */

public class Attrs {

    @BindingAdapter("app:imgUrl")
    public static void  setImage(ImageView img , String url){
        Context context =img.getContext();
        Uri uri = Uri.parse(url);
        Picasso.with(img.getContext()).load(Uri.parse(url)).into(img);

    }
}

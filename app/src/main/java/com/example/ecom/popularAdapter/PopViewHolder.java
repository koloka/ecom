package com.example.ecom.popularAdapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecom.R;
import com.facebook.drawee.view.SimpleDraweeView;

public class PopViewHolder extends RecyclerView.ViewHolder {
    private TextView txtTitle;
    private TextView txtBody;
    private TextView txtAuthor;
    private SimpleDraweeView popimg;

    public PopViewHolder(@NonNull View itemView) {
        super(itemView);
        txtTitle = itemView.findViewById(R.id.txt_titlepop);
        txtBody = itemView.findViewById(R.id.txt_blog_bodypop);
        txtAuthor = itemView.findViewById(R.id.txt_authorpop);
        popimg = itemView.findViewById(R.id.pop_img);
    }
    public void bind(Popular pop){
        txtTitle.setText(pop.getTitle());
        txtBody.setText(pop.getBody());
        txtAuthor.setText(pop.getAuthor());
        popimg.setImageURI(pop.getBlogUrl());
    }
}


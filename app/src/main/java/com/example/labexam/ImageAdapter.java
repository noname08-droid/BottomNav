package com.example.labexam;


import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder>{

    Dialog myImageView;

    ImageView showImage;
    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        final ImageViewHolder vHolder =new ImageViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.recycler_item, parent, false));


        myImageView = new Dialog(parent.getContext());
        myImageView.setContentView(R.layout.show_image);
        myImageView.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        showImage = (ImageView) myImageView.findViewById(R.id.show_Images);
        vHolder.postImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showImage.setImageResource(postItems.get(vHolder.getAdapterPosition()).getImage());

                Toast.makeText(view.getContext(), "Item Clicked: " +
                        String.valueOf(vHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
                myImageView.show();
            }
        });
        return vHolder;
//        return new ImageViewHolder(
//                LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false)
//
//        );
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        holder.setPostImageView(postItems.get(position));

        //
//        myImageView = new Dialog(holder.postImageView.getContext());
//        myImageView.setContentView(R.layout.show_image);
//        myImageView.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//
//        holder.postImageView.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//
//                ImageView showImage = (ImageView) myImageView.findViewById(R.id.show_Images);
//                showImage.setImageResource(postItems.get(holder.getAdapterPosition()).getImage());
//
//                Toast.makeText(view.getContext(), "Item Clicked: " +
//                        String.valueOf(holder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
//
//            }
//        });
        //
    }

    @Override
    public int getItemCount() {
        return postItems.size();
    }

    private List<PostItem> postItems;

    public ImageAdapter(List<PostItem> postItems) {
        this.postItems = postItems;
    }

    class ImageViewHolder extends RecyclerView.ViewHolder {

        RoundedImageView postImageView;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            postImageView = itemView.findViewById(R.id.imagePost);
            //postImageView.setOnClickListener((View.OnClickListener) this);
        }
        void setPostImageView(PostItem postItem){

            postImageView.setImageResource(postItem.getImage());
    }
    }
}

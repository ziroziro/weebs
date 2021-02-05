package com.ziro.weebs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class StaggredRecyclerAdapter extends RecyclerView.Adapter<StaggredRecyclerAdapter.ImageViewHolder> {

    Context mContext;
    List<Row> mdata;

    public StaggredRecyclerAdapter(Context mContext, List<Row> mdata) {
        this.mContext = mContext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.row_item,viewGroup,false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder imageViewHolder,int i) {

        //bind image
        imageViewHolder.img.setImageResource(mdata.get(i).getImg());

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }


    public class ImageViewHolder extends RecyclerView.ViewHolder{

        ImageView img;


        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.row_img);
        }
    }
}

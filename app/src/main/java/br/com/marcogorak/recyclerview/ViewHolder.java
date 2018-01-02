package br.com.marcogorak.recyclerview;

import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

/**
 * Created by marcogorak on 23/12/2017.
 */

public class ViewHolder extends RecyclerView.ViewHolder{

    public ImageView featuredImage;
    public TextView title;
    public TextView desc;
    public AppCompatButton btnLink;

    public ViewHolder(View itemView) {
        super(itemView);


        this.featuredImage = (ImageView) itemView.findViewById(R.id.featured_image);
        this.title = (TextView) itemView.findViewById(R.id.title);
        this.desc = (TextView) itemView.findViewById(R.id.desc);
        this.btnLink = (AppCompatButton) itemView.findViewById(R.id.btn_link);

    }
}

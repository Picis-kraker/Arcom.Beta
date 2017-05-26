package com.example.g40_70.agricularcom.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.g40_70.agricularcom.R;
import com.example.g40_70.agricularcom.databinding.TemplateMovieBinding;
import com.example.g40_70.agricularcom.models.Movie;

import java.util.List;


public class ArcomAdapter extends RecyclerView.Adapter<ArcomAdapter.MovieHolder>{



    public  interface  OnMovieSelected{
       void onMovie(int position);
   }
    LayoutInflater inflater;
    List<Movie> data;
    OnMovieSelected onMovieSelected;

    public ArcomAdapter(LayoutInflater inflater, List<Movie> data , OnMovieSelected onMovieSelected) {
        this.inflater = inflater;
        this.data = data;
        this.onMovieSelected = onMovieSelected;
    }

    @Override
        public MovieHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         View v =  inflater.inflate(R.layout.template_movie, parent, false);
        return new MovieHolder(v);
    }

        @Override
        public void onBindViewHolder(MovieHolder holder, int position) {
       Movie m = data.get(position);
            holder.binding.setMovie(m);
            holder.binding.getRoot().setTag(position);
            holder.binding.setHandler(this);
        }

        @Override
        public int getItemCount() {
            return data.size();
        }
        public  void onClick(View view){
            int pos = (int)view.getTag();
            onMovieSelected.onMovie(pos);
        }


    //region Description
    static  class MovieHolder extends RecyclerView.ViewHolder{

        TemplateMovieBinding binding;

        public MovieHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }


    }
    //endregion
}

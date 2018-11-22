package vn.edu.poly.demoxmlparser.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import vn.edu.poly.demoxmlparser.R;
import vn.edu.poly.demoxmlparser.model.News;


public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    private List<News> newsList;
    private Activity activity;
    /**Contructor*/
    public NewsAdapter(Activity activity, List<News> newsList) {
        this.activity = activity;
        this.newsList = newsList;
    }
    /** Create ViewHolder*/
    public class NewsViewHolder extends RecyclerView.ViewHolder {
        private TextView titles;
        private TextView descriptions;
        private TextView pubDates;
        private TextView links;
        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            titles = (TextView) itemView.findViewById(R.id.title);
            descriptions = (TextView) itemView.findViewById(R.id.description);
            pubDates = (TextView) itemView.findViewById(R.id.pubDate);
            links = (TextView) itemView.findViewById(R.id.link);
        }
    }
    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        /** Get layout */
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item,parent,false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        /** Set Value*/
        final News news = newsList.get(position);
        holder.titles.setText(news.getTitle());
        holder.descriptions.setText(news.getDescription());
        holder.pubDates.setText(news.getPubDate());
        holder.links.setText(news.getLink());
        /*Sự kiện click vào item*/
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, news.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }
}

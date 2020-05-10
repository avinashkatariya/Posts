package com.example.posts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    private List<PostModel> _posts = new ArrayList<>();
    private Context _context;

    public PostAdapter(Context context) {
        this._context = context;
        _posts.add(new PostModel("Numerology: Discover your Sun number and find out what it has to say about You !!!","What is Sun Number In Numerology:   We all have heard about zodiac signs and the Average Joe in the world could most likely tell you","Aastikin","August 11, 2017","https://aastik.in/wp-content/uploads/2017/03/386270901_51dd18de87_b-218x150.jpg"));
        _posts.add(new PostModel("Wearing Pukhraj (Yellow Sapphire) can give you miraculous progress & success in life","Introduction: Pukhraj also known as Yellow Sapphire is an attractive yellow colored expensive gemstone which is well known for its astrological benefits. According to the.","Aastikin","July 14, 2017","https://aastik.in/wp-content/uploads/2017/07/yellow-sapphire-stone-for-jewelry-218x150.jpg"));
        _posts.add(new PostModel("These Gemstones Will Bring You Success, If Chosen According To Profession.","According to the Vedic astrology wearing a right gemstone can bring miracle in a life. There are total nine planets and each one of","Astkikin"," June 20, 2017","https://aastik.in/wp-content/uploads/2017/06/7ae69b1be31ea40a0f28d1f0411a04ae-2-218x150.jpg"));
        _posts.add(new PostModel("Numerology: Discover your Sun number and find out what it has to say about You !!!","What is Sun Number In Numerology:   We all have heard about zodiac signs and the Average Joe in the world could most likely tell you","Aastikin","August 11, 2017","https://aastik.in/wp-content/uploads/2017/03/386270901_51dd18de87_b-218x150.jpg"));
        _posts.add(new PostModel("Numerology: Discover your Sun number and find out what it has to say about You !!!","What is Sun Number In Numerology:   We all have heard about zodiac signs and the Average Joe in the world could most likely tell you","Aastikin","August 11, 2017","https://aastik.in/wp-content/uploads/2017/03/386270901_51dd18de87_b-218x150.jpg"));
        _posts.add(new PostModel("Numerology: Discover your Sun number and find out what it has to say about You !!!","What is Sun Number In Numerology:   We all have heard about zodiac signs and the Average Joe in the world could most likely tell you","Aastikin","August 11, 2017","https://aastik.in/wp-content/uploads/2017/03/386270901_51dd18de87_b-218x150.jpg"));
        _posts.add(new PostModel("Numerology: Discover your Sun number and find out what it has to say about You !!!","What is Sun Number In Numerology:   We all have heard about zodiac signs and the Average Joe in the world could most likely tell you","Aastikin","August 11, 2017","https://aastik.in/wp-content/uploads/2017/03/386270901_51dd18de87_b-218x150.jpg"));
        _posts.add(new PostModel("Numerology: Discover your Sun number and find out what it has to say about You !!!","What is Sun Number In Numerology:   We all have heard about zodiac signs and the Average Joe in the world could most likely tell you","Aastikin","August 11, 2017","https://aastik.in/wp-content/uploads/2017/03/386270901_51dd18de87_b-218x150.jpg"));

    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.post_layout,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.postHeading.setText(_posts.get(position).get_postHeading());
        holder.postContent.setText(_posts.get(position).get_postContent());
        holder.postAuthor.setText(_posts.get(position).get_author());
        holder.postPostedDate.setText(_posts.get(position).get_postDate());
        Glide.with(_context).load(_posts.get(position).get_imageUrl()).into(holder.postImage);


    }

    @Override
    public int getItemCount() {
        return _posts.size();
    }

    public  static class  PostViewHolder extends  RecyclerView.ViewHolder{

        public TextView postHeading,postContent,postAuthor,postPostedDate;
        public ImageView postImage;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            postHeading = itemView.findViewById(R.id.postHeading);
            postContent = itemView.findViewById(R.id.postContent);
            postAuthor = itemView.findViewById(R.id.postAuthor);
            postPostedDate = itemView.findViewById(R.id.postPostedDate);
            postImage = itemView.findViewById(R.id.postImage);
        }
    }
}

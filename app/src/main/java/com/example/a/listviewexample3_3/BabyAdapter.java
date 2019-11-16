package com.example.a.listviewexample3_3;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by A on 2019/11/5.
 */

public class BabyAdapter extends ArrayAdapter<Baby> {

        //p116定制界面
        private int resourceID;
       private List<Baby>babies;
        public BabyAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List objects) {
            super(context, resource, objects);
            resourceID=resource;
            babies=objects;
        }

        @Override
        public int getCount() {
            return super.getCount();
        }
        @NonNull
        @Override
        public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent)
        //哪个 回收放滚出屏幕的 描绘的的父布局
        {
            Baby baby = getItem(position);
            View view;
            ViewHoloder viewHoloder;
            if(convertView==null){
                view = LayoutInflater.from(getContext()).inflate(resourceID,parent,false);
                viewHoloder = new ViewHoloder();
                viewHoloder.babyImage= (ImageView) view.findViewById(R.id.baby_image);
                viewHoloder.babyName = (TextView) view.findViewById(R.id.baby_name);
                viewHoloder.babyTitle = (TextView) view.findViewById(R.id.baby_title);
                viewHoloder.button1 = (Button) view.findViewById(R.id.button_1) ;
                view.setTag(viewHoloder);
            }else {
                view = convertView;
                viewHoloder = (ViewHoloder) view.getTag();
            }
            viewHoloder.babyImage.setImageResource(baby.getImageID());
            viewHoloder.babyName.setText(baby.getName());
            viewHoloder.babyTitle.setText(baby.getTitle());
            viewHoloder.button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showInfo(position);
                }
            });
            return view;
        }
        public void showInfo(int location){
            AlertDialog.Builder dialog=new AlertDialog.Builder(getContext());
            dialog.setTitle(babies.get(location).getTitle());
            dialog.setMessage(babies.get(location).getName());
            dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            }).show();
        }
        class ViewHoloder{
            ImageView babyImage;
            TextView babyName;
            TextView
                    babyTitle;
            Button button1;
        }
    }



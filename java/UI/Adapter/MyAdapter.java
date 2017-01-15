package com.example.adm.sharedpefscrud.UI.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.adm.sharedpefscrud.Model.Person;
import com.example.adm.sharedpefscrud.R;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter{

    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<Person> persinList;

    public MyAdapter(Context context, LayoutInflater layoutInflater, ArrayList<Person> persinList) {
        this.context = context;
        this.layoutInflater = layoutInflater;
        this.persinList = persinList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null){
            view = layoutInflater.inflate(R.layout.item_person, parent, false);
        }
        final Person person = (Person) getItem(position);

        TextView tvNamePerson = (TextView) convertView.findViewById(R.id.text_view_name);
        TextView tvSurnamePerson = (TextView) convertView.findViewById(R.id.text_view_surname);
        TextView tvNumberPerson = (TextView) convertView.findViewById(R.id.text_view_number);
        TextView tvMailPerson = (TextView) convertView.findViewById(R.id.text_view_mail);
        TextView tvSkypePerson = (TextView) convertView.findViewById(R.id.text_view_skype);
        ImageButton ibDelete = (ImageButton) convertView.findViewById(R.id.image_button_item_delete);

        tvNamePerson.setText(person.getName());
        tvSurnamePerson.setText(person.getSurname());
        tvNumberPerson.setText(person.getNumber());
        tvMailPerson.setText(person.getMail());
        tvSkypePerson.setText(person.getSkype());

        tvNumberPerson.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        tvMailPerson.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        tvSkypePerson.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        ibDelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });

        return view;
    }

    @Override
    public int getCount() {
        return persinList.size();
    }

    @Override
    public Object getItem(int position) {
        return persinList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

}

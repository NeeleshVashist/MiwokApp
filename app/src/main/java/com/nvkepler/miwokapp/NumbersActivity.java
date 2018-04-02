package com.nvkepler.miwokapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by neelv on 21/3/18.
 */

public class NumbersActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an array of words
        //        String[] words = new String[10];
        //        words[0] = "one";
        //        words[1] = "two";
        //        words[2] = "three";
        //        words[3] = "four";
        //        words[4] = "five";
        //        words[5] = "six";
        //        words[6] = "seven";
        //        words[7] = "eight";
        //        words[8] = "nine";
        //        words[9] = "ten";

        //ArrayList of Words
        //        ArrayList<String> words = new ArrayList<>();
        //        words.add(0,"one");
        //        words.add(1,"two");
        //        words.add(2,"three");
        //        words.add(3,"four");
        //        words.add(4,"five");
        //        words.add(5,"six");
        //        words.add(6,"seven");
        //        words.add(7,"eight");
        //        words.add(8,"nine");
        //        words.add(9,"ten");

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo’e"));
        words.add(new Word("ten", "na’aacha"));

        //Log msg to print a log at a particular point

        //Log.d("word", "word at 0 index : " + words.get(0));

        //

        //Log to print all the elements in the arraylist

        //Log.d("word","Words : " + words);

        //

        // Find the root view so we can add child views to it

        //LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        //

        // Create a variable to keep track of the current index position

        //int index = 0;

        //

        // Keep looping until we've reached the end of the list (which means keep looping

        // as long as the current index position is less than the length of the list)

        //while (index < words.size()) {

        // Create a new TextView

        //TextView wordView = new TextView(this);

        //

        // Set the text to be word at the current index

        //wordView.setText(words.get(index));

        //

        // Add this TextView as another child to the root view of this layout

        //rootView.addView(wordView);

        //

        // Increment the index variable by 1

        //index++;

        //}

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        //ArrayAdapter<String> itemsAdapter =
        //        new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        //ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        //listView.setAdapter(itemsAdapter);

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}

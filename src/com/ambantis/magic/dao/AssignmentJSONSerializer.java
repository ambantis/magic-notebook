/*
package com.ambantis.magic.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

import com.ambantis.magic.models.Assignment;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONTokener;

import android.content.Context;

public class AssignmentJSONSerializer {
	private Context mContext;
	private String mFilename;
	
	public AssignmentJSONSerializer (Context c, String f){
		mContext = c;
		mFilename = f;
	}
	
	public ArrayList<Assignment> loadAssignments() throws IOException, JSONException {
		ArrayList<Assignment> assignments = new ArrayList<Assignment>();
		BufferedReader reader = null;
		try {
			// Read into StringBuilder
			InputStream in = mContext.openFileInput(mFilename);
			reader = new BufferedReader(new InputStreamReader(in));
			StringBuilder jsonString = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				jsonString.append(line);
			}
			// Parse JSON w/ JSONTokener
			JSONArray array = (JSONArray) new JSONTokener(jsonString.toString())
					.nextValue();
			//Build array of assignments from JSON objects
			for (int i = 0; i < array.length(); i++)
                //				assignments.add(new Assignment(array.getJSONObject(i)))
                //  todo:2013-06-15:ambantis:fix this
                ;
		} catch (FileNotFoundException e) {
			// Happens on first run
		} finally {
			if (reader != null)
				reader.close();
		}
		return assignments;
	}
	
	public void saveAssignments(ArrayList<Assignment> assignments)
				throws JSONException, IOException {
		// Build the array in JSON
		JSONArray array = new JSONArray();
		for (Assignment a : assignments)
			array.put(a.toJSON());
		
		// Write the file to local storage
		Writer writer = null;
		try {
			OutputStream out = mContext
					.openFileOutput(mFilename, Context.MODE_PRIVATE);
			writer = new OutputStreamWriter(out);
			writer.write(array.toString());
		} finally {
			if (writer != null)
				writer.close();
		}
	}
}

*/

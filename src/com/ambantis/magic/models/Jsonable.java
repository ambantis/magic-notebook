package com.ambantis.magic.models;

import org.json.JSONObject;
import org.json.JSONException;

/**
 * Classes that implement this interface can be exported in JSON format
 *
 * User: Alexandros Bantis
 * Date: 6/15/13
 * Time: 6:02 PM
 */
public interface Jsonable {

    abstract JSONObject toJSON() throws JSONException;
}

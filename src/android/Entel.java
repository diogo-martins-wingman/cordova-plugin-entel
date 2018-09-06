package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Entel extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
		
         cordova.getActivity().runOnUiThread(new Runnable() {
            public void run() {
              Toast.makeText(cordova.getActivity(), "teste",Toast.LENGTH_LONG).show();
            }
        });
		if (action.equals("greet")) {

            String name = data.getString(0);
            String message = "Hello, " + name;
            callbackContext.success(message);
			
			
            return true;

        } else {
            
            return false;

        }
    }
}
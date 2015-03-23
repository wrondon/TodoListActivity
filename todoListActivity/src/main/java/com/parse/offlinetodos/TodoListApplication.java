package com.parse.offlinetodos;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseObject;
import com.parse.ParseUser;

public class TodoListApplication extends Application {
	
	public static final String TODO_GROUP_NAME = "ALL_TODOS";
	
	@Override
	public void onCreate() {
		super.onCreate();
		
		// add Todo subclass
		ParseObject.registerSubclass(Todo.class);
		
		// enable the Local Datastore
		Parse.enableLocalDatastore(getApplicationContext());
		Parse.initialize(this, "FY61zpJRwvv0wiUMvBNe5kiOM6OVXbYI3A7bk6lD", "S5lbx4PT3YHqYafjdk65hbNmtCNwsQOUk1dhprvH");
		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
		ParseACL.setDefaultACL(defaultACL, true);	
	}
	
	

}

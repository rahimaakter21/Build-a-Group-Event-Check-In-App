# Group-Event-CheckUp-Job3-1
# Build-a-Group-Event-Check-In-App

###Build a Group Event Check-In App
                  Description: Develop an Android application that allows users to create, join, and share their location for group events. This app will use Firebase Authentication for
                   secure login, Firestore Database to store event and user data, and Google Maps todisplay user locations.

      1. User Login/Registration Screen:

            Begin with a login and registration screen using Firebase Authentication.Once authenticated, users can create or join an event by either selecting
            from a list of events or creating a new one.


      2. Event Creation and Joining:
   
            ○ Users can create an event by giving it a name, location, and time.
            ○ Alternatively, users can search for and join existing events.
            ○ Store event details in Firestore with fields for the event name,
            location, participants, and time.
      4. Check-In and Location Sharing:
            After joining or creating an event, users are directed to a screen where they
            can check in to the event. Once checked in, the app should:
            ○ Detect the device’s current location and update it in Firestore under
            the event's participant list.
            ○ Display each participant's location as a marker on Google Maps with
            a snippet containing the user’s name and time of check-in.

      5. Display Event Participants:
            ○ Show a list of all participants who have checked into the event using
            a RecyclerView.
            ○ Each item in the RecyclerView should display the user’s name,
            check-in time, and location distance from the event venue.

      6. Update User Details:
            Allow users to update their profile details, including display name, and
            update their check-in location if needed.
      
      Additional Requirements:
            ● Use Android Jetpack components like ViewModel, LiveData, and Data
            Binding to manage UI updates and data flow efficiently.
            ● Follow the MVVM architecture to ensure separation of concerns between UI
            and data handling.

# ticketbookingapp

ReactJS-HOL-12 : Conditional rendering.

## Components
- LoginButton.js  - <button onClick={props.onClick}>Login</button>
- LogoutButton.js - <button onClick={props.onClick}>Logout</button>
- UserGreeting.js  - <h1>Welcome back</h1>
- GuestGreeting.js - <h1>Please sign up.</h1>
- Greeting.js - if (props.isLoggedIn) return <UserGreeting/>, else
  <GuestGreeting/> (matches your image 5 exactly)
- App.js - class component holding isLoggedIn in state.
  Renders Greeting + either LoginButton or LogoutButton depending on
  isLoggedIn, using an element variable (`let button`). Clicking Login
  sets isLoggedIn=true -> "Welcome back" + Logout button shown (image 2).
  Clicking Logout sets isLoggedIn=false -> "Please sign up." + Login
  button shown (image 1).

NOTE: Your text description mentions "flight details" and "book
tickets" for a ticketbookingapp, but the screenshots and code snippets
you shared are the standard React "Welcome back" / "Please sign up."
conditional rendering example with no flight/ticket content. This
script matches the screenshots and code exactly (the concrete
evidence). If you actually want flight-listing / ticket-booking
content added on top of this login/logout mechanism, let me know and
this can be extended.

## node_modules
This project reuses node_modules from ReactJS-HOL-1-myfirstreact via a
directory junction created by this script (Windows mklink /J), so no
fresh "npm install" / extra disk space is needed. If react-scripts
still isn't found when you run "npm start", run "npm install" once
inside ticketbookingapp as a fallback.

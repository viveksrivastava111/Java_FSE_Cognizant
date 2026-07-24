# eventexamplesapp

ReactJS-HOL-11 : React event handling.

## Counter.js
- state.count starts at 5 (matches your screenshot's starting value)
- Increment button: increases count AND calls sayHello() -> alert
  "Hello! Member1" (matches image 1)
- Decrement button: decreases count only
- Say welcome button: invokes sayWelcome("welcome") passing "welcome"
  as an argument -> alert "welcome" (matches image 2)
- Click on me button: synthetic onClick event -> alert "I was clicked"
  (matches image 3)
- All handlers bound via constructor `this` binding (classic React
  class-component event handling pattern taught in this HOL)

## CurrencyConvertor.js
- Controlled inputs for Amount (text input) and Currency (textarea,
  matching the resizable box shape in your screenshot)
- Submit button -> handleSubmit() -> alerts
  "Converting to  <currency> Amount is <amount * 80>"
- NOTE: Your screenshot shows Amount=80, Currency=Euro producing
  "Amount is 6400" = 80 * 80. This uses a rate of 80 to exactly match
  that reference output, NOT a real-world INR-to-Euro rate (which
  would actually divide, not multiply, since 1 Euro > 1 Rupee). If you
  want real currency conversion math instead of matching the
  screenshot's number, say so and this can be corrected.

## node_modules
This project reuses node_modules from ReactJS-HOL-1-myfirstreact via a
directory junction created by this script (Windows mklink /J), so no
fresh "npm install" / extra disk space is needed. If react-scripts
still isn't found when you run "npm start", run "npm install" once
inside eventexamplesapp as a fallback.

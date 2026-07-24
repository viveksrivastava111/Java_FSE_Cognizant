# cricketapp (HOL-9)

ReactJS-HOL-9 : ES6 features (map, arrow functions, destructuring, merge).
Data matches the exact reference screenshots you shared:
  - ListofPlayers: Jack 50, Michael 70, John 40, Ann 61, Elisabeth 61,
    Sachin 95, Dhoni 100, Virat 84, Jadeja 64, Raina 75, Rohit 80
  - IndianTeam (for Odd/Even split): Sachin1, Dhoni2, Virat3, Rohit4,
    Yuvaraj5, Raina6
      -> Odd  = First: Sachin1, Third: Virat3, Fifth: Yuvaraj5
      -> Even = Second: Dhoni2, Fourth: Rohit4, Sixth: Raina6
  - T20Players + RanjiTrophyPlayers merged via spread -> "First Player"
    through "Sixth Player"

flag = true  -> shows ListofPlayers (map + filter output)
flag = false -> shows Odd/Even Players + Merged Indian Players output
Toggle `var flag` at the top of App.js to switch between the two
screenshots ("When Flag=true" / "When Flag=false").

## node_modules
This project reuses node_modules from ReactJS-HOL-1-myfirstreact via a
directory junction created by this script (Windows mklink /J), so no
fresh "npm install" / extra disk space is needed. If react-scripts
still isn't found when you run "npm start", run "npm install" once
inside cricketapp as a fallback.

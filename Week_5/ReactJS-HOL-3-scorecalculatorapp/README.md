# scorecalculatorapp

ReactJS-HOL-3 : Function component + styling.
"CalculateScore" is a function component that accepts Name, School,
Total and goal as props, calculates average = (total / goal) * 100,
and displays it. Styled via Stylesheets/mystyle.css.

## node_modules
This project reuses node_modules from ReactJS-HOL-1-myfirstreact via a
directory junction created by this script (Windows mklink /J), so no
fresh "npm install" / extra disk space is needed. If react-scripts
still isn't found when you run "npm start", run "npm install" once
inside scorecalculatorapp as a fallback.

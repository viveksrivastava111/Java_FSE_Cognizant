# cohortdashboard

ReactJS-HOL-5 : Styling with CSS Modules + inline styles.

NOTE: No zip file was uploaded for this hands-on, so this project was
built from scratch (not unzipped) to match the objectives and the
Figure 2 screenshot you shared, using 3 sample cohorts:
  - INTADMDF10 -.NET FSD (Scheduled)
  - ADM21JF014 -Java FSD (Ongoing)
  - CDBJF21025 -Java FSD (Ongoing)
Edit the `cohorts` array at the top of CohortDetails.js if your actual
lab data differs.

CohortDetails.module.css:
  - .box class: width 300px, display inline-block, 10px margin all
    round, 10px top/bottom padding, 20px left/right padding, 1px solid
    black border, 10px border-radius
  - dt tag selector: font-weight 500

CohortDetails.js:
  - Imports the CSS Module (import styles from './CohortDetails.module.css')
  - Applies styles.box to each cohort's container div via className
  - Uses inline style on <h3> - green when status is "Ongoing"
    (case-insensitive), blue otherwise

## node_modules
This project reuses node_modules from ReactJS-HOL-1-myfirstreact via a
directory junction created by this script (Windows mklink /J), so no
fresh "npm install" / extra disk space is needed. If react-scripts
still isn't found when you run "npm start", run "npm install" once
inside cohortdashboard as a fallback.

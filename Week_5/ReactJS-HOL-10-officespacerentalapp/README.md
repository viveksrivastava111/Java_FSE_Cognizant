# officespacerentalapp

ReactJS-HOL-10 : JSX elements, attributes, and inline CSS.

## App.js
- Heading element: "Office Space , at Affordable Range"
- Image attribute (src) displays each office's image
- officeSpaces array holds 3 office objects (Name, Rent, Address,
  image) - looped via .map() as the doc explicitly asks to "create a
  list of Object and loop through the office space item"
- First item (DBS / Rs. 50000 / Chennai) matches your reference
  screenshot exactly
- getRentStyle() mirrors your reference logic exactly (let colors=[],
  push 'textRed' if rent <= 60000 else 'textGreen') and converts that
  into an inline style object so the <p> tag colors Rent red (<=60000)
  or green (>60000)

NOTE: The lab doc says to loop through a LIST of office objects, but
the screenshot shows only one office card (DBS). This script builds
the list version (3 offices) as literally instructed. If you only
want the single DBS object with no loop, remove the array/map and
hardcode one office object instead - say the word and I'll adjust.

Image URLs are placeholder stock photos (Unsplash) since no actual
image file was provided - swap the `image` field with your own path
or URL if you have specific images from the reference solution.

## node_modules
This project reuses node_modules from ReactJS-HOL-1-myfirstreact via a
directory junction created by this script (Windows mklink /J), so no
fresh "npm install" / extra disk space is needed. If react-scripts
still isn't found when you run "npm start", run "npm install" once
inside officespacerentalapp as a fallback.

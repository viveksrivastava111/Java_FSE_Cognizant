# bloggerapp

ReactJS-HOL-13 : List rendering with keys + multiple conditional
rendering techniques, 3 components side by side.

## booksData.js
- books array: Master React/670, Deep Dive into Angular 11/800,
  Mongo Essentials/450 - verbatim from your image 4

## BookDetails.js
- `bookdet` variable holding JSX built via props.books.map(), each
  item keyed by book.id, rendering <h3>{bname}</h3> and
  <h4>{price}</h4> - verbatim from your image 2

## BlogDetails.js
- React Learning / Stephen Biz / "Welcome to learning React!" and
  Installation / Schewzdenier / "You can install React from npm."
  - matches your screenshot exactly

## CourseDetails.js
- Angular / 4/5/2021 and React / 6/3/20201 (kept literally as shown
  in your screenshot - looks like a typo for 2021, but reproduced
  as-is since that's the working reference; let me know if you want
  it corrected)

## App.js - 3 conditional rendering techniques (per lab objective
"Implement this with as many ways possible of Conditional Rendering")
1. Book Details: if/else assigning JSX to a variable (bookSection)
   before the component renders - classic "element variable" pattern
2. Blog Details: Logical && operator inline in JSX
   ({showBlogs && <BlogDetails />})
3. Course Details: Ternary operator inline in JSX
   ({showCourses ? <CourseDetails /> : <p>No courses...</p>})
- className values (st2, v1, mystyle1) match your image 3 exactly;
  basic CSS added in index.css to lay the 3 sections out side by side
  with green dividers, matching your screenshot's layout

## node_modules
This project reuses node_modules from ReactJS-HOL-1-myfirstreact via a
directory junction created by this script (Windows mklink /J), so no
fresh "npm install" / extra disk space is needed. If react-scripts
still isn't found when you run "npm start", run "npm install" once
inside bloggerapp as a fallback.

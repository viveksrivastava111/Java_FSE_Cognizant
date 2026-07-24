# blogapp

ReactJS-HOL-4 : Component life cycle.
Post.js - plain JS class (id, title, body).
Posts.js - class component:
  - constructor: initializes state.posts = []
  - loadPosts(): fetch from jsonplaceholder /posts, maps each item to a
    Post instance, stores in state
  - componentDidMount(): calls loadPosts()
  - render(): displays title (h2) and body (p) for every post
  - componentDidCatch(error, info): shows an alert with the error message

## node_modules
This project reuses node_modules from ReactJS-HOL-1-myfirstreact via a
directory junction created by this script (Windows mklink /J), so no
fresh "npm install" / extra disk space is needed. If react-scripts
still isn't found when you run "npm start", run "npm install" once
inside blogapp as a fallback.

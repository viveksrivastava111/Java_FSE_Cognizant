const blogs = [
    { id: 201, title: "React Learning", author: "Stephen Biz", body: "Welcome to learning React!" },
    { id: 202, title: "Installation", author: "Schewzdenier", body: "You can install React from npm." }
];

function BlogDetails(props) {
    const content = blogs.map((blog) =>
        <div key={blog.id}>
            <h1>{blog.title}</h1>
            <h4>{blog.author}</h4>
            <p>{blog.body}</p>
        </div>
    );

    return content;
}

export default BlogDetails;

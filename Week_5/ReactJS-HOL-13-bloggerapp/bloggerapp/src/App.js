import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';
import { books } from './booksData';

// ---------------------------------------------------------------
// Conditional Rendering - Way 1: if/else with a variable holding JSX
// ---------------------------------------------------------------
const showBooks = true;
let bookSection;
if (showBooks) {
    bookSection = <BookDetails books={books} />;
} else {
    bookSection = null;
}

function App() {
    // ---------------------------------------------------------------
    // Conditional Rendering - Way 2: Logical && operator (inline)
    // ---------------------------------------------------------------
    const showBlogs = true;

    // ---------------------------------------------------------------
    // Conditional Rendering - Way 3: Ternary operator (inline)
    // ---------------------------------------------------------------
    const showCourses = true;

    return (
        <div>
            <div></div>
            <div></div>

            <div className="st2">
                <h1> Book Details</h1>
                {bookSection}
            </div>

            <div className="v1">
                <h1> Blog Details</h1>
                {showBlogs && <BlogDetails />}
            </div>

            <div className="mystyle1">
                <h1> Course Details</h1>
                {showCourses ? <CourseDetails /> : <p>No courses to display.</p>}
            </div>
        </div>
    );
}

export default App;

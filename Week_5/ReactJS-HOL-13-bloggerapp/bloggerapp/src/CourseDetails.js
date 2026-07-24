const courses = [
    { id: 301, cname: "Angular", date: "4/5/2021" },
    { id: 302, cname: "React", date: "6/3/20201" }
];

function CourseDetails(props) {
    const coursedet = courses.map((course) =>
        <div key={course.id}>
            <h1>{course.cname}</h1>
            <p>{course.date}</p>
        </div>
    );

    return coursedet;
}

export default CourseDetails;

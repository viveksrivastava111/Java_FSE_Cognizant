import '../Stylesheets/mystyle.css';

function CalculateScore(props) {
  const average = ((props.total / props.goal) * 100).toFixed(2);

  return (
    <div className="score-card">
      <h2>Student Score Card</h2>
      <p><strong>Name:</strong> {props.name}</p>
      <p><strong>School:</strong> {props.school}</p>
      <p><strong>Total Marks:</strong> {props.total}</p>
      <p><strong>Goal / Max Marks:</strong> {props.goal}</p>
      <p className="average-score"><strong>Average Score:</strong> {average}%</p>
    </div>
  );
}

export default CalculateScore;

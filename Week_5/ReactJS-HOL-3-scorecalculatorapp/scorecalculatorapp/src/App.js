import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore
        name="Sparsh Srivastava"
        school="Green Valley Public School"
        total={450}
        goal={500}
      />
    </div>
  );
}

export default App;

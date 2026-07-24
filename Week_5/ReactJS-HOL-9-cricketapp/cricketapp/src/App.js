import ListofPlayers from './ListofPlayers';
import {
    OddPlayers,
    EvenPlayers,
    IndianPlayers,
    ListofIndianPlayers,
    IndianTeam
} from './IndianPlayers';

var flag = true;

function App() {
    if (flag === true) {
        return (
            <div>
                <h1> List of Players</h1>
                <ListofPlayers />
            </div>
        );
    }
    else {
        return (
            <div>
                <div>
                    <h1> Indian Team </h1>
                    <h1> Odd Players </h1>
                    {OddPlayers(IndianTeam)}
                    <hr />
                    <h1>Even Players</h1>
                    {EvenPlayers(IndianTeam)}
                </div>
                <hr />
                <div>
                    <h1> List of Indian Players Merged:</h1>
                    <ListofIndianPlayers IndianPlayers={IndianPlayers} />
                </div>
            </div>
        );
    }
}

export default App;

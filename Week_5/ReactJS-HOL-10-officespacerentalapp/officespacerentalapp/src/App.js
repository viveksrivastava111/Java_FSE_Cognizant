const officeSpaces = [
    {
        name: "DBS",
        rent: 50000,
        address: "Chennai",
        image: "https://images.unsplash.com/photo-1497366216548-37526070297c?w=400"
    },
    {
        name: "WeWork",
        rent: 75000,
        address: "Bangalore",
        image: "https://images.unsplash.com/photo-1497366811353-6870744d04b2?w=400"
    },
    {
        name: "Regus",
        rent: 45000,
        address: "Mumbai",
        image: "https://images.unsplash.com/photo-1524758631624-e2822e304c36?w=400"
    }
];

function getRentStyle(itemName) {
    let colors = [];
    if (itemName.rent <= 60000) {
        colors.push('textRed');
    }
    else {
        colors.push('textGreen');
    }
    return colors[0] === 'textRed'
        ? { color: 'red' }
        : { color: 'green' };
}

function App() {
    return (
        <div>
            <h1>Office Space , at Affordable Range</h1>

            {officeSpaces.map((office, index) => (
                <div key={index}>
                    <img src={office.image} alt={office.name} width="200" />

                    <h1>Name: {office.name}</h1>

                    <p style={getRentStyle(office)}>
                        <strong>Rent: Rs. {office.rent}</strong>
                    </p>

                    <p>Address: {office.address}</p>
                </div>
            ))}
        </div>
    );
}

export default App;

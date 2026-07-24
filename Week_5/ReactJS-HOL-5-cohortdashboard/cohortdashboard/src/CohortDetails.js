import styles from './CohortDetails.module.css';

const cohorts = [
    {
        code: "INTADMDF10 -.NET FSD",
        startedOn: "22-Feb-2022",
        status: "Scheduled",
        coach: "Aathma",
        trainer: "Jojo Jose"
    },
    {
        code: "ADM21JF014 -Java FSD",
        startedOn: "10-Sep-2021",
        status: "Ongoing",
        coach: "Apoorv",
        trainer: "Elisa Smith"
    },
    {
        code: "CDBJF21025 -Java FSD",
        startedOn: "24-Dec-2021",
        status: "Ongoing",
        coach: "Aathma",
        trainer: "John Doe"
    }
];

function CohortDetails() {
    return (
        <div>
            <h1>Cohorts Details</h1>
            {cohorts.map((cohort, index) => (
                <div key={index} className={styles.box}>
                    <h3 style={{ color: cohort.status.toLowerCase() === "ongoing" ? "green" : "blue" }}>
                        {cohort.code}
                    </h3>
                    <dl>
                        <dt>Started On</dt>
                        <dd>{cohort.startedOn}</dd>
                        <dt>Current Status</dt>
                        <dd>{cohort.status}</dd>
                        <dt>Coach</dt>
                        <dd>{cohort.coach}</dd>
                        <dt>Trainer</dt>
                        <dd>{cohort.trainer}</dd>
                    </dl>
                </div>
            ))}
        </div>
    );
}

export default CohortDetails;

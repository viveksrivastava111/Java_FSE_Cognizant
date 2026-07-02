SET SERVEROUTPUT ON;

BEGIN
    FOR c IN (
        SELECT CustomerID
        FROM Customers
        WHERE Age > 60
    )
    LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = c.CustomerID;

        DBMS_OUTPUT.PUT_LINE('Discount applied to Customer ID: ' || c.CustomerID);
    END LOOP;

    COMMIT;
END;
/

BEGIN
    FOR c IN (
        SELECT CustomerID
        FROM Customers
        WHERE Balance > 10000
    )
    LOOP
        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = c.CustomerID;

        DBMS_OUTPUT.PUT_LINE('Customer promoted to VIP: ' || c.CustomerID);
    END LOOP;

    COMMIT;
END;
/

BEGIN
    FOR l IN (
        SELECT c.Name, l.LoanID, l.DueDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: ' || l.Name ||
            ' your Loan ID ' || l.LoanID ||
            ' is due on ' || l.DueDate
        );
    END LOOP;
END;
/
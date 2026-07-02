SET SERVEROUTPUT ON;

-- Scenario 1: Process Monthly Interest

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE UPPER(AccountType) = 'SAVINGS';

    DBMS_OUTPUT.PUT_LINE('Monthly interest added to all savings accounts.');

    COMMIT;
END;
/

-- Scenario 2: Update Employee Bonus

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_department IN VARCHAR2,
    p_bonus_percent IN NUMBER
)
IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_percent / 100)
    WHERE Department = p_department;

    DBMS_OUTPUT.PUT_LINE('Bonus added for department: ' || p_department);

    COMMIT;
END;
/

-- Scenario 3: Transfer Funds

CREATE OR REPLACE PROCEDURE TransferFunds(
    p_from_account IN NUMBER,
    p_to_account IN NUMBER,
    p_amount IN NUMBER
)
IS
    v_balance NUMBER;
BEGIN
    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_from_account;

    IF v_balance >= p_amount THEN

        UPDATE Accounts
        SET Balance = Balance - p_amount
        WHERE AccountID = p_from_account;

        UPDATE Accounts
        SET Balance = Balance + p_amount
        WHERE AccountID = p_to_account;

        DBMS_OUTPUT.PUT_LINE('Amount transferred successfully.');

        COMMIT;

    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient balance.');
    END IF;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Account not found.');
END;
/

-- Test Calls


BEGIN
    ProcessMonthlyInterest;
END;
/

BEGIN
    UpdateEmployeeBonus('IT', 10);
END;
/

BEGIN
    TransferFunds(101, 102, 5000);
END;
/
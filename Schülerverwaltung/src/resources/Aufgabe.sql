DROP TABLE Aufgabe CASCADE CONSTRAINTS;

CREATE TABLE Aufgabe (
    id INTEGER,
    typ VARCHAR2(30),
    fach VARCHAR2(3),
    datum DATE,
    beschreibung VARCHAR2(50),
    
    CONSTRAINT pkAufgabe PRIMARY KEY(id)
);
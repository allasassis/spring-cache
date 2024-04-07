CREATE TABLE IF NOT EXISTS company (id INT PRIMARY KEY, name varchar(20));

CREATE OR REPLACE FUNCTION populateDb()
RETURNS VOID AS '
DECLARE
    cont INT := 1;
    registries INT := 0;
BEGIN
    SELECT COUNT(*) INTO registries FROM company;
    IF registries = 0 THEN
        FOR cont IN 1..300000 LOOP
            INSERT INTO company (id, name)
            VALUES (cont, CONCAT(''Company '', cont));
        END LOOP;
    END IF;
END;
'
LANGUAGE plpgsql;

SELECT populateDb();
ALTER TABLE users DROP COLUMN name;
ALTER TABLE users ADD COLUMN name VARCHAR(100) NOT NULL;
ALTER TABLE users ADD COLUMN login VARCHAR(100) NOT NULL;
ALTER TABLE users ADD CONSTRAINT login_unique UNIQUE (login);
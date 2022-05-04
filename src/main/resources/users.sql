CREATE TABLE users (
                       acct VARCHAR ( 255 ) PRIMARY KEY,
                       pwd VARCHAR ( 255 ),
                       fullname VARCHAR ( 255  ),
                       create_at TIMESTAMP,
                       update_at TIMESTAMP
);

INSERT INTO users (acct, pwd, fullname, create_at, update_at)
VALUES ('acct1', 'pwd', 'full name', '2022-05-02', '2022-05-02');
COMMIT;

SELECT * FROM users;

CREATE TABLE if NOT EXISTS users (
                       id serial PRIMARY KEY,
                       acct VARCHAR ( 255 ),
                       pwd VARCHAR ( 255 ),
                       fullname VARCHAR ( 255 ),
                       create_at TIMESTAMP,
                       update_at TIMESTAMP
);

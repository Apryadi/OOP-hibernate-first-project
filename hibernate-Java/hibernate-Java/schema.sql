-- Create the users table
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    major VARCHAR(255)
);

-- Insert data into the users table
INSERT INTO users (name, age, major) VALUES ('marco', 70, 'Physics');
INSERT INTO users (name, age, major) VALUES ('ocram', 60, 'Chemistry');

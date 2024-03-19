-- Insert sample books
INSERT INTO books (title, author, published_date, status) VALUES
('The Great Gatsby', 'F. Scott Fitzgerald', '1925-04-10', 'AVAILABLE'),
('To Kill a Mockingbird', 'Harper Lee', '1960-07-11', 'AVAILABLE'),
('1984', 'George Orwell', '1949-06-08', 'BORROWED'),
('Pride and Prejudice', 'Jane Austen', '1813-01-28', 'AVAILABLE');

-- Insert sample members
INSERT INTO members (first_name, last_name, email, join_date) VALUES
('John', 'Doe', 'john.doe@example.com', '2022-01-15'),
('Jane', 'Doe', 'jane.doe@example.com', '2023-02-20'),
('Alice', 'Smith', 'alice.smith@example.com', '2024-03-05');


INSERT INTO loans (book_id, member_id, loan_date, return_date) VALUES
(3, 1, '2024-02-01', NULL);

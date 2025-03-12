CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    book_name VARCHAR(255) NOT NULL,
    author_name VARCHAR(255) NOT NULL,
    number_of_pages BIGINT,
    book_genre VARCHAR(100),
    status_borrowed BOOLEAN DEFAULT FALSE,
    book_edition BIGINT,
    book_year BIGINT
);

INSERT INTO books (book_name, author_name, number_of_pages, book_genre, status_borrowed, book_edition, book_year)
VALUES
    ('Ainda Estou Aqui', 'Marcelo Rubens Paiva', 320, 'Drama', false, 1, 2015);

INSERT INTO books (book_name, author_name, number_of_pages, book_genre, status_borrowed, book_edition, book_year)
VALUES
    ('Uma Aprendizagem ou O Livro dos Prazeres', 'Clarice Lispector', 200, 'Romance', false, 1, 1990);

INSERT INTO books (book_name, author_name, number_of_pages, book_genre, status_borrowed, book_edition, book_year)
VALUES
    ('Cultura e Imperialismo', 'Edward Said', 400, 'Sociologia', false, 1, 1993);

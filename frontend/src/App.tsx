import React from 'react';
import './App.css';
import { useBookQuery } from './useRequest';
import { GET_BOOKS } from './graphql';
import { Book } from './type/Books';
import { BookComponent } from './components/BookComponent';

function App() {

  const { loading, error, data } = useBookQuery(GET_BOOKS);

  if (loading) return <h1>Loading...</h1>;
  if (error) return <h1>Something went wrong!</h1>;

  return (
    <div className="App">
      <h1>Books</h1>
      {data?.getBooks.map((book: Book) => (
        <BookComponent id={book.id} title={book.title} publisher={book.publisher}/>
      ))}
    </div>
  );
}

export default App;

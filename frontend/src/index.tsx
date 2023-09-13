import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import ApolloClient from "apollo-boost";
import { ApolloProvider } from 'react-apollo';

const client = new ApolloClient({
  uri: "https://localhost:4000/graphql"
})

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <ApolloProvider client={client}>
    <React.StrictMode>
      <App />
    </React.StrictMode>
  </ApolloProvider>
);
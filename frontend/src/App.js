import { ApolloClient, InMemoryCache, ApolloProvider, HttpLink, from } from "@apollo/client";
import {onError} from "@apollo/client/link/error"
import { GetBooks } from "./components/GetBooks";

const errorLink = onError(({graphqlErrors, networkError}) => {
  if(graphqlErrors) {
    graphqlErrors.map(({message, location, path}) => {
      alert(`Graphql Error: ${message}`)
    })
  }
})
const link = from([
  errorLink,
  new HttpLink({uri: "http://localhost:8080/graphql"})
])

const client = new ApolloClient({
  uri: "http://localhost:8080/graphql",
  cache: new InMemoryCache(),
  // link: link
})

function App() {
  return (
    <ApolloProvider client={client}>
    <div className="App">
      Hello World
    </div>
    <GetBooks/>
    </ApolloProvider>
  );
}

export default App;

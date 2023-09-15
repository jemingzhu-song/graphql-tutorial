import { useQuery, gql} from '@apollo/client'
import { GET_BOOKS } from '../GraphQL/Queries'

export const GetBooks = () => {

    const {error, loading, data } = useQuery(GET_BOOKS);

    if (error) return <h1>Error</h1>
    if (loading) return <h1>Loading</h1>

    console.log(`Data: ${data}`)
    console.log(`Stringify: ${JSON.stringify(data)}`)


    return <div>
        Books
    </div>
}
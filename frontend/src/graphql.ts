import gql from "graphql-tag";

export const GET_BOOKS = gql`
{
    getBooks {
        id
        title
        publisher
    }
}
`
import { DocumentNode, useQuery, useMutation } from "@apollo/react-hooks";
import { Book } from "./type/Books";

export function useBookQuery(gqlQuery: DocumentNode) {
    const { loading, error, data } = useQuery<Book>(gqlQuery)
    return { loading, error, data };
}
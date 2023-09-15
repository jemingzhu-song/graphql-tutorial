import { Book } from "./Books";

export interface Author {
    id?: number,
    name: string,
    books: Book[]
}